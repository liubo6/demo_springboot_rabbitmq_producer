package com.liubo.demo.rabbitmq.producer.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hzlbo on 2016/7/11.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        System.out.println("GlobalExceptionHandler.defaultErrorHandler()");
    }

    //返回json数据或者String数据： 那么需要在方法上加上注解：@ResponseBody 添加return即可。

    //返回视图：定义一个ModelAndView即可，然后return; 定义视图文件(比如：error.html,error.ftl,error.jsp);

}
