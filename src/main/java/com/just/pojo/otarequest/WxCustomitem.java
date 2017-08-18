package com.just.pojo.otarequest;

/**
 * Created by flyhigh on 2016/8/1.
 */
public class WxCustomitem {
    Integer num = 0;
    String code = "";

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
        if (num == null)
            num = 0;
        this.num = num;
    }


}
