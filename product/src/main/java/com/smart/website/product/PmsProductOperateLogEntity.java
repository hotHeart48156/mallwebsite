package com.smart.website.product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_product_operate_log", schema = "product1", catalog = "")
public class PmsProductOperateLogEntity {
    private long id;
    private Long productId;
    private BigDecimal priceOld;
    private BigDecimal priceNew;
    private BigDecimal salePriceOld;
    private BigDecimal salePriceNew;
    private Integer giftPointOld;
    private Integer giftPointNew;
    private Integer usePointLimitOld;
    private Integer usePointLimitNew;
    private String operateMan;
    private Timestamp createTime;
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
    @Column(name = "price_old", nullable = true, precision = 2)
    public BigDecimal getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    @Basic
    @Column(name = "price_new", nullable = true, precision = 2)
    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    @Basic
    @Column(name = "sale_price_old", nullable = true, precision = 2)
    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    @Basic
    @Column(name = "sale_price_new", nullable = true, precision = 2)
    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    @Basic
    @Column(name = "gift_point_old", nullable = true)
    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    @Basic
    @Column(name = "gift_point_new", nullable = true)
    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    @Basic
    @Column(name = "use_point_limit_old", nullable = true)
    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    @Basic
    @Column(name = "use_point_limit_new", nullable = true)
    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    @Basic
    @Column(name = "operate_man", nullable = true, length = 64)
    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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

        PmsProductOperateLogEntity that = (PmsProductOperateLogEntity) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (priceOld != null ? !priceOld.equals(that.priceOld) : that.priceOld != null) return false;
        if (priceNew != null ? !priceNew.equals(that.priceNew) : that.priceNew != null) return false;
        if (salePriceOld != null ? !salePriceOld.equals(that.salePriceOld) : that.salePriceOld != null) return false;
        if (salePriceNew != null ? !salePriceNew.equals(that.salePriceNew) : that.salePriceNew != null) return false;
        if (giftPointOld != null ? !giftPointOld.equals(that.giftPointOld) : that.giftPointOld != null) return false;
        if (giftPointNew != null ? !giftPointNew.equals(that.giftPointNew) : that.giftPointNew != null) return false;
        if (usePointLimitOld != null ? !usePointLimitOld.equals(that.usePointLimitOld) : that.usePointLimitOld != null)
            return false;
        if (usePointLimitNew != null ? !usePointLimitNew.equals(that.usePointLimitNew) : that.usePointLimitNew != null)
            return false;
        if (operateMan != null ? !operateMan.equals(that.operateMan) : that.operateMan != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (priceOld != null ? priceOld.hashCode() : 0);
        result = 31 * result + (priceNew != null ? priceNew.hashCode() : 0);
        result = 31 * result + (salePriceOld != null ? salePriceOld.hashCode() : 0);
        result = 31 * result + (salePriceNew != null ? salePriceNew.hashCode() : 0);
        result = 31 * result + (giftPointOld != null ? giftPointOld.hashCode() : 0);
        result = 31 * result + (giftPointNew != null ? giftPointNew.hashCode() : 0);
        result = 31 * result + (usePointLimitOld != null ? usePointLimitOld.hashCode() : 0);
        result = 31 * result + (usePointLimitNew != null ? usePointLimitNew.hashCode() : 0);
        result = 31 * result + (operateMan != null ? operateMan.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
