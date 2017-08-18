package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Naconfig")
public class Naconfig implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String runtime_p = "";/* 每日运行时间 */
    private String crontime_p = "";/* 每日运行时间转quartz时间表达式 */
    private String progress_p = "";/* 每日运行的步奏 */
    private String serverip_p = "";/* 运行的服务器IP */

    @Id
    @SequenceGenerator(name = "Naconfig", sequenceName = "Naconfig_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Naconfig")
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

    @Column(length = 20, nullable = true, name = "[runtime]")
    public String getRuntime_p() {
        return EntityUtil.cutOffStr(runtime_p, this.getClass(), "runtime_p");
    }

    public void setRuntime_p(String runtime_p) {
        this.runtime_p = EntityUtil.cutOffStr(runtime_p, this.getClass(), "runtime_p");
    }

    @Column(length = 20, nullable = true, name = "[crontime]")
    public String getCrontime_p() {
        return EntityUtil.cutOffStr(crontime_p, this.getClass(), "crontime_p");
    }

    public void setCrontime_p(String crontime_p) {
        this.crontime_p = EntityUtil.cutOffStr(crontime_p, this.getClass(), "crontime_p");
    }

    @Column(length = 500, nullable = true, name = "[progress]")
    public String getProgress_p() {
        return EntityUtil.cutOffStr(progress_p, this.getClass(), "progress_p");
    }

    public void setProgress_p(String progress_p) {
        this.progress_p = EntityUtil.cutOffStr(progress_p, this.getClass(), "progress_p");
    }

    @Column(length = 20, nullable = true, name = "[serverip]")
    public String getServerip_p() {
        return EntityUtil.cutOffStr(serverip_p, this.getClass(), "serverip_p");
    }

    public void setServerip_p(String serverip_p) {
        this.serverip_p = EntityUtil.cutOffStr(serverip_p, this.getClass(), "serverip_p");
    }
}
