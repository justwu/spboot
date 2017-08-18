package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Contract")
public class Contract implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道代码 */
    private String bookingid_p = "";/* Yun平台订单号 */
    private String aprofileid_p = "";/* 甲方档案号 */
    private String aname_p = "";/* 甲方 */
    private String alinkname_p = "";/* 甲方责任人 */
    private String bprofileid_p = "";/* 乙方档案号 */
    private String bname_p = "";/* 乙方 */
    private String blinkname_p = "";/* 乙方责任人 */
    private String title_p = "";/* 合同名称 */
    private String type_p = "";/* 1-协议客户 2-旅行社客户 */
    private Date startdate_p = sdf;/* 开始日期 */
    private Date enddate_p = sdf;/* 结束日期 */
    private String telephone_p = "";/* 电话号码 */
    private String status_p = "";/* 状态 N-新建 H-审核中 R-执行 F-审核失败 C-取消 */
    private String ratecode_p = "";/* 房价代码 */
    private Date createdate_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private String info_p = "";/* 备注 */
    private Boolean secrecy_p = false;/* 保密 */
    private String checkstr_p = "";/* 审查信息 */

    @Id
    @SequenceGenerator(name = "Contract", sequenceName = "Contract_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Contract")
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

    @Column(length = 20, nullable = true, name = "[bookingid]")
    public String getBookingid_p() {
        return EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    public void setBookingid_p(String bookingid_p) {
        this.bookingid_p = EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    @Column(length = 60, nullable = true, name = "[aprofileid]")
    public String getAprofileid_p() {
        return EntityUtil.cutOffStr(aprofileid_p, this.getClass(), "aprofileid_p");
    }

    public void setAprofileid_p(String aprofileid_p) {
        this.aprofileid_p = EntityUtil.cutOffStr(aprofileid_p, this.getClass(), "aprofileid_p");
    }

    @Column(length = 60, nullable = true, name = "[aname]")
    public String getAname_p() {
        return EntityUtil.cutOffStr(aname_p, this.getClass(), "aname_p");
    }

    public void setAname_p(String aname_p) {
        this.aname_p = EntityUtil.cutOffStr(aname_p, this.getClass(), "aname_p");
    }

    @Column(length = 60, nullable = true, name = "[alinkname]")
    public String getAlinkname_p() {
        return EntityUtil.cutOffStr(alinkname_p, this.getClass(), "alinkname_p");
    }

    public void setAlinkname_p(String alinkname_p) {
        this.alinkname_p = EntityUtil.cutOffStr(alinkname_p, this.getClass(), "alinkname_p");
    }

    @Column(length = 60, nullable = true, name = "[bprofileid]")
    public String getBprofileid_p() {
        return EntityUtil.cutOffStr(bprofileid_p, this.getClass(), "bprofileid_p");
    }

    public void setBprofileid_p(String bprofileid_p) {
        this.bprofileid_p = EntityUtil.cutOffStr(bprofileid_p, this.getClass(), "bprofileid_p");
    }

    @Column(length = 60, nullable = true, name = "[bname]")
    public String getBname_p() {
        return EntityUtil.cutOffStr(bname_p, this.getClass(), "bname_p");
    }

    public void setBname_p(String bname_p) {
        this.bname_p = EntityUtil.cutOffStr(bname_p, this.getClass(), "bname_p");
    }

    @Column(length = 60, nullable = true, name = "[blinkname]")
    public String getBlinkname_p() {
        return EntityUtil.cutOffStr(blinkname_p, this.getClass(), "blinkname_p");
    }

    public void setBlinkname_p(String blinkname_p) {
        this.blinkname_p = EntityUtil.cutOffStr(blinkname_p, this.getClass(), "blinkname_p");
    }

    @Column(length = 60, nullable = true, name = "[title]")
    public String getTitle_p() {
        return EntityUtil.cutOffStr(title_p, this.getClass(), "title_p");
    }

    public void setTitle_p(String title_p) {
        this.title_p = EntityUtil.cutOffStr(title_p, this.getClass(), "title_p");
    }

    @Column(length = 1, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(nullable = true, name = "[startdate]")
    public Date getStartdate_p() {
        return null == startdate_p ? EntityUtil.stringToDate("1900-01-01") : startdate_p;
    }

    public void setStartdate_p(Date startdate_p) {
        this.startdate_p = null == startdate_p ? EntityUtil.stringToDate("1900-01-01") : startdate_p;
    }

    @Column(nullable = true, name = "[enddate]")
    public Date getEnddate_p() {
        return null == enddate_p ? EntityUtil.stringToDate("1900-01-01") : enddate_p;
    }

    public void setEnddate_p(Date enddate_p) {
        this.enddate_p = null == enddate_p ? EntityUtil.stringToDate("1900-01-01") : enddate_p;
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(nullable = true, name = "[createdate]")
    public Date getCreatedate_p() {
        return null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    public void setCreatedate_p(Date createdate_p) {
        this.createdate_p = null == createdate_p ? EntityUtil.stringToDate("1900-01-01") : createdate_p;
    }

    @Column(length = 10, nullable = true, name = "[createtime]")
    public String getCreatetime_p() {
        return EntityUtil.cutOffStr(createtime_p, this.getClass(), "createtime_p");
    }

    public void setCreatetime_p(String createtime_p) {
        this.createtime_p = EntityUtil.cutOffStr(createtime_p, this.getClass(), "createtime_p");
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

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[info]")
    public String getInfo_p() {
        return EntityUtil.cutOffStr(info_p, this.getClass(), "info_p");
    }

    public void setInfo_p(String info_p) {
        this.info_p = EntityUtil.cutOffStr(info_p, this.getClass(), "info_p");
    }

    @Column(length = 1, nullable = true, name = "[secrecy]")
    public Boolean getSecrecy_p() {
        return null == secrecy_p ? false : secrecy_p;
    }

    public void setSecrecy_p(Boolean secrecy_p) {
        this.secrecy_p = null == secrecy_p ? false : secrecy_p;
    }

    @Column(length = 60, nullable = true, name = "[checkstr]")
    public String getCheckstr_p() {
        return EntityUtil.cutOffStr(checkstr_p, this.getClass(), "checkstr_p");
    }

    public void setCheckstr_p(String checkstr_p) {
        this.checkstr_p = EntityUtil.cutOffStr(checkstr_p, this.getClass(), "checkstr_p");
    }
}
