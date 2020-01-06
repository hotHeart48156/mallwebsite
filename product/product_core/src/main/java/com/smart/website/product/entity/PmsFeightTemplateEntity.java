package com.smart.website.product.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_feight_template", schema = "product1", catalog = "")
public class PmsFeightTemplateEntity {
    private long id;
    private String name;
    private Integer chargeType;
    private BigDecimal firstWeight;
    private BigDecimal firstFee;
    private BigDecimal continueWeight;
    private BigDecimal continmeFee;
    private String dest;
    private Integer storeId;
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
    @Column(name = "name", nullable = true, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "charge_type", nullable = true)
    public Integer getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    @Basic
    @Column(name = "first_weight", nullable = true, precision = 2)
    public BigDecimal getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    @Basic
    @Column(name = "first_fee", nullable = true, precision = 2)
    public BigDecimal getFirstFee() {
        return firstFee;
    }

    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    @Basic
    @Column(name = "continue_weight", nullable = true, precision = 2)
    public BigDecimal getContinueWeight() {
        return continueWeight;
    }

    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    @Basic
    @Column(name = "continme_fee", nullable = true, precision = 2)
    public BigDecimal getContinmeFee() {
        return continmeFee;
    }

    public void setContinmeFee(BigDecimal continmeFee) {
        this.continmeFee = continmeFee;
    }

    @Basic
    @Column(name = "dest", nullable = true, length = 255)
    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
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

        PmsFeightTemplateEntity that = (PmsFeightTemplateEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null) return false;
        if (firstWeight != null ? !firstWeight.equals(that.firstWeight) : that.firstWeight != null) return false;
        if (firstFee != null ? !firstFee.equals(that.firstFee) : that.firstFee != null) return false;
        if (continueWeight != null ? !continueWeight.equals(that.continueWeight) : that.continueWeight != null)
            return false;
        if (continmeFee != null ? !continmeFee.equals(that.continmeFee) : that.continmeFee != null) return false;
        if (dest != null ? !dest.equals(that.dest) : that.dest != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        return createTime != null ? createTime.equals(that.createTime) : that.createTime == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (firstWeight != null ? firstWeight.hashCode() : 0);
        result = 31 * result + (firstFee != null ? firstFee.hashCode() : 0);
        result = 31 * result + (continueWeight != null ? continueWeight.hashCode() : 0);
        result = 31 * result + (continmeFee != null ? continmeFee.hashCode() : 0);
        result = 31 * result + (dest != null ? dest.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
