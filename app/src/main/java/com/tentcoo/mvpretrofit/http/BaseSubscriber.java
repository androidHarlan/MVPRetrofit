package com.tentcoo.mvpretrofit.http;

import android.content.Context;
import android.util.Log;
import rx.Subscriber;

import org.reactivestreams.Subscription;


/**
 * Created by huangdiudiu on 2018/4/9.
 */

public class BaseSubscriber <T> extends Subscriber<T> {

    private Context context;

    @SuppressWarnings("unused")
    public BaseSubscriber(Context context) {
        this.context = context;
    }

    @SuppressWarnings("WeakerAccess")
    public BaseSubscriber() {
    }

    public  void onError(ApiException.ResponseException e){

    };


    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        Log.e("tag", "BaseSubscriber.throwable =" + e.toString());
        if (e instanceof Exception) {
            //访问获得对应的Exception
            onError(ApiException.handleException(e));
        } else {
            //将Throwable 和 未知错误的status code返回
            onError(new ApiException.ResponseException(e, ApiException.ErrorCode.UNKNOWN));
        }
    }

    @Override
    public void onNext(T t) {

    }


}
