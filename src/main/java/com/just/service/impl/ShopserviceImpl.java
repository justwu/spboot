package com.just.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by flyhigh on 2017/6/8.
 */
@Component
@Scope("prototype") //每次调用创建一个BEAN
public class ShopserviceImpl {

    public String getProductlist(String name) {
        System.out.println("今天J2不放假");
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "买个J2";
    }


}
