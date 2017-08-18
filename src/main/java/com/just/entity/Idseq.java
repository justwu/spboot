package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Idseq")
public class Idseq implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String code_p = "";/* 代码 */
    private BigDecimal value_p = BigDecimal.valueOf(0.00);/* 值 */

    @Id
    @SequenceGenerator(name = "Idseq", sequenceName = "Idseq_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Idseq")
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

    @Column(precision = 16, scale = 0, nullable = true, name = "[value]")
    public BigDecimal getValue_p() {
        return value_p == null ? new BigDecimal(0.00) : value_p;
    }

    public Integer getValue_p(int i) {
        return value_p == null ? new BigDecimal(0.00).intValue() : value_p.intValue();
    }

    public void setValue_p(Object value_p) {
        if (value_p == null || "".equals(value_p))
            this.value_p = new BigDecimal("0");
        else
            this.value_p = new BigDecimal(value_p.toString());
        this.value_p = EntityUtil.cutOffDecimal(this.value_p.setScale(0, RoundingMode.HALF_UP), this.getClass(), "value_p");
    }
}
