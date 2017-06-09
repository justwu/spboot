package com.just.service.spcomp;

import com.just.service.api.Shopservice;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by flyhigh on 2017/6/9.
 */
public class Servicefactory {

    //@Autowired
    //1.构造器注解(constructor)
    //2.属性setter注解
    //3.field注解
    @Autowired
    private Shopservice shopservice;

}
