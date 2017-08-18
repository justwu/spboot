package com.just.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by flyhigh on 2017/7/10.
 */
@Entity
public class Sbman {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}