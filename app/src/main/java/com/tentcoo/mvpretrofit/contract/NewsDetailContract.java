package com.tentcoo.mvpretrofit.contract;

import com.jaydenxiao.common.base.BasePresenter;
import com.jaydenxiao.common.base.BaseView;
import com.tentcoo.mvpretrofit.model.GirlData;

/**
 * des:新闻详情contract
 * Created by xsf
 * on 2016.09.14:38
 */
public interface NewsDetailContract {
    public interface View extends BaseView {

        void gotoRegister(GirlData girlData);


    }

    public interface Presenter extends BasePresenter<View> {

        void downLoad();


    }
}
