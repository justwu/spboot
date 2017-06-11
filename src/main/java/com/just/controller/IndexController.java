package com.just.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by flyhigh on 2017/6/11.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @Value("${r8path}")
    private String r8pth;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("host", "www.jb51.net");
        System.out.println(r8pth);
        return "index";
    }
}