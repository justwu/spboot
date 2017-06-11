package com.just.controller;

import com.just.pojo.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flyhigh on 2017/6/11.
 */
@RestController
@RequestMapping("/Rs")
public class Rscontroller {

    @RequestMapping("/{id}")
    public Employee queryid(@PathVariable("id") String id) {
        Employee employee = new Employee();
        employee.setLastName("NBA");
        employee.setId(1);
        System.out.println("鸡儿不放假 id:" + id);
        return employee;
    }
}
