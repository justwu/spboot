package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Sales")
public class Sales implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String hotelcode_p = "";/* 酒店代码 */
    private String salesid_p = "";/* 销售员ID */
    private String name_p = "";/* 销售员姓名 */

    @Id
    @SequenceGenerator(name = "Sales", sequenceName = "Sales_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Sales")
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

    @Column(length = 20, nullable = true, name = "[hotelcode]")
    public String getHotelcode_p() {
        return EntityUtil.cutOffStr(hotelcode_p, this.getClass(), "hotelcode_p");
    }

    public void setHotelcode_p(String hotelcode_p) {
        this.hotelcode_p = EntityUtil.cutOffStr(hotelcode_p, this.getClass(), "hotelcode_p");
    }

    @Column(length = 8, nullable = true, name = "[salesid]")
    public String getSalesid_p() {
        return EntityUtil.cutOffStr(salesid_p, this.getClass(), "salesid_p");
    }

    public void setSalesid_p(String salesid_p) {
        this.salesid_p = EntityUtil.cutOffStr(salesid_p, this.getClass(), "salesid_p");
    }

    @Column(length = 30, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }
}
