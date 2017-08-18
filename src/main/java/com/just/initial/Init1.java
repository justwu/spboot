package com.just.initial;

import com.just.dao.bean.SbRepositoryImpl;
import com.just.dao.local.SbRepository;
import com.just.entity.Sbman;
import com.just.utils.SpringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 实现CommandLineRunner 接口的类会在spring应用启动时进行初始化run方法order数值越低,优先级越高
 * Created by flyhigh on 2017/7/15.
 */
@Component
@Order(value = 1)
public class Init1 implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(Init1.class);

    @Autowired
    SbRepository sbRepository;

    @Autowired
    SbRepositoryImpl sbRepositoryimpl;

    @Override
    public void run(String... strings) throws Exception {
        SbRepository sbRepository = SpringUtil.getBean(SbRepository.class);
        Sbman sbman = sbRepository.findOne(5);
        if (sbman == null) {
            logger.info("没找到");
        } else {
            sbman.setName(Math.random() + "");
            sbRepository.save(sbman);
            logger.info(this.getClass().getName() + " running id:" + sbman.getId() + "name :" + sbman.getName() + " age : " + sbman.getAge());
        }


    /*    Sbman ss=new Sbman();
        ss.setName("777");
        ss.setAge(99);
        sbRepositoryimpl.mergeSb("78");*/


    }

}
