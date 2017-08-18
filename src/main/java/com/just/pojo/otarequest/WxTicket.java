package com.just.pojo.otarequest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by flyhigh on 2016/8/1.
 */
public class WxTicket {
    String ticketcode = "";
    Integer num = 0;
    BigDecimal amount = BigDecimal.ZERO;
    Date usedate = null;//
    WxGuestInfo guestinfo = null;//new

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        if (num == null)
            num = 0;
        this.num = num;
    }

    public String getTicketcode() {
        return ticketcode;
    }

    public void setTicketcode(String ticketcode) {
        if (ticketcode == null)
            ticketcode = "";
        this.ticketcode = ticketcode;
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

    public WxGuestInfo getGuestinfo() {
        return guestinfo;
    }

    public void setGuestinfo(WxGuestInfo guestinfo) {
        this.guestinfo = guestinfo;
    }

}
