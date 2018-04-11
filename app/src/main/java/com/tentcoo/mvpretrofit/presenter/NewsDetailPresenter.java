package com.tentcoo.mvpretrofit.presenter;


import android.content.Context;
import android.widget.Toast;

import com.jaydenxiao.common.base.BaseRxPresenter;

import com.jaydenxiao.common.exception.ExceptionHandle;
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
                mView.stopLoading();
            }

            @Override
            public void onError(Throwable e) {
                mView.showErrorTip(ExceptionHandle.handleException(e).message);

            }
            @Override
            public void onNext(GirlData girlData) {
                mView.gotoRegister(girlData);
            }
        });
    }
}
