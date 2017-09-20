package com.just.service.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.just.entity.Col_rs;
import com.just.exception.DefinedException;
import com.just.pojo.otarequest.WxOrderForm;
import com.just.pojo.otarequest.WxRequestForm;

public interface OtaService {

    ArrayNode wxQuerySections(WxRequestForm queryform) throws DefinedException;

    ObjectNode wxQueryRoomtypes(WxRequestForm requestForm) throws DefinedException;

    Col_rs wxCreateOrder(WxOrderForm orderForm) throws DefinedException;

    void testError() throws DefinedException;


}
