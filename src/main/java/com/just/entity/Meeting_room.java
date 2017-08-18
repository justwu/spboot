package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Meeting_room")
public class Meeting_room implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String site_p = "";/* 场地代码 */
    private String code_p = "";/* 代码 */
    private String desc_p = "";/* 描述 */
    private BigDecimal maxnum_p = BigDecimal.valueOf(0.00);/* 最大容纳人数 */

    @Id
    @SequenceGenerator(name = "Meeting_room", sequenceName = "Meeting_room_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Meeting_room")
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

    @Column(length = 30, nullable = true, name = "[site]")
    public String getSite_p() {
        return EntityUtil.cutOffStr(site_p, this.getClass(), "site_p");
    }

    public void setSite_p(String site_p) {
        this.site_p = EntityUtil.cutOffStr(site_p, this.getClass(), "site_p");
    }

    @Column(length = 30, nullable = true, name = "[code]")
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

    @Column(precision = 8, scale = 0, nullable = true, name = "[maxnum]")
    public BigDecimal getMaxnum_p() {
        return maxnum_p == null ? new BigDecimal(0.00) : maxnum_p;
    }

    public Integer getMaxnum_p(int i) {
        return maxnum_p == null ? new BigDecimal(0.00).intValue() : maxnum_p.intValue();
    }

    public void setMaxnum_p(Object maxnum_p) {
        if (maxnum_p == null || "".equals(maxnum_p))
            this.maxnum_p = new BigDecimal("0");
        else
            this.maxnum_p = new BigDecimal(maxnum_p.toString());
        this.maxnum_p = EntityUtil.cutOffDecimal(this.maxnum_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "maxnum_p");
    }
}
