package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Policylink")
public class Policylink implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 价格优先代码 */
    private String kitcode_p = "";/* 套餐代码 */
    private String channelcode_p = "";/* 渠道代码 */

    @Id
    @SequenceGenerator(name = "Policylink", sequenceName = "Policylink_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Policylink")
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

    @Column(length = 30, nullable = true, name = "[kitcode]")
    public String getKitcode_p() {
        return EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    public void setKitcode_p(String kitcode_p) {
        this.kitcode_p = EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    @Column(length = 30, nullable = true, name = "[channelcode]")
    public String getChannelcode_p() {
        return EntityUtil.cutOffStr(channelcode_p, this.getClass(), "channelcode_p");
    }

    public void setChannelcode_p(String channelcode_p) {
        this.channelcode_p = EntityUtil.cutOffStr(channelcode_p, this.getClass(), "channelcode_p");
    }
}
