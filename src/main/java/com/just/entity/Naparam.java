package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Naparam")
public class Naparam implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String progressid_p = "";/* 进程ID */
    private String paramname_p = "";/* 参数名 */
    private String paramvalue_p = "";/* 参数值 */

    @Id
    @SequenceGenerator(name = "Naparam", sequenceName = "Naparam_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Naparam")
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

    @Column(length = 10, nullable = true, name = "[progressid]")
    public String getProgressid_p() {
        return EntityUtil.cutOffStr(progressid_p, this.getClass(), "progressid_p");
    }

    public void setProgressid_p(String progressid_p) {
        this.progressid_p = EntityUtil.cutOffStr(progressid_p, this.getClass(), "progressid_p");
    }

    @Column(length = 20, nullable = true, name = "[paramname]")
    public String getParamname_p() {
        return EntityUtil.cutOffStr(paramname_p, this.getClass(), "paramname_p");
    }

    public void setParamname_p(String paramname_p) {
        this.paramname_p = EntityUtil.cutOffStr(paramname_p, this.getClass(), "paramname_p");
    }

    @Column(length = 200, nullable = true, name = "[paramvalue]")
    public String getParamvalue_p() {
        return EntityUtil.cutOffStr(paramvalue_p, this.getClass(), "paramvalue_p");
    }

    public void setParamvalue_p(String paramvalue_p) {
        this.paramvalue_p = EntityUtil.cutOffStr(paramvalue_p, this.getClass(), "paramvalue_p");
    }
}
