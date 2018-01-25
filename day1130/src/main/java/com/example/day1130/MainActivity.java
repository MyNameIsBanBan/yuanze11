package com.example.day1130;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String str="https://www.toutiao.com/api/pc/focus/";
    private   List<Person.DataBean.PcFeedFocusBean> pc;
    private ListView lv;
    private MyAdapter my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.lv);
        new AsyncTask<String,Integer,String>(){
			
            @Override
            protected String doInBackground(String... params) {
                Util u=new Util();
                String getjson = u.getjson(str);
                return getjson;
            }

            @Override
            protected void onPostExecute(String s) {
                Gson g=new Gson();
                Person person = g.fromJson(s, Person.class);
                Person.DataBean data = person.getData();
                pc = data.getPc_feed_focus();
                my=new MyAdapter();
                lv.setAdapter(my);
            }

        }.execute();
    }
  class MyAdapter extends BaseAdapter{

      @Override
      public int getCount() {
          return pc.size();
      }

      @Override
      public Object getItem(int position) {
          return null;
      }

      @Override
      public long getItemId(int position) {
          return 0;
      }

      @Override
      public View getView(final int position, View convertView, ViewGroup parent) {
          final ViewHolder holder;
          if(convertView==null){
              holder=new ViewHolder();
              convertView=convertView.inflate(MainActivity.this,R.layout.li,null);
              holder.name= (TextView) convertView.findViewById(R.id.name);
              holder.age= (TextView) convertView.findViewById(R.id.age);
              holder.img = (ImageView) convertView.findViewById(R.id.img);
              convertView.setTag(holder);
          }else{
             holder= (ViewHolder) convertView.getTag();
          }
          holder.name.setText(pc.get(position).getTitle());
          holder.age.setText(pc.get(position).getDisplay_url());
          //给图片赋值
          new AsyncTask<String,Integer,Bitmap>(){

              @Override
              protected Bitmap doInBackground(String... params) {
                  //网络代码请求图片
                  Bitmap bitmap = new Util().getBitmap("http:"+pc.get(position).getImage_url());
                  return bitmap;
              }
              @Override
              protected void onPostExecute(Bitmap bitmap) {
                  super.onPostExecute(bitmap);
                  if(bitmap != null){
                      holder.img.setImageBitmap(bitmap);
                  }
              }
          }.execute();

          return convertView;
      }
      class ViewHolder{
          TextView name,age;
          ImageView img;

      }
  }
}
