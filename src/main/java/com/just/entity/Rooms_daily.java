package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Rooms_daily")
public class Rooms_daily implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String regno_p = "";/* 平台预订号 */
    private Date datum_p = sdf;/* 日期 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 价格 */
    private String ratecode_p = "";/* 房价代码 */
    private Boolean fixrate_p = false;/* 是否固定价格 */
    private BigDecimal orgprice_p = BigDecimal.valueOf(0.00);/* 价格 */

    @Id
    @SequenceGenerator(name = "Rooms_daily", sequenceName = "Rooms_daily_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Rooms_daily")
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

    @Column(length = 60, nullable = true, name = "[regno]")
    public String getRegno_p() {
        return EntityUtil.cutOffStr(regno_p, this.getClass(), "regno_p");
    }

    public void setRegno_p(String regno_p) {
        this.regno_p = EntityUtil.cutOffStr(regno_p, this.getClass(), "regno_p");
    }

    @Column(nullable = true, name = "[datum]")
    public Date getDatum_p() {
        return null == datum_p ? EntityUtil.stringToDate("1900-01-01") : datum_p;
    }

    public void setDatum_p(Date datum_p) {
        this.datum_p = null == datum_p ? EntityUtil.stringToDate("1900-01-01") : datum_p;
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

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 1, nullable = true, name = "[fixrate]")
    public Boolean getFixrate_p() {
        return null == fixrate_p ? false : fixrate_p;
    }

    public void setFixrate_p(Boolean fixrate_p) {
        this.fixrate_p = null == fixrate_p ? false : fixrate_p;
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[orgprice]")
    public BigDecimal getOrgprice_p() {
        return orgprice_p == null ? new BigDecimal(0.00) : orgprice_p;
    }

    public Double getOrgprice_p(int i) {
        return Double.valueOf(orgprice_p.toString());
    }

    public void setOrgprice_p(Object orgprice_p) {
        if (orgprice_p == null || "".equals(orgprice_p))
            this.orgprice_p = new BigDecimal("0");
        else
            this.orgprice_p = new BigDecimal(orgprice_p.toString());
        this.orgprice_p = EntityUtil.cutOffDecimal(this.orgprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "orgprice_p");
    }
}
