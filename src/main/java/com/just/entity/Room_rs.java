package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Room_rs")
public class Room_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String guestname_p = "";/* 客人姓名 */
    private Date arrdate_p = sdf;/* 到店日期 */
    private Date deptdate_p = sdf;/* 离店日期 */
    private BigDecimal anz_p = BigDecimal.valueOf(0.00);/* 房间数 */
    private String adult_p = "";/* 大人 */
    private String child_p = "";/* 小孩 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 房价 */
    private String remark_p = "";/* 备注 */
    private String ratecode_p = "";/* 房价代码 */
    private String rmtype_p = "";/* 房型 */
    private String channel_p = "";/* 渠道大组 */
    private Boolean fixrate_p = false;/* 是否固定价格 */
    private String regno_p = "";/* 平台预订号 */
    private String colno_p = "";/* 平台综合预订号 */
    private String pmsno_p = "";/* 线下预订号 */
    private String otano_p = "";/* 第三方订单号 */
    private String channelsource_p = "";/* 二级渠道代码为了方便以后的细分.还没用上 */
    private String createuserid_p = "";/* 创建者 */
    private Date createdate_p = sdf;/* 创建日期 */
    private Date canceldate_p = sdf;/* 取消日期 */
    private String status_p = "";/* 状态 */
    private String payment_p = "";/* 付款方式 */
    private String hotelcode_p = "";/* 景区酒店代码 */
    private String pricedetail_p = "";/* 每日的价格详情信息 */
    private String guestphone_p = "";/* 客人手机 */
    private BigDecimal totalprice_p = BigDecimal.valueOf(0.00);/* 总房价 */
    private String profileid_p = "";/* 档案号 */
    private String shareid_p = "";/* 合住ID标示 */
    private String roomno_p = "";/* 房间号 */
    private String groupid_p = "";/* 团队档案号 */
    private String companyid_p = "";/* 公司档案号 */
    private String travelid_p = "";/* 旅行社档案号 */
    private String sourceid_p = "";/* 网站档案号 */
    private String kitcode_p = "";/* 套餐代码 */
    private String policycode_p = "";/* 优先价格代码 */
    private BigDecimal itemid_p = BigDecimal.valueOf(0.00);/* 产品ID */
    private String pmscode_p = "";/* PMS的ratedetail记录ratecode */

    @Id
    @SequenceGenerator(name = "Room_rs", sequenceName = "Room_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Room_rs")
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

    @Column(length = 60, nullable = true, name = "[guestname]")
    public String getGuestname_p() {
        return EntityUtil.cutOffStr(guestname_p, this.getClass(), "guestname_p");
    }

    public void setGuestname_p(String guestname_p) {
        this.guestname_p = EntityUtil.cutOffStr(guestname_p, this.getClass(), "guestname_p");
    }

    @Column(nullable = true, name = "[arrdate]")
    public Date getArrdate_p() {
        return null == arrdate_p ? EntityUtil.stringToDate("1900-01-01") : arrdate_p;
    }

    public void setArrdate_p(Date arrdate_p) {
        this.arrdate_p = null == arrdate_p ? EntityUtil.stringToDate("1900-01-01") : arrdate_p;
    }

    @Column(nullable = true, name = "[deptdate]")
    public Date getDeptdate_p() {
        return null == deptdate_p ? EntityUtil.stringToDate("1900-01-01") : deptdate_p;
    }

    public void setDeptdate_p(Date deptdate_p) {
        this.deptdate_p = null == deptdate_p ? EntityUtil.stringToDate("1900-01-01") : deptdate_p;
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[anz]")
    public BigDecimal getAnz_p() {
        return anz_p == null ? new BigDecimal(0.00) : anz_p;
    }

    public Integer getAnz_p(int i) {
        return anz_p == null ? new BigDecimal(0.00).intValue() : anz_p.intValue();
    }

    public void setAnz_p(Object anz_p) {
        if (anz_p == null || "".equals(anz_p))
            this.anz_p = new BigDecimal("0");
        else
            this.anz_p = new BigDecimal(anz_p.toString());
        this.anz_p = EntityUtil.cutOffDecimal(this.anz_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "anz_p");
    }

    @Column(length = 3, nullable = true, name = "[adult]")
    public String getAdult_p() {
        return EntityUtil.cutOffStr(adult_p, this.getClass(), "adult_p");
    }

    public void setAdult_p(String adult_p) {
        this.adult_p = EntityUtil.cutOffStr(adult_p, this.getClass(), "adult_p");
    }

    @Column(length = 3, nullable = true, name = "[child]")
    public String getChild_p() {
        return EntityUtil.cutOffStr(child_p, this.getClass(), "child_p");
    }

    public void setChild_p(String child_p) {
        this.child_p = EntityUtil.cutOffStr(child_p, this.getClass(), "child_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[price]")
    public BigDecimal getPrice_p() {
        return price_p == null ? new BigDecimal(0.00) : price_p;
    }

    public Double getPrice_p(int i) {
        return Double.valueOf(price_p.toString());
    }

    public void setPrice_p(Object price_p) {
        if (price_p == null || "".equals(price_p))
            this.price_p = new BigDecimal("0");
        else
            this.price_p = new BigDecimal(price_p.toString());
        this.price_p = EntityUtil.cutOffDecimal(this.price_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "price_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[remark]")
    public String getRemark_p() {
        return EntityUtil.cutOffStr(remark_p, this.getClass(), "remark_p");
    }

    public void setRemark_p(String remark_p) {
        this.remark_p = EntityUtil.cutOffStr(remark_p, this.getClass(), "remark_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 20, nullable = true, name = "[rmtype]")
    public String getRmtype_p() {
        return EntityUtil.cutOffStr(rmtype_p, this.getClass(), "rmtype_p");
    }

    public void setRmtype_p(String rmtype_p) {
        this.rmtype_p = EntityUtil.cutOffStr(rmtype_p, this.getClass(), "rmtype_p");
    }

    @Column(length = 20, nullable = true, name = "[channel]")
    public String getChannel_p() {
        return EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    public void setChannel_p(String channel_p) {
        this.channel_p = EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    @Column(length = 1, nullable = true, name = "[fixrate]")
    public Boolean getFixrate_p() {
        return null == fixrate_p ? false : fixrate_p;
    }

    public void setFixrate_p(Boolean fixrate_p) {
        this.fixrate_p = null == fixrate_p ? false : fixrate_p;
    }

    @Column(length = 60, nullable = true, name = "[regno]")
    public String getRegno_p() {
        return EntityUtil.cutOffStr(regno_p, this.getClass(), "regno_p");
    }

    public void setRegno_p(String regno_p) {
        this.regno_p = EntityUtil.cutOffStr(regno_p, this.getClass(), "regno_p");
    }

    @Column(length = 60, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    @Column(length = 60, nullable = true, name = "[pmsno]")
    public String getPmsno_p() {
        return EntityUtil.cutOffStr(pmsno_p, this.getClass(), "pmsno_p");
    }

    public void setPmsno_p(String pmsno_p) {
        this.pmsno_p = EntityUtil.cutOffStr(pmsno_p, this.getClass(), "pmsno_p");
    }

    @Column(length = 60, nullable = true, name = "[otano]")
    public String getOtano_p() {
        return EntityUtil.cutOffStr(otano_p, this.getClass(), "otano_p");
    }

    public void setOtano_p(String otano_p) {
        this.otano_p = EntityUtil.cutOffStr(otano_p, this.getClass(), "otano_p");
    }

    @Column(length = 60, nullable = true, name = "[channelsource]")
    public String getChannelsource_p() {
        return EntityUtil.cutOffStr(channelsource_p, this.getClass(), "channelsource_p");
    }

    public void setChannelsource_p(String channelsource_p) {
        this.channelsource_p = EntityUtil.cutOffStr(channelsource_p, this.getClass(), "channelsource_p");
    }

    @Column(length = 60, nullable = true, name = "[createuserid]")
    public String getCreateuserid_p() {
        return EntityUtil.cutOffStr(createuserid_p, this.getClass(), "createuserid_p");
    }

    public void setCreateuserid_p(String createuserid_p) {
        this.createuserid_p = EntityUtil.cutOffStr(createuserid_p, this.getClass(), "createuserid_p");
    }

    @Column(nullable = true, name = "[createdate]")
    public Date getCreatedate_p() {
        return null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    public void setCreatedate_p(Date createdate_p) {
        this.createdate_p = null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    @Column(nullable = true, name = "[canceldate]")
    public Date getCanceldate_p() {
        return null == canceldate_p ? EntityUtil.stringToDate("1900-01-01") : canceldate_p;
    }

    public void setCanceldate_p(Date canceldate_p) {
        this.canceldate_p = null == canceldate_p ? EntityUtil.stringToDate("1900-01-01") : canceldate_p;
    }

    @Column(length = 2, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    @Column(length = 20, nullable = true, name = "[hotelcode]")
    public String getHotelcode_p() {
        return EntityUtil.cutOffStr(hotelcode_p, this.getClass(), "hotelcode_p");
    }

    public void setHotelcode_p(String hotelcode_p) {
        this.hotelcode_p = EntityUtil.cutOffStr(hotelcode_p, this.getClass(), "hotelcode_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[pricedetail]")
    public String getPricedetail_p() {
        return EntityUtil.cutOffStr(pricedetail_p, this.getClass(), "pricedetail_p");
    }

    public void setPricedetail_p(String pricedetail_p) {
        this.pricedetail_p = EntityUtil.cutOffStr(pricedetail_p, this.getClass(), "pricedetail_p");
    }

    @Column(length = 30, nullable = true, name = "[guestphone]")
    public String getGuestphone_p() {
        return EntityUtil.cutOffStr(guestphone_p, this.getClass(), "guestphone_p");
    }

    public void setGuestphone_p(String guestphone_p) {
        this.guestphone_p = EntityUtil.cutOffStr(guestphone_p, this.getClass(), "guestphone_p");
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

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 30, nullable = true, name = "[shareid]")
    public String getShareid_p() {
        return EntityUtil.cutOffStr(shareid_p, this.getClass(), "shareid_p");
    }

    public void setShareid_p(String shareid_p) {
        this.shareid_p = EntityUtil.cutOffStr(shareid_p, this.getClass(), "shareid_p");
    }

    @Column(length = 30, nullable = true, name = "[roomno]")
    public String getRoomno_p() {
        return EntityUtil.cutOffStr(roomno_p, this.getClass(), "roomno_p");
    }

    public void setRoomno_p(String roomno_p) {
        this.roomno_p = EntityUtil.cutOffStr(roomno_p, this.getClass(), "roomno_p");
    }

    @Column(length = 60, nullable = true, name = "[groupid]")
    public String getGroupid_p() {
        return EntityUtil.cutOffStr(groupid_p, this.getClass(), "groupid_p");
    }

    public void setGroupid_p(String groupid_p) {
        this.groupid_p = EntityUtil.cutOffStr(groupid_p, this.getClass(), "groupid_p");
    }

    @Column(length = 60, nullable = true, name = "[companyid]")
    public String getCompanyid_p() {
        return EntityUtil.cutOffStr(companyid_p, this.getClass(), "companyid_p");
    }

    public void setCompanyid_p(String companyid_p) {
        this.companyid_p = EntityUtil.cutOffStr(companyid_p, this.getClass(), "companyid_p");
    }

    @Column(length = 60, nullable = true, name = "[travelid]")
    public String getTravelid_p() {
        return EntityUtil.cutOffStr(travelid_p, this.getClass(), "travelid_p");
    }

    public void setTravelid_p(String travelid_p) {
        this.travelid_p = EntityUtil.cutOffStr(travelid_p, this.getClass(), "travelid_p");
    }

    @Column(length = 60, nullable = true, name = "[sourceid]")
    public String getSourceid_p() {
        return EntityUtil.cutOffStr(sourceid_p, this.getClass(), "sourceid_p");
    }

    public void setSourceid_p(String sourceid_p) {
        this.sourceid_p = EntityUtil.cutOffStr(sourceid_p, this.getClass(), "sourceid_p");
    }

    @Column(length = 30, nullable = true, name = "[kitcode]")
    public String getKitcode_p() {
        return EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    public void setKitcode_p(String kitcode_p) {
        this.kitcode_p = EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    @Column(length = 30, nullable = true, name = "[policycode]")
    public String getPolicycode_p() {
        return EntityUtil.cutOffStr(policycode_p, this.getClass(), "policycode_p");
    }

    public void setPolicycode_p(String policycode_p) {
        this.policycode_p = EntityUtil.cutOffStr(policycode_p, this.getClass(), "policycode_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[itemid]")
    public BigDecimal getItemid_p() {
        return itemid_p == null ? new BigDecimal(0.00) : itemid_p;
    }

    public Integer getItemid_p(int i) {
        return itemid_p == null ? new BigDecimal(0.00).intValue() : itemid_p.intValue();
    }

    public void setItemid_p(Object itemid_p) {
        if (itemid_p == null || "".equals(itemid_p))
            this.itemid_p = new BigDecimal("0");
        else
            this.itemid_p = new BigDecimal(itemid_p.toString());
        this.itemid_p = EntityUtil.cutOffDecimal(this.itemid_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "itemid_p");
    }

    @Column(length = 20, nullable = true, name = "[pmscode]")
    public String getPmscode_p() {
        return EntityUtil.cutOffStr(pmscode_p, this.getClass(), "pmscode_p");
    }

    public void setPmscode_p(String pmscode_p) {
        this.pmscode_p = EntityUtil.cutOffStr(pmscode_p, this.getClass(), "pmscode_p");
    }
}
