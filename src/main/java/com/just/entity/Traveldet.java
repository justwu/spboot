package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Traveldet")
public class Traveldet implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 二级渠道代码(旅行社代码) */
    private String desc_p = "";/* 二级渠道描述 */
    private String chtype_p = "";/* 二级渠道属性,0预留型,1自由销售 */
    private String channel_p = "";/* 关联的渠道代码 */
    private Date cutdate_p = sdf;/* 具体某一天释放房表资源 */
    private BigDecimal cutdays_p = BigDecimal.valueOf(0.00);/* 提前几天释放房表资源 */
    private Date startdate_p = sdf;/* 开始日期 */
    private Date enddate_p = sdf;/* 结束日期 */
    private String status_p = "";/* 状态 O=Using, I=Initial, C=Canceled */
    private String info_p = "";/* 备注 */
    private Date created_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String strategy_p = "";/* 渠道策略 */
    private String pricestrategy_p = "";/* 价格策略 */
    private String travelid_p = "";/* 旅行社档案号 */
    private String travelname_p = "";/* 旅行社档案 */

    @Id
    @SequenceGenerator(name = "Traveldet", sequenceName = "Traveldet_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Traveldet")
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

    @Column(length = 3, nullable = true, name = "[chtype]")
    public String getChtype_p() {
        return EntityUtil.cutOffStr(chtype_p, this.getClass(), "chtype_p");
    }

    public void setChtype_p(String chtype_p) {
        this.chtype_p = EntityUtil.cutOffStr(chtype_p, this.getClass(), "chtype_p");
    }

    @Column(length = 20, nullable = true, name = "[channel]")
    public String getChannel_p() {
        return EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    public void setChannel_p(String channel_p) {
        this.channel_p = EntityUtil.cutOffStr(channel_p, this.getClass(), "channel_p");
    }

    @Column(nullable = true, name = "[cutdate]")
    public Date getCutdate_p() {
        return null == cutdate_p ? EntityUtil.stringToDate("1900-01-01") : cutdate_p;
    }

    public void setCutdate_p(Date cutdate_p) {
        this.cutdate_p = null == cutdate_p ? EntityUtil.stringToDate("1900-01-01") : cutdate_p;
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[cutdays]")
    public BigDecimal getCutdays_p() {
        return cutdays_p == null ? new BigDecimal(0.00) : cutdays_p;
    }

    public Integer getCutdays_p(int i) {
        return cutdays_p == null ? new BigDecimal(0.00).intValue() : cutdays_p.intValue();
    }

    public void setCutdays_p(Object cutdays_p) {
        if (cutdays_p == null || "".equals(cutdays_p))
            this.cutdays_p = new BigDecimal("0");
        else
            this.cutdays_p = new BigDecimal(cutdays_p.toString());
        this.cutdays_p = EntityUtil.cutOffDecimal(this.cutdays_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "cutdays_p");
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

    @Column(length = 1, nullable = true, name = "[status]")
    public String getStatus_p() {
        return EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
    }

    public void setStatus_p(String status_p) {
        this.status_p = EntityUtil.cutOffStr(status_p, this.getClass(), "status_p");
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

    @Column(length = 20, nullable = true, name = "[strategy]")
    public String getStrategy_p() {
        return EntityUtil.cutOffStr(strategy_p, this.getClass(), "strategy_p");
    }

    public void setStrategy_p(String strategy_p) {
        this.strategy_p = EntityUtil.cutOffStr(strategy_p, this.getClass(), "strategy_p");
    }

    @Column(length = 20, nullable = true, name = "[pricestrategy]")
    public String getPricestrategy_p() {
        return EntityUtil.cutOffStr(pricestrategy_p, this.getClass(), "pricestrategy_p");
    }

    public void setPricestrategy_p(String pricestrategy_p) {
        this.pricestrategy_p = EntityUtil.cutOffStr(pricestrategy_p, this.getClass(), "pricestrategy_p");
    }

    @Column(length = 60, nullable = true, name = "[travelid]")
    public String getTravelid_p() {
        return EntityUtil.cutOffStr(travelid_p, this.getClass(), "travelid_p");
    }

    public void setTravelid_p(String travelid_p) {
        this.travelid_p = EntityUtil.cutOffStr(travelid_p, this.getClass(), "travelid_p");
    }

    @Column(length = 60, nullable = true, name = "[travelname]")
    public String getTravelname_p() {
        return EntityUtil.cutOffStr(travelname_p, this.getClass(), "travelname_p");
    }

    public void setTravelname_p(String travelname_p) {
        this.travelname_p = EntityUtil.cutOffStr(travelname_p, this.getClass(), "travelname_p");
    }
}
