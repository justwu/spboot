package com.just.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class OtaAdvice {

    Logger logger = LoggerFactory.getLogger(OtaAdvice.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) //异常时返回一个500的状态错误
    public Map errorHandler(Exception ex) throws Exception {
        Map map = new HashMap();
        map.put("code", "999");
        if (ex instanceof DefinedException) {
            DefinedException exception = (DefinedException) ex;
            map.put("extype", "definedException");
            map.put("code", exception.getErrorcode());
        }
        map.put("msg", "重新包装服不服" + ex.getMessage());
        logger.info("重新包装了异常 {} ", "嘿嘿88");
        return map;
    }

/*
    @ResponseBody
    @ExceptionHandler(value = DefinedException.class)
    public Map errorHandler(DefinedException ex) throws DefinedException{
        Map map = new HashMap();
        map.put("code", ex.getErrorcode());
        map.put("msg",ex.getMessage());
        map.put("uuu","special");
        return map;
    }*/



}
