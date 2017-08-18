package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Tisch")
public class Tisch implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 餐桌类型 */
    private String desc_p = "";/* 餐桌类型描述 */
    private BigDecimal anz_p = BigDecimal.valueOf(0.00);/* 最大用餐人数 */
    private String restaurant_p = "";/* 属于哪个餐厅 */
    private String time_p = "";/* 产品餐段 */

    @Id
    @SequenceGenerator(name = "Tisch", sequenceName = "Tisch_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Tisch")
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

    @Column(length = 20, nullable = true, name = "[code]")
    public String getCode_p() {
        return EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    public void setCode_p(String code_p) {
        this.code_p = EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    @Column(length = 60, nullable = true, name = "[desc]")
    public String getDesc_p() {
        return EntityUtil.cutOffStr(desc_p, this.getClass(), "desc_p");
    }

    public void setDesc_p(String desc_p) {
        this.desc_p = EntityUtil.cutOffStr(desc_p, this.getClass(), "desc_p");
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

    @Column(length = 20, nullable = true, name = "[restaurant]")
    public String getRestaurant_p() {
        return EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    public void setRestaurant_p(String restaurant_p) {
        this.restaurant_p = EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    @Column(length = 30, nullable = true, name = "[time]")
    public String getTime_p() {
        return EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }

    public void setTime_p(String time_p) {
        this.time_p = EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }
}
