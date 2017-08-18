package com.just.pojo.otarequest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by flyhigh on 2016/8/1.
 */
public class WxPos {
    String poscode = "";
    Integer num = 0;
    BigDecimal amount = BigDecimal.ZERO;
    Date usedate = null;//
    String period = "";//餐段代码
    WxGuestInfo guestinfo = null;//new

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        if (num == null)
            num = 0;
        this.num = num;
    }

    public String getPoscode() {
        return poscode;
    }

    public void setPoscode(String poscode) {
        if (poscode == null)
            poscode = "";
        this.poscode = poscode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        if (amount == null)
            amount = BigDecimal.ZERO;
        this.amount = amount;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if (period == null)
            period = "";
        this.period = period;
    }

    public WxGuestInfo getGuestinfo() {
        return guestinfo;
    }

    public void setGuestinfo(WxGuestInfo guestinfo) {
        this.guestinfo = guestinfo;
    }

}
