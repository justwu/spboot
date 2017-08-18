package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Prepay_handbills")
public class Prepay_handbills implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String billno_p = "";/* 手工单号 */
    private String onlineno_p = "";/* 网络手工单号 */
    private String payno_p = "";/* 预付款订单号 */
    private Date date_p = sdf;/* 手工单日期 */
    private BigDecimal amount_p = BigDecimal.valueOf(0.00);/* 手工单金额 */
    private String payment_p = "";/* 付款方式微信,淘宝等 */
    private Date created_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */

    @Id
    @SequenceGenerator(name = "Prepay_handbills", sequenceName = "Prepay_handbills_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Prepay_handbills")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
    }

    @Column(length = 20, nullable = true, name = "[billno]")
    public String getBillno_p() {
        return EntityUtil.cutOffStr(billno_p, this.getClass(), "billno_p");
    }

    public void setBillno_p(String billno_p) {
        this.billno_p = EntityUtil.cutOffStr(billno_p, this.getClass(), "billno_p");
    }

    @Column(length = 60, nullable = true, name = "[onlineno]")
    public String getOnlineno_p() {
        return EntityUtil.cutOffStr(onlineno_p, this.getClass(), "onlineno_p");
    }

    public void setOnlineno_p(String onlineno_p) {
        this.onlineno_p = EntityUtil.cutOffStr(onlineno_p, this.getClass(), "onlineno_p");
    }

    @Column(length = 20, nullable = true, name = "[payno]")
    public String getPayno_p() {
        return EntityUtil.cutOffStr(payno_p, this.getClass(), "payno_p");
    }

    public void setPayno_p(String payno_p) {
        this.payno_p = EntityUtil.cutOffStr(payno_p, this.getClass(), "payno_p");
    }

    @Column(nullable = true, name = "[date]")
    public Date getDate_p() {
        return null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    public void setDate_p(Date date_p) {
        this.date_p = null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
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

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
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
