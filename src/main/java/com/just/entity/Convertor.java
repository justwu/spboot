package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Convertor")
public class Convertor implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String localcode_p = "";/* 平台代码 */
    private String remotecode_p = "";/* 交互代码 */
    private String type_p = "";/* 转化表交互类型 */

    @Id
    @SequenceGenerator(name = "Convertor", sequenceName = "Convertor_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Convertor")
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

    @Column(length = 8, nullable = true, name = "[localcode]")
    public String getLocalcode_p() {
        return EntityUtil.cutOffStr(localcode_p, this.getClass(), "localcode_p");
    }

    public void setLocalcode_p(String localcode_p) {
        this.localcode_p = EntityUtil.cutOffStr(localcode_p, this.getClass(), "localcode_p");
    }

    @Column(length = 30, nullable = true, name = "[remotecode]")
    public String getRemotecode_p() {
        return EntityUtil.cutOffStr(remotecode_p, this.getClass(), "remotecode_p");
    }

    public void setRemotecode_p(String remotecode_p) {
        this.remotecode_p = EntityUtil.cutOffStr(remotecode_p, this.getClass(), "remotecode_p");
    }

    @Column(length = 8, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }
}
