package com.example.day1130;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lenovo on 2017/11/30.
 */

public class Util {
    String str="";

    public String getjson(String jsonstr){
        URL url=null;
        HttpURLConnection urlConnection=null;
        try {
             url=new URL(jsonstr);
             urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            int res = urlConnection.getResponseCode();
            if(res==200){
                InputStream in = urlConnection.getInputStream();
                byte[] b=new byte[1024];
                int len=0;
                while((len=in.read(b))!=-1){
                    String st=new String(b,0,len);
                    str+=st;
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 请求图片
     * @param imgUrl
     * @return
     */
    public Bitmap getBitmap(String imgUrl){
        URL url=null;
        HttpURLConnection urlConnection=null;
        Bitmap bitmap = null;
        try {
            url=new URL(imgUrl);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            int res = urlConnection.getResponseCode();
            if(res==200){
                InputStream is = urlConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);//把inputStream数据流转换为Bitmap
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
