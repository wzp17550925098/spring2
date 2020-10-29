package com.usian.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zjy
 * @create 2020-10-27 17:56
 */
@Configuration
public class MyException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if(ex instanceof  NullPointerException){
            modelAndView.setViewName("error1");
        }
        modelAndView.addObject("error",modelAndView);
        return modelAndView;
    }
}
