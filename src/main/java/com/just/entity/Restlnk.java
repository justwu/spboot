package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Restlnk")
public class Restlnk implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String rescode_p = "";/* 餐厅代码 */
    private String tischcode_p = "";/* 桌型代码 */
    private BigDecimal anz_p = BigDecimal.valueOf(0.00);/* 配置数 */

    @Id
    @SequenceGenerator(name = "Restlnk", sequenceName = "Restlnk_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Restlnk")
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

    @Column(length = 8, nullable = true, name = "[rescode]")
    public String getRescode_p() {
        return EntityUtil.cutOffStr(rescode_p, this.getClass(), "rescode_p");
    }

    public void setRescode_p(String rescode_p) {
        this.rescode_p = EntityUtil.cutOffStr(rescode_p, this.getClass(), "rescode_p");
    }

    @Column(length = 8, nullable = true, name = "[tischcode]")
    public String getTischcode_p() {
        return EntityUtil.cutOffStr(tischcode_p, this.getClass(), "tischcode_p");
    }

    public void setTischcode_p(String tischcode_p) {
        this.tischcode_p = EntityUtil.cutOffStr(tischcode_p, this.getClass(), "tischcode_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[anz]")
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
}
