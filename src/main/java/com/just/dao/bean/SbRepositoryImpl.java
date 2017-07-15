package com.just.dao.bean;

import com.just.pojo.Sbman;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by flyhigh on 2017/7/10.
 */
@Repository
public class SbRepositoryImpl {
    @PersistenceContext
    private EntityManager em;


    public void mergeSb(String name) {
        Sbman sbman = new Sbman();
//        sbman.
        em.merge(sbman);
        System.out.println("保存成功!!! ");
    }

}
