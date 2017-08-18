package com.just.controller;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.just.exception.DefindedException;
import com.just.pojo.otarequest.WxRequestForm;
import com.just.service.api.OtaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by flyhigh on 2017/6/11.
 */
@Controller
@RequestMapping("/price")
public class PriceController {
    @Value("${r8path}")
    private String r8pth;

    private Logger logger = LoggerFactory.getLogger(PriceController.class);

    @Autowired
    @Qualifier("OtaServiceImpl")
    OtaService otaService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public @ResponseBody
    HashMap<String, Object> rs() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("2222", "1111");
        result.put("333", "6666");
        return result;
    }

    @RequestMapping(value = "/order2", method = RequestMethod.GET)
    public @ResponseBody
    String rs2() {
        ArrayNode result = null;
        try {
            result = otaService.wxQuerySections(new WxRequestForm());
        } catch (DefindedException e) {
            e.printStackTrace();
        }

        return result.toString();
    }


}