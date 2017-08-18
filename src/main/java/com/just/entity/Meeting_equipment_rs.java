package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Meeting_equipment_rs")
public class Meeting_equipment_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String bookingid_p = "";/* 会议订单号 */
    private String meetingid_p = "";/* 会议子订单号 */
    private String code_p = "";/* 设备代码 */
    private BigDecimal amount_p = BigDecimal.valueOf(0.00);/* 价格 */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 数量 */
    private Date created_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */

    @Id
    @SequenceGenerator(name = "Meeting_equipment_rs", sequenceName = "Meeting_equipment_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Meeting_equipment_rs")
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

    @Column(length = 30, nullable = true, name = "[code]")
    public String getCode_p() {
        return EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    public void setCode_p(String code_p) {
        this.code_p = EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
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
}
