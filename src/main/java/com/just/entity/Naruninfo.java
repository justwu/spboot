package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Naruninfo")
public class Naruninfo implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String running_p = "";/* 运行状态:0等待,1运行中 */
    private String runprogress_p = "";/* 当前运行步奏 */
    private String laststart_p = "";/* 上次开始时间 */
    private String lastend_p = "";/* 上次结束时间 */
    private String start_p = "";/* 本次任务开始时间 */
    private String nextprogress_p = "";/* 下一个步奏 */
    private Date nadate_p = sdf;/* 夜审任务统计处理的日期 */
    private Date rundate_p = sdf;/* 夜审任务执行日期 */

    @Id
    @SequenceGenerator(name = "Naruninfo", sequenceName = "Naruninfo_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Naruninfo")
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

    @Column(length = 10, nullable = true, name = "[running]")
    public String getRunning_p() {
        return EntityUtil.cutOffStr(running_p, this.getClass(), "running_p");
    }

    public void setRunning_p(String running_p) {
        this.running_p = EntityUtil.cutOffStr(running_p, this.getClass(), "running_p");
    }

    @Column(length = 3, nullable = true, name = "[runprogress]")
    public String getRunprogress_p() {
        return EntityUtil.cutOffStr(runprogress_p, this.getClass(), "runprogress_p");
    }

    public void setRunprogress_p(String runprogress_p) {
        this.runprogress_p = EntityUtil.cutOffStr(runprogress_p, this.getClass(), "runprogress_p");
    }

    @Column(length = 20, nullable = true, name = "[laststart]")
    public String getLaststart_p() {
        return EntityUtil.cutOffStr(laststart_p, this.getClass(), "laststart_p");
    }

    public void setLaststart_p(String laststart_p) {
        this.laststart_p = EntityUtil.cutOffStr(laststart_p, this.getClass(), "laststart_p");
    }

    @Column(length = 20, nullable = true, name = "[lastend]")
    public String getLastend_p() {
        return EntityUtil.cutOffStr(lastend_p, this.getClass(), "lastend_p");
    }

    public void setLastend_p(String lastend_p) {
        this.lastend_p = EntityUtil.cutOffStr(lastend_p, this.getClass(), "lastend_p");
    }

    @Column(length = 20, nullable = true, name = "[start]")
    public String getStart_p() {
        return EntityUtil.cutOffStr(start_p, this.getClass(), "start_p");
    }

    public void setStart_p(String start_p) {
        this.start_p = EntityUtil.cutOffStr(start_p, this.getClass(), "start_p");
    }

    @Column(length = 3, nullable = true, name = "[nextprogress]")
    public String getNextprogress_p() {
        return EntityUtil.cutOffStr(nextprogress_p, this.getClass(), "nextprogress_p");
    }

    public void setNextprogress_p(String nextprogress_p) {
        this.nextprogress_p = EntityUtil.cutOffStr(nextprogress_p, this.getClass(), "nextprogress_p");
    }

    @Column(nullable = true, name = "[nadate]")
    public Date getNadate_p() {
        return null == nadate_p ? EntityUtil.stringToDate("1900-01-01") : nadate_p;
    }

    public void setNadate_p(Date nadate_p) {
        this.nadate_p = null == nadate_p ? EntityUtil.stringToDate("1900-01-01") : nadate_p;
    }

    @Column(nullable = true, name = "[rundate]")
    public Date getRundate_p() {
        return null == rundate_p ? EntityUtil.stringToDate("1900-01-01") : rundate_p;
    }

    public void setRundate_p(Date rundate_p) {
        this.rundate_p = null == rundate_p ? EntityUtil.stringToDate("1900-01-01") : rundate_p;
    }
}
