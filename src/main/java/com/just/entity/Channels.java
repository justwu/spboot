package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Channels")
public class Channels implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String channelid_p = "";/* 代码 */
    private String desc_p = "";/* 渠道描述 */

    @Id
    @SequenceGenerator(name = "Channels", sequenceName = "Channels_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Channels")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
    }

    @Column(length = 20, nullable = true, name = "[channelid]")
    public String getChannelid_p() {
        return EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    public void setChannelid_p(String channelid_p) {
        this.channelid_p = EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    @Column(length = 60, nullable = true, name = "[desc]")
    public String getDesc_p() {
        return EntityUtil.cutOffStr(desc_p, this.getClass(), "desc_p");
    }

    public void setDesc_p(String desc_p) {
        this.desc_p = EntityUtil.cutOffStr(desc_p, this.getClass(), "desc_p");
    }
}
