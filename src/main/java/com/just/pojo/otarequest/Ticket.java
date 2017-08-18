package com.just.pojo.otarequest;

import java.util.Date;

/**
 * Created by flyhigh on 2016/5/19.
 */
public class Ticket {
    String code = "";
    String ttype = "";
    Date usedate = null;
    Integer num = 0;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }
}
