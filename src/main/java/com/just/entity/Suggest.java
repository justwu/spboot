package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Suggest")
public class Suggest implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String profileid_p = "";/* 档案号 */
    private String bookingid_p = "";/* Yun平台订单号 */
    private String name_p = "";/* 姓名 */
    private String title_p = "";/* 主题 */
    private String telephone_p = "";/* 电话号码 */
    private String level_p = "";/* 0-一般 1-紧急 2-非常紧急 */
    private String type_p = "";/* S-建议 C-投诉 F-回馈 */
    private String status_p = "";/* 状态 N-未处理 H-处理中 F-处理完成 C-取消 */
    private String processor_p = "";/* 处理用户 */
    private Date createdate_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private String content_p = "";/* 内容 */
    private String handle_p = "";/* 处理 */
    private String info_p = "";/* 备注 */

    @Id
    @SequenceGenerator(name = "Suggest", sequenceName = "Suggest_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Suggest")
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

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 20, nullable = true, name = "[bookingid]")
    public String getBookingid_p() {
        return EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    public void setBookingid_p(String bookingid_p) {
        this.bookingid_p = EntityUtil.cutOffStr(bookingid_p, this.getClass(), "bookingid_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 60, nullable = true, name = "[title]")
    public String getTitle_p() {
        return EntityUtil.cutOffStr(title_p, this.getClass(), "title_p");
    }

    public void setTitle_p(String title_p) {
        this.title_p = EntityUtil.cutOffStr(title_p, this.getClass(), "title_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(length = 1, nullable = true, name = "[level]")
    public String getLevel_p() {
        return EntityUtil.cutOffStr(level_p, this.getClass(), "level_p");
    }

    public void setLevel_p(String level_p) {
        this.level_p = EntityUtil.cutOffStr(level_p, this.getClass(), "level_p");
    }

    @Column(length = 1, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 20, nullable = true, name = "[processor]")
    public String getProcessor_p() {
        return EntityUtil.cutOffStr(processor_p, this.getClass(), "processor_p");
    }

    public void setProcessor_p(String processor_p) {
        this.processor_p = EntityUtil.cutOffStr(processor_p, this.getClass(), "processor_p");
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
    @Column(length = 150, nullable = true, name = "[content]")
    public String getContent_p() {
        return EntityUtil.cutOffStr(content_p, this.getClass(), "content_p");
    }

    public void setContent_p(String content_p) {
        this.content_p = EntityUtil.cutOffStr(content_p, this.getClass(), "content_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[handle]")
    public String getHandle_p() {
        return EntityUtil.cutOffStr(handle_p, this.getClass(), "handle_p");
    }

    public void setHandle_p(String handle_p) {
        this.handle_p = EntityUtil.cutOffStr(handle_p, this.getClass(), "handle_p");
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
}
