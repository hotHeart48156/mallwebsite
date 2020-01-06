package com.smart.website.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "cms_prefrence_area_product_relation", schema = "product1", catalog = "")
public class CmsPrefrenceAreaProductRelationEntity {
    private long id;
    private Long prefrenceAreaId;
    private Long productId;
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
    @Column(name = "prefrence_area_id", nullable = true)
    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
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

        CmsPrefrenceAreaProductRelationEntity that = (CmsPrefrenceAreaProductRelationEntity) o;

        if (id != that.id) return false;
        if (prefrenceAreaId != null ? !prefrenceAreaId.equals(that.prefrenceAreaId) : that.prefrenceAreaId != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (prefrenceAreaId != null ? prefrenceAreaId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
