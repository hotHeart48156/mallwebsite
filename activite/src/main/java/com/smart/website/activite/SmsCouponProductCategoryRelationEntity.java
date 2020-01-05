package com.smart.website.activite;

import javax.persistence.*;

@Entity
@Table(name = "sms_coupon_product_category_relation", schema = "activiti", catalog = "")
public class SmsCouponProductCategoryRelationEntity {
    private long id;
    private Long couponId;
    private Long productCategoryId;
    private String productCategoryName;
    private String parentCategoryName;
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
    @Column(name = "coupon_id", nullable = true)
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "product_category_id", nullable = true)
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "product_category_name", nullable = true, length = 200)
    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Basic
    @Column(name = "parent_category_name", nullable = true, length = 200)
    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
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

        SmsCouponProductCategoryRelationEntity that = (SmsCouponProductCategoryRelationEntity) o;

        if (id != that.id) return false;
        if (couponId != null ? !couponId.equals(that.couponId) : that.couponId != null) return false;
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null)
            return false;
        if (productCategoryName != null ? !productCategoryName.equals(that.productCategoryName) : that.productCategoryName != null)
            return false;
        if (parentCategoryName != null ? !parentCategoryName.equals(that.parentCategoryName) : that.parentCategoryName != null)
            return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (couponId != null ? couponId.hashCode() : 0);
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (productCategoryName != null ? productCategoryName.hashCode() : 0);
        result = 31 * result + (parentCategoryName != null ? parentCategoryName.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
