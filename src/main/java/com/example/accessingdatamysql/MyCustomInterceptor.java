package com.example.accessingdatamysql;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyCustomInterceptor implements HandlerInterceptor{


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(request.getHeader("Authorization") == null){
            System.out.println("Intercepted");
            return false;
        }else{
            System.out.println("Intercepted");
            return true;
        }
//        System.out.println(request.getHeader("Authorization"));
//        System.out.println(response);
//        System.out.println(handler);
//        System.out.println("REQUEST PASSED HERE");


    }
}