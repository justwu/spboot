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
@RequestMapping("/price")
public class PriceController {
    @Value("${r8path}")
    private String r8pth;

    private Logger logger = LoggerFactory.getLogger(PriceController.class);

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String rs(Model model) {
        model.addAttribute("name", "Dear");
        return "priceorder";
    }


}