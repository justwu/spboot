package com.just.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.just.dao.local.DaoLocal;
import com.just.entity.Section;
import com.just.exception.DefindedException;
import com.just.pojo.otarequest.WxRequestForm;
import com.just.service.api.OtaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OtaServiceImpl")
public class OtaServiceImpl implements OtaService {

    private Logger logger = LoggerFactory.getLogger(OtaService.class);

    @Autowired
    private DaoLocal daoLocal;

    @Override
    public ArrayNode wxQuerySections(WxRequestForm queryform) throws DefindedException {
        List<Section> sections = daoLocal.getObjectList("from Section");
        ObjectMapper objectMapper = new ObjectMapper();  //如果不想定义对象.就用这种直接返回JSON的树结构
        ArrayNode arrayNode = objectMapper.createArrayNode();
        for (Section section : sections) {
            ObjectNode o = objectMapper.createObjectNode();
            o.put("code", section.getCode_p());
            o.put("desc", section.getDesc_p());
            arrayNode.add(o);
        }
        String result = arrayNode.toString();
        logger.debug(result);
        return arrayNode;
    }

    @Override
    public String wxQueryRoomtypes(WxRequestForm requestForm) throws DefindedException {
        return "abc";
    }

    @Override
    public void test() {
        logger.info("Test 方法执行");
    }
}
