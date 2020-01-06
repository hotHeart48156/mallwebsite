package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_reward_logs", schema = "user", catalog = "")
public class UmsRewardLogsEntity {
    private long id;
    private Long sendMemberId;
    private Long recMemberId;
    private String coin;
    private Timestamp createTime;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "send_member_id", nullable = true)
    public Long getSendMemberId() {
        return sendMemberId;
    }

    public void setSendMemberId(Long sendMemberId) {
        this.sendMemberId = sendMemberId;
    }

    @Basic
    @Column(name = "rec_member_id", nullable = true)
    public Long getRecMemberId() {
        return recMemberId;
    }

    public void setRecMemberId(Long recMemberId) {
        this.recMemberId = recMemberId;
    }

    @Basic
    @Column(name = "coin", nullable = true, length = 255)
    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmsRewardLogsEntity that = (UmsRewardLogsEntity) o;

        if (id != that.id) return false;
        if (sendMemberId != null ? !sendMemberId.equals(that.sendMemberId) : that.sendMemberId != null) return false;
        if (recMemberId != null ? !recMemberId.equals(that.recMemberId) : that.recMemberId != null) return false;
        if (coin != null ? !coin.equals(that.coin) : that.coin != null) return false;
        return createTime != null ? createTime.equals(that.createTime) : that.createTime == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (sendMemberId != null ? sendMemberId.hashCode() : 0);
        result = 31 * result + (recMemberId != null ? recMemberId.hashCode() : 0);
        result = 31 * result + (coin != null ? coin.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
