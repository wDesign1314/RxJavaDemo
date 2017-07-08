package com.ken.rxjavademo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private ConvenientBanner mBanner;
    private List<PictureBean.TopStoriesBean> mList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getBannerData();
    }

    private void initView() {
        mBanner = (ConvenientBanner) findViewById(R.id.banner);
    }

    public void getBannerData() {
        //定义路径
        String url = "http://news-at.zhihu.com/api/4/news/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        //动态代理
        Rxjava_interface rxjava_interface = retrofit.create(Rxjava_interface.class);
        
        rxjava_interface.getPicData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PictureBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        
                    }

                    @Override
                    public void onNext(PictureBean value) {
                        mList.addAll(value.getTop_stories());
                        System.out.println("value=="+value.getStories().get(0).getImages());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        mBanner.setPages(new CBViewHolderCreator<MyViewHolder>() {
                            @Override
                            public MyViewHolder createHolder() {
                                return new MyViewHolder();
                            }
                        },mList);
                    }
                });
    }
    class MyViewHolder implements Holder<PictureBean.TopStoriesBean>{

        private ImageView mImageView;

        @Override
        public View createView(Context context) {
            mImageView = new ImageView(context);
            mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return mImageView;
        }

        @Override
        public void UpdateUI(Context context, int position, PictureBean.TopStoriesBean data) {
            Glide.with(context)
                    .load(data.getImage())
                    .into(mImageView);
        }
    }

    @Override
    protected void onResume() {
        //自动翻页
        mBanner.startTurning(2000);
        super.onResume();
    }

    @Override
    protected void onPause() {
        mBanner.stopTurning();
        super.onPause();
    }
}
