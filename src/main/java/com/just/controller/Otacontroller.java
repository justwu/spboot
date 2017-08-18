package com.just.controller;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.just.exception.DefindedException;
import com.just.pojo.otarequest.WxRequestForm;
import com.just.pojo.otaresponse.OtaResult;
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

    @Autowired
    @Qualifier("OtaServiceImpl")
    OtaService otaService;

    @RequestMapping("/av")
    public ArrayNode wxQueryAvailProduct(@RequestBody WxRequestForm requestForm) {
        OtaResult otaResult = new OtaResult();
        ArrayNode result = null;
        try {
            result = otaService.wxQuerySections(requestForm);
            String aa = otaService.wxQueryRoomtypes(requestForm);
            logger.info(result + "  " + aa);
        } catch (DefindedException e) {
            e.printStackTrace();
        }
//        JSONPObject object=
        otaResult.setResultcode("999");
        otaResult.setResultdesc("神秘嘉宾");
        return result;
    }

    @RequestMapping("/test")
    public OtaResult wxtest() {
        otaService.test();
        OtaResult otaResult = new OtaResult();
//        JSONPObject object=
        otaResult.setResultcode("999");
        otaResult.setResultdesc("神秘嘉宾");
        return otaResult;
    }


}
