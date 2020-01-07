package com.smart.website.activite.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_sign_record", schema = "activiti", catalog = "")
//登录记录
public class SmsSignRecordEntity {
    private long id;
    private long userId;
    private int signScore;
    private String record;
    private Timestamp signTime;
    private int type;
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
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "sign_score", nullable = false)
    public int getSignScore() {
        return signScore;
    }

    public void setSignScore(int signScore) {
        this.signScore = signScore;
    }

    @Basic
    @Column(name = "record", nullable = true, length = 20)
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Basic
    @Column(name = "sign_time", nullable = true)
    public Timestamp getSignTime() {
        return signTime;
    }

    public void setSignTime(Timestamp signTime) {
        this.signTime = signTime;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

        SmsSignRecordEntity that = (SmsSignRecordEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (signScore != that.signScore) return false;
        if (type != that.type) return false;
        if (record != null ? !record.equals(that.record) : that.record != null) return false;
        if (signTime != null ? !signTime.equals(that.signTime) : that.signTime != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + signScore;
        result = 31 * result + (record != null ? record.hashCode() : 0);
        result = 31 * result + (signTime != null ? signTime.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
