package com.example.day1130;

import java.util.List;

/**
 * Created by lenovo on 2017/11/30.
 */

public class Person {

    /**
     * message : success
     * data : {"pc_feed_focus":[{"title":"特朗普发推特惹祸 民主党领袖拒绝参加会议川普迷之尴尬","display_url":"/group/6493665801139126798/","has_video":false,"image_url":"//p9.pstatp.com/origin/46c70005cc2c4e33b903","has_image":true,"group_id":6493665801139126798,"media_url":"http://toutiao.com/m5784742177"},{"title":"一个学生两个老师 这所乡村学校每天只有三个人","display_url":"/group/6493341662247387661/","has_video":false,"image_url":"//p3.pstatp.com/origin/46c600040154c3b15643","has_image":true,"group_id":6493341662247387661,"media_url":"http://toutiao.com/m5739097906"},{"title":"英国哈里王子与女友订婚后合体现身 笑容满面十分甜腻","display_url":"/group/6493102128343548429/","has_video":false,"image_url":"//p3.pstatp.com/origin/46c3001c67306e91140c","has_image":true,"group_id":6493102128343548429,"media_url":"http://toutiao.com/m5784742177"},{"title":"39岁布冯荣膺意甲最佳球员 称还有可能重返国家队","display_url":"/group/6493320694699393549/","has_video":false,"image_url":"//p3.pstatp.com/origin/46c60003f95c1e71955a","has_image":true,"group_id":6493320694699393549,"media_url":"http://toutiao.com/m1564293928517634"},{"title":"仅存两辆！黄埔军校现\u201c上游\u201d导弹车","display_url":"/group/6493260419342270989/","has_video":false,"image_url":"//p1.pstatp.com/origin/46c50004e207211ad3a8","has_image":true,"group_id":6493260419342270989,"media_url":"http://toutiao.com/m3432307046"},{"title":"冻龄女神韩彩英一身白裙 还是记忆中的那个豪杰春香","display_url":"/group/6493359706382270990/","has_video":false,"image_url":"//p1.pstatp.com/origin/46c60003fbca0521a5fd","has_image":true,"group_id":6493359706382270990,"media_url":"http://toutiao.com/m5738017030"},{"title":"印尼巴厘岛阿贡火山喷发 如柱火山灰高达1500米","display_url":"/group/6492971575208313358/","has_video":false,"image_url":"//p1.pstatp.com/origin/46c2001c7b8f82561dda","has_image":true,"group_id":6492971575208313358,"media_url":"http://toutiao.com/m5784742177"},{"title":"章子怡亮相中戏分享表演经验 主席宠溺后辈\u201c好乖\u201d","display_url":"/group/6493005686740353550/","has_video":false,"image_url":"//p3.pstatp.com/origin/46c50001763c73dfa04b","has_image":true,"group_id":6493005686740353550,"media_url":"http://toutiao.com/m5738017030"},{"title":"17名退伍军人开花店 施行军事化管理","display_url":"/group/6483734652673589774/","has_video":false,"image_url":"//p1.pstatp.com/origin/46c700007adf5761db3f","has_image":true,"group_id":6483734652673589774,"media_url":"http://toutiao.com/m1555140519616514"},{"title":"2017中国十佳劳伦斯冠军奖：最佳团队提名出炉","display_url":"/group/6492992113960026638/","has_video":false,"image_url":"//p1.pstatp.com/origin/46c7000079d85f97c202","has_image":true,"group_id":6492992113960026638,"media_url":"http://toutiao.com/m1564293928517634"}]}
     */

    private String message;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<PcFeedFocusBean> pc_feed_focus;

        public List<PcFeedFocusBean> getPc_feed_focus() {
            return pc_feed_focus;
        }

        public void setPc_feed_focus(List<PcFeedFocusBean> pc_feed_focus) {
            this.pc_feed_focus = pc_feed_focus;
        }

        public static class PcFeedFocusBean {
            /**
             * title : 特朗普发推特惹祸 民主党领袖拒绝参加会议川普迷之尴尬
             * display_url : /group/6493665801139126798/
             * has_video : false
             * image_url : //p9.pstatp.com/origin/46c70005cc2c4e33b903
             * has_image : true
             * group_id : 6493665801139126798
             * media_url : http://toutiao.com/m5784742177
             */

            private String title;
            private String display_url;
            private boolean has_video;
            private String image_url;
            private boolean has_image;
            private long group_id;
            private String media_url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDisplay_url() {
                return display_url;
            }

            public void setDisplay_url(String display_url) {
                this.display_url = display_url;
            }

            public boolean isHas_video() {
                return has_video;
            }

            public void setHas_video(boolean has_video) {
                this.has_video = has_video;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public boolean isHas_image() {
                return has_image;
            }

            public void setHas_image(boolean has_image) {
                this.has_image = has_image;
            }

            public long getGroup_id() {
                return group_id;
            }

            public void setGroup_id(long group_id) {
                this.group_id = group_id;
            }

            public String getMedia_url() {
                return media_url;
            }

            public void setMedia_url(String media_url) {
                this.media_url = media_url;
            }
        }
    }
}
