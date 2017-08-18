package com.just.entity;

import com.just.utils.EntityUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name = "Accessory")
public class Accessory implements Serializable {
    Date sdf = EntityUtil.stringToDate("1900-01-01");
    private Integer sqlid_p = 0;/* SQL主键 */
    private String profileid_p = "";/* 档案号 */
    private String subid_p = "";/* 第二层id,用于区分一个档案下有多个子单的情况 */
    private String name_p = "";/* 名称 */
    private String filename_p = "";/* 文件名称 */
    private String type_p = "";/* 类型 合同/附件/照片等 */
    private String path_p = "";/* 路径 */
    private Date date_p = sdf;/* 上传日期 */

    @Id
    @SequenceGenerator(name = "Accessory", sequenceName = "Accessory_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Accessory")
    @Column(length = 10, nullable = false, name = "[sqlid]")
    public Integer getSqlid_p() {
        return sqlid_p;
    }

    public void setSqlid_p(Integer sqlid_p) {
        this.sqlid_p = sqlid_p;
    }

    @Column(length = 60, nullable = true, name = "[profileid]")
    public String getProfileid_p() {
        return EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    public void setProfileid_p(String profileid_p) {
        this.profileid_p = EntityUtil.cutOffStr(profileid_p, this.getClass(), "profileid_p");
    }

    @Column(length = 60, nullable = true, name = "[subid]")
    public String getSubid_p() {
        return EntityUtil.cutOffStr(subid_p, this.getClass(), "subid_p");
    }

    public void setSubid_p(String subid_p) {
        this.subid_p = EntityUtil.cutOffStr(subid_p, this.getClass(), "subid_p");
    }

    @Column(length = 60, nullable = true, name = "[name]")
    public String getName_p() {
        return EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    public void setName_p(String name_p) {
        this.name_p = EntityUtil.cutOffStr(name_p, this.getClass(), "name_p");
    }

    @Column(length = 60, nullable = true, name = "[filename]")
    public String getFilename_p() {
        return EntityUtil.cutOffStr(filename_p, this.getClass(), "filename_p");
    }

    public void setFilename_p(String filename_p) {
        this.filename_p = EntityUtil.cutOffStr(filename_p, this.getClass(), "filename_p");
    }

    @Column(length = 20, nullable = true, name = "[type]")
    public String getType_p() {
        return EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    public void setType_p(String type_p) {
        this.type_p = EntityUtil.cutOffStr(type_p, this.getClass(), "type_p");
    }

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(length = 150, nullable = true, name = "[path]")
    public String getPath_p() {
        return EntityUtil.cutOffStr(path_p, this.getClass(), "path_p");
    }

    public void setPath_p(String path_p) {
        this.path_p = EntityUtil.cutOffStr(path_p, this.getClass(), "path_p");
    }

    @Column(nullable = true, name = "[date]")
    public Date getDate_p() {
        return null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }

    public void setDate_p(Date date_p) {
        this.date_p = null == date_p ? EntityUtil.stringToDate("1900-01-01") : date_p;
    }
}
