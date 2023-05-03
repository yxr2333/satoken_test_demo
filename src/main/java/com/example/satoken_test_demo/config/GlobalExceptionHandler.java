package com.example.satoken_test_demo.config;

import cn.dev33.satoken.exception.NotLoginException;
import com.example.satoken_test_demo.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created By IntelliJ IDEA
 *
 * @author IceCreamQAQ
 * @datetime 2023/5/2 星期二
 * Happy Every Coding Time~
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotLoginException.class)
    @ResponseBody
    public Result<Object> handleNotLoginException(NotLoginException e) {
        e.printStackTrace();
        // 处理未登录异常
        return Result.error("未登录");
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result<Object> handleException(Exception e) {
        e.printStackTrace();
        // 处理异常信息
        return Result.error("暂时无法处理~");
    }
}
