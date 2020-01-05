package com.smart.website.admin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_sys_notice", schema = "admin", catalog = "")
public class AdminSysNoticeEntity {
    private int noticeId;
    private String noticeTitle;
    private String noticeType;
    private String noticeContent;
    private String status;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @Column(name = "notice_id", nullable = false)
    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    @Basic
    @Column(name = "notice_title", nullable = false, length = 50)
    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    @Basic
    @Column(name = "notice_type", nullable = false, length = 1)
    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    @Basic
    @Column(name = "notice_content", nullable = true, length = 2000)
    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
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
    @Column(name = "remark", nullable = true, length = 255)
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

        AdminSysNoticeEntity that = (AdminSysNoticeEntity) o;

        if (noticeId != that.noticeId) return false;
        if (noticeTitle != null ? !noticeTitle.equals(that.noticeTitle) : that.noticeTitle != null) return false;
        if (noticeType != null ? !noticeType.equals(that.noticeType) : that.noticeType != null) return false;
        if (noticeContent != null ? !noticeContent.equals(that.noticeContent) : that.noticeContent != null)
            return false;
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
        int result = noticeId;
        result = 31 * result + (noticeTitle != null ? noticeTitle.hashCode() : 0);
        result = 31 * result + (noticeType != null ? noticeType.hashCode() : 0);
        result = 31 * result + (noticeContent != null ? noticeContent.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
