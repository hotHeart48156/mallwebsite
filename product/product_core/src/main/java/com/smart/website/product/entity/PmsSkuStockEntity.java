package com.smart.website.product.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pms_sku_stock", schema = "product1", catalog = "")
public class PmsSkuStockEntity {
    private long id;
    private Long productId;
    private String skuCode;
    private BigDecimal price;
    private Integer stock;
    private Integer lowStock;
    private String sp1;
    private String sp2;
    private String sp3;
    private String pic;
    private Integer sale;
    private BigDecimal promotionPrice;
    private Integer lockStock;
    private Integer storeId;
    private String productName;
    private String sp4;

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
    @Column(name = "sku_code", nullable = false, length = 64)
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "stock", nullable = true)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "low_stock", nullable = true)
    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    @Basic
    @Column(name = "sp1", nullable = true, length = 64)
    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    @Basic
    @Column(name = "sp2", nullable = true, length = 64)
    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    @Basic
    @Column(name = "sp3", nullable = true, length = 64)
    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "sale", nullable = true)
    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Basic
    @Column(name = "promotion_price", nullable = true, precision = 2)
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Basic
    @Column(name = "lock_stock", nullable = true)
    public Integer getLockStock() {
        return lockStock;
    }

    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
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
    @Column(name = "product_name", nullable = true, length = 255)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "sp4", nullable = true, length = 255)
    public String getSp4() {
        return sp4;
    }

    public void setSp4(String sp4) {
        this.sp4 = sp4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsSkuStockEntity that = (PmsSkuStockEntity) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (skuCode != null ? !skuCode.equals(that.skuCode) : that.skuCode != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;
        if (lowStock != null ? !lowStock.equals(that.lowStock) : that.lowStock != null) return false;
        if (sp1 != null ? !sp1.equals(that.sp1) : that.sp1 != null) return false;
        if (sp2 != null ? !sp2.equals(that.sp2) : that.sp2 != null) return false;
        if (sp3 != null ? !sp3.equals(that.sp3) : that.sp3 != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (sale != null ? !sale.equals(that.sale) : that.sale != null) return false;
        if (promotionPrice != null ? !promotionPrice.equals(that.promotionPrice) : that.promotionPrice != null)
            return false;
        if (lockStock != null ? !lockStock.equals(that.lockStock) : that.lockStock != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        return sp4 != null ? sp4.equals(that.sp4) : that.sp4 == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (skuCode != null ? skuCode.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (lowStock != null ? lowStock.hashCode() : 0);
        result = 31 * result + (sp1 != null ? sp1.hashCode() : 0);
        result = 31 * result + (sp2 != null ? sp2.hashCode() : 0);
        result = 31 * result + (sp3 != null ? sp3.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (sale != null ? sale.hashCode() : 0);
        result = 31 * result + (promotionPrice != null ? promotionPrice.hashCode() : 0);
        result = 31 * result + (lockStock != null ? lockStock.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (sp4 != null ? sp4.hashCode() : 0);
        return result;
    }
}
