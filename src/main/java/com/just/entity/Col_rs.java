package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Col_rs")
public class Col_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道大组 */
    private String channelsource_p = "";/* 二级渠道代码 */
    private String colno_p = "";/* Yun平台订单号 */
    private String channelno_p = "";/* 线上渠道订单号 */
    private String pmscolno_p = "";/* Pms订单号 */
    private String payment_p = "";/* 付款方式微信,淘宝等 */
    private Date arrdate_p = sdf;/* 到店 */
    private Date enddate_p = sdf;/* 离店 */
    private Date createdate_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private Date canceldate_p = sdf;/* 取消日期 */
    private String canceltime_p = "";/* 取消时间 */
    private Date modifydate_p = sdf;/* 修改日期 */
    private String modifytime_p = "";/* 修改时间 */
    private String package_p = "";/* 套餐代码 */
    private BigDecimal packagenum_p = BigDecimal.valueOf(0.00);/* 套餐份数 */
    private String telephone_p = "";/* 电话号码 */
    private String status_p = "";/* 状态 N-初始  A-到店  F-完成 C-取消 */
    private String pstatus_p = "";/* 状态 空-未付款 P-已付款 */
    private String channel_signal_p = "";/* 渠道标示(支付号等) */
    private String creator_p = "";/* 创建人 */
    private String requestip_p = "";/* 订单来源的IP地址 */
    private String modify_p = "";/* 修改人 */
    private String modifyip_p = "";/* 修改人IP */
    private String name_p = "";/* 订单名 */
    private String idnumber_p = "";/* 证件号 */
    private String ratecode_p = "";/* 价格代码 */
    private String sales_p = "";/* 销售员 */
    private String info_p = "";/* 备注 */
    private Boolean hasroom_p = false;/* 是否有客房预定 */
    private Boolean hasticket_p = false;/* 是否有门票预定 */
    private Boolean hascatering_p = false;/* 是否有餐饮预定 */
    private Boolean hasmeeting_p = false;/* 是否有会议预定 */
    private Boolean hasboat_p = false;/* 是否有车船预定 */
    private Boolean hasspa_p = false;/* 是否有SPA预定 */
    private Boolean hasentertainment_p = false;/* 是否有娱乐预定 */
    private BigDecimal roomprice_p = BigDecimal.valueOf(0.00);/* 客房价格 */
    private BigDecimal ticketprice_p = BigDecimal.valueOf(0.00);/* 门票价格 */
    private BigDecimal cateringprice_p = BigDecimal.valueOf(0.00);/* 餐饮价格 */
    private BigDecimal meetingprice_p = BigDecimal.valueOf(0.00);/* 会议价格 */
    private BigDecimal spaprice_p = BigDecimal.valueOf(0.00);/* SPA价格 */
    private BigDecimal boatprice_p = BigDecimal.valueOf(0.00);/* 车船价格 */
    private BigDecimal enterprice_p = BigDecimal.valueOf(0.00);/* 娱乐价格 */
    private BigDecimal roomdeposit_p = BigDecimal.valueOf(0.00);/* 客房定金 */
    private BigDecimal ticketdeposit_p = BigDecimal.valueOf(0.00);/* 门票定金 */
    private BigDecimal cateringdeposit_p = BigDecimal.valueOf(0.00);/* 餐饮定金 */
    private BigDecimal meetingdeposit_p = BigDecimal.valueOf(0.00);/* 会议定金 */
    private BigDecimal enterdeposit_p = BigDecimal.valueOf(0.00);/* 娱乐定金 */
    private BigDecimal deposit_p = BigDecimal.valueOf(0.00);/* 未分配定金 */
    private String profileid_p = "";/* 档案号 */
    private Date packstart_p = sdf;/* 套餐资源扣减开始日期 */
    private Date packend_p = sdf;/* 套餐资源扣减结束日期 */
    private Boolean isgroup_p = false;/* 团队 */

    @Id
    @SequenceGenerator(name = "Col_rs", sequenceName = "Col_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Col_rs")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
    }

    @Column(length = 20, nullable = true, name = "[section]")
    public String getSection_p() {
        return EntityUtil.cutOffStr(section_p, this.getClass(), "section_p");
    }

    public void setSection_p(String section_p) {
        this.section_p = EntityUtil.cutOffStr(section_p, this.getClass(), "section_p");
    }

    @Column(length = 20, nullable = true, name = "[channel]")
    public String getChannel_p() {
        return EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    public void setChannel_p(String channel_p) {
        this.channel_p = EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    @Column(length = 20, nullable = true, name = "[channelsource]")
    public String getChannelsource_p() {
        return EntityUtil.cutOffStr(channelsource_p, this.getClass(), "channelsource_p");
    }

    public void setChannelsource_p(String channelsource_p) {
        this.channelsource_p = EntityUtil.cutOffStr(channelsource_p, this.getClass(), "channelsource_p");
    }

    @Column(length = 20, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    @Column(length = 50, nullable = true, name = "[channelno]")
    public String getChannelno_p() {
        return EntityUtil.cutOffStr(channelno_p, this.getClass(), "channelno_p");
    }

    public void setChannelno_p(String channelno_p) {
        this.channelno_p = EntityUtil.cutOffStr(channelno_p, this.getClass(), "channelno_p");
    }

    @Column(length = 50, nullable = true, name = "[pmscolno]")
    public String getPmscolno_p() {
        return EntityUtil.cutOffStr(pmscolno_p, this.getClass(), "pmscolno_p");
    }

    public void setPmscolno_p(String pmscolno_p) {
        this.pmscolno_p = EntityUtil.cutOffStr(pmscolno_p, this.getClass(), "pmscolno_p");
    }

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    @Column(nullable = true, name = "[arrdate]")
    public Date getArrdate_p() {
        return null == arrdate_p ? EntityUtil.stringToDate("1900-01-01") : arrdate_p;
    }

    public void setArrdate_p(Date arrdate_p) {
        this.arrdate_p = null == arrdate_p ? EntityUtil.stringToDate("1900-01-01") : arrdate_p;
    }

    @Column(nullable = true, name = "[enddate]")
    public Date getEnddate_p() {
        return null == enddate_p ? EntityUtil.stringToDate("1900-01-01") : enddate_p;
    }

    public void setEnddate_p(Date enddate_p) {
        this.enddate_p = null == enddate_p ? EntityUtil.stringToDate("1900-01-01") : enddate_p;
    }

    @Column(nullable = true, name = "[createdate]")
    public Date getCreatedate_p() {
        return null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    public void setCreatedate_p(Date createdate_p) {
        this.createdate_p = null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    @Column(length = 10, nullable = true, name = "[createtime]")
    public String getCreatetime_p() {
        return EntityUtil.cutOffStr(createtime_p, this.getClass(), "createtime_p");
    }

    public void setCreatetime_p(String createtime_p) {
        this.createtime_p = EntityUtil.cutOffStr(createtime_p, this.getClass(), "createtime_p");
    }

    @Column(nullable = true, name = "[canceldate]")
    public Date getCanceldate_p() {
        return null == canceldate_p ? EntityUtil.stringToDate("1900-01-01") : canceldate_p;
    }

    public void setCanceldate_p(Date canceldate_p) {
        this.canceldate_p = null == canceldate_p ? EntityUtil.stringToDate("1900-01-01") : canceldate_p;
    }

    @Column(length = 10, nullable = true, name = "[canceltime]")
    public String getCanceltime_p() {
        return EntityUtil.cutOffStr(canceltime_p, this.getClass(), "canceltime_p");
    }

    public void setCanceltime_p(String canceltime_p) {
        this.canceltime_p = EntityUtil.cutOffStr(canceltime_p, this.getClass(), "canceltime_p");
    }

    @Column(nullable = true, name = "[modifydate]")
    public Date getModifydate_p() {
        return null == modifydate_p ? EntityUtil.stringToDate("1900-01-01") : modifydate_p;
    }

    public void setModifydate_p(Date modifydate_p) {
        this.modifydate_p = null == modifydate_p ? EntityUtil.stringToDate("1900-01-01") : modifydate_p;
    }

    @Column(length = 10, nullable = true, name = "[modifytime]")
    public String getModifytime_p() {
        return EntityUtil.cutOffStr(modifytime_p, this.getClass(), "modifytime_p");
    }

    public void setModifytime_p(String modifytime_p) {
        this.modifytime_p = EntityUtil.cutOffStr(modifytime_p, this.getClass(), "modifytime_p");
    }

    @Column(length = 20, nullable = true, name = "[package]")
    public String getPackage_p() {
        return EntityUtil.cutOffStr(package_p, this.getClass(), "package_p");
    }

    public void setPackage_p(String package_p) {
        this.package_p = EntityUtil.cutOffStr(package_p, this.getClass(), "package_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[packagenum]")
    public BigDecimal getPackagenum_p() {
        return packagenum_p == null ? new BigDecimal(0.00) : packagenum_p;
    }

    public Integer getPackagenum_p(int i) {
        return packagenum_p == null ? new BigDecimal(0.00).intValue() : packagenum_p.intValue();
    }

    public void setPackagenum_p(Object packagenum_p) {
        if (packagenum_p == null || "".equals(packagenum_p))
            this.packagenum_p = new BigDecimal("0");
        else
            this.packagenum_p = new BigDecimal(packagenum_p.toString());
        this.packagenum_p = EntityUtil.cutOffDecimal(this.packagenum_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "packagenum_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 1, nullable = true, name = "[pstatus]")
    public String getPstatus_p() {
        return EntityUtil.cutOffStr(pstatus_p, this.getClass(), "pstatus_p");
    }

    public void setPstatus_p(String pstatus_p) {
        this.pstatus_p = EntityUtil.cutOffStr(pstatus_p, this.getClass(), "pstatus_p");
    }

    @Column(length = 60, nullable = true, name = "[channel_signal]")
    public String getChannel_signal_p() {
        return EntityUtil.cutOffStr(channel_signal_p, this.getClass(), "channel_signal_p");
    }

    public void setChannel_signal_p(String channel_signal_p) {
        this.channel_signal_p = EntityUtil.cutOffStr(channel_signal_p, this.getClass(), "channel_signal_p");
    }

    @Column(length = 20, nullable = true, name = "[creator]")
    public String getCreator_p() {
        return EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    public void setCreator_p(String creator_p) {
        this.creator_p = EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    @Column(length = 20, nullable = true, name = "[requestip]")
    public String getRequestip_p() {
        return EntityUtil.cutOffStr(requestip_p, this.getClass(), "requestip_p");
    }

    public void setRequestip_p(String requestip_p) {
        this.requestip_p = EntityUtil.cutOffStr(requestip_p, this.getClass(), "requestip_p");
    }

    @Column(length = 20, nullable = true, name = "[modify]")
    public String getModify_p() {
        return EntityUtil.cutOffStr(modify_p, this.getClass(), "modify_p");
    }

    public void setModify_p(String modify_p) {
        this.modify_p = EntityUtil.cutOffStr(modify_p, this.getClass(), "modify_p");
    }

    @Column(length = 20, nullable = true, name = "[modifyip]")
    public String getModifyip_p() {
        return EntityUtil.cutOffStr(modifyip_p, this.getClass(), "modifyip_p");
    }

    public void setModifyip_p(String modifyip_p) {
        this.modifyip_p = EntityUtil.cutOffStr(modifyip_p, this.getClass(), "modifyip_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 20, nullable = true, name = "[idnumber]")
    public String getIdnumber_p() {
        return EntityUtil.cutOffStr(idnumber_p, this.getClass(), "idnumber_p");
    }

    public void setIdnumber_p(String idnumber_p) {
        this.idnumber_p = EntityUtil.cutOffStr(idnumber_p, this.getClass(), "idnumber_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 20, nullable = true, name = "[sales]")
    public String getSales_p() {
        return EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    public void setSales_p(String sales_p) {
        this.sales_p = EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[info]")
    public String getInfo_p() {
        return EntityUtil.cutOffStr(info_p, this.getClass(), "info_p");
    }

    public void setInfo_p(String info_p) {
        this.info_p = EntityUtil.cutOffStr(info_p, this.getClass(), "info_p");
    }

    @Column(length = 1, nullable = true, name = "[hasroom]")
    public Boolean getHasroom_p() {
        return null == hasroom_p ? false : hasroom_p;
    }

    public void setHasroom_p(Boolean hasroom_p) {
        this.hasroom_p = null == hasroom_p ? false : hasroom_p;
    }

    @Column(length = 1, nullable = true, name = "[hasticket]")
    public Boolean getHasticket_p() {
        return null == hasticket_p ? false : hasticket_p;
    }

    public void setHasticket_p(Boolean hasticket_p) {
        this.hasticket_p = null == hasticket_p ? false : hasticket_p;
    }

    @Column(length = 1, nullable = true, name = "[hascatering]")
    public Boolean getHascatering_p() {
        return null == hascatering_p ? false : hascatering_p;
    }

    public void setHascatering_p(Boolean hascatering_p) {
        this.hascatering_p = null == hascatering_p ? false : hascatering_p;
    }

    @Column(length = 1, nullable = true, name = "[hasmeeting]")
    public Boolean getHasmeeting_p() {
        return null == hasmeeting_p ? false : hasmeeting_p;
    }

    public void setHasmeeting_p(Boolean hasmeeting_p) {
        this.hasmeeting_p = null == hasmeeting_p ? false : hasmeeting_p;
    }

    @Column(length = 1, nullable = true, name = "[hasboat]")
    public Boolean getHasboat_p() {
        return null == hasboat_p ? false : hasboat_p;
    }

    public void setHasboat_p(Boolean hasboat_p) {
        this.hasboat_p = null == hasboat_p ? false : hasboat_p;
    }

    @Column(length = 1, nullable = true, name = "[hasspa]")
    public Boolean getHasspa_p() {
        return null == hasspa_p ? false : hasspa_p;
    }

    public void setHasspa_p(Boolean hasspa_p) {
        this.hasspa_p = null == hasspa_p ? false : hasspa_p;
    }

    @Column(length = 1, nullable = true, name = "[hasentertainment]")
    public Boolean getHasentertainment_p() {
        return null == hasentertainment_p ? false : hasentertainment_p;
    }

    public void setHasentertainment_p(Boolean hasentertainment_p) {
        this.hasentertainment_p = null == hasentertainment_p ? false : hasentertainment_p;
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[roomprice]")
    public BigDecimal getRoomprice_p() {
        return roomprice_p == null ? new BigDecimal(0.00) : roomprice_p;
    }

    public Double getRoomprice_p(int i) {
        return Double.valueOf(roomprice_p.toString());
    }

    public void setRoomprice_p(Object roomprice_p) {
        if (roomprice_p == null || "".equals(roomprice_p))
            this.roomprice_p = new BigDecimal("0");
        else
            this.roomprice_p = new BigDecimal(roomprice_p.toString());
        this.roomprice_p = EntityUtil.cutOffDecimal(this.roomprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "roomprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[ticketprice]")
    public BigDecimal getTicketprice_p() {
        return ticketprice_p == null ? new BigDecimal(0.00) : ticketprice_p;
    }

    public Double getTicketprice_p(int i) {
        return Double.valueOf(ticketprice_p.toString());
    }

    public void setTicketprice_p(Object ticketprice_p) {
        if (ticketprice_p == null || "".equals(ticketprice_p))
            this.ticketprice_p = new BigDecimal("0");
        else
            this.ticketprice_p = new BigDecimal(ticketprice_p.toString());
        this.ticketprice_p = EntityUtil.cutOffDecimal(this.ticketprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "ticketprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[cateringprice]")
    public BigDecimal getCateringprice_p() {
        return cateringprice_p == null ? new BigDecimal(0.00) : cateringprice_p;
    }

    public Double getCateringprice_p(int i) {
        return Double.valueOf(cateringprice_p.toString());
    }

    public void setCateringprice_p(Object cateringprice_p) {
        if (cateringprice_p == null || "".equals(cateringprice_p))
            this.cateringprice_p = new BigDecimal("0");
        else
            this.cateringprice_p = new BigDecimal(cateringprice_p.toString());
        this.cateringprice_p = EntityUtil.cutOffDecimal(this.cateringprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "cateringprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[meetingprice]")
    public BigDecimal getMeetingprice_p() {
        return meetingprice_p == null ? new BigDecimal(0.00) : meetingprice_p;
    }

    public Double getMeetingprice_p(int i) {
        return Double.valueOf(meetingprice_p.toString());
    }

    public void setMeetingprice_p(Object meetingprice_p) {
        if (meetingprice_p == null || "".equals(meetingprice_p))
            this.meetingprice_p = new BigDecimal("0");
        else
            this.meetingprice_p = new BigDecimal(meetingprice_p.toString());
        this.meetingprice_p = EntityUtil.cutOffDecimal(this.meetingprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "meetingprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[spaprice]")
    public BigDecimal getSpaprice_p() {
        return spaprice_p == null ? new BigDecimal(0.00) : spaprice_p;
    }

    public Double getSpaprice_p(int i) {
        return Double.valueOf(spaprice_p.toString());
    }

    public void setSpaprice_p(Object spaprice_p) {
        if (spaprice_p == null || "".equals(spaprice_p))
            this.spaprice_p = new BigDecimal("0");
        else
            this.spaprice_p = new BigDecimal(spaprice_p.toString());
        this.spaprice_p = EntityUtil.cutOffDecimal(this.spaprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "spaprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[boatprice]")
    public BigDecimal getBoatprice_p() {
        return boatprice_p == null ? new BigDecimal(0.00) : boatprice_p;
    }

    public Double getBoatprice_p(int i) {
        return Double.valueOf(boatprice_p.toString());
    }

    public void setBoatprice_p(Object boatprice_p) {
        if (boatprice_p == null || "".equals(boatprice_p))
            this.boatprice_p = new BigDecimal("0");
        else
            this.boatprice_p = new BigDecimal(boatprice_p.toString());
        this.boatprice_p = EntityUtil.cutOffDecimal(this.boatprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "boatprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[enterprice]")
    public BigDecimal getEnterprice_p() {
        return enterprice_p == null ? new BigDecimal(0.00) : enterprice_p;
    }

    public Double getEnterprice_p(int i) {
        return Double.valueOf(enterprice_p.toString());
    }

    public void setEnterprice_p(Object enterprice_p) {
        if (enterprice_p == null || "".equals(enterprice_p))
            this.enterprice_p = new BigDecimal("0");
        else
            this.enterprice_p = new BigDecimal(enterprice_p.toString());
        this.enterprice_p = EntityUtil.cutOffDecimal(this.enterprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "enterprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[roomdeposit]")
    public BigDecimal getRoomdeposit_p() {
        return roomdeposit_p == null ? new BigDecimal(0.00) : roomdeposit_p;
    }

    public Double getRoomdeposit_p(int i) {
        return Double.valueOf(roomdeposit_p.toString());
    }

    public void setRoomdeposit_p(Object roomdeposit_p) {
        if (roomdeposit_p == null || "".equals(roomdeposit_p))
            this.roomdeposit_p = new BigDecimal("0");
        else
            this.roomdeposit_p = new BigDecimal(roomdeposit_p.toString());
        this.roomdeposit_p = EntityUtil.cutOffDecimal(this.roomdeposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "roomdeposit_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[ticketdeposit]")
    public BigDecimal getTicketdeposit_p() {
        return ticketdeposit_p == null ? new BigDecimal(0.00) : ticketdeposit_p;
    }

    public Double getTicketdeposit_p(int i) {
        return Double.valueOf(ticketdeposit_p.toString());
    }

    public void setTicketdeposit_p(Object ticketdeposit_p) {
        if (ticketdeposit_p == null || "".equals(ticketdeposit_p))
            this.ticketdeposit_p = new BigDecimal("0");
        else
            this.ticketdeposit_p = new BigDecimal(ticketdeposit_p.toString());
        this.ticketdeposit_p = EntityUtil.cutOffDecimal(this.ticketdeposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "ticketdeposit_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[cateringdeposit]")
    public BigDecimal getCateringdeposit_p() {
        return cateringdeposit_p == null ? new BigDecimal(0.00) : cateringdeposit_p;
    }

    public Double getCateringdeposit_p(int i) {
        return Double.valueOf(cateringdeposit_p.toString());
    }

    public void setCateringdeposit_p(Object cateringdeposit_p) {
        if (cateringdeposit_p == null || "".equals(cateringdeposit_p))
            this.cateringdeposit_p = new BigDecimal("0");
        else
            this.cateringdeposit_p = new BigDecimal(cateringdeposit_p.toString());
        this.cateringdeposit_p = EntityUtil.cutOffDecimal(this.cateringdeposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "cateringdeposit_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[meetingdeposit]")
    public BigDecimal getMeetingdeposit_p() {
        return meetingdeposit_p == null ? new BigDecimal(0.00) : meetingdeposit_p;
    }

    public Double getMeetingdeposit_p(int i) {
        return Double.valueOf(meetingdeposit_p.toString());
    }

    public void setMeetingdeposit_p(Object meetingdeposit_p) {
        if (meetingdeposit_p == null || "".equals(meetingdeposit_p))
            this.meetingdeposit_p = new BigDecimal("0");
        else
            this.meetingdeposit_p = new BigDecimal(meetingdeposit_p.toString());
        this.meetingdeposit_p = EntityUtil.cutOffDecimal(this.meetingdeposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "meetingdeposit_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[enterdeposit]")
    public BigDecimal getEnterdeposit_p() {
        return enterdeposit_p == null ? new BigDecimal(0.00) : enterdeposit_p;
    }

    public Double getEnterdeposit_p(int i) {
        return Double.valueOf(enterdeposit_p.toString());
    }

    public void setEnterdeposit_p(Object enterdeposit_p) {
        if (enterdeposit_p == null || "".equals(enterdeposit_p))
            this.enterdeposit_p = new BigDecimal("0");
        else
            this.enterdeposit_p = new BigDecimal(enterdeposit_p.toString());
        this.enterdeposit_p = EntityUtil.cutOffDecimal(this.enterdeposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "enterdeposit_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[deposit]")
    public BigDecimal getDeposit_p() {
        return deposit_p == null ? new BigDecimal(0.00) : deposit_p;
    }

    public Double getDeposit_p(int i) {
        return Double.valueOf(deposit_p.toString());
    }

    public void setDeposit_p(Object deposit_p) {
        if (deposit_p == null || "".equals(deposit_p))
            this.deposit_p = new BigDecimal("0");
        else
            this.deposit_p = new BigDecimal(deposit_p.toString());
        this.deposit_p = EntityUtil.cutOffDecimal(this.deposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "deposit_p");
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(nullable = true, name = "[packstart]")
    public Date getPackstart_p() {
        return null == packstart_p ? EntityUtil.stringToDate("1900-01-01") : packstart_p;
    }

    public void setPackstart_p(Date packstart_p) {
        this.packstart_p = null == packstart_p ? EntityUtil.stringToDate("1900-01-01") : packstart_p;
    }

    @Column(nullable = true, name = "[packend]")
    public Date getPackend_p() {
        return null == packend_p ? EntityUtil.stringToDate("1900-01-01") : packend_p;
    }

    public void setPackend_p(Date packend_p) {
        this.packend_p = null == packend_p ? EntityUtil.stringToDate("1900-01-01") : packend_p;
    }

    @Column(length = 1, nullable = true, name = "[isgroup]")
    public Boolean getIsgroup_p() {
        return null == isgroup_p ? false : isgroup_p;
    }

    public void setIsgroup_p(Boolean isgroup_p) {
        this.isgroup_p = null == isgroup_p ? false : isgroup_p;
    }
}
