package com.just.testrun;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class T2 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root1 = mapper.createObjectNode();
        root1.put("code", "GBHOTEL");
        root1.put("desc", "古北水镇");

        ObjectNode root2 = mapper.createObjectNode();
        root1.put("code", "GBHOTEL");
        root1.put("desc", "古北水镇");


    }
}
