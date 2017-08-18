package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Ticket")
public class Ticket implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 代码 */
    private String desc_p = "";/* 描述 */
    private String offline_code_p = "";/* 线下编码 */
    private String group_p = "";/* 组 */
    private String type_p = "";/* 门票类型 D-日票 N-夜票 */
    private String checkpoint_p = "";/* 关联检票点 */

    @Id
    @SequenceGenerator(name = "Ticket", sequenceName = "Ticket_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Ticket")
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

    @Column(length = 20, nullable = true, name = "[code]")
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

    @Column(length = 20, nullable = true, name = "[offline_code]")
    public String getOffline_code_p() {
        return EntityUtil.cutOffStr(offline_code_p, this.getClass(), "offline_code_p");
    }

    public void setOffline_code_p(String offline_code_p) {
        this.offline_code_p = EntityUtil.cutOffStr(offline_code_p, this.getClass(), "offline_code_p");
    }

    @Column(length = 20, nullable = true, name = "[group]")
    public String getGroup_p() {
        return EntityUtil.cutOffStr(group_p, this.getClass(), "group_p");
    }

    public void setGroup_p(String group_p) {
        this.group_p = EntityUtil.cutOffStr(group_p, this.getClass(), "group_p");
    }

    @Column(length = 2, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(length = 60, nullable = true, name = "[checkpoint]")
    public String getCheckpoint_p() {
        return EntityUtil.cutOffStr(checkpoint_p, this.getClass(), "checkpoint_p");
    }

    public void setCheckpoint_p(String checkpoint_p) {
        this.checkpoint_p = EntityUtil.cutOffStr(checkpoint_p, this.getClass(), "checkpoint_p");
    }
}
