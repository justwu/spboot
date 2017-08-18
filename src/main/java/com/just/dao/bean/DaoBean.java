package com.just.dao.bean;

import com.just.dao.local.DaoLocal;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DaoBean implements DaoLocal {

    @PersistenceContext
    private EntityManager manager;  //还要考虑多数据源的情况

    public <A> List<A> getObjectList(String jpql, Object... objects) {
        Query query = manager.createQuery(jpql);
        if (objects != null && objects.length > 0) {
            for (int i = 0; i < objects.length; i++) {
                query.setParameter(i + 1, objects[i]);
            }
        }
        List<A> list = null;
        try {
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
