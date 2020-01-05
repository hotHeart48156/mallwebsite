package com.smart.website.user.entity;

import javax.persistence.*;

@Entity
@Table(name = "ums_integration_consume_setting", schema = "user", catalog = "")
public class UmsIntegrationConsumeSettingEntity {
    private long id;
    private Integer deductionPerAmount;
    private Integer maxPercentPerOrder;
    private Integer useUnit;
    private Integer couponStatus;
    private Integer storeId;
    private Integer login;
    private Integer register;
    private Integer sign;
    private Integer orders;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "deduction_per_amount", nullable = true)
    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    @Basic
    @Column(name = "max_percent_per_order", nullable = true)
    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    @Basic
    @Column(name = "use_unit", nullable = true)
    public Integer getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    @Basic
    @Column(name = "coupon_status", nullable = true)
    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
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
    @Column(name = "login", nullable = true)
    public Integer getLogin() {
        return login;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    @Basic
    @Column(name = "register", nullable = true)
    public Integer getRegister() {
        return register;
    }

    public void setRegister(Integer register) {
        this.register = register;
    }

    @Basic
    @Column(name = "sign", nullable = true)
    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    @Basic
    @Column(name = "orders", nullable = true)
    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmsIntegrationConsumeSettingEntity that = (UmsIntegrationConsumeSettingEntity) o;

        if (id != that.id) return false;
        if (deductionPerAmount != null ? !deductionPerAmount.equals(that.deductionPerAmount) : that.deductionPerAmount != null)
            return false;
        if (maxPercentPerOrder != null ? !maxPercentPerOrder.equals(that.maxPercentPerOrder) : that.maxPercentPerOrder != null)
            return false;
        if (useUnit != null ? !useUnit.equals(that.useUnit) : that.useUnit != null) return false;
        if (couponStatus != null ? !couponStatus.equals(that.couponStatus) : that.couponStatus != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (register != null ? !register.equals(that.register) : that.register != null) return false;
        if (sign != null ? !sign.equals(that.sign) : that.sign != null) return false;
        if (orders != null ? !orders.equals(that.orders) : that.orders != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (deductionPerAmount != null ? deductionPerAmount.hashCode() : 0);
        result = 31 * result + (maxPercentPerOrder != null ? maxPercentPerOrder.hashCode() : 0);
        result = 31 * result + (useUnit != null ? useUnit.hashCode() : 0);
        result = 31 * result + (couponStatus != null ? couponStatus.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (register != null ? register.hashCode() : 0);
        result = 31 * result + (sign != null ? sign.hashCode() : 0);
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
    }
}
