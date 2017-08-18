package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Section")
public class Section implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String code_p = "";/* 景区代码 */
    private String desc_p = "";/* 景区描述 */
    private String license_p = "";/* 景区许可证 */
    private Date expiry_p = sdf;/* 许可证有效期 */
    private String type_p = "";/* 景区类型 */
    private String r8url_p = "";/* 景区的R8PMS接口地址 */
    private String r8loginname_p = "";/* 景区的R8PMS接口登录名 */
    private String r8loginpassword_p = "";/* 景区的R8PMS接口密码MD5 */
    private String ticketurl_p = "";/* 景区的票务接口地址 */
    private String ticketloginname_p = "";/* 景区的票务接口登录名 */
    private String ticketloginpassword_p = "";/* 景区的票务接口密码 */
    private String ticketcorpcode_p = "";/* 景区的票务接口企业码 */
    private String ticketprivacycode_p = "";/* 景区的票务接口私钥 */
    private String msgurl_p = "";/* 景区的消息接口地址 */
    private String msgloginname_p = "";/* 景区的消息接口用户名 */
    private String msgcorpcode_p = "";/* 景区的消息接口企业码 */

    @Id
    @SequenceGenerator(name = "Section", sequenceName = "Section_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Section")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
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

    @Column(length = 20, nullable = true, name = "[license]")
    public String getLicense_p() {
        return EntityUtil.cutOffStr(license_p, this.getClass(), "license_p");
    }

    public void setLicense_p(String license_p) {
        this.license_p = EntityUtil.cutOffStr(license_p, this.getClass(), "license_p");
    }

    @Column(nullable = true, name = "[expiry]")
    public Date getExpiry_p() {
        return null == expiry_p ? EntityUtil.stringToDate("1900-01-01") : expiry_p;
    }

    public void setExpiry_p(Date expiry_p) {
        this.expiry_p = null == expiry_p ? EntityUtil.stringToDate("1900-01-01") : expiry_p;
    }

    @Column(length = 50, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(length = 200, nullable = true, name = "[r8url]")
    public String getR8url_p() {
        return EntityUtil.cutOffStr(r8url_p, this.getClass(), "r8url_p");
    }

    public void setR8url_p(String r8url_p) {
        this.r8url_p = EntityUtil.cutOffStr(r8url_p, this.getClass(), "r8url_p");
    }

    @Column(length = 20, nullable = true, name = "[r8loginname]")
    public String getR8loginname_p() {
        return EntityUtil.cutOffStr(r8loginname_p, this.getClass(), "r8loginname_p");
    }

    public void setR8loginname_p(String r8loginname_p) {
        this.r8loginname_p = EntityUtil.cutOffStr(r8loginname_p, this.getClass(), "r8loginname_p");
    }

    @Column(length = 64, nullable = true, name = "[r8loginpassword]")
    public String getR8loginpassword_p() {
        return EntityUtil.cutOffStr(r8loginpassword_p, this.getClass(), "r8loginpassword_p");
    }

    public void setR8loginpassword_p(String r8loginpassword_p) {
        this.r8loginpassword_p = EntityUtil.cutOffStr(r8loginpassword_p, this.getClass(), "r8loginpassword_p");
    }

    @Column(length = 200, nullable = true, name = "[ticketurl]")
    public String getTicketurl_p() {
        return EntityUtil.cutOffStr(ticketurl_p, this.getClass(), "ticketurl_p");
    }

    public void setTicketurl_p(String ticketurl_p) {
        this.ticketurl_p = EntityUtil.cutOffStr(ticketurl_p, this.getClass(), "ticketurl_p");
    }

    @Column(length = 20, nullable = true, name = "[ticketloginname]")
    public String getTicketloginname_p() {
        return EntityUtil.cutOffStr(ticketloginname_p, this.getClass(), "ticketloginname_p");
    }

    public void setTicketloginname_p(String ticketloginname_p) {
        this.ticketloginname_p = EntityUtil.cutOffStr(ticketloginname_p, this.getClass(), "ticketloginname_p");
    }

    @Column(length = 64, nullable = true, name = "[ticketloginpassword]")
    public String getTicketloginpassword_p() {
        return EntityUtil.cutOffStr(ticketloginpassword_p, this.getClass(), "ticketloginpassword_p");
    }

    public void setTicketloginpassword_p(String ticketloginpassword_p) {
        this.ticketloginpassword_p = EntityUtil.cutOffStr(ticketloginpassword_p, this.getClass(), "ticketloginpassword_p");
    }

    @Column(length = 64, nullable = true, name = "[ticketcorpcode]")
    public String getTicketcorpcode_p() {
        return EntityUtil.cutOffStr(ticketcorpcode_p, this.getClass(), "ticketcorpcode_p");
    }

    public void setTicketcorpcode_p(String ticketcorpcode_p) {
        this.ticketcorpcode_p = EntityUtil.cutOffStr(ticketcorpcode_p, this.getClass(), "ticketcorpcode_p");
    }

    @Column(length = 64, nullable = true, name = "[ticketprivacycode]")
    public String getTicketprivacycode_p() {
        return EntityUtil.cutOffStr(ticketprivacycode_p, this.getClass(), "ticketprivacycode_p");
    }

    public void setTicketprivacycode_p(String ticketprivacycode_p) {
        this.ticketprivacycode_p = EntityUtil.cutOffStr(ticketprivacycode_p, this.getClass(), "ticketprivacycode_p");
    }

    @Column(length = 200, nullable = true, name = "[msgurl]")
    public String getMsgurl_p() {
        return EntityUtil.cutOffStr(msgurl_p, this.getClass(), "msgurl_p");
    }

    public void setMsgurl_p(String msgurl_p) {
        this.msgurl_p = EntityUtil.cutOffStr(msgurl_p, this.getClass(), "msgurl_p");
    }

    @Column(length = 20, nullable = true, name = "[msgloginname]")
    public String getMsgloginname_p() {
        return EntityUtil.cutOffStr(msgloginname_p, this.getClass(), "msgloginname_p");
    }

    public void setMsgloginname_p(String msgloginname_p) {
        this.msgloginname_p = EntityUtil.cutOffStr(msgloginname_p, this.getClass(), "msgloginname_p");
    }

    @Column(length = 64, nullable = true, name = "[msgcorpcode]")
    public String getMsgcorpcode_p() {
        return EntityUtil.cutOffStr(msgcorpcode_p, this.getClass(), "msgcorpcode_p");
    }

    public void setMsgcorpcode_p(String msgcorpcode_p) {
        this.msgcorpcode_p = EntityUtil.cutOffStr(msgcorpcode_p, this.getClass(), "msgcorpcode_p");
    }
}
