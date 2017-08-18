package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "GTicket_rs")
public class GTicket_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道 */
    private String bookingid_p = "";/* Yun平台订单号 */
    private String interfaceid_p = "";/* 第三方订单号 */
    private String status_p = "";/* 状态 N-预定 P-出票 R-退票 F-完成 C-取消 */
    private String profileid_p = "";/* 档案号 */
    private String name_p = "";/* 姓名 */
    private String telephone_p = "";/* 电话号码 */
    private String guideid_p = "";/* 导游档案号 */
    private String guide_p = "";/* 导游 */
    private String guidenum_p = "";/* 导游证号 */
    private Date date_p = sdf;/* 游玩时间 */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 数量 */
    private String sales_p = "";/* 销售员 */
    private String area_p = "";/* 客源地区 */
    private String info_p = "";/* 备注 */
    private Date createdate_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private Date canceldate_p = sdf;/* 取消日期 */
    private String canceltime_p = "";/* 取消时间 */
    private String canceler_p = "";/* 取消人 */
    private String cancelip_p = "";/* 取消人IP */
    private BigDecimal totalprice_p = BigDecimal.valueOf(0.00);/* 总价 */
    private String ratecode_p = "";/* 价格代码 */
    private String payment_p = "";/* 付款方式 */

    @Id
    @SequenceGenerator(name = "GTicket_rs", sequenceName = "GTicket_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "GTicket_rs")
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

    @Column(length = 20, nullable = true, name = "[bookingid]")
    public String getBookingid_p() {
        return EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    public void setBookingid_p(String bookingid_p) {
        this.bookingid_p = EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    @Column(length = 20, nullable = true, name = "[interfaceid]")
    public String getInterfaceid_p() {
        return EntityUtil.cutOffStr(interfaceid_p, this.getClass(), "interfaceid_p");
    }

    public void setInterfaceid_p(String interfaceid_p) {
        this.interfaceid_p = EntityUtil.cutOffStr(interfaceid_p, this.getClass(), "interfaceid_p");
    }

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(length = 60, nullable = true, name = "[guideid]")
    public String getGuideid_p() {
        return EntityUtil.cutOffStr(guideid_p, this.getClass(), "guideid_p");
    }

    public void setGuideid_p(String guideid_p) {
        this.guideid_p = EntityUtil.cutOffStr(guideid_p, this.getClass(), "guideid_p");
    }

    @Column(length = 60, nullable = true, name = "[guide]")
    public String getGuide_p() {
        return EntityUtil.cutOffStr(guide_p, this.getClass(), "guide_p");
    }

    public void setGuide_p(String guide_p) {
        this.guide_p = EntityUtil.cutOffStr(guide_p, this.getClass(), "guide_p");
    }

    @Column(length = 60, nullable = true, name = "[guidenum]")
    public String getGuidenum_p() {
        return EntityUtil.cutOffStr(guidenum_p, this.getClass(), "guidenum_p");
    }

    public void setGuidenum_p(String guidenum_p) {
        this.guidenum_p = EntityUtil.cutOffStr(guidenum_p, this.getClass(), "guidenum_p");
    }

    @Column(nullable = true, name = "[date]")
    public Date getDate_p() {
        return null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    public void setDate_p(Date date_p) {
        this.date_p = null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[num]")
    public BigDecimal getNum_p() {
        return num_p == null ? new BigDecimal(0.00) : num_p;
    }

    public Integer getNum_p(int i) {
        return num_p == null ? new BigDecimal(0.00).intValue() : num_p.intValue();
    }

    public void setNum_p(Object num_p) {
        if (num_p == null || "".equals(num_p))
            this.num_p = new BigDecimal("0");
        else
            this.num_p = new BigDecimal(num_p.toString());
        this.num_p = EntityUtil.cutOffDecimal(this.num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "num_p");
    }

    @Column(length = 20, nullable = true, name = "[sales]")
    public String getSales_p() {
        return EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    public void setSales_p(String sales_p) {
        this.sales_p = EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    @Column(length = 20, nullable = true, name = "[area]")
    public String getArea_p() {
        return EntityUtil.cutOffStr(area_p, this.getClass(), "area_p");
    }

    public void setArea_p(String area_p) {
        this.area_p = EntityUtil.cutOffStr(area_p, this.getClass(), "area_p");
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

    @Column(length = 20, nullable = true, name = "[creator]")
    public String getCreator_p() {
        return EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    public void setCreator_p(String creator_p) {
        this.creator_p = EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    @Column(length = 20, nullable = true, name = "[createip]")
    public String getCreateip_p() {
        return EntityUtil.cutOffStr(createip_p, this.getClass(), "createip_p");
    }

    public void setCreateip_p(String createip_p) {
        this.createip_p = EntityUtil.cutOffStr(createip_p, this.getClass(), "createip_p");
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

    @Column(length = 20, nullable = true, name = "[canceler]")
    public String getCanceler_p() {
        return EntityUtil.cutOffStr(canceler_p, this.getClass(), "canceler_p");
    }

    public void setCanceler_p(String canceler_p) {
        this.canceler_p = EntityUtil.cutOffStr(canceler_p, this.getClass(), "canceler_p");
    }

    @Column(length = 20, nullable = true, name = "[cancelip]")
    public String getCancelip_p() {
        return EntityUtil.cutOffStr(cancelip_p, this.getClass(), "cancelip_p");
    }

    public void setCancelip_p(String cancelip_p) {
        this.cancelip_p = EntityUtil.cutOffStr(cancelip_p, this.getClass(), "cancelip_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[totalprice]")
    public BigDecimal getTotalprice_p() {
        return totalprice_p == null ? new BigDecimal(0.00) : totalprice_p;
    }

    public Double getTotalprice_p(int i) {
        return Double.valueOf(totalprice_p.toString());
    }

    public void setTotalprice_p(Object totalprice_p) {
        if (totalprice_p == null || "".equals(totalprice_p))
            this.totalprice_p = new BigDecimal("0");
        else
            this.totalprice_p = new BigDecimal(totalprice_p.toString());
        this.totalprice_p = EntityUtil.cutOffDecimal(this.totalprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "totalprice_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }
}
