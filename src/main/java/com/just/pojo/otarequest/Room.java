package com.just.pojo.otarequest;

import java.util.Date;

/**
 * Created by flyhigh on 2016/5/19.
 */
public class Room {
    String guestname = "";
    String mobile = "";
    String idtype = "";
    String idno = "";
    String roomtype = "";
    String ratecode = "";
    Date startdate = null;
    Date enddate = null;
    Integer num = 1;

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }


    public String getRatecode() {
        return ratecode;
    }

    public void setRatecode(String ratecode) {
        this.ratecode = ratecode;
    }
}
