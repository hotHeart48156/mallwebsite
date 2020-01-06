package com.smart.website.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "pms_brand", schema = "product1", catalog = "")
public class PmsBrandEntity {
    private long id;
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private Integer productCount;
    private Integer productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;
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
    @Column(name = "name", nullable = true, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "first_letter", nullable = true, length = 8)
    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
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
    @Column(name = "factory_status", nullable = true)
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
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
    @Column(name = "product_count", nullable = true)
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Basic
    @Column(name = "product_comment_count", nullable = true)
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    @Basic
    @Column(name = "logo", nullable = true, length = 255)
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "big_pic", nullable = true, length = 255)
    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    @Basic
    @Column(name = "brand_story", nullable = true, length = -1)
    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
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

        PmsBrandEntity that = (PmsBrandEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (firstLetter != null ? !firstLetter.equals(that.firstLetter) : that.firstLetter != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (factoryStatus != null ? !factoryStatus.equals(that.factoryStatus) : that.factoryStatus != null)
            return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        if (productCount != null ? !productCount.equals(that.productCount) : that.productCount != null) return false;
        if (productCommentCount != null ? !productCommentCount.equals(that.productCommentCount) : that.productCommentCount != null)
            return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (bigPic != null ? !bigPic.equals(that.bigPic) : that.bigPic != null) return false;
        if (brandStory != null ? !brandStory.equals(that.brandStory) : that.brandStory != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (firstLetter != null ? firstLetter.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (factoryStatus != null ? factoryStatus.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + (productCount != null ? productCount.hashCode() : 0);
        result = 31 * result + (productCommentCount != null ? productCommentCount.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (bigPic != null ? bigPic.hashCode() : 0);
        result = 31 * result + (brandStory != null ? brandStory.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
