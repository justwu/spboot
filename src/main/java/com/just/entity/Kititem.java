package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Kititem")
public class Kititem implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 产品的景区代码 */
    private String kitcode_p = "";/* 套餐代码 */
    private String accountid_p = "";/* 商户号 */
    private String producttype_p = "";/* 产品类型 房R,票T,餐C,自定义Z */
    private String itemtype_p = "";/* 多选一/单选必备 空为固定.M为多选 */
    private String groupcode_p = "";/* 多选一的组.允许房,餐内有多个多选一,R1,R2,T1,T2 */
    private BigDecimal baserate_p = BigDecimal.valueOf(0.00);/* 成本价定义 */
    private BigDecimal price_p = BigDecimal.valueOf(0.00);/* 设置定义的非周末价格,不管ratecode,都卖这个价 */
    private BigDecimal wprice_p = BigDecimal.valueOf(0.00);/* 设置定义的周末价格,不管ratecode,都卖这个价 */
    private BigDecimal orgprice_p = BigDecimal.valueOf(0.00);/* 根据套餐设置得出的价格 */
    private BigDecimal discountprice_p = BigDecimal.valueOf(0.00);/* 手动修改的打折价格 */
    private BigDecimal calcprice_p = BigDecimal.valueOf(0.00);/* 运算得出的实际价格.考虑fix的时候 */
    private Boolean fixrate_p = false;/* 是否属于固定价格 */
    private BigDecimal discount1_p = BigDecimal.valueOf(0.00);/* 打折套数1 */
    private BigDecimal discount2_p = BigDecimal.valueOf(0.00);/* 打折套数2 */
    private BigDecimal price1_p = BigDecimal.valueOf(0.00);/* 打折价1 */
    private BigDecimal price2_p = BigDecimal.valueOf(0.00);/* 打折价2 */
    private BigDecimal days_p = BigDecimal.valueOf(0.00);/* 产品有效天数(住店天数,子预订天数) */
    private BigDecimal num_p = BigDecimal.valueOf(0.00);/* 产品数量 */
    private String ratecode_p = "";/* 价格代码 */
    private String productcode_p = "";/* 产品代码 */
    private String productdesc_p = "";/* 产品描述 */
    private String productgroup_p = "";/* 产品组(客房所属的酒店,餐厅/餐桌的分组) */
    private Date usedate_p = sdf;/* 日期 */
    private String time_p = "";/* 餐段代码 */

    @Id
    @SequenceGenerator(name = "Kititem", sequenceName = "Kititem_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Kititem")
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

    @Column(length = 20, nullable = true, name = "[kitcode]")
    public String getKitcode_p() {
        return EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    public void setKitcode_p(String kitcode_p) {
        this.kitcode_p = EntityUtil.cutOffStr(kitcode_p, this.getClass(), "kitcode_p");
    }

    @Column(length = 60, nullable = true, name = "[accountid]")
    public String getAccountid_p() {
        return EntityUtil.cutOffStr(accountid_p, this.getClass(), "accountid_p");
    }

    public void setAccountid_p(String accountid_p) {
        this.accountid_p = EntityUtil.cutOffStr(accountid_p, this.getClass(), "accountid_p");
    }

    @Column(length = 3, nullable = true, name = "[producttype]")
    public String getProducttype_p() {
        return EntityUtil.cutOffStr(producttype_p, this.getClass(), "producttype_p");
    }

    public void setProducttype_p(String producttype_p) {
        this.producttype_p = EntityUtil.cutOffStr(producttype_p, this.getClass(), "producttype_p");
    }

    @Column(length = 3, nullable = true, name = "[itemtype]")
    public String getItemtype_p() {
        return EntityUtil.cutOffStr(itemtype_p, this.getClass(), "itemtype_p");
    }

    public void setItemtype_p(String itemtype_p) {
        this.itemtype_p = EntityUtil.cutOffStr(itemtype_p, this.getClass(), "itemtype_p");
    }

    @Column(length = 3, nullable = true, name = "[groupcode]")
    public String getGroupcode_p() {
        return EntityUtil.cutOffStr(groupcode_p, this.getClass(), "groupcode_p");
    }

    public void setGroupcode_p(String groupcode_p) {
        this.groupcode_p = EntityUtil.cutOffStr(groupcode_p, this.getClass(), "groupcode_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[baserate]")
    public BigDecimal getBaserate_p() {
        return baserate_p == null ? new BigDecimal(0.00) : baserate_p;
    }

    public Double getBaserate_p(int i) {
        return Double.valueOf(baserate_p.toString());
    }

    public void setBaserate_p(Object baserate_p) {
        if (baserate_p == null || "".equals(baserate_p))
            this.baserate_p = new BigDecimal("0");
        else
            this.baserate_p = new BigDecimal(baserate_p.toString());
        this.baserate_p = EntityUtil.cutOffDecimal(this.baserate_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "baserate_p");
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

    @Column(precision = 12, scale = 2, nullable = true, name = "[wprice]")
    public BigDecimal getWprice_p() {
        return wprice_p == null ? new BigDecimal(0.00) : wprice_p;
    }

    public Double getWprice_p(int i) {
        return Double.valueOf(wprice_p.toString());
    }

    public void setWprice_p(Object wprice_p) {
        if (wprice_p == null || "".equals(wprice_p))
            this.wprice_p = new BigDecimal("0");
        else
            this.wprice_p = new BigDecimal(wprice_p.toString());
        this.wprice_p = EntityUtil.cutOffDecimal(this.wprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "wprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[orgprice]")
    public BigDecimal getOrgprice_p() {
        return orgprice_p == null ? new BigDecimal(0.00) : orgprice_p;
    }

    public Double getOrgprice_p(int i) {
        return Double.valueOf(orgprice_p.toString());
    }

    public void setOrgprice_p(Object orgprice_p) {
        if (orgprice_p == null || "".equals(orgprice_p))
            this.orgprice_p = new BigDecimal("0");
        else
            this.orgprice_p = new BigDecimal(orgprice_p.toString());
        this.orgprice_p = EntityUtil.cutOffDecimal(this.orgprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "orgprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[discountprice]")
    public BigDecimal getDiscountprice_p() {
        return discountprice_p == null ? new BigDecimal(0.00) : discountprice_p;
    }

    public Double getDiscountprice_p(int i) {
        return Double.valueOf(discountprice_p.toString());
    }

    public void setDiscountprice_p(Object discountprice_p) {
        if (discountprice_p == null || "".equals(discountprice_p))
            this.discountprice_p = new BigDecimal("0");
        else
            this.discountprice_p = new BigDecimal(discountprice_p.toString());
        this.discountprice_p = EntityUtil.cutOffDecimal(this.discountprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "discountprice_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[calcprice]")
    public BigDecimal getCalcprice_p() {
        return calcprice_p == null ? new BigDecimal(0.00) : calcprice_p;
    }

    public Double getCalcprice_p(int i) {
        return Double.valueOf(calcprice_p.toString());
    }

    public void setCalcprice_p(Object calcprice_p) {
        if (calcprice_p == null || "".equals(calcprice_p))
            this.calcprice_p = new BigDecimal("0");
        else
            this.calcprice_p = new BigDecimal(calcprice_p.toString());
        this.calcprice_p = EntityUtil.cutOffDecimal(this.calcprice_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "calcprice_p");
    }

    @Column(length = 1, nullable = true, name = "[fixrate]")
    public Boolean getFixrate_p() {
        return null == fixrate_p ? false : fixrate_p;
    }

    public void setFixrate_p(Boolean fixrate_p) {
        this.fixrate_p = null == fixrate_p ? false : fixrate_p;
    }

    @Column(precision = 5, scale = 0, nullable = true, name = "[discount1]")
    public BigDecimal getDiscount1_p() {
        return discount1_p == null ? new BigDecimal(0.00) : discount1_p;
    }

    public Integer getDiscount1_p(int i) {
        return discount1_p == null ? new BigDecimal(0.00).intValue() : discount1_p.intValue();
    }

    public void setDiscount1_p(Object discount1_p) {
        if (discount1_p == null || "".equals(discount1_p))
            this.discount1_p = new BigDecimal("0");
        else
            this.discount1_p = new BigDecimal(discount1_p.toString());
        this.discount1_p = EntityUtil.cutOffDecimal(this.discount1_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "discount1_p");
    }

    @Column(precision = 5, scale = 0, nullable = true, name = "[discount2]")
    public BigDecimal getDiscount2_p() {
        return discount2_p == null ? new BigDecimal(0.00) : discount2_p;
    }

    public Integer getDiscount2_p(int i) {
        return discount2_p == null ? new BigDecimal(0.00).intValue() : discount2_p.intValue();
    }

    public void setDiscount2_p(Object discount2_p) {
        if (discount2_p == null || "".equals(discount2_p))
            this.discount2_p = new BigDecimal("0");
        else
            this.discount2_p = new BigDecimal(discount2_p.toString());
        this.discount2_p = EntityUtil.cutOffDecimal(this.discount2_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "discount2_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[price1]")
    public BigDecimal getPrice1_p() {
        return price1_p == null ? new BigDecimal(0.00) : price1_p;
    }

    public Double getPrice1_p(int i) {
        return Double.valueOf(price1_p.toString());
    }

    public void setPrice1_p(Object price1_p) {
        if (price1_p == null || "".equals(price1_p))
            this.price1_p = new BigDecimal("0");
        else
            this.price1_p = new BigDecimal(price1_p.toString());
        this.price1_p = EntityUtil.cutOffDecimal(this.price1_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "price1_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[price2]")
    public BigDecimal getPrice2_p() {
        return price2_p == null ? new BigDecimal(0.00) : price2_p;
    }

    public Double getPrice2_p(int i) {
        return Double.valueOf(price2_p.toString());
    }

    public void setPrice2_p(Object price2_p) {
        if (price2_p == null || "".equals(price2_p))
            this.price2_p = new BigDecimal("0");
        else
            this.price2_p = new BigDecimal(price2_p.toString());
        this.price2_p = EntityUtil.cutOffDecimal(this.price2_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "price2_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[days]")
    public BigDecimal getDays_p() {
        return days_p == null ? new BigDecimal(0.00) : days_p;
    }

    public Integer getDays_p(int i) {
        return days_p == null ? new BigDecimal(0.00).intValue() : days_p.intValue();
    }

    public void setDays_p(Object days_p) {
        if (days_p == null || "".equals(days_p))
            this.days_p = new BigDecimal("0");
        else
            this.days_p = new BigDecimal(days_p.toString());
        this.days_p = EntityUtil.cutOffDecimal(this.days_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "days_p");
    }

    @Column(precision = 5, scale = 0, nullable = true, name = "[num]")
    public BigDecimal getNum_p() {
        return num_p == null ? new BigDecimal(0.00) : num_p;
    }

    public Integer getNum_p(int i) {
        return num_p == null ? new BigDecimal(0.00).intValue() : num_p.intValue();
    }

    public void setNum_p(Object num_p) {
        if (num_p == null || "".equals(num_p))
            this.num_p = new BigDecimal("0");
        else
            this.num_p = new BigDecimal(num_p.toString());
        this.num_p = EntityUtil.cutOffDecimal(this.num_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "num_p");
    }

    @Column(length = 20, nullable = true, name = "[ratecode]")
    public String getRatecode_p() {
        return EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    public void setRatecode_p(String ratecode_p) {
        this.ratecode_p = EntityUtil.cutOffStr(ratecode_p, this.getClass(), "ratecode_p");
    }

    @Column(length = 60, nullable = true, name = "[productcode]")
    public String getProductcode_p() {
        return EntityUtil.cutOffStr(productcode_p, this.getClass(), "productcode_p");
    }

    public void setProductcode_p(String productcode_p) {
        this.productcode_p = EntityUtil.cutOffStr(productcode_p, this.getClass(), "productcode_p");
    }

    @Column(length = 60, nullable = true, name = "[productdesc]")
    public String getProductdesc_p() {
        return EntityUtil.cutOffStr(productdesc_p, this.getClass(), "productdesc_p");
    }

    public void setProductdesc_p(String productdesc_p) {
        this.productdesc_p = EntityUtil.cutOffStr(productdesc_p, this.getClass(), "productdesc_p");
    }

    @Column(length = 20, nullable = true, name = "[productgroup]")
    public String getProductgroup_p() {
        return EntityUtil.cutOffStr(productgroup_p, this.getClass(), "productgroup_p");
    }

    public void setProductgroup_p(String productgroup_p) {
        this.productgroup_p = EntityUtil.cutOffStr(productgroup_p, this.getClass(), "productgroup_p");
    }

    @Column(nullable = true, name = "[usedate]")
    public Date getUsedate_p() {
        return null == usedate_p ? EntityUtil.stringToDate("1900-01-01") : usedate_p;
    }

    public void setUsedate_p(Date usedate_p) {
        this.usedate_p = null == usedate_p ? EntityUtil.stringToDate("1900-01-01") : usedate_p;
    }

    @Column(length = 20, nullable = true, name = "[time]")
    public String getTime_p() {
        return EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }

    public void setTime_p(String time_p) {
        this.time_p = EntityUtil.cutOffStr(time_p, this.getClass(), "time_p");
    }
}
