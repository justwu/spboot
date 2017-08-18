package com.just.pojo.otarequest;

import java.util.Date;

/**
 * Created by flyhigh on 2016/5/19.
 */
public class Pos {
    String restaurantcode = "";
    String code = "";
    Integer persons = 0;
    Integer tables = 0;
    String section = "";
    Date usedate = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPersons() {
        return persons;
    }

    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    public String getRestaurantcode() {
        return restaurantcode;
    }

    public void setRestaurantcode(String restaurantcode) {
        this.restaurantcode = restaurantcode;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getTables() {
        return tables;
    }

    public void setTables(Integer tables) {
        this.tables = tables;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }
}
