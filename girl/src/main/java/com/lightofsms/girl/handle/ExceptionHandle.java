package com.lightofsms.girl.handle;

import com.lightofsms.girl.exception.GirlException;
import com.lightofsms.girl.pojo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler
    @ResponseBody
    public Result handle(Exception e) {

        System.out.println("controllerException->");
        if (e instanceof GirlException) {
            return new Result(((GirlException) e).getCode(), e.getMessage(), null);
        }

        return null;
    }
}
