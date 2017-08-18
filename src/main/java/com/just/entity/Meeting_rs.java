package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Meeting_rs")
public class Meeting_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道 */
    private String bookingid_p = "";/* 会议订单号 */
    private String interfaceid_p = "";/* 第三方订单号 */
    private String colno_p = "";/* 综合预定号 */
    private String profileid_p = "";/* 档案号 */
    private String name_p = "";/* 客户名 */
    private String meetingname_p = "";/* 会议名称 */
    private String telephone_p = "";/* 电话号码 */
    private Date start_p = sdf;/* 开始日期 */
    private Date end_p = sdf;/* 结束日期 */
    private String site_p = "";/* 会场代码 */
    private String room_p = "";/* 会议厅代码 */
    private String ratecode_p = "";/* 价格代码 */
    private String payment_p = "";/* 付款方式微信,淘宝等 */
    private BigDecimal amount_p = BigDecimal.valueOf(0.00);/* 会议预定总价 */
    private BigDecimal deposit_p = BigDecimal.valueOf(0.00);/* 定金 */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 人数 */
    private String sales_p = "";/* 销售员 */
    private String timearea_p = "";/* 时间段 */
    private String info_p = "";/* 备注 */
    private String status_p = "";/* 状态  N=预定, A=开始, C=取消, F=完成 */
    private Date created_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private String modify_p = "";/* 修改人 */
    private String modifyip_p = "";/* 修改人IP */
    private Date modifydate_p = sdf;/* 修改日期 */
    private String modifytime_p = "";/* 修改时间 */

    @Id
    @SequenceGenerator(name = "Meeting_rs", sequenceName = "Meeting_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Meeting_rs")
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

    @Column(length = 20, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
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

    @Column(length = 60, nullable = true, name = "[meetingname]")
    public String getMeetingname_p() {
        return EntityUtil.cutOffStr(meetingname_p, this.getClass(), "meetingname_p");
    }

    public void setMeetingname_p(String meetingname_p) {
        this.meetingname_p = EntityUtil.cutOffStr(meetingname_p, this.getClass(), "meetingname_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(nullable = true, name = "[start]")
    public Date getStart_p() {
        return null == start_p ? EntityUtil.stringToDate("1900-01-01") : start_p;
    }

    public void setStart_p(Date start_p) {
        this.start_p = null == start_p ? EntityUtil.stringToDate("1900-01-01") : start_p;
    }

    @Column(nullable = true, name = "[end]")
    public Date getEnd_p() {
        return null == end_p ? EntityUtil.stringToDate("1900-01-01") : end_p;
    }

    public void setEnd_p(Date end_p) {
        this.end_p = null == end_p ? EntityUtil.stringToDate("1900-01-01") : end_p;
    }

    @Column(length = 30, nullable = true, name = "[site]")
    public String getSite_p() {
        return EntityUtil.cutOffStr(site_p, this.getClass(), "site_p");
    }

    public void setSite_p(String site_p) {
        this.site_p = EntityUtil.cutOffStr(site_p, this.getClass(), "site_p");
    }

    @Column(length = 30, nullable = true, name = "[room]")
    public String getRoom_p() {
        return EntityUtil.cutOffStr(room_p, this.getClass(), "room_p");
    }

    public void setRoom_p(String room_p) {
        this.room_p = EntityUtil.cutOffStr(room_p, this.getClass(), "room_p");
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

    @Column(precision = 12, scale = 2, nullable = true, name = "[amount]")
    public BigDecimal getAmount_p() {
        return amount_p == null ? new BigDecimal(0.00) : amount_p;
    }

    public Double getAmount_p(int i) {
        return Double.valueOf(amount_p.toString());
    }

    public void setAmount_p(Object amount_p) {
        if (amount_p == null || "".equals(amount_p))
            this.amount_p = new BigDecimal("0");
        else
            this.amount_p = new BigDecimal(amount_p.toString());
        this.amount_p = EntityUtil.cutOffDecimal(this.amount_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "amount_p");
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

    @Column(precision = 8, scale = 0, nullable = true, name = "[num]")
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

    @Column(length = 60, nullable = true, name = "[timearea]")
    public String getTimearea_p() {
        return EntityUtil.cutOffStr(timearea_p, this.getClass(), "timearea_p");
    }

    public void setTimearea_p(String timearea_p) {
        this.timearea_p = EntityUtil.cutOffStr(timearea_p, this.getClass(), "timearea_p");
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

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(nullable = true, name = "[created]")
    public Date getCreated_p() {
        return null == created_p ? EntityUtil.stringToDate("1900-01-01") : created_p;
    }

    public void setCreated_p(Date created_p) {
        this.created_p = null == created_p ? EntityUtil.stringToDate("1900-01-01") : created_p;
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
}
