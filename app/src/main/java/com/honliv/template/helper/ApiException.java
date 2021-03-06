package com.honliv.template.helper;

/**
 * Created by Rodin on 2016/12/6.
 */

public class ApiException extends RuntimeException {
    private int errorCode;

    public ApiException(int code, String msg) {
        super(msg);
        this.errorCode = code;
    }

    public ApiException(String msg) {
        super(msg);
    }

    public int getErrorCode() {
        return errorCode;
    }
}
