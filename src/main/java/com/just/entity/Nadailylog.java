package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Nadailylog")
public class Nadailylog implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String runtime_p = "";/* 步奏 */
    private String progressid_p = "";/* 进程ID */
    private String starttime_p = "";/* 开始时间 */
    private String endtime_p = "";/* 结束时间 */
    private String totaltime_p = "";/* 步奏运行的总时间 */
    private Date nadate_p = sdf;/* 夜审日期 */

    @Id
    @SequenceGenerator(name = "Nadailylog", sequenceName = "Nadailylog_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Nadailylog")
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

    @Column(length = 10, nullable = true, name = "[runtime]")
    public String getRuntime_p() {
        return EntityUtil.cutOffStr(runtime_p, this.getClass(), "runtime_p");
    }

    public void setRuntime_p(String runtime_p) {
        this.runtime_p = EntityUtil.cutOffStr(runtime_p, this.getClass(), "runtime_p");
    }

    @Column(length = 20, nullable = true, name = "[progressid]")
    public String getProgressid_p() {
        return EntityUtil.cutOffStr(progressid_p, this.getClass(), "progressid_p");
    }

    public void setProgressid_p(String progressid_p) {
        this.progressid_p = EntityUtil.cutOffStr(progressid_p, this.getClass(), "progressid_p");
    }

    @Column(length = 20, nullable = true, name = "[starttime]")
    public String getStarttime_p() {
        return EntityUtil.cutOffStr(starttime_p, this.getClass(), "starttime_p");
    }

    public void setStarttime_p(String starttime_p) {
        this.starttime_p = EntityUtil.cutOffStr(starttime_p, this.getClass(), "starttime_p");
    }

    @Column(length = 20, nullable = true, name = "[endtime]")
    public String getEndtime_p() {
        return EntityUtil.cutOffStr(endtime_p, this.getClass(), "endtime_p");
    }

    public void setEndtime_p(String endtime_p) {
        this.endtime_p = EntityUtil.cutOffStr(endtime_p, this.getClass(), "endtime_p");
    }

    @Column(length = 20, nullable = true, name = "[totaltime]")
    public String getTotaltime_p() {
        return EntityUtil.cutOffStr(totaltime_p, this.getClass(), "totaltime_p");
    }

    public void setTotaltime_p(String totaltime_p) {
        this.totaltime_p = EntityUtil.cutOffStr(totaltime_p, this.getClass(), "totaltime_p");
    }

    @Column(nullable = true, name = "[nadate]")
    public Date getNadate_p() {
        return null == nadate_p ? EntityUtil.stringToDate("1900-01-01") : nadate_p;
    }

    public void setNadate_p(Date nadate_p) {
        this.nadate_p = null == nadate_p ? EntityUtil.stringToDate("1900-01-01") : nadate_p;
    }
}
