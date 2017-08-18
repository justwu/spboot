package com.just.dao.local;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DaoLocal {

    public <A> List<A> getObjectList(String jpql, Object... objects);


}
