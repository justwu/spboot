package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Ratedetail")
public class Ratedetail implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 房价代码 */
    private Date startdate_p = sdf;/* 使用开始日期 */
    private Date enddate_p = sdf;/* 使用结束日期 */
    private BigDecimal rate_p = BigDecimal.valueOf(0.00);/* 平时价 */
    private BigDecimal wrate_p = BigDecimal.valueOf(0.00);/* 周末价 */
    private String packages_p = "";/* 内含服务 */
    private String productcode_p = "";/* 产品具体的代码 票类代码Or房型代码 */
    private String type_p = "";/* 价格策略类型/房型or门票or产品  */
    private BigDecimal mrate1_p = BigDecimal.valueOf(0.00);/* 会议平时价1 */
    private BigDecimal wmrate1_p = BigDecimal.valueOf(0.00);/* 会议周末价1 */
    private BigDecimal mrate2_p = BigDecimal.valueOf(0.00);/* 会议平时价2 */
    private BigDecimal wmrate2_p = BigDecimal.valueOf(0.00);/* 会议周末价2 */
    private BigDecimal mrate3_p = BigDecimal.valueOf(0.00);/* 会议平时价3 */
    private BigDecimal wmrate3_p = BigDecimal.valueOf(0.00);/* 会议周末价3 */
    private BigDecimal mrate4_p = BigDecimal.valueOf(0.00);/* 会议平时价4 */
    private BigDecimal wmrate4_p = BigDecimal.valueOf(0.00);/* 会议周末价4 */
    private String pmsid_p = "";/* PMS的上传标识 */
    private String pmsrangeid_p = "";/* PMS的SQLID */
    private String pmscode_p = "";/* PMS的ratedetail记录ratecode */

    @Id
    @SequenceGenerator(name = "Ratedetail", sequenceName = "Ratedetail_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Ratedetail")
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

    @Column(precision = 12, scale = 2, nullable = true, name = "[rate]")
    public BigDecimal getRate_p() {
        return rate_p == null ? new BigDecimal(0.00) : rate_p;
    }

    public Double getRate_p(int i) {
        return Double.valueOf(rate_p.toString());
    }

    public void setRate_p(Object rate_p) {
        if (rate_p == null || "".equals(rate_p))
            this.rate_p = new BigDecimal("0");
        else
            this.rate_p = new BigDecimal(rate_p.toString());
        this.rate_p = EntityUtil.cutOffDecimal(this.rate_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "rate_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[wrate]")
    public BigDecimal getWrate_p() {
        return wrate_p == null ? new BigDecimal(0.00) : wrate_p;
    }

    public Double getWrate_p(int i) {
        return Double.valueOf(wrate_p.toString());
    }

    public void setWrate_p(Object wrate_p) {
        if (wrate_p == null || "".equals(wrate_p))
            this.wrate_p = new BigDecimal("0");
        else
            this.wrate_p = new BigDecimal(wrate_p.toString());
        this.wrate_p = EntityUtil.cutOffDecimal(this.wrate_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "wrate_p");
    }

    @Column(length = 60, nullable = true, name = "[packages]")
    public String getPackages_p() {
        return EntityUtil.cutOffStr(packages_p, this.getClass(), "packages_p");
    }

    public void setPackages_p(String packages_p) {
        this.packages_p = EntityUtil.cutOffStr(packages_p, this.getClass(), "packages_p");
    }

    @Column(length = 20, nullable = true, name = "[productcode]")
    public String getProductcode_p() {
        return EntityUtil.cutOffStr(productcode_p, this.getClass(), "productcode_p");
    }

    public void setProductcode_p(String productcode_p) {
        this.productcode_p = EntityUtil.cutOffStr(productcode_p, this.getClass(), "productcode_p");
    }

    @Column(length = 3, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[mrate1]")
    public BigDecimal getMrate1_p() {
        return mrate1_p == null ? new BigDecimal(0.00) : mrate1_p;
    }

    public Double getMrate1_p(int i) {
        return Double.valueOf(mrate1_p.toString());
    }

    public void setMrate1_p(Object mrate1_p) {
        if (mrate1_p == null || "".equals(mrate1_p))
            this.mrate1_p = new BigDecimal("0");
        else
            this.mrate1_p = new BigDecimal(mrate1_p.toString());
        this.mrate1_p = EntityUtil.cutOffDecimal(this.mrate1_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "mrate1_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[wmrate1]")
    public BigDecimal getWmrate1_p() {
        return wmrate1_p == null ? new BigDecimal(0.00) : wmrate1_p;
    }

    public Double getWmrate1_p(int i) {
        return Double.valueOf(wmrate1_p.toString());
    }

    public void setWmrate1_p(Object wmrate1_p) {
        if (wmrate1_p == null || "".equals(wmrate1_p))
            this.wmrate1_p = new BigDecimal("0");
        else
            this.wmrate1_p = new BigDecimal(wmrate1_p.toString());
        this.wmrate1_p = EntityUtil.cutOffDecimal(this.wmrate1_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "wmrate1_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[mrate2]")
    public BigDecimal getMrate2_p() {
        return mrate2_p == null ? new BigDecimal(0.00) : mrate2_p;
    }

    public Double getMrate2_p(int i) {
        return Double.valueOf(mrate2_p.toString());
    }

    public void setMrate2_p(Object mrate2_p) {
        if (mrate2_p == null || "".equals(mrate2_p))
            this.mrate2_p = new BigDecimal("0");
        else
            this.mrate2_p = new BigDecimal(mrate2_p.toString());
        this.mrate2_p = EntityUtil.cutOffDecimal(this.mrate2_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "mrate2_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[wmrate2]")
    public BigDecimal getWmrate2_p() {
        return wmrate2_p == null ? new BigDecimal(0.00) : wmrate2_p;
    }

    public Double getWmrate2_p(int i) {
        return Double.valueOf(wmrate2_p.toString());
    }

    public void setWmrate2_p(Object wmrate2_p) {
        if (wmrate2_p == null || "".equals(wmrate2_p))
            this.wmrate2_p = new BigDecimal("0");
        else
            this.wmrate2_p = new BigDecimal(wmrate2_p.toString());
        this.wmrate2_p = EntityUtil.cutOffDecimal(this.wmrate2_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "wmrate2_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[mrate3]")
    public BigDecimal getMrate3_p() {
        return mrate3_p == null ? new BigDecimal(0.00) : mrate3_p;
    }

    public Double getMrate3_p(int i) {
        return Double.valueOf(mrate3_p.toString());
    }

    public void setMrate3_p(Object mrate3_p) {
        if (mrate3_p == null || "".equals(mrate3_p))
            this.mrate3_p = new BigDecimal("0");
        else
            this.mrate3_p = new BigDecimal(mrate3_p.toString());
        this.mrate3_p = EntityUtil.cutOffDecimal(this.mrate3_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "mrate3_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[wmrate3]")
    public BigDecimal getWmrate3_p() {
        return wmrate3_p == null ? new BigDecimal(0.00) : wmrate3_p;
    }

    public Double getWmrate3_p(int i) {
        return Double.valueOf(wmrate3_p.toString());
    }

    public void setWmrate3_p(Object wmrate3_p) {
        if (wmrate3_p == null || "".equals(wmrate3_p))
            this.wmrate3_p = new BigDecimal("0");
        else
            this.wmrate3_p = new BigDecimal(wmrate3_p.toString());
        this.wmrate3_p = EntityUtil.cutOffDecimal(this.wmrate3_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "wmrate3_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[mrate4]")
    public BigDecimal getMrate4_p() {
        return mrate4_p == null ? new BigDecimal(0.00) : mrate4_p;
    }

    public Double getMrate4_p(int i) {
        return Double.valueOf(mrate4_p.toString());
    }

    public void setMrate4_p(Object mrate4_p) {
        if (mrate4_p == null || "".equals(mrate4_p))
            this.mrate4_p = new BigDecimal("0");
        else
            this.mrate4_p = new BigDecimal(mrate4_p.toString());
        this.mrate4_p = EntityUtil.cutOffDecimal(this.mrate4_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "mrate4_p");
    }

    @Column(precision = 12, scale = 2, nullable = true, name = "[wmrate4]")
    public BigDecimal getWmrate4_p() {
        return wmrate4_p == null ? new BigDecimal(0.00) : wmrate4_p;
    }

    public Double getWmrate4_p(int i) {
        return Double.valueOf(wmrate4_p.toString());
    }

    public void setWmrate4_p(Object wmrate4_p) {
        if (wmrate4_p == null || "".equals(wmrate4_p))
            this.wmrate4_p = new BigDecimal("0");
        else
            this.wmrate4_p = new BigDecimal(wmrate4_p.toString());
        this.wmrate4_p = EntityUtil.cutOffDecimal(this.wmrate4_p.setScale(2, RoundingMode.HALF_UP), this.getClass(), "wmrate4_p");
    }

    @Column(length = 20, nullable = true, name = "[pmsid]")
    public String getPmsid_p() {
        return EntityUtil.cutOffStr(pmsid_p, this.getClass(), "pmsid_p");
    }

    public void setPmsid_p(String pmsid_p) {
        this.pmsid_p = EntityUtil.cutOffStr(pmsid_p, this.getClass(), "pmsid_p");
    }

    @Column(length = 20, nullable = true, name = "[pmsrangeid]")
    public String getPmsrangeid_p() {
        return EntityUtil.cutOffStr(pmsrangeid_p, this.getClass(), "pmsrangeid_p");
    }

    public void setPmsrangeid_p(String pmsrangeid_p) {
        this.pmsrangeid_p = EntityUtil.cutOffStr(pmsrangeid_p, this.getClass(), "pmsrangeid_p");
    }

    @Column(length = 20, nullable = true, name = "[pmscode]")
    public String getPmscode_p() {
        return EntityUtil.cutOffStr(pmscode_p, this.getClass(), "pmscode_p");
    }

    public void setPmscode_p(String pmscode_p) {
        this.pmscode_p = EntityUtil.cutOffStr(pmscode_p, this.getClass(), "pmscode_p");
    }
}
