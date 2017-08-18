package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Roomtype")
public class Roomtype implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/*  */
    private String desc_p = "";/*  */
    private String groupid_p = "";/* 分类大组 */
    private String hotelcode_p = "";/* 酒店代码 */
    private String property_p = "";/* 景区代码 */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 物理房间数 */
    private String introduction_p = "";/* 备注 */

    @Id
    @SequenceGenerator(name = "Roomtype", sequenceName = "Roomtype_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Roomtype")
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

    @Column(length = 20, nullable = true, name = "[groupid]")
    public String getGroupid_p() {
        return EntityUtil.cutOffStr(groupid_p, this.getClass(), "groupid_p");
    }

    public void setGroupid_p(String groupid_p) {
        this.groupid_p = EntityUtil.cutOffStr(groupid_p, this.getClass(), "groupid_p");
    }

    @Column(length = 20, nullable = true, name = "[hotelcode]")
    public String getHotelcode_p() {
        return EntityUtil.cutOffStr(hotelcode_p, this.getClass(), "hotelcode_p");
    }

    public void setHotelcode_p(String hotelcode_p) {
        this.hotelcode_p = EntityUtil.cutOffStr(hotelcode_p, this.getClass(), "hotelcode_p");
    }

    @Column(length = 50, nullable = true, name = "[property]")
    public String getProperty_p() {
        return EntityUtil.cutOffStr(property_p, this.getClass(), "property_p");
    }

    public void setProperty_p(String property_p) {
        this.property_p = EntityUtil.cutOffStr(property_p, this.getClass(), "property_p");
    }

    @Column(precision = 4, scale = 0, nullable = true, name = "[num]")
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

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[introduction]")
    public String getIntroduction_p() {
        return EntityUtil.cutOffStr(introduction_p, this.getClass(), "introduction_p");
    }

    public void setIntroduction_p(String introduction_p) {
        this.introduction_p = EntityUtil.cutOffStr(introduction_p, this.getClass(), "introduction_p");
    }
}
