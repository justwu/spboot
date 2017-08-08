package com.just.initial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by flyhigh on 2017/7/15.
 */
@Component
@Order(value = 2)
public class Init2 implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Init2.class);

    @Override
    public void run(String... strings) throws Exception {

        logger.info(this.getClass().getName() + " 启动执行running ");
    }

}
