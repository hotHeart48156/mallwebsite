package com.smart.website.activite;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_coupon_history", schema = "activiti", catalog = "")
public class SmsCouponHistoryEntity {
    private long id;
    private Long couponId;
    private Long memberId;
    private String couponCode;
    private String memberNickname;
    private Integer getType;
    private Timestamp createTime;
    private Integer useStatus;
    private Timestamp useTime;
    private Long orderId;
    private String orderSn;
    private Timestamp startTime;
    private Timestamp endTime;
    private String note;
    private Integer storeId;
    private Integer amount;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "coupon_id", nullable = true)
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
    @Column(name = "coupon_code", nullable = true, length = 64)
    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Basic
    @Column(name = "member_nickname", nullable = true, length = 64)
    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    @Basic
    @Column(name = "get_type", nullable = true)
    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
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
    @Column(name = "use_status", nullable = true)
    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    @Basic
    @Column(name = "use_time", nullable = true)
    public Timestamp getUseTime() {
        return useTime;
    }

    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
    }

    @Basic
    @Column(name = "order_id", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_sn", nullable = true, length = 100)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 255)
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

    @Basic
    @Column(name = "amount", nullable = true, precision = 0)
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsCouponHistoryEntity that = (SmsCouponHistoryEntity) o;

        if (id != that.id) return false;
        if (couponId != null ? !couponId.equals(that.couponId) : that.couponId != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (couponCode != null ? !couponCode.equals(that.couponCode) : that.couponCode != null) return false;
        if (memberNickname != null ? !memberNickname.equals(that.memberNickname) : that.memberNickname != null)
            return false;
        if (getType != null ? !getType.equals(that.getType) : that.getType != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (useStatus != null ? !useStatus.equals(that.useStatus) : that.useStatus != null) return false;
        if (useTime != null ? !useTime.equals(that.useTime) : that.useTime != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (orderSn != null ? !orderSn.equals(that.orderSn) : that.orderSn != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (couponId != null ? couponId.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (couponCode != null ? couponCode.hashCode() : 0);
        result = 31 * result + (memberNickname != null ? memberNickname.hashCode() : 0);
        result = 31 * result + (getType != null ? getType.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (useStatus != null ? useStatus.hashCode() : 0);
        result = 31 * result + (useTime != null ? useTime.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
