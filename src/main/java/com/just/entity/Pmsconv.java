package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Pmsconv")
public class Pmsconv implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String pmscode_p = "";/* PMS代码 */
    private String yuncode_p = "";/* 平台代码 */
    private String groupcode_p = "";/* 项目组 */

    @Id
    @SequenceGenerator(name = "Pmsconv", sequenceName = "Pmsconv_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Pmsconv")
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

    @Column(length = 100, nullable = true, name = "[pmscode]")
    public String getPmscode_p() {
        return EntityUtil.cutOffStr(pmscode_p, this.getClass(), "pmscode_p");
    }

    public void setPmscode_p(String pmscode_p) {
        this.pmscode_p = EntityUtil.cutOffStr(pmscode_p, this.getClass(), "pmscode_p");
    }

    @Column(length = 100, nullable = true, name = "[yuncode]")
    public String getYuncode_p() {
        return EntityUtil.cutOffStr(yuncode_p, this.getClass(), "yuncode_p");
    }

    public void setYuncode_p(String yuncode_p) {
        this.yuncode_p = EntityUtil.cutOffStr(yuncode_p, this.getClass(), "yuncode_p");
    }

    @Column(length = 30, nullable = true, name = "[groupcode]")
    public String getGroupcode_p() {
        return EntityUtil.cutOffStr(groupcode_p, this.getClass(), "groupcode_p");
    }

    public void setGroupcode_p(String groupcode_p) {
        this.groupcode_p = EntityUtil.cutOffStr(groupcode_p, this.getClass(), "groupcode_p");
    }
}
