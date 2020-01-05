package com.smart.website.activite;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_coupon", schema = "activiti", catalog = "")
public class SmsCouponEntity {
    private long id;
    private Integer type;
    private String name;
    private Integer platform;
    private Integer count;
    private BigDecimal amount;
    private Integer perLimit;
    private BigDecimal minPoint;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer useType;
    private String note;
    private Integer publishCount;
    private Integer useCount;
    private Integer receiveCount;
    private Timestamp enableTime;
    private String code;
    private Integer memberLevel;
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
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "platform", nullable = true)
    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    @Basic
    @Column(name = "count", nullable = true)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "per_limit", nullable = true)
    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    @Basic
    @Column(name = "min_point", nullable = true, precision = 2)
    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
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
    @Column(name = "use_type", nullable = true)
    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
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
    @Column(name = "publish_count", nullable = true)
    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    @Basic
    @Column(name = "use_count", nullable = true)
    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    @Basic
    @Column(name = "receive_count", nullable = true)
    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    @Basic
    @Column(name = "enable_time", nullable = true)
    public Timestamp getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Timestamp enableTime) {
        this.enableTime = enableTime;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 64)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "member_level", nullable = true)
    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
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

        SmsCouponEntity that = (SmsCouponEntity) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (perLimit != null ? !perLimit.equals(that.perLimit) : that.perLimit != null) return false;
        if (minPoint != null ? !minPoint.equals(that.minPoint) : that.minPoint != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (useType != null ? !useType.equals(that.useType) : that.useType != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (publishCount != null ? !publishCount.equals(that.publishCount) : that.publishCount != null) return false;
        if (useCount != null ? !useCount.equals(that.useCount) : that.useCount != null) return false;
        if (receiveCount != null ? !receiveCount.equals(that.receiveCount) : that.receiveCount != null) return false;
        if (enableTime != null ? !enableTime.equals(that.enableTime) : that.enableTime != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (memberLevel != null ? !memberLevel.equals(that.memberLevel) : that.memberLevel != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (perLimit != null ? perLimit.hashCode() : 0);
        result = 31 * result + (minPoint != null ? minPoint.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (useType != null ? useType.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (publishCount != null ? publishCount.hashCode() : 0);
        result = 31 * result + (useCount != null ? useCount.hashCode() : 0);
        result = 31 * result + (receiveCount != null ? receiveCount.hashCode() : 0);
        result = 31 * result + (enableTime != null ? enableTime.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (memberLevel != null ? memberLevel.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
