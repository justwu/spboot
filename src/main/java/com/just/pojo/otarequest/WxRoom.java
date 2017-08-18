package com.just.pojo.otarequest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by flyhigh on 2016/5/24.
 */
public class WxRoom {
    String hotelid = "";
    String roomtype = "";
    Date startdate = null;
    Date enddate = null;
    Integer num = 0;
    BigDecimal amount = BigDecimal.ZERO;
    WxGuestInfo guestinfo = null;//new

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        if (hotelid == null)
            hotelid = "";
        this.hotelid = hotelid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        if (roomtype == null)
            roomtype = "";
        this.roomtype = roomtype;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        if (num == null)
            num = 0;
        this.num = num;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        if (amount == null)
            amount = BigDecimal.ZERO;
        this.amount = amount;
    }

    public WxGuestInfo getGuestinfo() {
        return guestinfo;
    }

    public void setGuestinfo(WxGuestInfo guestinfo) {
        this.guestinfo = guestinfo;
    }
}
