package com.just.pojo.otarequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by flyhigh on 2016/5/24.
 */
public class WxRequestForm {
    String channelcode = "";
    String sceniccode = "";
    /*  String hotelname = "";
      String hotelid = "";*/
    String roomtype = "";
    String ratecode = "";
    String ticketcode = "";
    String restaurantcode = "";
    String otaorderid = "";
    String poscode = "";
    /*  BigDecimal minrate = BigDecimal.ZERO;
          BigDecimal maxrate = BigDecimal.valueOf(99999999);*/
    List<BigDecimal> amount = new ArrayList<BigDecimal>();
    Integer num = 1;
    Date startdate = new Date();
    Date enddate = new Date();
    String appid = "";
    String packagecode = "";//增加套餐code
    String paymenttype = "";//付款方式.01银联 02微信 03支付宝
    String payid = "";//线上付款单号
    String refundreason = "";
    String full = "0";

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }


    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        if (num == null)
            num = 0;
        this.num = num;
    }


    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        if (channelcode == null)
            channelcode = "";
        this.channelcode = channelcode;
    }


   /* public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public BigDecimal getMaxrate() {
        return maxrate;
    }

    public void setMaxrate(BigDecimal maxrate) {
        this.maxrate = maxrate;
    }

    public BigDecimal getMinrate() {
        return minrate;
    }

    public void setMinrate(BigDecimal minrate) {
        this.minrate = minrate;
    }*/

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        if (roomtype == null)
            roomtype = "";
        this.roomtype = roomtype;
    }

    public String getSceniccode() {
        return sceniccode;
    }

    public void setSceniccode(String sceniccode) {
        if (sceniccode == null)
            sceniccode = "";
        this.sceniccode = sceniccode;
    }

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

    public String getRatecode() {
        return ratecode;
    }

    public void setRatecode(String ratecode) {
        if (ratecode == null)
            ratecode = "";
        this.ratecode = ratecode;
    }


    /*public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }*/


    public String getOtaorderid() {
        return otaorderid;
    }

    public void setOtaorderid(String otaorderid) {
        if (otaorderid == null)
            otaorderid = "";
        this.otaorderid = otaorderid;
    }

    public String getRestaurantcode() {
        return restaurantcode;
    }

    public void setRestaurantcode(String restaurantcode) {
        if (restaurantcode == null)
            restaurantcode = "";
        this.restaurantcode = restaurantcode;
    }

    public String getTicketcode() {
        return ticketcode;
    }

    public void setTicketcode(String ticketcode) {
        if (ticketcode == null)
            ticketcode = "";
        this.ticketcode = ticketcode;
    }


    public String getPoscode() {
        return poscode;
    }

    public void setPoscode(String poscode) {
        if (poscode == null)
            poscode = "";
        this.poscode = poscode;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        if (appid == null)
            appid = "";
        this.appid = appid;
    }

    public String getPackagecode() {
        return packagecode;
    }

    public void setPackagecode(String packagecode) {
        if (packagecode == null)
            packagecode = "";
        this.packagecode = packagecode;
    }

    public String getRefundreason() {
        return refundreason;
    }

    public void setRefundreason(String refundreason) {
        this.refundreason = refundreason;
    }


    public List<BigDecimal> getAmount() {
        return amount;
    }

    public void setAmount(List<BigDecimal> amount) {
        this.amount = amount;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

}
