package com.smart.website.user.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ums_member_rule_setting", schema = "user", catalog = "")
public class UmsMemberRuleSettingEntity {
    private long id;
    private Integer continueSignDay;
    private Integer continueSignPoint;
    private BigDecimal consumePerPoint;
    private BigDecimal lowOrderAmount;
    private Integer maxPointPerOrder;
    private Integer type;
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
    @Column(name = "continue_sign_day", nullable = true)
    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    @Basic
    @Column(name = "continue_sign_point", nullable = true)
    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    @Basic
    @Column(name = "consume_per_point", nullable = true, precision = 2)
    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    @Basic
    @Column(name = "low_order_amount", nullable = true, precision = 2)
    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    @Basic
    @Column(name = "max_point_per_order", nullable = true)
    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
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

        UmsMemberRuleSettingEntity that = (UmsMemberRuleSettingEntity) o;

        if (id != that.id) return false;
        if (continueSignDay != null ? !continueSignDay.equals(that.continueSignDay) : that.continueSignDay != null)
            return false;
        if (continueSignPoint != null ? !continueSignPoint.equals(that.continueSignPoint) : that.continueSignPoint != null)
            return false;
        if (consumePerPoint != null ? !consumePerPoint.equals(that.consumePerPoint) : that.consumePerPoint != null)
            return false;
        if (lowOrderAmount != null ? !lowOrderAmount.equals(that.lowOrderAmount) : that.lowOrderAmount != null)
            return false;
        if (maxPointPerOrder != null ? !maxPointPerOrder.equals(that.maxPointPerOrder) : that.maxPointPerOrder != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (continueSignDay != null ? continueSignDay.hashCode() : 0);
        result = 31 * result + (continueSignPoint != null ? continueSignPoint.hashCode() : 0);
        result = 31 * result + (consumePerPoint != null ? consumePerPoint.hashCode() : 0);
        result = 31 * result + (lowOrderAmount != null ? lowOrderAmount.hashCode() : 0);
        result = 31 * result + (maxPointPerOrder != null ? maxPointPerOrder.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
