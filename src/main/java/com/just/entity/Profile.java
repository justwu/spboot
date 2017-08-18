package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Profile")
public class Profile implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String name_p = "";/* 姓名 */
    private String profileid_p = "";/* 档案号 */
    private String pmsno_p = "";/* PMS档案号 */
    private String pmskey_p = "";/* 景区ID+PMS档案号。上下行的时候用 */
    private String channelid_p = "";/* 渠道档案号 */
    private String chname_p = "";/* 拼音 */
    private String type_p = "";/* 档案类型 C:公司,G:团队,T:旅行社,S:订房网站,默认空,个人 */
    private String sex_p = "";/* 性别 */
    private Date birthday_p = sdf;/* 生日 */
    private String vip_p = "";/* VIP */
    private String memberid_p = "";/* 会员号 */
    private String memberlv_p = "";/* 会员等级 */
    private String country_p = "";/* 国家代码 */
    private String provice_p = "";/* 省份代码 */
    private String city_p = "";/* 城市 */
    private String address_p = "";/* 地址 */
    private String idtype_p = "";/* 证件类型 */
    private String idnum_p = "";/* 证件号码 */
    private String mobile_p = "";/* 手机 */
    private String phone_p = "";/* 固定电话 */
    private String remark_p = "";/* 备注 */
    private String email_p = "";/* 邮箱 */
    private String company_p = "";/* 公司 */
    private String related_p = "";/* 相关人员 */
    private String guides_p = "";/* 导游人员 */
    private String linkname_p = "";/* 联系人 */
    private String linktel_p = "";/* 联系人电话 */
    private String industry_p = "";/* 行业 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private Date resdate_p = sdf;/* 预定日期 */

    @Id
    @SequenceGenerator(name = "Profile", sequenceName = "Profile_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Profile")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 60, nullable = true, name = "[pmsno]")
    public String getPmsno_p() {
        return EntityUtil.cutOffStr(pmsno_p, this.getClass(), "pmsno_p");
    }

    public void setPmsno_p(String pmsno_p) {
        this.pmsno_p = EntityUtil.cutOffStr(pmsno_p, this.getClass(), "pmsno_p");
    }

    @Column(length = 60, nullable = true, name = "[pmskey]")
    public String getPmskey_p() {
        return EntityUtil.cutOffStr(pmskey_p, this.getClass(), "pmskey_p");
    }

    public void setPmskey_p(String pmskey_p) {
        this.pmskey_p = EntityUtil.cutOffStr(pmskey_p, this.getClass(), "pmskey_p");
    }

    @Column(length = 60, nullable = true, name = "[channelid]")
    public String getChannelid_p() {
        return EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    public void setChannelid_p(String channelid_p) {
        this.channelid_p = EntityUtil.cutOffStr(channelid_p, this.getClass(), "channelid_p");
    }

    @Column(length = 60, nullable = true, name = "[chname]")
    public String getChname_p() {
        return EntityUtil.cutOffStr(chname_p, this.getClass(), "chname_p");
    }

    public void setChname_p(String chname_p) {
        this.chname_p = EntityUtil.cutOffStr(chname_p, this.getClass(), "chname_p");
    }

    @Column(length = 1, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(length = 1, nullable = true, name = "[sex]")
    public String getSex_p() {
        return EntityUtil.cutOffStr(sex_p, this.getClass(), "sex_p");
    }

    public void setSex_p(String sex_p) {
        this.sex_p = EntityUtil.cutOffStr(sex_p, this.getClass(), "sex_p");
    }

    @Column(nullable = true, name = "[birthday]")
    public Date getBirthday_p() {
        return null == birthday_p ? EntityUtil.stringToDate("1900-01-01") : birthday_p;
    }

    public void setBirthday_p(Date birthday_p) {
        this.birthday_p = null == birthday_p ? EntityUtil.stringToDate("1900-01-01") : birthday_p;
    }

    @Column(length = 3, nullable = true, name = "[vip]")
    public String getVip_p() {
        return EntityUtil.cutOffStr(vip_p, this.getClass(), "vip_p");
    }

    public void setVip_p(String vip_p) {
        this.vip_p = EntityUtil.cutOffStr(vip_p, this.getClass(), "vip_p");
    }

    @Column(length = 30, nullable = true, name = "[memberid]")
    public String getMemberid_p() {
        return EntityUtil.cutOffStr(memberid_p, this.getClass(), "memberid_p");
    }

    public void setMemberid_p(String memberid_p) {
        this.memberid_p = EntityUtil.cutOffStr(memberid_p, this.getClass(), "memberid_p");
    }

    @Column(length = 20, nullable = true, name = "[memberlv]")
    public String getMemberlv_p() {
        return EntityUtil.cutOffStr(memberlv_p, this.getClass(), "memberlv_p");
    }

    public void setMemberlv_p(String memberlv_p) {
        this.memberlv_p = EntityUtil.cutOffStr(memberlv_p, this.getClass(), "memberlv_p");
    }

    @Column(length = 8, nullable = true, name = "[country]")
    public String getCountry_p() {
        return EntityUtil.cutOffStr(country_p, this.getClass(), "country_p");
    }

    public void setCountry_p(String country_p) {
        this.country_p = EntityUtil.cutOffStr(country_p, this.getClass(), "country_p");
    }

    @Column(length = 20, nullable = true, name = "[provice]")
    public String getProvice_p() {
        return EntityUtil.cutOffStr(provice_p, this.getClass(), "provice_p");
    }

    public void setProvice_p(String provice_p) {
        this.provice_p = EntityUtil.cutOffStr(provice_p, this.getClass(), "provice_p");
    }

    @Column(length = 8, nullable = true, name = "[city]")
    public String getCity_p() {
        return EntityUtil.cutOffStr(city_p, this.getClass(), "city_p");
    }

    public void setCity_p(String city_p) {
        this.city_p = EntityUtil.cutOffStr(city_p, this.getClass(), "city_p");
    }

    @Column(length = 500, nullable = true, name = "[address]")
    public String getAddress_p() {
        return EntityUtil.cutOffStr(address_p, this.getClass(), "address_p");
    }

    public void setAddress_p(String address_p) {
        this.address_p = EntityUtil.cutOffStr(address_p, this.getClass(), "address_p");
    }

    @Column(length = 60, nullable = true, name = "[idtype]")
    public String getIdtype_p() {
        return EntityUtil.cutOffStr(idtype_p, this.getClass(), "idtype_p");
    }

    public void setIdtype_p(String idtype_p) {
        this.idtype_p = EntityUtil.cutOffStr(idtype_p, this.getClass(), "idtype_p");
    }

    @Column(length = 60, nullable = true, name = "[idnum]")
    public String getIdnum_p() {
        return EntityUtil.cutOffStr(idnum_p, this.getClass(), "idnum_p");
    }

    public void setIdnum_p(String idnum_p) {
        this.idnum_p = EntityUtil.cutOffStr(idnum_p, this.getClass(), "idnum_p");
    }

    @Column(length = 60, nullable = true, name = "[mobile]")
    public String getMobile_p() {
        return EntityUtil.cutOffStr(mobile_p, this.getClass(), "mobile_p");
    }

    public void setMobile_p(String mobile_p) {
        this.mobile_p = EntityUtil.cutOffStr(mobile_p, this.getClass(), "mobile_p");
    }

    @Column(length = 60, nullable = true, name = "[phone]")
    public String getPhone_p() {
        return EntityUtil.cutOffStr(phone_p, this.getClass(), "phone_p");
    }

    public void setPhone_p(String phone_p) {
        this.phone_p = EntityUtil.cutOffStr(phone_p, this.getClass(), "phone_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[remark]")
    public String getRemark_p() {
        return EntityUtil.cutOffStr(remark_p, this.getClass(), "remark_p");
    }

    public void setRemark_p(String remark_p) {
        this.remark_p = EntityUtil.cutOffStr(remark_p, this.getClass(), "remark_p");
    }

    @Column(length = 60, nullable = true, name = "[email]")
    public String getEmail_p() {
        return EntityUtil.cutOffStr(email_p, this.getClass(), "email_p");
    }

    public void setEmail_p(String email_p) {
        this.email_p = EntityUtil.cutOffStr(email_p, this.getClass(), "email_p");
    }

    @Column(length = 60, nullable = true, name = "[company]")
    public String getCompany_p() {
        return EntityUtil.cutOffStr(company_p, this.getClass(), "company_p");
    }

    public void setCompany_p(String company_p) {
        this.company_p = EntityUtil.cutOffStr(company_p, this.getClass(), "company_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[related]")
    public String getRelated_p() {
        return EntityUtil.cutOffStr(related_p, this.getClass(), "related_p");
    }

    public void setRelated_p(String related_p) {
        this.related_p = EntityUtil.cutOffStr(related_p, this.getClass(), "related_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[guides]")
    public String getGuides_p() {
        return EntityUtil.cutOffStr(guides_p, this.getClass(), "guides_p");
    }

    public void setGuides_p(String guides_p) {
        this.guides_p = EntityUtil.cutOffStr(guides_p, this.getClass(), "guides_p");
    }

    @Column(length = 60, nullable = true, name = "[linkname]")
    public String getLinkname_p() {
        return EntityUtil.cutOffStr(linkname_p, this.getClass(), "linkname_p");
    }

    public void setLinkname_p(String linkname_p) {
        this.linkname_p = EntityUtil.cutOffStr(linkname_p, this.getClass(), "linkname_p");
    }

    @Column(length = 60, nullable = true, name = "[linktel]")
    public String getLinktel_p() {
        return EntityUtil.cutOffStr(linktel_p, this.getClass(), "linktel_p");
    }

    public void setLinktel_p(String linktel_p) {
        this.linktel_p = EntityUtil.cutOffStr(linktel_p, this.getClass(), "linktel_p");
    }

    @Column(length = 20, nullable = true, name = "[industry]")
    public String getIndustry_p() {
        return EntityUtil.cutOffStr(industry_p, this.getClass(), "industry_p");
    }

    public void setIndustry_p(String industry_p) {
        this.industry_p = EntityUtil.cutOffStr(industry_p, this.getClass(), "industry_p");
    }

    @Column(length = 20, nullable = true, name = "[creator]")
    public String getCreator_p() {
        return EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    public void setCreator_p(String creator_p) {
        this.creator_p = EntityUtil.cutOffStr(creator_p, this.getClass(), "creator_p");
    }

    @Column(length = 20, nullable = true, name = "[createip]")
    public String getCreateip_p() {
        return EntityUtil.cutOffStr(createip_p, this.getClass(), "createip_p");
    }

    public void setCreateip_p(String createip_p) {
        this.createip_p = EntityUtil.cutOffStr(createip_p, this.getClass(), "createip_p");
    }

    @Column(nullable = true, name = "[resdate]")
    public Date getResdate_p() {
        return null == resdate_p ? EntityUtil.stringToDate("1900-01-01") : resdate_p;
    }

    public void setResdate_p(Date resdate_p) {
        this.resdate_p = null == resdate_p ? EntityUtil.stringToDate("1900-01-01") : resdate_p;
    }
}
