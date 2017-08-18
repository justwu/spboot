package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Rcaters")
public class Rcaters implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channelid_p = "";/* 渠道代码 */
    private String restaurant_p = "";/* 餐厅代码 */
    private String tisch_p = "";/* 餐标代码 */
    private String time_p = "";/* 餐段代码 */
    private Date datum_p = sdf;/* 日期 */
    private BigDecimal pickup_num_p = BigDecimal.valueOf(0.00);/* 已用数 */
    private BigDecimal allow_num_p = BigDecimal.valueOf(0.00);/* 预留数 */

    @Id
    @SequenceGenerator(name = "Rcaters", sequenceName = "Rcaters_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Rcaters")
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

    @Column(length = 20, nullable = true, name = "[channelid]")
    public String getChannelid_p() {
        return EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    public void setChannelid_p(String channelid_p) {
        this.channelid_p = EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    @Column(length = 20, nullable = true, name = "[restaurant]")
    public String getRestaurant_p() {
        return EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    public void setRestaurant_p(String restaurant_p) {
        this.restaurant_p = EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    @Column(length = 20, nullable = true, name = "[tisch]")
    public String getTisch_p() {
        return EntityUtil.cutOffStr(tisch_p, this.getClass(), "tisch_p");
    }

    public void setTisch_p(String tisch_p) {
        this.tisch_p = EntityUtil.cutOffStr(tisch_p, this.getClass(), "tisch_p");
    }

    @Column(length = 20, nullable = true, name = "[time]")
    public String getTime_p() {
        return EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }

    public void setTime_p(String time_p) {
        this.time_p = EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
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

    @Column(precision = 8, scale = 0, nullable = true, name = "[allow_num]")
    public BigDecimal getAllow_num_p() {
        return allow_num_p == null ? new BigDecimal(0.00) : allow_num_p;
    }

    public Integer getAllow_num_p(int i) {
        return allow_num_p == null ? new BigDecimal(0.00).intValue() : allow_num_p.intValue();
    }

    public void setAllow_num_p(Object allow_num_p) {
        if (allow_num_p == null || "".equals(allow_num_p))
            this.allow_num_p = new BigDecimal("0");
        else
            this.allow_num_p = new BigDecimal(allow_num_p.toString());
        this.allow_num_p = EntityUtil.cutOffDecimal(this.allow_num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "allow_num_p");
    }
}
