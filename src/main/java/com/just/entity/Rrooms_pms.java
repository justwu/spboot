package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Rrooms_pms")
public class Rrooms_pms implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String rmtype_p = "";/* 房型代码 */
    private Date datum_p = sdf;/* 日期 */
    private BigDecimal pickup_num_p = BigDecimal.valueOf(0.00);/* 已用数 */
    private BigDecimal actual_num_p = BigDecimal.valueOf(0.00);/* 物理房间数 */
    private BigDecimal closed_num_p = BigDecimal.valueOf(0.00);/* 当天维修.当天关闭的房间数 */

    @Id
    @SequenceGenerator(name = "Rrooms_pms", sequenceName = "Rrooms_pms_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Rrooms_pms")
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

    @Column(length = 20, nullable = true, name = "[rmtype]")
    public String getRmtype_p() {
        return EntityUtil.cutOffStr(rmtype_p, this.getClass(), "rmtype_p");
    }

    public void setRmtype_p(String rmtype_p) {
        this.rmtype_p = EntityUtil.cutOffStr(rmtype_p, this.getClass(), "rmtype_p");
    }

    @Column(nullable = true, name = "[datum]")
    public Date getDatum_p() {
        return null == datum_p ? EntityUtil.stringToDate("1900-01-01") : datum_p;
    }

    public void setDatum_p(Date datum_p) {
        this.datum_p = null == datum_p ? EntityUtil.stringToDate("1900-01-01") : datum_p;
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[pickup_num]")
    public BigDecimal getPickup_num_p() {
        return pickup_num_p == null ? new BigDecimal(0.00) : pickup_num_p;
    }

    public Integer getPickup_num_p(int i) {
        return pickup_num_p == null ? new BigDecimal(0.00).intValue() : pickup_num_p.intValue();
    }

    public void setPickup_num_p(Object pickup_num_p) {
        if (pickup_num_p == null || "".equals(pickup_num_p))
            this.pickup_num_p = new BigDecimal("0");
        else
            this.pickup_num_p = new BigDecimal(pickup_num_p.toString());
        this.pickup_num_p = EntityUtil.cutOffDecimal(this.pickup_num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "pickup_num_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[actual_num]")
    public BigDecimal getActual_num_p() {
        return actual_num_p == null ? new BigDecimal(0.00) : actual_num_p;
    }

    public Integer getActual_num_p(int i) {
        return actual_num_p == null ? new BigDecimal(0.00).intValue() : actual_num_p.intValue();
    }

    public void setActual_num_p(Object actual_num_p) {
        if (actual_num_p == null || "".equals(actual_num_p))
            this.actual_num_p = new BigDecimal("0");
        else
            this.actual_num_p = new BigDecimal(actual_num_p.toString());
        this.actual_num_p = EntityUtil.cutOffDecimal(this.actual_num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "actual_num_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[closed_num]")
    public BigDecimal getClosed_num_p() {
        return closed_num_p == null ? new BigDecimal(0.00) : closed_num_p;
    }

    public Integer getClosed_num_p(int i) {
        return closed_num_p == null ? new BigDecimal(0.00).intValue() : closed_num_p.intValue();
    }

    public void setClosed_num_p(Object closed_num_p) {
        if (closed_num_p == null || "".equals(closed_num_p))
            this.closed_num_p = new BigDecimal("0");
        else
            this.closed_num_p = new BigDecimal(closed_num_p.toString());
        this.closed_num_p = EntityUtil.cutOffDecimal(this.closed_num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "closed_num_p");
    }
}
