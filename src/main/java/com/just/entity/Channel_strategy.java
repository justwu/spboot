package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Channel_strategy")
public class Channel_strategy implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String section_p = "";/* 景区代码 */
    private String code_p = "";/* 代码 */
    private String desc_p = "";/* 描述 */
    private String strategy1_p = "";/* 策略1 */
    private String strategy2_p = "";/* 策略2 */
    private String strategy3_p = "";/* 策略3 */
    private BigDecimal debit1_p = BigDecimal.valueOf(0.00);/* 扣款1 */
    private BigDecimal debit2_p = BigDecimal.valueOf(0.00);/* 扣款2 */
    private BigDecimal debit3_p = BigDecimal.valueOf(0.00);/* 扣款3 */
    private Boolean rounding_p = false;/* 四舍五入 */

    @Id
    @SequenceGenerator(name = "Channel_strategy", sequenceName = "Channel_strategy_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Channel_strategy")
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

    @Column(length = 30, nullable = true, name = "[code]")
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

    @Column(length = 20, nullable = true, name = "[strategy1]")
    public String getStrategy1_p() {
        return EntityUtil.cutOffStr(strategy1_p, this.getClass(), "strategy1_p");
    }

    public void setStrategy1_p(String strategy1_p) {
        this.strategy1_p = EntityUtil.cutOffStr(strategy1_p, this.getClass(), "strategy1_p");
    }

    @Column(length = 20, nullable = true, name = "[strategy2]")
    public String getStrategy2_p() {
        return EntityUtil.cutOffStr(strategy2_p, this.getClass(), "strategy2_p");
    }

    public void setStrategy2_p(String strategy2_p) {
        this.strategy2_p = EntityUtil.cutOffStr(strategy2_p, this.getClass(), "strategy2_p");
    }

    @Column(length = 20, nullable = true, name = "[strategy3]")
    public String getStrategy3_p() {
        return EntityUtil.cutOffStr(strategy3_p, this.getClass(), "strategy3_p");
    }

    public void setStrategy3_p(String strategy3_p) {
        this.strategy3_p = EntityUtil.cutOffStr(strategy3_p, this.getClass(), "strategy3_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[debit1]")
    public BigDecimal getDebit1_p() {
        return debit1_p == null ? new BigDecimal(0.00) : debit1_p;
    }

    public Integer getDebit1_p(int i) {
        return debit1_p == null ? new BigDecimal(0.00).intValue() : debit1_p.intValue();
    }

    public void setDebit1_p(Object debit1_p) {
        if (debit1_p == null || "".equals(debit1_p))
            this.debit1_p = new BigDecimal("0");
        else
            this.debit1_p = new BigDecimal(debit1_p.toString());
        this.debit1_p = EntityUtil.cutOffDecimal(this.debit1_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "debit1_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[debit2]")
    public BigDecimal getDebit2_p() {
        return debit2_p == null ? new BigDecimal(0.00) : debit2_p;
    }

    public Integer getDebit2_p(int i) {
        return debit2_p == null ? new BigDecimal(0.00).intValue() : debit2_p.intValue();
    }

    public void setDebit2_p(Object debit2_p) {
        if (debit2_p == null || "".equals(debit2_p))
            this.debit2_p = new BigDecimal("0");
        else
            this.debit2_p = new BigDecimal(debit2_p.toString());
        this.debit2_p = EntityUtil.cutOffDecimal(this.debit2_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "debit2_p");
    }

    @Column(precision = 3, scale = 0, nullable = true, name = "[debit3]")
    public BigDecimal getDebit3_p() {
        return debit3_p == null ? new BigDecimal(0.00) : debit3_p;
    }

    public Integer getDebit3_p(int i) {
        return debit3_p == null ? new BigDecimal(0.00).intValue() : debit3_p.intValue();
    }

    public void setDebit3_p(Object debit3_p) {
        if (debit3_p == null || "".equals(debit3_p))
            this.debit3_p = new BigDecimal("0");
        else
            this.debit3_p = new BigDecimal(debit3_p.toString());
        this.debit3_p = EntityUtil.cutOffDecimal(this.debit3_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "debit3_p");
    }

    @Column(length = 1, nullable = true, name = "[rounding]")
    public Boolean getRounding_p() {
        return null == rounding_p ? false : rounding_p;
    }

    public void setRounding_p(Boolean rounding_p) {
        this.rounding_p = null == rounding_p ? false : rounding_p;
    }
}
