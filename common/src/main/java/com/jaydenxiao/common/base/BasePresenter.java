package com.jaydenxiao.common.base;

import android.content.Context;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;


/**
 * des:基类presenter
 * Created by xsf
 * on 2016.07.11:55
 */
public interface  BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
