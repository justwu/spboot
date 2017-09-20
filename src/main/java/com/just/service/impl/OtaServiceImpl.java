package com.just.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.just.dao.bean.OtaRepositoryImpl;
import com.just.entity.Col_rs;
import com.just.entity.Section;
import com.just.exception.DefinedException;
import com.just.pojo.otarequest.WxOrderForm;
import com.just.pojo.otarequest.WxRequestForm;
import com.just.service.api.OtaService;
import com.just.utils.CalculateDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("OtaServiceImpl")
public class OtaServiceImpl implements OtaService {

    private Logger logger = LoggerFactory.getLogger(OtaService.class);

    /*@Autowired
    private DaoLocal daoLocal;*/

    @Autowired
    private OtaRepositoryImpl otaRepository;

    public ArrayNode wxQuerySections(WxRequestForm queryform) throws DefinedException {
        long s1 = System.currentTimeMillis();
        List<Section> sections = otaRepository.getSections();//  daoLocal.getObjectList("from Sction");
        System.out.println((System.currentTimeMillis() - s1) + "ms 查询列表用时");
        ObjectMapper objectMapper = new ObjectMapper();  //如果不想定义对象.就用这种直接返回JSON的树结构
        ArrayNode arrayNode = objectMapper.createArrayNode();
        for (Section section : sections) {
            ObjectNode o = objectMapper.createObjectNode();
            o.put("code", section.getCode_p());
            o.put("desc", section.getDesc_p());
            arrayNode.add(o);
        }
        String result = arrayNode.toString();
        logger.info(result);
        return arrayNode;
    }

    public ObjectNode wxQueryRoomtypes(WxRequestForm requestForm) throws DefinedException {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode o = objectMapper.createObjectNode();
        o.put("xxx", "111");
        o.put("rrr", "222");
        return o;
    }

    public Col_rs wxCreateOrder(WxOrderForm orderForm) throws DefinedException {
        Col_rs rs = new Col_rs();
        rs.setArrdate_p(CalculateDate.stringToDate("2017-10-01"));
        rs.setEnddate_p(CalculateDate.stringToDate("2107-10-22"));
        rs.setName_p("999");
        return rs;
    }

    public void testError() throws DefinedException {
        throw new DefinedException("一言不合丢个异常给你", 888);
    }
}
