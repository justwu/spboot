package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Kitfixcharge")
public class Kitfixcharge implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String kitname_p = "";/* 自定义项目名称 */
    private BigDecimal anz_p = BigDecimal.valueOf(0.00);/* 产品数量 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 项目单价 */
    private String colno_p = "";/* 综合预订号 */

    @Id
    @SequenceGenerator(name = "Kitfixcharge", sequenceName = "Kitfixcharge_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Kitfixcharge")
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

    @Column(length = 500, nullable = true, name = "[kitname]")
    public String getKitname_p() {
        return EntityUtil.cutOffStr(kitname_p, this.getClass(), "kitname_p");
    }

    public void setKitname_p(String kitname_p) {
        this.kitname_p = EntityUtil.cutOffStr(kitname_p, this.getClass(), "kitname_p");
    }

    @Column(precision = 4, scale = 0, nullable = true, name = "[anz]")
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

    @Column(length = 60, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }
}
