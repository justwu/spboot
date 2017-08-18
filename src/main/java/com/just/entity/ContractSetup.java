package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "ContractSetup")
public class ContractSetup implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String type_p = "";/* 合同表的类型 0-甲方设置 1-合同样式设置 */
    private String profileid_p = "";/* 档案号 */
    private String name_p = "";/* 甲方 */
    private String linkname_p = "";/* 责任人 */
    private String code_p = "";/* 合同代码 */
    private String guesttype_p = "";/* 1-协议客户 2-旅行社客户 */
    private String content_p = "";/* 合同内容 */
    private BigDecimal size_p = BigDecimal.valueOf(0.00);/* 字体大小 */

    @Id
    @SequenceGenerator(name = "ContractSetup", sequenceName = "ContractSetup_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ContractSetup")
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

    @Column(length = 1, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 60, nullable = true, name = "[linkname]")
    public String getLinkname_p() {
        return EntityUtil.cutOffStr(linkname_p, this.getClass(), "linkname_p");
    }

    public void setLinkname_p(String linkname_p) {
        this.linkname_p = EntityUtil.cutOffStr(linkname_p, this.getClass(), "linkname_p");
    }

    @Column(length = 30, nullable = true, name = "[code]")
    public String getCode_p() {
        return EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    public void setCode_p(String code_p) {
        this.code_p = EntityUtil.cutOffStr(code_p, this.getClass(), "code_p");
    }

    @Column(length = 1, nullable = true, name = "[guesttype]")
    public String getGuesttype_p() {
        return EntityUtil.cutOffStr(guesttype_p, this.getClass(), "guesttype_p");
    }

    public void setGuesttype_p(String guesttype_p) {
        this.guesttype_p = EntityUtil.cutOffStr(guesttype_p, this.getClass(), "guesttype_p");
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

    @Column(precision = 4, scale = 0, nullable = true, name = "[size]")
    public BigDecimal getSize_p() {
        return size_p == null ? new BigDecimal(0.00) : size_p;
    }

    public Integer getSize_p(int i) {
        return size_p == null ? new BigDecimal(0.00).intValue() : size_p.intValue();
    }

    public void setSize_p(Object size_p) {
        if (size_p == null || "".equals(size_p))
            this.size_p = new BigDecimal("0");
        else
            this.size_p = new BigDecimal(size_p.toString());
        this.size_p = EntityUtil.cutOffDecimal(this.size_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "size_p");
    }
}
