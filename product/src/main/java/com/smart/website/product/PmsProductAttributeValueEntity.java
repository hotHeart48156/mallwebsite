package com.smart.website.product;

import javax.persistence.*;

@Entity
@Table(name = "pms_product_attribute_value", schema = "product1", catalog = "")
public class PmsProductAttributeValueEntity {
    private long id;
    private Long productId;
    private Long productAttributeId;
    private String value;
    private Integer storeId;
    private String name;
    private Integer type;

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
    @Column(name = "product_attribute_id", nullable = true)
    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    @Basic
    @Column(name = "value", nullable = true, length = 64)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsProductAttributeValueEntity that = (PmsProductAttributeValueEntity) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (productAttributeId != null ? !productAttributeId.equals(that.productAttributeId) : that.productAttributeId != null)
            return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productAttributeId != null ? productAttributeId.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
