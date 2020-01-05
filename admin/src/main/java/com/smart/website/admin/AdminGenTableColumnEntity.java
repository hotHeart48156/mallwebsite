package com.smart.website.admin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_gen_table_column", schema = "admin", catalog = "")
public class AdminGenTableColumnEntity {
    private long columnId;
    private String tableId;
    private String columnName;
    private String columnComment;
    private String columnType;
    private String javaType;
    private String javaField;
    private String isPk;
    private String isIncrement;
    private String isRequired;
    private String isInsert;
    private String isEdit;
    private String isList;
    private String isQuery;
    private String queryType;
    private String htmlType;
    private String dictType;
    private Integer sort;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @Column(name = "column_id", nullable = false)
    public long getColumnId() {
        return columnId;
    }

    public void setColumnId(long columnId) {
        this.columnId = columnId;
    }

    @Basic
    @Column(name = "table_id", nullable = true, length = 64)
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "column_name", nullable = true, length = 200)
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "column_comment", nullable = true, length = 500)
    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    @Basic
    @Column(name = "column_type", nullable = true, length = 100)
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Basic
    @Column(name = "java_type", nullable = true, length = 500)
    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    @Basic
    @Column(name = "java_field", nullable = true, length = 200)
    public String getJavaField() {
        return javaField;
    }

    public void setJavaField(String javaField) {
        this.javaField = javaField;
    }

    @Basic
    @Column(name = "is_pk", nullable = true, length = 1)
    public String getIsPk() {
        return isPk;
    }

    public void setIsPk(String isPk) {
        this.isPk = isPk;
    }

    @Basic
    @Column(name = "is_increment", nullable = true, length = 1)
    public String getIsIncrement() {
        return isIncrement;
    }

    public void setIsIncrement(String isIncrement) {
        this.isIncrement = isIncrement;
    }

    @Basic
    @Column(name = "is_required", nullable = true, length = 1)
    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    @Basic
    @Column(name = "is_insert", nullable = true, length = 1)
    public String getIsInsert() {
        return isInsert;
    }

    public void setIsInsert(String isInsert) {
        this.isInsert = isInsert;
    }

    @Basic
    @Column(name = "is_edit", nullable = true, length = 1)
    public String getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    @Basic
    @Column(name = "is_list", nullable = true, length = 1)
    public String getIsList() {
        return isList;
    }

    public void setIsList(String isList) {
        this.isList = isList;
    }

    @Basic
    @Column(name = "is_query", nullable = true, length = 1)
    public String getIsQuery() {
        return isQuery;
    }

    public void setIsQuery(String isQuery) {
        this.isQuery = isQuery;
    }

    @Basic
    @Column(name = "query_type", nullable = true, length = 200)
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    @Basic
    @Column(name = "html_type", nullable = true, length = 200)
    public String getHtmlType() {
        return htmlType;
    }

    public void setHtmlType(String htmlType) {
        this.htmlType = htmlType;
    }

    @Basic
    @Column(name = "dict_type", nullable = true, length = 200)
    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminGenTableColumnEntity that = (AdminGenTableColumnEntity) o;

        if (columnId != that.columnId) return false;
        if (tableId != null ? !tableId.equals(that.tableId) : that.tableId != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (columnComment != null ? !columnComment.equals(that.columnComment) : that.columnComment != null)
            return false;
        if (columnType != null ? !columnType.equals(that.columnType) : that.columnType != null) return false;
        if (javaType != null ? !javaType.equals(that.javaType) : that.javaType != null) return false;
        if (javaField != null ? !javaField.equals(that.javaField) : that.javaField != null) return false;
        if (isPk != null ? !isPk.equals(that.isPk) : that.isPk != null) return false;
        if (isIncrement != null ? !isIncrement.equals(that.isIncrement) : that.isIncrement != null) return false;
        if (isRequired != null ? !isRequired.equals(that.isRequired) : that.isRequired != null) return false;
        if (isInsert != null ? !isInsert.equals(that.isInsert) : that.isInsert != null) return false;
        if (isEdit != null ? !isEdit.equals(that.isEdit) : that.isEdit != null) return false;
        if (isList != null ? !isList.equals(that.isList) : that.isList != null) return false;
        if (isQuery != null ? !isQuery.equals(that.isQuery) : that.isQuery != null) return false;
        if (queryType != null ? !queryType.equals(that.queryType) : that.queryType != null) return false;
        if (htmlType != null ? !htmlType.equals(that.htmlType) : that.htmlType != null) return false;
        if (dictType != null ? !dictType.equals(that.dictType) : that.dictType != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (columnId ^ (columnId >>> 32));
        result = 31 * result + (tableId != null ? tableId.hashCode() : 0);
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (columnComment != null ? columnComment.hashCode() : 0);
        result = 31 * result + (columnType != null ? columnType.hashCode() : 0);
        result = 31 * result + (javaType != null ? javaType.hashCode() : 0);
        result = 31 * result + (javaField != null ? javaField.hashCode() : 0);
        result = 31 * result + (isPk != null ? isPk.hashCode() : 0);
        result = 31 * result + (isIncrement != null ? isIncrement.hashCode() : 0);
        result = 31 * result + (isRequired != null ? isRequired.hashCode() : 0);
        result = 31 * result + (isInsert != null ? isInsert.hashCode() : 0);
        result = 31 * result + (isEdit != null ? isEdit.hashCode() : 0);
        result = 31 * result + (isList != null ? isList.hashCode() : 0);
        result = 31 * result + (isQuery != null ? isQuery.hashCode() : 0);
        result = 31 * result + (queryType != null ? queryType.hashCode() : 0);
        result = 31 * result + (htmlType != null ? htmlType.hashCode() : 0);
        result = 31 * result + (dictType != null ? dictType.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
