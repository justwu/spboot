package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Policydet")
public class Policydet implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 价格优先代码 */
    private Date startdate_p = sdf;/* 使用开始日期 */
    private Date enddate_p = sdf;/* 使用结束日期 */
    private BigDecimal rate1_p = BigDecimal.valueOf(0.00);/* 周一价 */
    private BigDecimal rate2_p = BigDecimal.valueOf(0.00);/* 周二价 */
    private BigDecimal rate3_p = BigDecimal.valueOf(0.00);/* 周三价 */
    private BigDecimal rate4_p = BigDecimal.valueOf(0.00);/* 周四价 */
    private BigDecimal rate5_p = BigDecimal.valueOf(0.00);/* 周五价 */
    private BigDecimal rate6_p = BigDecimal.valueOf(0.00);/* 周六价 */
    private BigDecimal rate7_p = BigDecimal.valueOf(0.00);/* 周日价 */
    private BigDecimal rate_p = BigDecimal.valueOf(0.00);/* 节日一口价 */
    private String productcode_p = "";/* 餐标代码or票类代码Or房型代码 */
    private String type_p = "";/* 价格策略类型/房型or门票or产品  */
    private BigDecimal lv_p = BigDecimal.valueOf(0.00);/* 策略优先等级 */

    @Id
    @SequenceGenerator(name = "Policydet", sequenceName = "Policydet_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Policydet")
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

    @Column(length = 30, nullable = true, name = "[code]")
    public String getCode_p() {
        return EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    public void setCode_p(String code_p) {
        this.code_p = EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    @Column(nullable = true, name = "[startdate]")
    public Date getStartdate_p() {
        return null == startdate_p ? EntityUtil.stringToDate("1900-01-01") : startdate_p;
    }

    public void setStartdate_p(Date startdate_p) {
        this.startdate_p = null == startdate_p ? EntityUtil.stringToDate("1900-01-01") : startdate_p;
    }

    @Column(nullable = true, name = "[enddate]")
    public Date getEnddate_p() {
        return null == enddate_p ? EntityUtil.stringToDate("1900-01-01") : enddate_p;
    }

    public void setEnddate_p(Date enddate_p) {
        this.enddate_p = null == enddate_p ? EntityUtil.stringToDate("1900-01-01") : enddate_p;
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate1]")
    public BigDecimal getRate1_p() {
        return rate1_p == null ? new BigDecimal(0.00) : rate1_p;
    }

    public Double getRate1_p(int i) {
        return Double.valueOf(rate1_p.toString());
    }

    public void setRate1_p(Object rate1_p) {
        if (rate1_p == null || "".equals(rate1_p))
            this.rate1_p = new BigDecimal("0");
        else
            this.rate1_p = new BigDecimal(rate1_p.toString());
        this.rate1_p = EntityUtil.cutOffDecimal(this.rate1_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate1_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate2]")
    public BigDecimal getRate2_p() {
        return rate2_p == null ? new BigDecimal(0.00) : rate2_p;
    }

    public Double getRate2_p(int i) {
        return Double.valueOf(rate2_p.toString());
    }

    public void setRate2_p(Object rate2_p) {
        if (rate2_p == null || "".equals(rate2_p))
            this.rate2_p = new BigDecimal("0");
        else
            this.rate2_p = new BigDecimal(rate2_p.toString());
        this.rate2_p = EntityUtil.cutOffDecimal(this.rate2_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate2_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate3]")
    public BigDecimal getRate3_p() {
        return rate3_p == null ? new BigDecimal(0.00) : rate3_p;
    }

    public Double getRate3_p(int i) {
        return Double.valueOf(rate3_p.toString());
    }

    public void setRate3_p(Object rate3_p) {
        if (rate3_p == null || "".equals(rate3_p))
            this.rate3_p = new BigDecimal("0");
        else
            this.rate3_p = new BigDecimal(rate3_p.toString());
        this.rate3_p = EntityUtil.cutOffDecimal(this.rate3_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate3_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate4]")
    public BigDecimal getRate4_p() {
        return rate4_p == null ? new BigDecimal(0.00) : rate4_p;
    }

    public Double getRate4_p(int i) {
        return Double.valueOf(rate4_p.toString());
    }

    public void setRate4_p(Object rate4_p) {
        if (rate4_p == null || "".equals(rate4_p))
            this.rate4_p = new BigDecimal("0");
        else
            this.rate4_p = new BigDecimal(rate4_p.toString());
        this.rate4_p = EntityUtil.cutOffDecimal(this.rate4_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate4_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate5]")
    public BigDecimal getRate5_p() {
        return rate5_p == null ? new BigDecimal(0.00) : rate5_p;
    }

    public Double getRate5_p(int i) {
        return Double.valueOf(rate5_p.toString());
    }

    public void setRate5_p(Object rate5_p) {
        if (rate5_p == null || "".equals(rate5_p))
            this.rate5_p = new BigDecimal("0");
        else
            this.rate5_p = new BigDecimal(rate5_p.toString());
        this.rate5_p = EntityUtil.cutOffDecimal(this.rate5_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate5_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate6]")
    public BigDecimal getRate6_p() {
        return rate6_p == null ? new BigDecimal(0.00) : rate6_p;
    }

    public Double getRate6_p(int i) {
        return Double.valueOf(rate6_p.toString());
    }

    public void setRate6_p(Object rate6_p) {
        if (rate6_p == null || "".equals(rate6_p))
            this.rate6_p = new BigDecimal("0");
        else
            this.rate6_p = new BigDecimal(rate6_p.toString());
        this.rate6_p = EntityUtil.cutOffDecimal(this.rate6_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate6_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate7]")
    public BigDecimal getRate7_p() {
        return rate7_p == null ? new BigDecimal(0.00) : rate7_p;
    }

    public Double getRate7_p(int i) {
        return Double.valueOf(rate7_p.toString());
    }

    public void setRate7_p(Object rate7_p) {
        if (rate7_p == null || "".equals(rate7_p))
            this.rate7_p = new BigDecimal("0");
        else
            this.rate7_p = new BigDecimal(rate7_p.toString());
        this.rate7_p = EntityUtil.cutOffDecimal(this.rate7_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate7_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate]")
    public BigDecimal getRate_p() {
        return rate_p == null ? new BigDecimal(0.00) : rate_p;
    }

    public Double getRate_p(int i) {
        return Double.valueOf(rate_p.toString());
    }

    public void setRate_p(Object rate_p) {
        if (rate_p == null || "".equals(rate_p))
            this.rate_p = new BigDecimal("0");
        else
            this.rate_p = new BigDecimal(rate_p.toString());
        this.rate_p = EntityUtil.cutOffDecimal(this.rate_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate_p");
    }

    @Column(length = 20, nullable = true, name = "[productcode]")
    public String getProductcode_p() {
        return EntityUtil.cutOffStr(productcode_p, this.getClass(), "productcode_p");
    }

    public void setProductcode_p(String productcode_p) {
        this.productcode_p = EntityUtil.cutOffStr(productcode_p, this.getClass(), "productcode_p");
    }

    @Column(length = 3, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[lv]")
    public BigDecimal getLv_p() {
        return lv_p == null ? new BigDecimal(0.00) : lv_p;
    }

    public Integer getLv_p(int i) {
        return lv_p == null ? new BigDecimal(0.00).intValue() : lv_p.intValue();
    }

    public void setLv_p(Object lv_p) {
        if (lv_p == null || "".equals(lv_p))
            this.lv_p = new BigDecimal("0");
        else
            this.lv_p = new BigDecimal(lv_p.toString());
        this.lv_p = EntityUtil.cutOffDecimal(this.lv_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "lv_p");
    }
}
