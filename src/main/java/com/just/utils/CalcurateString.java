package com.just.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.just.pojo.otarequest.WxOrderForm;

import java.io.IOException;
import java.util.List;

public class CalcurateString {

    public static <T> String transEntity2Json(T t) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "{}";

        try {
            jsonString = objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    public static <T> T transJson2Entity(String jsonStr, Class<T> tClass) {
        ObjectMapper objectMapper = new ObjectMapper();

        T t = null;
        try {
            t = objectMapper.readValue(jsonStr, tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return t;
    }

    public static <T> List<T> transJson2EntityList(String jsonStr, Class<T> tClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<T> list = null;

        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, tClass);
        try {
            list = objectMapper.readValue(jsonStr, javaType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        String teststring = "{\"memo\":\"\",\"payment\":100,\"packagenum\":0,\"remark\":\"备注信息\",\"orderlist\":{\"ticket\":[],\"customitem\":[],\"room\":[{\"amount\":1,\"num\":1,\"startdate\":\"2017-08-16\",\"guestinfo\":{\"idtype\":\"SF\",\"guestname\":\"客房测试\",\"idno\":\"666666666\",\"profileid\":\"321321321\",\"mobile\":\"13307792222\"},\"hotelid\":\"SZ\",\"roomtype\":\"SZ22\",\"enddate\":\"2017-08-17\"}],\"pos\":[]},\"appid\":\"\",\"sceniccode\":\"GBHOTEL\",\"guestinfo\":{\"idtype\":\"SF\",\"guestname\":\"综合预订测试档案\",\"profileid\":\"532532532\",\"idno\":\"55555555555\",\"mobile\":\"13307791111\"},\"paytype\":\"WX\",\"channelcode\":\"EW\",\"packagecode\":\"\",\"totalamount\":0,\"otaorderid\":\"3506335285452800\"}";
        WxOrderForm orderForm = transJson2Entity(teststring, WxOrderForm.class);
        System.out.println(orderForm.getOrderlist().getRoom().get(0).getRoomtype());
    }
}
