package com.just.pojo.otarequest;

import java.math.BigDecimal;

/**
 * Created by flyhigh on 2016/5/24.
 */
public class WxOrderForm {
    String otaorderid = "";
    String channelcode = "";
    String sceniccode = "";
    String packagecode = "";
    BigDecimal packagenum = BigDecimal.ZERO;
    WxGuestInfo guestinfo = null;
    WxOrderList orderlist = null;
    BigDecimal totalamount = BigDecimal.ZERO;
    BigDecimal payment = BigDecimal.ZERO;//已付款金额
    String remark = "";//客人备注
    String memo = "";//折扣及发票信息备注
    String paytype = "";//支付方式
    String appid = "";

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        if (channelcode == null)
            channelcode = "";
        this.channelcode = channelcode;
    }

    public WxGuestInfo getGuestinfo() {
        return guestinfo;
    }

    public void setGuestinfo(WxGuestInfo guestinfo) {
        this.guestinfo = guestinfo;
    }

    public String getSceniccode() {
        return sceniccode;
    }

    public void setSceniccode(String sceniccode) {
        if (sceniccode == null)
            sceniccode = "";
        this.sceniccode = sceniccode;
    }

    public String getOtaorderid() {
        return otaorderid;
    }

    public void setOtaorderid(String otaorderid) {
        if (otaorderid == null)
            otaorderid = "";
        this.otaorderid = otaorderid;
    }


    public String getPackagecode() {
        return packagecode;
    }

    public void setPackagecode(String packagecode) {
        if (packagecode == null)
            packagecode = "";
        this.packagecode = packagecode;
    }


    public WxOrderList getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(WxOrderList orderlist) {
        this.orderlist = orderlist;
    }


    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        if (appid == null)
            appid = "";
        this.appid = appid;
    }


    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        if (totalamount == null)
            totalamount = BigDecimal.ZERO;
        this.totalamount = totalamount;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        if (payment == null)
            payment = BigDecimal.ZERO;
        this.payment = payment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        if (remark == null)
            remark = "";
        this.remark = remark;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        if (memo == null)
            memo = "";
        this.memo = memo;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        if (paytype == null)
            paytype = "";
        this.paytype = paytype;
    }

    public BigDecimal getPackagenum() {
        return packagenum;
    }

    public void setPackagenum(BigDecimal packagenum) {
        this.packagenum = packagenum;
    }


}
