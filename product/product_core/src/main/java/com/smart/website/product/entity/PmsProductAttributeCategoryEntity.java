package com.smart.website.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "pms_product_attribute_category", schema = "product1", catalog = "")
public class PmsProductAttributeCategoryEntity {
    private long id;
    private String name;
    private Integer attributeCount;
    private Integer paramCount;
    private Integer storeId;
    private String pic;

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
    @Column(name = "attribute_count", nullable = true)
    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    @Basic
    @Column(name = "param_count", nullable = true)
    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
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
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsProductAttributeCategoryEntity that = (PmsProductAttributeCategoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (attributeCount != null ? !attributeCount.equals(that.attributeCount) : that.attributeCount != null)
            return false;
        if (paramCount != null ? !paramCount.equals(that.paramCount) : that.paramCount != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        return pic != null ? pic.equals(that.pic) : that.pic == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (attributeCount != null ? attributeCount.hashCode() : 0);
        result = 31 * result + (paramCount != null ? paramCount.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        return result;
    }
}
