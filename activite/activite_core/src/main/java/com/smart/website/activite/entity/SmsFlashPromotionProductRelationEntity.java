package com.smart.website.activite.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_flash_promotion_product_relation", schema = "activiti", catalog = "")
public class SmsFlashPromotionProductRelationEntity {
    private long id;
    private Long flashPromotionId;
    private Long flashPromotionSessionId;
    private Long productId;
    private BigDecimal flashPromotionPrice;
    private Integer flashPromotionCount;
    private Integer flashPromotionLimit;
    private Integer sort;
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
    @Column(name = "flash_promotion_id", nullable = true)
    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    @Basic
    @Column(name = "flash_promotion_session_id", nullable = true)
    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    @Basic
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "flash_promotion_price", nullable = true, precision = 2)
    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    @Basic
    @Column(name = "flash_promotion_count", nullable = true)
    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    @Basic
    @Column(name = "flash_promotion_limit", nullable = true)
    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

        SmsFlashPromotionProductRelationEntity that = (SmsFlashPromotionProductRelationEntity) o;

        if (id != that.id) return false;
        if (flashPromotionId != null ? !flashPromotionId.equals(that.flashPromotionId) : that.flashPromotionId != null)
            return false;
        if (flashPromotionSessionId != null ? !flashPromotionSessionId.equals(that.flashPromotionSessionId) : that.flashPromotionSessionId != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (flashPromotionPrice != null ? !flashPromotionPrice.equals(that.flashPromotionPrice) : that.flashPromotionPrice != null)
            return false;
        if (flashPromotionCount != null ? !flashPromotionCount.equals(that.flashPromotionCount) : that.flashPromotionCount != null)
            return false;
        if (flashPromotionLimit != null ? !flashPromotionLimit.equals(that.flashPromotionLimit) : that.flashPromotionLimit != null)
            return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (flashPromotionId != null ? flashPromotionId.hashCode() : 0);
        result = 31 * result + (flashPromotionSessionId != null ? flashPromotionSessionId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (flashPromotionPrice != null ? flashPromotionPrice.hashCode() : 0);
        result = 31 * result + (flashPromotionCount != null ? flashPromotionCount.hashCode() : 0);
        result = 31 * result + (flashPromotionLimit != null ? flashPromotionLimit.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
