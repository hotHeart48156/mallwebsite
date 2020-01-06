package com.smart.website.activite.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_draw_user", schema = "activiti", catalog = "")
public class SmsDrawUserEntity {
    private long id;
    private Long drawId;
    private Long userId;
    private Timestamp time;
    private String role;
    private Integer lotteryStatus;
    private Integer storeId;

    @Basic
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "draw_id", nullable = true)
    public Long getDrawId() {
        return drawId;
    }

    public void setDrawId(Long drawId) {
        this.drawId = drawId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "role", nullable = true, length = 30)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "lottery_status", nullable = true)
    public Integer getLotteryStatus() {
        return lotteryStatus;
    }

    public void setLotteryStatus(Integer lotteryStatus) {
        this.lotteryStatus = lotteryStatus;
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

        SmsDrawUserEntity that = (SmsDrawUserEntity) o;

        if (id != that.id) return false;
        if (drawId != null ? !drawId.equals(that.drawId) : that.drawId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (lotteryStatus != null ? !lotteryStatus.equals(that.lotteryStatus) : that.lotteryStatus != null)
            return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (drawId != null ? drawId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (lotteryStatus != null ? lotteryStatus.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
