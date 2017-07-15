package com.just.initial;

import com.just.dao.local.SbRepository;
import com.just.pojo.Sbman;
import com.just.utils.SpringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by flyhigh on 2017/7/15.
 */
@Component
@Order(value = 1)
public class Init1 implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Init1.class);

    @Autowired
    SbRepository sbRepository;

    @Override
    public void run(String... strings) throws Exception {
        SbRepository sbRepository = SpringUtil.getBean(SbRepository.class);
        Sbman sbman = sbRepository.findOne(5);
        if (sbman == null) {
            System.out.println("没 找到");
        }

        logger.info(this.getClass().getName() + " running id:" + sbman.getId() + "name :" + sbman.getName() + " age : " + sbman.getAge());


    }

}
