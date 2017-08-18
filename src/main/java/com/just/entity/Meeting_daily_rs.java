package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Meeting_daily_rs")
public class Meeting_daily_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道 */
    private String bookingid_p = "";/* 会议主订单号 */
    private String meetingid_p = "";/* 会议子订单号 */
    private String meetingname_p = "";/* 会议名称 */
    private Date date_p = sdf;/* 会议日期 */
    private String site_p = "";/* 会场代码 */
    private String room_p = "";/* 会议厅代码 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 会议预定价格 */
    private BigDecimal equipamount_p = BigDecimal.valueOf(0.00);/* 设备总价 */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 人数 */
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
    private Boolean defined_p = false;/* 自定义记录 */

    @Id
    @SequenceGenerator(name = "Meeting_daily_rs", sequenceName = "Meeting_daily_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Meeting_daily_rs")
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

    @Column(length = 20, nullable = true, name = "[meetingid]")
    public String getMeetingid_p() {
        return EntityUtil.cutOffStr(meetingid_p, this.getClass(), "meetingid_p");
    }

    public void setMeetingid_p(String meetingid_p) {
        this.meetingid_p = EntityUtil.cutOffStr(meetingid_p, this.getClass(), "meetingid_p");
    }

    @Column(length = 60, nullable = true, name = "[meetingname]")
    public String getMeetingname_p() {
        return EntityUtil.cutOffStr(meetingname_p, this.getClass(), "meetingname_p");
    }

    public void setMeetingname_p(String meetingname_p) {
        this.meetingname_p = EntityUtil.cutOffStr(meetingname_p, this.getClass(), "meetingname_p");
    }

    @Column(nullable = true, name = "[date]")
    public Date getDate_p() {
        return null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    public void setDate_p(Date date_p) {
        this.date_p = null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
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

    @Column(precision = 12, scale = 2, nullable = true, name = "[equipamount]")
    public BigDecimal getEquipamount_p() {
        return equipamount_p == null ? new BigDecimal(0.00) : equipamount_p;
    }

    public Double getEquipamount_p(int i) {
        return Double.valueOf(equipamount_p.toString());
    }

    public void setEquipamount_p(Object equipamount_p) {
        if (equipamount_p == null || "".equals(equipamount_p))
            this.equipamount_p = new BigDecimal("0");
        else
            this.equipamount_p = new BigDecimal(equipamount_p.toString());
        this.equipamount_p = EntityUtil.cutOffDecimal(this.equipamount_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "equipamount_p");
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

    @Column(length = 30, nullable = true, name = "[timearea]")
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

    @Column(length = 1, nullable = true, name = "[defined]")
    public Boolean getDefined_p() {
        return null == defined_p ? false : defined_p;
    }

    public void setDefined_p(Boolean defined_p) {
        this.defined_p = null == defined_p ? false : defined_p;
    }
}
