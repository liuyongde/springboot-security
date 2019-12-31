package com.liuyongde.demo.config;

/***
 * @创建人 lyd
 * @创建时间 2019/12/27
 * @描述
 */
public class TokenIsExpiredException extends Exception {


    public TokenIsExpiredException() {
    }

    public TokenIsExpiredException(String message) {
        super(message);
    }

    public TokenIsExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public TokenIsExpiredException(Throwable cause) {
        super(cause);
    }

    public TokenIsExpiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}