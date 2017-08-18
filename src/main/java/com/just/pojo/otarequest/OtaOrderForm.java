package com.just.pojo.otarequest;

/**
 * Created by flyhigh on 2016/5/19.
 */
public class OtaOrderForm {
    String channelcode = "";
    String sceniccode = "";
    String contract = "";
    String mobile = "";
    String idtype = "";
    String idno = "";
    String ratecode = "";
    String otaid = "";
    String orderid = "";
    Order orders = new Order();

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
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

    public String getSceniccode() {
        return sceniccode;
    }

    public void setSceniccode(String sceniccode) {
        this.sceniccode = sceniccode;
    }


}
