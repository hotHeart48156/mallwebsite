package com.smart.website.product;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pms_product_full_reduction", schema = "product1", catalog = "")
public class PmsProductFullReductionEntity {
    private long id;
    private Long productId;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
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
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "full_price", nullable = true, precision = 2)
    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    @Basic
    @Column(name = "reduce_price", nullable = true, precision = 2)
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
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

        PmsProductFullReductionEntity that = (PmsProductFullReductionEntity) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (fullPrice != null ? !fullPrice.equals(that.fullPrice) : that.fullPrice != null) return false;
        if (reducePrice != null ? !reducePrice.equals(that.reducePrice) : that.reducePrice != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (fullPrice != null ? fullPrice.hashCode() : 0);
        result = 31 * result + (reducePrice != null ? reducePrice.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
