package com.lightofsms.girl.enums;

public enum ResultEnum {

    UNKONW_ERROR(-1, "未知错误"), SUCCESS(0, "成功");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }


    ResultEnum(int code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return getCode() + getMsg();
    }
}
