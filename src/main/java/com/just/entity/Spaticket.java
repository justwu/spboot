package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Spaticket")
public class Spaticket implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 票型代码 */
    private String desc_p = "";/* 票型描述 */
    private String spasite_p = "";/* 属于哪个站点 */

    @Id
    @SequenceGenerator(name = "Spaticket", sequenceName = "Spaticket_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Spaticket")
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

    @Column(length = 20, nullable = true, name = "[spasite]")
    public String getSpasite_p() {
        return EntityUtil.cutOffStr(spasite_p, this.getClass(), "spasite_p");
    }

    public void setSpasite_p(String spasite_p) {
        this.spasite_p = EntityUtil.cutOffStr(spasite_p, this.getClass(), "spasite_p");
    }
}
