package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Channeldet")
public class Channeldet implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 渠道代码 */
    private String desc_p = "";/* 渠道描述 */
    private Date cutdate_p = sdf;/* 具体某一天释放房表资源 */
    private BigDecimal cutdays_p = BigDecimal.valueOf(0.00);/* 提前几天释放房表资源 */
    private Date startdate_p = sdf;/* 开始日期 */
    private Date enddate_p = sdf;/* 结束日期 */
    private String ratecodes_p = "";/* 房价代码 */
    private String status_p = "";/* 状态 O=Using, I=Initial, C=Canceled */
    private String info_p = "";/* 备注 */
    private Date created_p = sdf;/* 创建日期 */
    private String createtime_p = "";/* 创建时间 */
    private String creator_p = "";/* 创建人 */
    private String createip_p = "";/* 创建人IP */
    private String modify_p = "";/* 修改人 */
    private String modifyip_p = "";/* 修改人IP */
    private Date modifydate_p = sdf;/* 修改日期 */
    private String modifytime_p = "";/* 修改时间 */
    private String saleid_p = "";/* 销售员ID */
    private String product_p = "";/* 产品 */
    private String roomtype_p = "";/* 房间类型 */
    private String tickettype_p = "";/* 门票类型 */
    private String cateringtype_p = "";/* 餐桌类型 */
    private String packagetype_p = "";/* 套餐类型 */
    private String strategy_p = "";/* 渠道策略 */
    private String caterstrategy_p = "";/* 餐饮策略 */
    private String pricestrategy_p = "";/* 价格策略 */
    private String interfacestrategy_p = "";/* 接口策略 */
    private String ticketstrategy_p = "";/* 门票策略 */
    private String segment_p = "";/* 网段限制 */
    private BigDecimal logintimes_p = BigDecimal.valueOf(0.00);/* 在线次数限制 */
    private String profiles_p = "";/* 渠道档案 */

    @Id
    @SequenceGenerator(name = "Channeldet", sequenceName = "Channeldet_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Channeldet")
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

    @Column(length = 60, nullable = true, name = "[ratecodes]")
    public String getRatecodes_p() {
        return EntityUtil.cutOffStr(ratecodes_p, this.getClass(), "ratecodes_p");
    }

    public void setRatecodes_p(String ratecodes_p) {
        this.ratecodes_p = EntityUtil.cutOffStr(ratecodes_p, this.getClass(), "ratecodes_p");
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

    @Column(length = 8, nullable = true, name = "[saleid]")
    public String getSaleid_p() {
        return EntityUtil.cutOffStr(saleid_p, this.getClass(), "saleid_p");
    }

    public void setSaleid_p(String saleid_p) {
        this.saleid_p = EntityUtil.cutOffStr(saleid_p, this.getClass(), "saleid_p");
    }

    @Column(length = 20, nullable = true, name = "[product]")
    public String getProduct_p() {
        return EntityUtil.cutOffStr(product_p, this.getClass(), "product_p");
    }

    public void setProduct_p(String product_p) {
        this.product_p = EntityUtil.cutOffStr(product_p, this.getClass(), "product_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[roomtype]")
    public String getRoomtype_p() {
        return EntityUtil.cutOffStr(roomtype_p, this.getClass(), "roomtype_p");
    }

    public void setRoomtype_p(String roomtype_p) {
        this.roomtype_p = EntityUtil.cutOffStr(roomtype_p, this.getClass(), "roomtype_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[tickettype]")
    public String getTickettype_p() {
        return EntityUtil.cutOffStr(tickettype_p, this.getClass(), "tickettype_p");
    }

    public void setTickettype_p(String tickettype_p) {
        this.tickettype_p = EntityUtil.cutOffStr(tickettype_p, this.getClass(), "tickettype_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[cateringtype]")
    public String getCateringtype_p() {
        return EntityUtil.cutOffStr(cateringtype_p, this.getClass(), "cateringtype_p");
    }

    public void setCateringtype_p(String cateringtype_p) {
        this.cateringtype_p = EntityUtil.cutOffStr(cateringtype_p, this.getClass(), "cateringtype_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[packagetype]")
    public String getPackagetype_p() {
        return EntityUtil.cutOffStr(packagetype_p, this.getClass(), "packagetype_p");
    }

    public void setPackagetype_p(String packagetype_p) {
        this.packagetype_p = EntityUtil.cutOffStr(packagetype_p, this.getClass(), "packagetype_p");
    }

    @Column(length = 20, nullable = true, name = "[strategy]")
    public String getStrategy_p() {
        return EntityUtil.cutOffStr(strategy_p, this.getClass(), "strategy_p");
    }

    public void setStrategy_p(String strategy_p) {
        this.strategy_p = EntityUtil.cutOffStr(strategy_p, this.getClass(), "strategy_p");
    }

    @Column(length = 20, nullable = true, name = "[caterstrategy]")
    public String getCaterstrategy_p() {
        return EntityUtil.cutOffStr(caterstrategy_p, this.getClass(), "caterstrategy_p");
    }

    public void setCaterstrategy_p(String caterstrategy_p) {
        this.caterstrategy_p = EntityUtil.cutOffStr(caterstrategy_p, this.getClass(), "caterstrategy_p");
    }

    @Column(length = 20, nullable = true, name = "[pricestrategy]")
    public String getPricestrategy_p() {
        return EntityUtil.cutOffStr(pricestrategy_p, this.getClass(), "pricestrategy_p");
    }

    public void setPricestrategy_p(String pricestrategy_p) {
        this.pricestrategy_p = EntityUtil.cutOffStr(pricestrategy_p, this.getClass(), "pricestrategy_p");
    }

    @Column(length = 20, nullable = true, name = "[interfacestrategy]")
    public String getInterfacestrategy_p() {
        return EntityUtil.cutOffStr(interfacestrategy_p, this.getClass(), "interfacestrategy_p");
    }

    public void setInterfacestrategy_p(String interfacestrategy_p) {
        this.interfacestrategy_p = EntityUtil.cutOffStr(interfacestrategy_p, this.getClass(), "interfacestrategy_p");
    }

    @Column(length = 20, nullable = true, name = "[ticketstrategy]")
    public String getTicketstrategy_p() {
        return EntityUtil.cutOffStr(ticketstrategy_p, this.getClass(), "ticketstrategy_p");
    }

    public void setTicketstrategy_p(String ticketstrategy_p) {
        this.ticketstrategy_p = EntityUtil.cutOffStr(ticketstrategy_p, this.getClass(), "ticketstrategy_p");
    }

    @Column(length = 20, nullable = true, name = "[segment]")
    public String getSegment_p() {
        return EntityUtil.cutOffStr(segment_p, this.getClass(), "segment_p");
    }

    public void setSegment_p(String segment_p) {
        this.segment_p = EntityUtil.cutOffStr(segment_p, this.getClass(), "segment_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[logintimes]")
    public BigDecimal getLogintimes_p() {
        return logintimes_p == null ? new BigDecimal(0.00) : logintimes_p;
    }

    public Integer getLogintimes_p(int i) {
        return logintimes_p == null ? new BigDecimal(0.00).intValue() : logintimes_p.intValue();
    }

    public void setLogintimes_p(Object logintimes_p) {
        if (logintimes_p == null || "".equals(logintimes_p))
            this.logintimes_p = new BigDecimal("0");
        else
            this.logintimes_p = new BigDecimal(logintimes_p.toString());
        this.logintimes_p = EntityUtil.cutOffDecimal(this.logintimes_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "logintimes_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[profiles]")
    public String getProfiles_p() {
        return EntityUtil.cutOffStr(profiles_p, this.getClass(), "profiles_p");
    }

    public void setProfiles_p(String profiles_p) {
        this.profiles_p = EntityUtil.cutOffStr(profiles_p, this.getClass(), "profiles_p");
    }
}
