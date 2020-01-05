package com.smart.website.product;

import javax.persistence.*;

@Entity
@Table(name = "pms_product_category_attribute_relation", schema = "product1", catalog = "")
public class PmsProductCategoryAttributeRelationEntity {
    private long id;
    private Long productCategoryId;
    private Long productAttributeId;
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
    @Column(name = "product_category_id", nullable = true)
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "product_attribute_id", nullable = true)
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
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

        PmsProductCategoryAttributeRelationEntity that = (PmsProductCategoryAttributeRelationEntity) o;

        if (id != that.id) return false;
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null)
            return false;
        if (productAttributeId != null ? !productAttributeId.equals(that.productAttributeId) : that.productAttributeId != null)
            return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (productAttributeId != null ? productAttributeId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
