package com.ken.rxjavademo;

import java.util.List;

/**
 * Created by Administrator on 2017/7/7.
 */

public class PictureBean {

    /**
     * date : 20170707
     * stories : [{"images":["https://pic4.zhimg.com/v2-d6aef4169a5b7b733aa885092a8cbe17.jpg"],"type":0,"id":9502906,"ga_prefix":"070720","title":"香油、辣椒、蒜末\u2026\u2026大晚上发张油泼面的照片，简直犯罪"},{"title":"真不想告诉你们国内还有这个美丽安静的南部小镇","ga_prefix":"070719","images":["https://pic2.zhimg.com/v2-1f32c2f465f3ae0d704c8bff78216045.jpg"],"multipic":true,"type":0,"id":9511545},{"images":["https://pic4.zhimg.com/v2-65a7e328d5743a475a21ecd93bbd8b1f.jpg"],"type":0,"id":9513082,"ga_prefix":"070718","title":"因为吸食「笑气」，他们中有人花掉上百万，有人终身瘫痪"},{"images":["https://pic1.zhimg.com/v2-c25aa0c48a5e4088664f2d40db5abdc4.jpg"],"type":0,"id":9512835,"ga_prefix":"070717","title":"《王者荣耀》防沉迷后，家长还是那个家长，孩子还是那个孩子"},{"images":["https://pic1.zhimg.com/v2-95aab91d8f633b664edc37b1478db3ec.jpg"],"type":0,"id":9511780,"ga_prefix":"070716","title":"妈妈没了母乳还有奶妈，奶妈也没有的话\u2026\u2026还好有配方奶"},{"images":["https://pic4.zhimg.com/v2-739e06cd31b6cf4aeb5d040afbae6b23.jpg"],"type":0,"id":9510774,"ga_prefix":"070715","title":"为什么说 iPhone 是一个好设计？因为是它会「说谎」"},{"images":["https://pic4.zhimg.com/v2-b95915287a8fba5e2b6eda11600ef2f7.jpg"],"type":0,"id":9511369,"ga_prefix":"070714","title":"别说「我和你爸不离婚都是为了你」，孩子不见得会感激你"},{"images":["https://pic4.zhimg.com/v2-5ec0522f51971093c7934c4da40b158b.jpg"],"type":0,"id":9507427,"ga_prefix":"070713","title":"十年前你在干什么？我在看《高达 00》哭成泪人"},{"images":["https://pic3.zhimg.com/v2-6149a256180616e4d5ae8e0c9cc00046.jpg"],"type":0,"id":9511797,"ga_prefix":"070712","title":"大误 · 道明寺决定发起总攻"},{"images":["https://pic3.zhimg.com/v2-da0953a19926563404196abea29c6f2a.jpg"],"type":0,"id":9509304,"ga_prefix":"070711","title":"别藏着掖着，快告诉我你们搞金融的是怎么理财的？"},{"images":["https://pic2.zhimg.com/v2-a37688e611cf271bbe63b8d225f06795.jpg"],"type":0,"id":9512136,"ga_prefix":"070710","title":"建收费站或是征燃油税，公路应该怎么收费才合理？"},{"images":["https://pic2.zhimg.com/v2-9629ca59e4b195b6bb6294c12efa06a9.jpg"],"type":0,"id":9512119,"ga_prefix":"070709","title":"甜品里不可缺少的「糖」，做的事情可远不止甜而已"},{"images":["https://pic3.zhimg.com/v2-42d2169aef3ba9ef52ce49fe35a3354e.jpg"],"type":0,"id":9505902,"ga_prefix":"070708","title":"免费下载论文的网站要赔天价罚金，法律胜了知识却输了"},{"images":["https://pic2.zhimg.com/v2-6867160085ddbcaad19a89e1f9512769.jpg"],"type":0,"id":9509957,"ga_prefix":"070707","title":"6% 的水军刷了 90% 的量，脱完水的明星究竟还有几分红？"},{"images":["https://pic3.zhimg.com/v2-bfa1464b471bc8cef3de538dd1fdaed6.jpg"],"type":0,"id":9511718,"ga_prefix":"070707","title":"这一次，终于不是让人脸酸的小鲜肉拿「最佳主角」了"},{"images":["https://pic2.zhimg.com/v2-be36bbcaceab8dc3528acb0b5c50f109.jpg"],"type":0,"id":9511015,"ga_prefix":"070707","title":"前不久开跑的「复兴号」动车组，有多少技术是自主知识产权？"},{"images":["https://pic1.zhimg.com/v2-b9124dfef8656cd78cb1645e4185b424.jpg"],"type":0,"id":9508437,"ga_prefix":"070706","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-1dfcb50fc5cde69a469eaae8c8d4396d.jpg","type":0,"id":9513082,"ga_prefix":"070718","title":"因为吸食「笑气」，他们中有人花掉上百万，有人终身瘫痪"},{"image":"https://pic2.zhimg.com/v2-09206350ac954f265df2bdc14944f3e9.jpg","type":0,"id":9510774,"ga_prefix":"070715","title":"为什么说 iPhone 是一个好设计？因为是它会「说谎」"},{"image":"https://pic1.zhimg.com/v2-df1b822426e60602c73b9e168e63b7fc.jpg","type":0,"id":9512835,"ga_prefix":"070717","title":"《王者荣耀》防沉迷后，家长还是那个家长，孩子还是那个孩子"},{"image":"https://pic3.zhimg.com/v2-5853b2c39fd0316b4d2db748e74c4f6e.jpg","type":0,"id":9509957,"ga_prefix":"070707","title":"6% 的水军刷了 90% 的量，脱完水的明星究竟还有几分红？"},{"image":"https://pic3.zhimg.com/v2-4b63a738c134615cb848e74dc6c3e8f2.jpg","type":0,"id":9511718,"ga_prefix":"070707","title":"这一次，终于不是让人脸酸的小鲜肉拿「最佳主角」了"}]
     */

    private String date;
    /**
     * images : ["https://pic4.zhimg.com/v2-d6aef4169a5b7b733aa885092a8cbe17.jpg"]
     * type : 0
     * id : 9502906
     * ga_prefix : 070720
     * title : 香油、辣椒、蒜末……大晚上发张油泼面的照片，简直犯罪
     */

    private List<StoriesBean> stories;
    /**
     * image : https://pic2.zhimg.com/v2-1dfcb50fc5cde69a469eaae8c8d4396d.jpg
     * type : 0
     * id : 9513082
     * ga_prefix : 070718
     * title : 因为吸食「笑气」，他们中有人花掉上百万，有人终身瘫痪
     */

    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
