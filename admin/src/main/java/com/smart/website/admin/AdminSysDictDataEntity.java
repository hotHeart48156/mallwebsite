package com.smart.website.admin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_sys_dict_data", schema = "admin", catalog = "")
public class AdminSysDictDataEntity {
    private long dictCode;
    private Integer dictSort;
    private String dictLabel;
    private String dictValue;
    private String dictType;
    private String cssClass;
    private String listClass;
    private String isDefault;
    private String status;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @Column(name = "dict_code", nullable = false)
    public long getDictCode() {
        return dictCode;
    }

    public void setDictCode(long dictCode) {
        this.dictCode = dictCode;
    }

    @Basic
    @Column(name = "dict_sort", nullable = true)
    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    @Basic
    @Column(name = "dict_label", nullable = true, length = 100)
    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel;
    }

    @Basic
    @Column(name = "dict_value", nullable = true, length = 100)
    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    @Basic
    @Column(name = "dict_type", nullable = true, length = 100)
    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    @Basic
    @Column(name = "css_class", nullable = true, length = 100)
    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    @Basic
    @Column(name = "list_class", nullable = true, length = 100)
    public String getListClass() {
        return listClass;
    }

    public void setListClass(String listClass) {
        this.listClass = listClass;
    }

    @Basic
    @Column(name = "is_default", nullable = true, length = 1)
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_by", nullable = true, length = 64)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_by", nullable = true, length = 64)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysDictDataEntity that = (AdminSysDictDataEntity) o;

        if (dictCode != that.dictCode) return false;
        if (dictSort != null ? !dictSort.equals(that.dictSort) : that.dictSort != null) return false;
        if (dictLabel != null ? !dictLabel.equals(that.dictLabel) : that.dictLabel != null) return false;
        if (dictValue != null ? !dictValue.equals(that.dictValue) : that.dictValue != null) return false;
        if (dictType != null ? !dictType.equals(that.dictType) : that.dictType != null) return false;
        if (cssClass != null ? !cssClass.equals(that.cssClass) : that.cssClass != null) return false;
        if (listClass != null ? !listClass.equals(that.listClass) : that.listClass != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dictCode ^ (dictCode >>> 32));
        result = 31 * result + (dictSort != null ? dictSort.hashCode() : 0);
        result = 31 * result + (dictLabel != null ? dictLabel.hashCode() : 0);
        result = 31 * result + (dictValue != null ? dictValue.hashCode() : 0);
        result = 31 * result + (dictType != null ? dictType.hashCode() : 0);
        result = 31 * result + (cssClass != null ? cssClass.hashCode() : 0);
        result = 31 * result + (listClass != null ? listClass.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
