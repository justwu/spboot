package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Spasite")
public class Spasite implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 站点代码 */
    private String desc_p = "";/* 站点描述 */
    private String address_p = "";/* 站点地址 */
    private String telephone_p = "";/* 站点电话 */
    private String opentime_p = "";/* 营业时间 */

    @Id
    @SequenceGenerator(name = "Spasite", sequenceName = "Spasite_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Spasite")
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

    @Column(length = 60, nullable = true, name = "[address]")
    public String getAddress_p() {
        return EntityUtil.cutOffStr(address_p, this.getClass(), "address_p");
    }

    public void setAddress_p(String address_p) {
        this.address_p = EntityUtil.cutOffStr(address_p, this.getClass(), "address_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[opentime]")
    public String getOpentime_p() {
        return EntityUtil.cutOffStr(opentime_p, this.getClass(), "opentime_p");
    }

    public void setOpentime_p(String opentime_p) {
        this.opentime_p = EntityUtil.cutOffStr(opentime_p, this.getClass(), "opentime_p");
    }
}
