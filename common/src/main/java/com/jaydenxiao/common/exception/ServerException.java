package com.jaydenxiao.common.exception;

/**
 * Created by huangdiudiu on 2018/4/11.
 */

public class ServerException extends RuntimeException{
    public int code;
    public String message;
}
