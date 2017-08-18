package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Restaurant_time")
public class Restaurant_time implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 代码 */
    private String desc_p = "";/* 描述 */
    private String restaurant_p = "";/* 餐厅代码 */
    private String starttime_p = "";/* 开始时间 */
    private String endtime_p = "";/* 结束时间 */

    @Id
    @SequenceGenerator(name = "Restaurant_time", sequenceName = "Restaurant_time_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Restaurant_time")
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

    @Column(length = 60, nullable = true, name = "[desc]")
    public String getDesc_p() {
        return EntityUtil.cutOffStr(desc_p, this.getClass(), "desc_p");
    }

    public void setDesc_p(String desc_p) {
        this.desc_p = EntityUtil.cutOffStr(desc_p, this.getClass(), "desc_p");
    }

    @Column(length = 20, nullable = true, name = "[restaurant]")
    public String getRestaurant_p() {
        return EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    public void setRestaurant_p(String restaurant_p) {
        this.restaurant_p = EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    @Column(length = 5, nullable = true, name = "[starttime]")
    public String getStarttime_p() {
        return EntityUtil.cutOffStr(starttime_p, this.getClass(), "starttime_p");
    }

    public void setStarttime_p(String starttime_p) {
        this.starttime_p = EntityUtil.cutOffStr(starttime_p, this.getClass(), "starttime_p");
    }

    @Column(length = 5, nullable = true, name = "[endtime]")
    public String getEndtime_p() {
        return EntityUtil.cutOffStr(endtime_p, this.getClass(), "endtime_p");
    }

    public void setEndtime_p(String endtime_p) {
        this.endtime_p = EntityUtil.cutOffStr(endtime_p, this.getClass(), "endtime_p");
    }
}
