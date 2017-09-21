package com.just.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by flyhigh on 2017/6/11.
 */
@Controller
public class IndexController {
    @Value("${r8path}")
    private String r8pth;

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * 测试hello
     *
     * @return
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        logger.info("访问hello方法");
        return "hello";
    }

    @RequestMapping(value = "/rs", method = RequestMethod.GET)
    public String rs(Model model) {
        model.addAttribute("name", "Dear");
        logger.info("访问rs方法啊啊啊111");
        return "price/priceorder";   //返回的是视图路径 templates目录是第一层方法
    }
}