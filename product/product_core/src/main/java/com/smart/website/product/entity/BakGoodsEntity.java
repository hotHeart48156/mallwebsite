package com.smart.website.product.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "bak_goods", schema = "product1", catalog = "")
public class BakGoodsEntity {
    private int id;
    private String goodsSn;
    private String name;
    private Integer categoryId;
    private Integer brandId;
    private String gallery;
    private String keywords;
    private String brief;
    private Byte isOnSale;
    private Short sortOrder;
    private String picUrl;
    private String shareUrl;
    private Byte isNew;
    private Byte isHot;
    private String unit;
    private BigDecimal counterPrice;
    private BigDecimal retailPrice;
    private String detail;
    private Timestamp addTime;
    private Timestamp updateTime;
    private Byte deleted;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goods_sn", nullable = false, length = 63)
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 127)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "brand_id", nullable = true)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "gallery", nullable = true, length = 1023)
    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
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
    @Column(name = "brief", nullable = true, length = 255)
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Basic
    @Column(name = "is_on_sale", nullable = true)
    public Byte getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Byte isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Basic
    @Column(name = "sort_order", nullable = true)
    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "pic_url", nullable = true, length = 255)
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Basic
    @Column(name = "share_url", nullable = true, length = 255)
    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    @Basic
    @Column(name = "is_new", nullable = true)
    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    @Basic
    @Column(name = "is_hot", nullable = true)
    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "unit", nullable = true, length = 31)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "counter_price", nullable = true, precision = 2)
    public BigDecimal getCounterPrice() {
        return counterPrice;
    }

    public void setCounterPrice(BigDecimal counterPrice) {
        this.counterPrice = counterPrice;
    }

    @Basic
    @Column(name = "retail_price", nullable = true, precision = 2)
    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Basic
    @Column(name = "detail", nullable = true, length = -1)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "add_time", nullable = true)
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BakGoodsEntity that = (BakGoodsEntity) o;

        if (id != that.id) return false;
        if (goodsSn != null ? !goodsSn.equals(that.goodsSn) : that.goodsSn != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;
        if (gallery != null ? !gallery.equals(that.gallery) : that.gallery != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (brief != null ? !brief.equals(that.brief) : that.brief != null) return false;
        if (isOnSale != null ? !isOnSale.equals(that.isOnSale) : that.isOnSale != null) return false;
        if (sortOrder != null ? !sortOrder.equals(that.sortOrder) : that.sortOrder != null) return false;
        if (picUrl != null ? !picUrl.equals(that.picUrl) : that.picUrl != null) return false;
        if (shareUrl != null ? !shareUrl.equals(that.shareUrl) : that.shareUrl != null) return false;
        if (isNew != null ? !isNew.equals(that.isNew) : that.isNew != null) return false;
        if (isHot != null ? !isHot.equals(that.isHot) : that.isHot != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (counterPrice != null ? !counterPrice.equals(that.counterPrice) : that.counterPrice != null) return false;
        if (retailPrice != null ? !retailPrice.equals(that.retailPrice) : that.retailPrice != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        return deleted != null ? deleted.equals(that.deleted) : that.deleted == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (gallery != null ? gallery.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (brief != null ? brief.hashCode() : 0);
        result = 31 * result + (isOnSale != null ? isOnSale.hashCode() : 0);
        result = 31 * result + (sortOrder != null ? sortOrder.hashCode() : 0);
        result = 31 * result + (picUrl != null ? picUrl.hashCode() : 0);
        result = 31 * result + (shareUrl != null ? shareUrl.hashCode() : 0);
        result = 31 * result + (isNew != null ? isNew.hashCode() : 0);
        result = 31 * result + (isHot != null ? isHot.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (counterPrice != null ? counterPrice.hashCode() : 0);
        result = 31 * result + (retailPrice != null ? retailPrice.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}
