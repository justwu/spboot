package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Template")
public class Template implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道代码 */
    private String code_p = "";/* 代码 */
    private String content_p = "";/* 内容 */
    private String trigger_p = "";/* 触发 */
    private String type_p = "";/* 组 */
    private Boolean use_p = false;/* 是否使用 */

    @Id
    @SequenceGenerator(name = "Template", sequenceName = "Template_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Template")
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

    @Column(length = 30, nullable = true, name = "[channel]")
    public String getChannel_p() {
        return EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    public void setChannel_p(String channel_p) {
        this.channel_p = EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    @Column(length = 20, nullable = true, name = "[code]")
    public String getCode_p() {
        return EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    public void setCode_p(String code_p) {
        this.code_p = EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[content]")
    public String getContent_p() {
        return EntityUtil.cutOffStr(content_p, this.getClass(), "content_p");
    }

    public void setContent_p(String content_p) {
        this.content_p = EntityUtil.cutOffStr(content_p, this.getClass(), "content_p");
    }

    @Column(length = 30, nullable = true, name = "[trigger]")
    public String getTrigger_p() {
        return EntityUtil.cutOffStr(trigger_p, this.getClass(), "trigger_p");
    }

    public void setTrigger_p(String trigger_p) {
        this.trigger_p = EntityUtil.cutOffStr(trigger_p, this.getClass(), "trigger_p");
    }

    @Column(length = 8, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(length = 1, nullable = true, name = "[use]")
    public Boolean getUse_p() {
        return null == use_p ? false : use_p;
    }

    public void setUse_p(Boolean use_p) {
        this.use_p = null == use_p ? false : use_p;
    }
}
