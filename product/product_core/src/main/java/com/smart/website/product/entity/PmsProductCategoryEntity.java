package com.smart.website.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "pms_product_category", schema = "product1", catalog = "")
public class PmsProductCategoryEntity {
    private long id;
    private Long parentId;
    private String name;
    private Integer level;
    private Integer productCount;
    private String productUnit;
    private Integer navStatus;
    private Integer showStatus;
    private int indexStatus;
    private Integer sort;
    private String icon;
    private String keywords;
    private String description;
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
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
    @Column(name = "level", nullable = true)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "product_count", nullable = true)
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Basic
    @Column(name = "product_unit", nullable = true, length = 64)
    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    @Basic
    @Column(name = "nav_status", nullable = true)
    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    @Basic
    @Column(name = "show_status", nullable = true)
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "index_status", nullable = false)
    public int getIndexStatus() {
        return indexStatus;
    }

    public void setIndexStatus(int indexStatus) {
        this.indexStatus = indexStatus;
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
    @Column(name = "icon", nullable = true, length = 255)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "keywords", nullable = true, length = 255)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        PmsProductCategoryEntity that = (PmsProductCategoryEntity) o;

        if (id != that.id) return false;
        if (indexStatus != that.indexStatus) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (productCount != null ? !productCount.equals(that.productCount) : that.productCount != null) return false;
        if (productUnit != null ? !productUnit.equals(that.productUnit) : that.productUnit != null) return false;
        if (navStatus != null ? !navStatus.equals(that.navStatus) : that.navStatus != null) return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (productCount != null ? productCount.hashCode() : 0);
        result = 31 * result + (productUnit != null ? productUnit.hashCode() : 0);
        result = 31 * result + (navStatus != null ? navStatus.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + indexStatus;
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
