package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Cater_rs")
public class Cater_rs implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String channel_p = "";/* 渠道 */
    private String bookingid_p = "";/* Yun平台订单号 */
    private String interfaceid_p = "";/* 第三方订单号 */
    private String status_p = "";/* 状态 N-预定 S-到店 F-完成 C-取消 */
    private String regno_p = "";/* 平台预订号 */
    private String colno_p = "";/* 平台综合预订号 */
    private String name_p = "";/* 姓名 */
    private String telephone_p = "";/* 电话号码 */
    private Date date_p = sdf;/* 预定日期 */
    private String restaurant_p = "";/* 餐厅 */
    private BigDecimal tables_p = BigDecimal.valueOf(0.00);/* 份数 */
    private BigDecimal occtables_p = BigDecimal.valueOf(0.00);/* 占用桌数 */
    private BigDecimal persons_p = BigDecimal.valueOf(0.00);/* 人数 */
    private String sales_p = "";/* 销售员 */
    private String info_p = "";/* 备注 */
    private String fixinfo_p = "";/* 固定备注 */
    private Date createdate_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private String modify_p = "";/* 修改人 */
    private String modifyip_p = "";/* 修改人IP */
    private Date modifydate_p = sdf;/* 修改日期 */
    private String modifytime_p = "";/* 修改时间 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 价格 */
    private BigDecimal totalprice_p = BigDecimal.valueOf(0.00);/* 总价 */
    private BigDecimal deposit_p = BigDecimal.valueOf(0.00);/* 定金 */
    private String payment_p = "";/* 付款方式微信,淘宝等 */
    private String tisch_p = "";/* 桌型 */
    private String ratecode_p = "";/* 价格代码 */
    private String idnumber_p = "";/* 证件号 */
    private String time_p = "";/* 餐段代码 */
    private String profileid_p = "";/* 档案号 */
    private Boolean fix_p = false;/* 固定价格 */
    private String kitcode_p = "";/* 套餐代码 */
    private BigDecimal itemid_p = BigDecimal.valueOf(0.00);/* 产品ID */

    @Id
    @SequenceGenerator(name = "Cater_rs", sequenceName = "Cater_rs_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Cater_rs")
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

    @Column(length = 20, nullable = true, name = "[channel]")
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

    @Column(length = 20, nullable = true, name = "[interfaceid]")
    public String getInterfaceid_p() {
        return EntityUtil.cutOffStr(interfaceid_p, this.getClass(), "interfaceid_p");
    }

    public void setInterfaceid_p(String interfaceid_p) {
        this.interfaceid_p = EntityUtil.cutOffStr(interfaceid_p, this.getClass(), "interfaceid_p");
    }

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    @Column(length = 60, nullable = true, name = "[regno]")
    public String getRegno_p() {
        return EntityUtil.cutOffStr(regno_p, this.getClass(), "regno_p");
    }

    public void setRegno_p(String regno_p) {
        this.regno_p = EntityUtil.cutOffStr(regno_p, this.getClass(), "regno_p");
    }

    @Column(length = 60, nullable = true, name = "[colno]")
    public String getColno_p() {
        return EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    public void setColno_p(String colno_p) {
        this.colno_p = EntityUtil.cutOffStr(colno_p, this.getClass(), "colno_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 20, nullable = true, name = "[telephone]")
    public String getTelephone_p() {
        return EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    public void setTelephone_p(String telephone_p) {
        this.telephone_p = EntityUtil.cutOffStr(telephone_p, this.getClass(), "telephone_p");
    }

    @Column(nullable = true, name = "[date]")
    public Date getDate_p() {
        return null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    public void setDate_p(Date date_p) {
        this.date_p = null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    @Column(length = 20, nullable = true, name = "[restaurant]")
    public String getRestaurant_p() {
        return EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    public void setRestaurant_p(String restaurant_p) {
        this.restaurant_p = EntityUtil.cutOffStr(restaurant_p, this.getClass(), "restaurant_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[tables]")
    public BigDecimal getTables_p() {
        return tables_p == null ? new BigDecimal(0.00) : tables_p;
    }

    public Integer getTables_p(int i) {
        return tables_p == null ? new BigDecimal(0.00).intValue() : tables_p.intValue();
    }

    public void setTables_p(Object tables_p) {
        if (tables_p == null || "".equals(tables_p))
            this.tables_p = new BigDecimal("0");
        else
            this.tables_p = new BigDecimal(tables_p.toString());
        this.tables_p = EntityUtil.cutOffDecimal(this.tables_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "tables_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[occtables]")
    public BigDecimal getOcctables_p() {
        return occtables_p == null ? new BigDecimal(0.00) : occtables_p;
    }

    public Integer getOcctables_p(int i) {
        return occtables_p == null ? new BigDecimal(0.00).intValue() : occtables_p.intValue();
    }

    public void setOcctables_p(Object occtables_p) {
        if (occtables_p == null || "".equals(occtables_p))
            this.occtables_p = new BigDecimal("0");
        else
            this.occtables_p = new BigDecimal(occtables_p.toString());
        this.occtables_p = EntityUtil.cutOffDecimal(this.occtables_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "occtables_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[persons]")
    public BigDecimal getPersons_p() {
        return persons_p == null ? new BigDecimal(0.00) : persons_p;
    }

    public Integer getPersons_p(int i) {
        return persons_p == null ? new BigDecimal(0.00).intValue() : persons_p.intValue();
    }

    public void setPersons_p(Object persons_p) {
        if (persons_p == null || "".equals(persons_p))
            this.persons_p = new BigDecimal("0");
        else
            this.persons_p = new BigDecimal(persons_p.toString());
        this.persons_p = EntityUtil.cutOffDecimal(this.persons_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "persons_p");
    }

    @Column(length = 20, nullable = true, name = "[sales]")
    public String getSales_p() {
        return EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
    }

    public void setSales_p(String sales_p) {
        this.sales_p = EntityUtil.cutOffStr(sales_p, this.getClass(), "sales_p");
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

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[fixinfo]")
    public String getFixinfo_p() {
        return EntityUtil.cutOffStr(fixinfo_p, this.getClass(), "fixinfo_p");
    }

    public void setFixinfo_p(String fixinfo_p) {
        this.fixinfo_p = EntityUtil.cutOffStr(fixinfo_p, this.getClass(), "fixinfo_p");
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

    @Column(precision = 12, scale = 2, nullable = true, name = "[price]")
    public BigDecimal getPrice_p() {
        return price_p == null ? new BigDecimal(0.00) : price_p;
    }

    public Double getPrice_p(int i) {
        return Double.valueOf(price_p.toString());
    }

    public void setPrice_p(Object price_p) {
        if (price_p == null || "".equals(price_p))
            this.price_p = new BigDecimal("0");
        else
            this.price_p = new BigDecimal(price_p.toString());
        this.price_p = EntityUtil.cutOffDecimal(this.price_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "price_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[totalprice]")
    public BigDecimal getTotalprice_p() {
        return totalprice_p == null ? new BigDecimal(0.00) : totalprice_p;
    }

    public Double getTotalprice_p(int i) {
        return Double.valueOf(totalprice_p.toString());
    }

    public void setTotalprice_p(Object totalprice_p) {
        if (totalprice_p == null || "".equals(totalprice_p))
            this.totalprice_p = new BigDecimal("0");
        else
            this.totalprice_p = new BigDecimal(totalprice_p.toString());
        this.totalprice_p = EntityUtil.cutOffDecimal(this.totalprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "totalprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[deposit]")
    public BigDecimal getDeposit_p() {
        return deposit_p == null ? new BigDecimal(0.00) : deposit_p;
    }

    public Double getDeposit_p(int i) {
        return Double.valueOf(deposit_p.toString());
    }

    public void setDeposit_p(Object deposit_p) {
        if (deposit_p == null || "".equals(deposit_p))
            this.deposit_p = new BigDecimal("0");
        else
            this.deposit_p = new BigDecimal(deposit_p.toString());
        this.deposit_p = EntityUtil.cutOffDecimal(this.deposit_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "deposit_p");
    }

    @Column(length = 20, nullable = true, name = "[payment]")
    public String getPayment_p() {
        return EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    public void setPayment_p(String payment_p) {
        this.payment_p = EntityUtil.cutOffStr(payment_p, this.getClass(), "payment_p");
    }

    @Column(length = 20, nullable = true, name = "[tisch]")
    public String getTisch_p() {
        return EntityUtil.cutOffStr(tisch_p, this.getClass(), "tisch_p");
    }

    public void setTisch_p(String tisch_p) {
        this.tisch_p = EntityUtil.cutOffStr(tisch_p, this.getClass(), "tisch_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 30, nullable = true, name = "[idnumber]")
    public String getIdnumber_p() {
        return EntityUtil.cutOffStr(idnumber_p, this.getClass(), "idnumber_p");
    }

    public void setIdnumber_p(String idnumber_p) {
        this.idnumber_p = EntityUtil.cutOffStr(idnumber_p, this.getClass(), "idnumber_p");
    }

    @Column(length = 20, nullable = true, name = "[time]")
    public String getTime_p() {
        return EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }

    public void setTime_p(String time_p) {
        this.time_p = EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 1, nullable = true, name = "[fix]")
    public Boolean getFix_p() {
        return null == fix_p ? false : fix_p;
    }

    public void setFix_p(Boolean fix_p) {
        this.fix_p = null == fix_p ? false : fix_p;
    }

    @Column(length = 30, nullable = true, name = "[kitcode]")
    public String getKitcode_p() {
        return EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    public void setKitcode_p(String kitcode_p) {
        this.kitcode_p = EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    @Column(precision = 8, scale = 0, nullable = true, name = "[itemid]")
    public BigDecimal getItemid_p() {
        return itemid_p == null ? new BigDecimal(0.00) : itemid_p;
    }

    public Integer getItemid_p(int i) {
        return itemid_p == null ? new BigDecimal(0.00).intValue() : itemid_p.intValue();
    }

    public void setItemid_p(Object itemid_p) {
        if (itemid_p == null || "".equals(itemid_p))
            this.itemid_p = new BigDecimal("0");
        else
            this.itemid_p = new BigDecimal(itemid_p.toString());
        this.itemid_p = EntityUtil.cutOffDecimal(this.itemid_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "itemid_p");
    }
}
