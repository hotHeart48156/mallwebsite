package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_reward_log", schema = "user", catalog = "")
public class UmsRewardLogEntity {
    private long id;
    private Long sendMemberId;
    private Long recMemberId;
    private Integer coin;
    private Timestamp createTime;
    private Long objid;
    private String memberNickName;
    private String memberIcon;
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
    @Column(name = "coin", nullable = true)
    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
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

    @Basic
    @Column(name = "objid", nullable = true)
    public Long getObjid() {
        return objid;
    }

    public void setObjid(Long objid) {
        this.objid = objid;
    }

    @Basic
    @Column(name = "member_nick_name", nullable = false, length = 36)
    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    @Basic
    @Column(name = "member_icon", nullable = false, length = 36)
    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
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

        UmsRewardLogEntity that = (UmsRewardLogEntity) o;

        if (id != that.id) return false;
        if (sendMemberId != null ? !sendMemberId.equals(that.sendMemberId) : that.sendMemberId != null) return false;
        if (recMemberId != null ? !recMemberId.equals(that.recMemberId) : that.recMemberId != null) return false;
        if (coin != null ? !coin.equals(that.coin) : that.coin != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (objid != null ? !objid.equals(that.objid) : that.objid != null) return false;
        if (memberNickName != null ? !memberNickName.equals(that.memberNickName) : that.memberNickName != null)
            return false;
        if (memberIcon != null ? !memberIcon.equals(that.memberIcon) : that.memberIcon != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (sendMemberId != null ? sendMemberId.hashCode() : 0);
        result = 31 * result + (recMemberId != null ? recMemberId.hashCode() : 0);
        result = 31 * result + (coin != null ? coin.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (objid != null ? objid.hashCode() : 0);
        result = 31 * result + (memberNickName != null ? memberNickName.hashCode() : 0);
        result = 31 * result + (memberIcon != null ? memberIcon.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
