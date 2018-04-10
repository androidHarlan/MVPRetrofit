package com.tentcoo.mvpretrofit;

import android.util.Log;

import com.google.gson.Gson;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonutils.LogUtils;
import com.tentcoo.mvpretrofit.model.GirlData;
import com.tentcoo.mvpretrofit.contract.NewsDetailContract;
import com.tentcoo.mvpretrofit.http.ApiException;
import com.tentcoo.mvpretrofit.presenter.NewsDetailPresenter;

public class MainActivity extends BaseActivity<NewsDetailPresenter> implements NewsDetailContract.View {




    @Override
    protected NewsDetailPresenter initPresenter() {
        return new NewsDetailPresenter(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        Log.e("backinfo","走了initView");
        mPresenter.downLoad();
    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

    }


    @Override
    public void gotoRegister(GirlData girlData) {
        Gson go=new Gson();
       ;Log.e("backinfo","数据的点点滴滴："+ go.toJson(girlData));
    }
}
