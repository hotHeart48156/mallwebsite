package com.smart.website.product_side.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "cms_member_report", schema = "product_side", catalog = "")
public class CmsMemberReportEntity {
    private Long id;
    private Integer reportType;
    private String reportMemberName;
    private Timestamp createTime;
    private String reportObject;
    private Integer reportStatus;
    private Integer handleStatus;
    private String note;
    private Integer storeId;

    @Basic
    @Column(name = "id", nullable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "report_type", nullable = true)
    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    @Basic
    @Column(name = "report_member_name", nullable = true, length = 100)
    public String getReportMemberName() {
        return reportMemberName;
    }

    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
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
    @Column(name = "report_object", nullable = true, length = 100)
    public String getReportObject() {
        return reportObject;
    }

    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    @Basic
    @Column(name = "report_status", nullable = true)
    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Basic
    @Column(name = "handle_status", nullable = true)
    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 200)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsMemberReportEntity that = (CmsMemberReportEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (reportType != null ? !reportType.equals(that.reportType) : that.reportType != null) return false;
        if (reportMemberName != null ? !reportMemberName.equals(that.reportMemberName) : that.reportMemberName != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (reportObject != null ? !reportObject.equals(that.reportObject) : that.reportObject != null) return false;
        if (reportStatus != null ? !reportStatus.equals(that.reportStatus) : that.reportStatus != null) return false;
        if (handleStatus != null ? !handleStatus.equals(that.handleStatus) : that.handleStatus != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (reportType != null ? reportType.hashCode() : 0);
        result = 31 * result + (reportMemberName != null ? reportMemberName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (reportObject != null ? reportObject.hashCode() : 0);
        result = 31 * result + (reportStatus != null ? reportStatus.hashCode() : 0);
        result = 31 * result + (handleStatus != null ? handleStatus.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
