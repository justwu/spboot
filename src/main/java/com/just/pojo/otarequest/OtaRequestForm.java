package com.just.pojo.otarequest;

import java.util.Date;

/**
 * Created by flyhigh on 2016/5/19.
 */
public class OtaRequestForm {
    String channelcode = "";
    String sceniccode = "";
    Date startdate = null;
    Date enddate = null;
    String roomtype = "";
    String ratecode = "";
    String otaid = "";
    String orderid = "";
    String producttype = "";
    String productcode = "";

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOtaid() {
        return otaid;
    }

    public void setOtaid(String otaid) {
        this.otaid = otaid;
    }

    public String getRatecode() {
        return ratecode;
    }

    public void setRatecode(String ratecode) {
        this.ratecode = ratecode;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getSceniccode() {
        return sceniccode;
    }

    public void setSceniccode(String sceniccode) {
        this.sceniccode = sceniccode;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }


    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }


}
