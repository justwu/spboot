package com.just.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class OtaAdvice {

    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 100);
//        map.put("msg",ex)
        return map;
    }


}
