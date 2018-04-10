package com.tentcoo.mvpretrofit.presenter;


import android.content.Context;
import android.widget.Toast;

import com.jaydenxiao.common.base.BaseRxPresenter;
import com.jaydenxiao.common.baseapp.BaseApplication;
import com.tentcoo.mvpretrofit.contract.NewsDetailContract;
import com.tentcoo.mvpretrofit.http.RetrofitHttpUtlis;
import com.tentcoo.mvpretrofit.model.GirlData;

import rx.Observer;

/**
 * des:新闻详情
 * Created by xsf
 * on 2016.09.17:08
 */
public class NewsDetailPresenter extends BaseRxPresenter<NewsDetailContract.View> implements NewsDetailContract.Presenter {
    private Context context;

    public NewsDetailPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void downLoad() {
        RetrofitHttpUtlis.getInstance().subscribe(RetrofitHttpUtlis.getInstance().getMovieService().getPhotoList(RetrofitHttpUtlis.getCacheControl()), new Observer<GirlData>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                Toast.makeText(BaseApplication.getAppContext(), "请求失败", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNext(GirlData girlData) {
                mView.gotoRegister(girlData);
            }
        });
    }
}
