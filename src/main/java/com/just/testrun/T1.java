package com.just.testrun;

import com.just.config.SysConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by flyhigh on 2017/6/9.
 */
public class T1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SysConfig.class);
       /* ShopserviceImpl shopservice = context.getBean(ShopserviceImpl.class);

        shopservice.getProductlist("hello");*/

        context.close();


    }
}
