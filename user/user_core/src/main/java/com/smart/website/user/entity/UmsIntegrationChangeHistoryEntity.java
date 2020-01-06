package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_integration_change_history", schema = "user", catalog = "")
public class UmsIntegrationChangeHistoryEntity {
    private long id;
    private Long memberId;
    private Timestamp createTime;
    private Integer changeType;
    private Integer changeCount;
    private String operateMan;
    private String operateNote;
    private Integer sourceType;
    private Integer storeId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "member_id", nullable = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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
    @Column(name = "change_type", nullable = true)
    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    @Basic
    @Column(name = "change_count", nullable = true)
    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    @Basic
    @Column(name = "operate_man", nullable = true, length = 100)
    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    @Basic
    @Column(name = "operate_note", nullable = true, length = 200)
    public String getOperateNote() {
        return operateNote;
    }

    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote;
    }

    @Basic
    @Column(name = "source_type", nullable = true)
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
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

        UmsIntegrationChangeHistoryEntity that = (UmsIntegrationChangeHistoryEntity) o;

        if (id != that.id) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (changeType != null ? !changeType.equals(that.changeType) : that.changeType != null) return false;
        if (changeCount != null ? !changeCount.equals(that.changeCount) : that.changeCount != null) return false;
        if (operateMan != null ? !operateMan.equals(that.operateMan) : that.operateMan != null) return false;
        if (operateNote != null ? !operateNote.equals(that.operateNote) : that.operateNote != null) return false;
        if (sourceType != null ? !sourceType.equals(that.sourceType) : that.sourceType != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (changeType != null ? changeType.hashCode() : 0);
        result = 31 * result + (changeCount != null ? changeCount.hashCode() : 0);
        result = 31 * result + (operateMan != null ? operateMan.hashCode() : 0);
        result = 31 * result + (operateNote != null ? operateNote.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
