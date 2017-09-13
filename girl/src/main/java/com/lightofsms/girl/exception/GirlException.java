package com.lightofsms.girl.exception;

public class GirlException extends RuntimeException {

    private int code;

    public GirlException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
