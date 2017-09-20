package com.just.controller;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.just.exception.DefinedException;
import com.just.pojo.otarequest.WxRequestForm;
import com.just.service.api.OtaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ota", method = RequestMethod.POST)
public class Otacontroller {

    private Logger logger = LoggerFactory.getLogger(Otacontroller.class);

    private Logger justloger = LoggerFactory.getLogger("just");

    @Autowired
    @Qualifier("OtaServiceImpl")
    OtaService otaService;

    @RequestMapping("/av")
    public ArrayNode wxQueryAvailProduct(@RequestBody WxRequestForm requestForm) throws DefinedException {
        ArrayNode result = otaService.wxQuerySections(requestForm);
        return result;
    }

    @RequestMapping("/roomtype")
    public ObjectNode wxQueryRoomtypes(@RequestBody WxRequestForm requestForm) throws DefinedException {
        ObjectNode result = otaService.wxQueryRoomtypes(requestForm);
        if (justloger != null) {
            justloger.debug("hello~ just coming ");
        }
        otaService.testError();
        logger.info("没事没事");
        return result;
    }


}
