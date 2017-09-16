package com.yss._other.exception;

import com.yss.pojo.ResultBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResultExceptionHandle {

    @ExceptionHandler(ResultException.class)
    public ResultBean handleException(ResultException e) {

        ResultBean result = new ResultBean(e);

        System.out.println(e.getMessage());

        return result;
    }
}
