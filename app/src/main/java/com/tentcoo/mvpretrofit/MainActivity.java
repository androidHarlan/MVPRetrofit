package com.tentcoo.mvpretrofit;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonwidget.LoadingTip;
import com.tentcoo.mvpretrofit.contract.NewsDetailContract;
import com.tentcoo.mvpretrofit.model.GirlData;
import com.tentcoo.mvpretrofit.presenter.NewsDetailPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<NewsDetailPresenter> implements NewsDetailContract.View {

    @Bind(R.id.loadedTip)
    LoadingTip loadedTip;
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
        Log.e("backinfo", "走了initView");
        mPresenter.downLoad();
        loadedTip.setLoadingTip(LoadingTip.LoadStatus.loading);

    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {
        loadedTip.setLoadingTip(LoadingTip.LoadStatus.finish);
    }

    @Override
    public void showErrorTip(String msg) {
        loadedTip.setLoadingTip(LoadingTip.LoadStatus.error);
        loadedTip.setTips(msg);
    }


    @Override
    public void gotoRegister(GirlData girlData) {
        Gson go = new Gson();
        ;
        Log.e("backinfo", "数据的点点滴滴：" + go.toJson(girlData));
    }


}
