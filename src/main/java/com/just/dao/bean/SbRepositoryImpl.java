package com.just.dao.bean;

import com.just.pojo.Sbman;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by flyhigh on 2017/7/10.
 */
@Repository
@Transactional  //不加事物注解.就会报没有事物的错.em操作会失败
public class SbRepositoryImpl {
    @PersistenceContext
    private EntityManager em;


    public void mergeSb(String name) {
        Sbman sbman = new Sbman();
        sbman.setName(Math.random() + ",,");
        sbman.setAge(21);
//        sbman.
        em.merge(sbman);
        System.out.println("保存成功!!! ");
    }

}
