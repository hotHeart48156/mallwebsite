package com.smart.website.admin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_gen_table", schema = "admin", catalog = "")
public class AdminGenTableEntity {
    private long tableId;
    private String tableName;
    private String tableComment;
    private String className;
    private String tplCategory;
    private String packageName;
    private String moduleName;
    private String businessName;
    private String functionName;
    private String functionAuthor;
    private String options;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @Column(name = "table_id", nullable = false)
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "table_name", nullable = true, length = 200)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "table_comment", nullable = true, length = 500)
    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Basic
    @Column(name = "class_name", nullable = true, length = 100)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "tpl_category", nullable = true, length = 200)
    public String getTplCategory() {
        return tplCategory;
    }

    public void setTplCategory(String tplCategory) {
        this.tplCategory = tplCategory;
    }

    @Basic
    @Column(name = "package_name", nullable = true, length = 100)
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Basic
    @Column(name = "module_name", nullable = true, length = 30)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Basic
    @Column(name = "business_name", nullable = true, length = 30)
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "function_name", nullable = true, length = 50)
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Basic
    @Column(name = "function_author", nullable = true, length = 50)
    public String getFunctionAuthor() {
        return functionAuthor;
    }

    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor;
    }

    @Basic
    @Column(name = "options", nullable = true, length = 1000)
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
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

        AdminGenTableEntity that = (AdminGenTableEntity) o;

        if (tableId != that.tableId) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (tableComment != null ? !tableComment.equals(that.tableComment) : that.tableComment != null) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (tplCategory != null ? !tplCategory.equals(that.tplCategory) : that.tplCategory != null) return false;
        if (packageName != null ? !packageName.equals(that.packageName) : that.packageName != null) return false;
        if (moduleName != null ? !moduleName.equals(that.moduleName) : that.moduleName != null) return false;
        if (businessName != null ? !businessName.equals(that.businessName) : that.businessName != null) return false;
        if (functionName != null ? !functionName.equals(that.functionName) : that.functionName != null) return false;
        if (functionAuthor != null ? !functionAuthor.equals(that.functionAuthor) : that.functionAuthor != null)
            return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tableId ^ (tableId >>> 32));
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (tableComment != null ? tableComment.hashCode() : 0);
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (tplCategory != null ? tplCategory.hashCode() : 0);
        result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
        result = 31 * result + (moduleName != null ? moduleName.hashCode() : 0);
        result = 31 * result + (businessName != null ? businessName.hashCode() : 0);
        result = 31 * result + (functionName != null ? functionName.hashCode() : 0);
        result = 31 * result + (functionAuthor != null ? functionAuthor.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
