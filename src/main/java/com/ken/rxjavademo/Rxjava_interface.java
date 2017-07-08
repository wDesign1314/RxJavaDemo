package com.ken.rxjavademo;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by Administrator on 2017/7/7.
 */

public interface Rxjava_interface {
    //http://news-at.zhihu.com/api/4/news/latest
    @GET("latest")
    Call<PictureBean> getData();
    
    @GET("latest")
    Observable<PictureBean> getPicData();
}
