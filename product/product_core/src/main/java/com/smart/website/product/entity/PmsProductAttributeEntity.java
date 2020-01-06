package com.smart.website.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "pms_product_attribute", schema = "product1", catalog = "")
public class PmsProductAttributeEntity {
    private long id;
    private Long productAttributeCategoryId;
    private String name;
    private Integer selectType;
    private Integer inputType;
    private String inputList;
    private Integer sort;
    private Integer filterType;
    private Integer searchType;
    private Integer relatedStatus;
    private Integer handAddStatus;
    private Integer type;
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
    @Column(name = "product_attribute_category_id", nullable = true)
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
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
    @Column(name = "select_type", nullable = true)
    public Integer getSelectType() {
        return selectType;
    }

    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    @Basic
    @Column(name = "input_type", nullable = true)
    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    @Basic
    @Column(name = "input_list", nullable = true, length = 255)
    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList;
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
    @Column(name = "filter_type", nullable = true)
    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    @Basic
    @Column(name = "search_type", nullable = true)
    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    @Basic
    @Column(name = "related_status", nullable = true)
    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    @Basic
    @Column(name = "hand_add_status", nullable = true)
    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

        PmsProductAttributeEntity that = (PmsProductAttributeEntity) o;

        if (id != that.id) return false;
        if (productAttributeCategoryId != null ? !productAttributeCategoryId.equals(that.productAttributeCategoryId) : that.productAttributeCategoryId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (selectType != null ? !selectType.equals(that.selectType) : that.selectType != null) return false;
        if (inputType != null ? !inputType.equals(that.inputType) : that.inputType != null) return false;
        if (inputList != null ? !inputList.equals(that.inputList) : that.inputList != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (filterType != null ? !filterType.equals(that.filterType) : that.filterType != null) return false;
        if (searchType != null ? !searchType.equals(that.searchType) : that.searchType != null) return false;
        if (relatedStatus != null ? !relatedStatus.equals(that.relatedStatus) : that.relatedStatus != null)
            return false;
        if (handAddStatus != null ? !handAddStatus.equals(that.handAddStatus) : that.handAddStatus != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productAttributeCategoryId != null ? productAttributeCategoryId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (selectType != null ? selectType.hashCode() : 0);
        result = 31 * result + (inputType != null ? inputType.hashCode() : 0);
        result = 31 * result + (inputList != null ? inputList.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + (searchType != null ? searchType.hashCode() : 0);
        result = 31 * result + (relatedStatus != null ? relatedStatus.hashCode() : 0);
        result = 31 * result + (handAddStatus != null ? handAddStatus.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
