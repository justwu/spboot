package com.just.service.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.just.exception.DefindedException;
import com.just.pojo.otarequest.WxRequestForm;

public interface OtaService {

    ArrayNode wxQuerySections(WxRequestForm queryform) throws DefindedException;

    String wxQueryRoomtypes(WxRequestForm requestForm) throws DefindedException;

    void test();


}
