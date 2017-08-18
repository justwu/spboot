package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Prepay")
public class Prepay implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String colno_p = "";/* 综合预定号 */
    private String payno_p = "";/* 预付款订单号 */
    private String profileid_p = "";/* 档案号 */
    private String name_p = "";/* 客户名 */
    private String payname_p = "";/* 付款人名 */
    private String telephone_p = "";/* 电话号码 */
    private String status_p = "";/* 状态  I=初始, R=退款, C=取消, F=完成 */
    private String pstatus_p = "";/* 付款状态  S=汇出, R=收到, C=取消 */
    private String type_p = "";/* 类别  S=系统录入, W=网上支付, V=语音支付 */
    private BigDecimal amount_p = BigDecimal.valueOf(0.00);/* 预付款金额 */
    private BigDecimal hbamount_p = BigDecimal.valueOf(0.00);/* 手工单总金额 */
    private BigDecimal balance_p = BigDecimal.valueOf(0.00);/* 剩余金额 */
    private BigDecimal refund_p = BigDecimal.valueOf(0.00);/* 退款金额 */
    private BigDecimal debit_p = BigDecimal.valueOf(0.00);/* 扣款金额 */
    private String info_p = "";/* 备注 */
    private Date paydate_p = sdf;/* 付款时间 */
    private String payment_p = "";/* 付款方式微信,淘宝等 */
    private Date created_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private String modify_p = "";/* 修改人 */
    private String modifyip_p = "";/* 修改人IP */
    private Date modifydate_p = sdf;/* 修改日期 */
    private String modifytime_p = "";/* 修改时间 */

    @Id
    @SequenceGenerator(name = "Prepay", sequenceName = "Prepay_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Prepay")
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

    @Column(length = 20, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    @Column(length = 20, nullable = true, name = "[payno]")
    public String getPayno_p() {
        return EntityUtil.cutOffStr(payno_p, this.getClass(), "payno_p");
    }

    public void setPayno_p(String payno_p) {
        this.payno_p = EntityUtil.cutOffStr(payno_p, this.getClass(), "payno_p");
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

    @Column(length = 60, nullable = true, name = "[payname]")
    public String getPayname_p() {
        return EntityUtil.cutOffStr(payname_p, this.getClass(), "payname_p");
    }

    public void setPayname_p(String payname_p) {
        this.payname_p = EntityUtil.cutOffStr(payname_p, this.getClass(), "payname_p");
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

    @Column(length = 1, nullable = true, name = "[pstatus]")
    public String getPstatus_p() {
        return EntityUtil.cutOffStr(pstatus_p, this.getClass(), "pstatus_p");
    }

    public void setPstatus_p(String pstatus_p) {
        this.pstatus_p = EntityUtil.cutOffStr(pstatus_p, this.getClass(), "pstatus_p");
    }

    @Column(length = 1, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[amount]")
    public BigDecimal getAmount_p() {
        return amount_p == null ? new BigDecimal(0.00) : amount_p;
    }

    public Double getAmount_p(int i) {
        return Double.valueOf(amount_p.toString());
    }

    public void setAmount_p(Object amount_p) {
        if (amount_p == null || "".equals(amount_p))
            this.amount_p = new BigDecimal("0");
        else
            this.amount_p = new BigDecimal(amount_p.toString());
        this.amount_p = EntityUtil.cutOffDecimal(this.amount_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "amount_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[hbamount]")
    public BigDecimal getHbamount_p() {
        return hbamount_p == null ? new BigDecimal(0.00) : hbamount_p;
    }

    public Double getHbamount_p(int i) {
        return Double.valueOf(hbamount_p.toString());
    }

    public void setHbamount_p(Object hbamount_p) {
        if (hbamount_p == null || "".equals(hbamount_p))
            this.hbamount_p = new BigDecimal("0");
        else
            this.hbamount_p = new BigDecimal(hbamount_p.toString());
        this.hbamount_p = EntityUtil.cutOffDecimal(this.hbamount_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "hbamount_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[balance]")
    public BigDecimal getBalance_p() {
        return balance_p == null ? new BigDecimal(0.00) : balance_p;
    }

    public Double getBalance_p(int i) {
        return Double.valueOf(balance_p.toString());
    }

    public void setBalance_p(Object balance_p) {
        if (balance_p == null || "".equals(balance_p))
            this.balance_p = new BigDecimal("0");
        else
            this.balance_p = new BigDecimal(balance_p.toString());
        this.balance_p = EntityUtil.cutOffDecimal(this.balance_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "balance_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[refund]")
    public BigDecimal getRefund_p() {
        return refund_p == null ? new BigDecimal(0.00) : refund_p;
    }

    public Double getRefund_p(int i) {
        return Double.valueOf(refund_p.toString());
    }

    public void setRefund_p(Object refund_p) {
        if (refund_p == null || "".equals(refund_p))
            this.refund_p = new BigDecimal("0");
        else
            this.refund_p = new BigDecimal(refund_p.toString());
        this.refund_p = EntityUtil.cutOffDecimal(this.refund_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "refund_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[debit]")
    public BigDecimal getDebit_p() {
        return debit_p == null ? new BigDecimal(0.00) : debit_p;
    }

    public Double getDebit_p(int i) {
        return Double.valueOf(debit_p.toString());
    }

    public void setDebit_p(Object debit_p) {
        if (debit_p == null || "".equals(debit_p))
            this.debit_p = new BigDecimal("0");
        else
            this.debit_p = new BigDecimal(debit_p.toString());
        this.debit_p = EntityUtil.cutOffDecimal(this.debit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "debit_p");
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

    @Column(nullable = true, name = "[paydate]")
    public Date getPaydate_p() {
        return null == paydate_p ? EntityUtil.stringToDate("1900-01-01") : paydate_p;
    }

    public void setPaydate_p(Date paydate_p) {
        this.paydate_p = null == paydate_p ? EntityUtil.stringToDate("1900-01-01") : paydate_p;
    }

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    @Column(nullable = true, name = "[created]")
    public Date getCreated_p() {
        return null == created_p ? EntityUtil.stringToDate("1900-01-01") : created_p;
    }

    public void setCreated_p(Date created_p) {
        this.created_p = null == created_p ? EntityUtil.stringToDate("1900-01-01") : created_p;
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

    @Column(length = 20, nullable = true, name = "[modify]")
    public String getModify_p() {
        return EntityUtil.cutOffStr(modify_p, this.getClass(), "modify_p");
    }

    public void setModify_p(String modify_p) {
        this.modify_p = EntityUtil.cutOffStr(modify_p, this.getClass(), "modify_p");
    }

    @Column(length = 20, nullable = true, name = "[modifyip]")
    public String getModifyip_p() {
        return EntityUtil.cutOffStr(modifyip_p, this.getClass(), "modifyip_p");
    }

    public void setModifyip_p(String modifyip_p) {
        this.modifyip_p = EntityUtil.cutOffStr(modifyip_p, this.getClass(), "modifyip_p");
    }

    @Column(nullable = true, name = "[modifydate]")
    public Date getModifydate_p() {
        return null == modifydate_p ? EntityUtil.stringToDate("1900-01-01") : modifydate_p;
    }

    public void setModifydate_p(Date modifydate_p) {
        this.modifydate_p = null == modifydate_p ? EntityUtil.stringToDate("1900-01-01") : modifydate_p;
    }

    @Column(length = 10, nullable = true, name = "[modifytime]")
    public String getModifytime_p() {
        return EntityUtil.cutOffStr(modifytime_p, this.getClass(), "modifytime_p");
    }

    public void setModifytime_p(String modifytime_p) {
        this.modifytime_p = EntityUtil.cutOffStr(modifytime_p, this.getClass(), "modifytime_p");
    }
}
