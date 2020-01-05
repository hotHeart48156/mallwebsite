package com.smart.website.product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_product", schema = "product1", catalog = "")
public class PmsProductEntity {
    private long id;
    private Long brandId;
    private Long productCategoryId;
    private Long feightTemplateId;
    private Long productAttributeCategoryId;
    private String name;
    private String pic;
    private String productSn;
    private Integer deleteStatus;
    private Integer publishStatus;
    private Integer newStatus;
    private Integer recommandStatus;
    private Integer verifyStatus;
    private Integer sort;
    private Integer sale;
    private BigDecimal price;
    private BigDecimal promotionPrice;
    private Integer giftGrowth;
    private Integer giftPoint;
    private Integer usePointLimit;
    private String subTitle;
    private String description;
    private BigDecimal originalPrice;
    private Integer stock;
    private Integer lowStock;
    private String unit;
    private BigDecimal weight;
    private Integer previewStatus;
    private String serviceIds;
    private String keywords;
    private String note;
    private String albumPics;
    private String detailTitle;
    private String detailDesc;
    private String detailHtml;
    private String detailMobileHtml;
    private Timestamp promotionStartTime;
    private Timestamp promotionEndTime;
    private Integer promotionPerLimit;
    private Integer promotionType;
    private String brandName;
    private String productCategoryName;
    private Long supplyId;
    private Timestamp createTime;
    private Long schoolId;
    private Integer storeId;
    private Long memberId;
    private Integer hit;
    private Integer type;
    private Long areaId;
    private String areaName;
    private String schoolName;
    private int transfee;
    private Integer isPaimai;
    private Timestamp expireTime;
    private String storeName;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "brand_id", nullable = true)
    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "product_category_id", nullable = true)
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "feight_template_id", nullable = true)
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
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
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "product_sn", nullable = true, length = 64)
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Basic
    @Column(name = "delete_status", nullable = true)
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "publish_status", nullable = true)
    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Basic
    @Column(name = "new_status", nullable = true)
    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    @Basic
    @Column(name = "recommand_status", nullable = true)
    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    @Basic
    @Column(name = "verify_status", nullable = true)
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
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
    @Column(name = "sale", nullable = true)
    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
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
    @Column(name = "promotion_price", nullable = true, precision = 2)
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Basic
    @Column(name = "gift_growth", nullable = true)
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Basic
    @Column(name = "gift_point", nullable = true)
    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    @Basic
    @Column(name = "use_point_limit", nullable = true)
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    @Basic
    @Column(name = "sub_title", nullable = true, length = 255)
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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
    @Column(name = "original_price", nullable = true, precision = 2)
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
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
    @Column(name = "unit", nullable = true, length = 16)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "weight", nullable = true, precision = 2)
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "preview_status", nullable = true)
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    @Basic
    @Column(name = "service_ids", nullable = true, length = 64)
    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
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
    @Column(name = "note", nullable = true, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "album_pics", nullable = true, length = 255)
    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    @Basic
    @Column(name = "detail_title", nullable = true, length = 255)
    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    @Basic
    @Column(name = "detail_desc", nullable = true, length = -1)
    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    @Basic
    @Column(name = "detail_html", nullable = true, length = -1)
    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    @Basic
    @Column(name = "detail_mobile_html", nullable = true, length = -1)
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    @Basic
    @Column(name = "promotion_start_time", nullable = true)
    public Timestamp getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Timestamp promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    @Basic
    @Column(name = "promotion_end_time", nullable = true)
    public Timestamp getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Timestamp promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    @Basic
    @Column(name = "promotion_per_limit", nullable = true)
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    @Basic
    @Column(name = "promotion_type", nullable = true)
    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    @Basic
    @Column(name = "brand_name", nullable = true, length = 255)
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "product_category_name", nullable = true, length = 255)
    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Basic
    @Column(name = "supply_id", nullable = true)
    public Long getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Long supplyId) {
        this.supplyId = supplyId;
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
    @Column(name = "school_id", nullable = true)
    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
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
    @Column(name = "member_id", nullable = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "hit", nullable = true)
    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
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
    @Column(name = "area_id", nullable = true)
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "area_name", nullable = true, length = 255)
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "school_name", nullable = true, length = 255)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "transfee", nullable = false, precision = 0)
    public int getTransfee() {
        return transfee;
    }

    public void setTransfee(int transfee) {
        this.transfee = transfee;
    }

    @Basic
    @Column(name = "is_paimai", nullable = true)
    public Integer getIsPaimai() {
        return isPaimai;
    }

    public void setIsPaimai(Integer isPaimai) {
        this.isPaimai = isPaimai;
    }

    @Basic
    @Column(name = "expire_time", nullable = true)
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "store_name", nullable = true, length = 255)
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsProductEntity that = (PmsProductEntity) o;

        if (id != that.id) return false;
        if (transfee != that.transfee) return false;
        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;
        if (productCategoryId != null ? !productCategoryId.equals(that.productCategoryId) : that.productCategoryId != null)
            return false;
        if (feightTemplateId != null ? !feightTemplateId.equals(that.feightTemplateId) : that.feightTemplateId != null)
            return false;
        if (productAttributeCategoryId != null ? !productAttributeCategoryId.equals(that.productAttributeCategoryId) : that.productAttributeCategoryId != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (productSn != null ? !productSn.equals(that.productSn) : that.productSn != null) return false;
        if (deleteStatus != null ? !deleteStatus.equals(that.deleteStatus) : that.deleteStatus != null) return false;
        if (publishStatus != null ? !publishStatus.equals(that.publishStatus) : that.publishStatus != null)
            return false;
        if (newStatus != null ? !newStatus.equals(that.newStatus) : that.newStatus != null) return false;
        if (recommandStatus != null ? !recommandStatus.equals(that.recommandStatus) : that.recommandStatus != null)
            return false;
        if (verifyStatus != null ? !verifyStatus.equals(that.verifyStatus) : that.verifyStatus != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (sale != null ? !sale.equals(that.sale) : that.sale != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (promotionPrice != null ? !promotionPrice.equals(that.promotionPrice) : that.promotionPrice != null)
            return false;
        if (giftGrowth != null ? !giftGrowth.equals(that.giftGrowth) : that.giftGrowth != null) return false;
        if (giftPoint != null ? !giftPoint.equals(that.giftPoint) : that.giftPoint != null) return false;
        if (usePointLimit != null ? !usePointLimit.equals(that.usePointLimit) : that.usePointLimit != null)
            return false;
        if (subTitle != null ? !subTitle.equals(that.subTitle) : that.subTitle != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (originalPrice != null ? !originalPrice.equals(that.originalPrice) : that.originalPrice != null)
            return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;
        if (lowStock != null ? !lowStock.equals(that.lowStock) : that.lowStock != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (previewStatus != null ? !previewStatus.equals(that.previewStatus) : that.previewStatus != null)
            return false;
        if (serviceIds != null ? !serviceIds.equals(that.serviceIds) : that.serviceIds != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (albumPics != null ? !albumPics.equals(that.albumPics) : that.albumPics != null) return false;
        if (detailTitle != null ? !detailTitle.equals(that.detailTitle) : that.detailTitle != null) return false;
        if (detailDesc != null ? !detailDesc.equals(that.detailDesc) : that.detailDesc != null) return false;
        if (detailHtml != null ? !detailHtml.equals(that.detailHtml) : that.detailHtml != null) return false;
        if (detailMobileHtml != null ? !detailMobileHtml.equals(that.detailMobileHtml) : that.detailMobileHtml != null)
            return false;
        if (promotionStartTime != null ? !promotionStartTime.equals(that.promotionStartTime) : that.promotionStartTime != null)
            return false;
        if (promotionEndTime != null ? !promotionEndTime.equals(that.promotionEndTime) : that.promotionEndTime != null)
            return false;
        if (promotionPerLimit != null ? !promotionPerLimit.equals(that.promotionPerLimit) : that.promotionPerLimit != null)
            return false;
        if (promotionType != null ? !promotionType.equals(that.promotionType) : that.promotionType != null)
            return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (productCategoryName != null ? !productCategoryName.equals(that.productCategoryName) : that.productCategoryName != null)
            return false;
        if (supplyId != null ? !supplyId.equals(that.supplyId) : that.supplyId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (hit != null ? !hit.equals(that.hit) : that.hit != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (isPaimai != null ? !isPaimai.equals(that.isPaimai) : that.isPaimai != null) return false;
        if (expireTime != null ? !expireTime.equals(that.expireTime) : that.expireTime != null) return false;
        if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (productCategoryId != null ? productCategoryId.hashCode() : 0);
        result = 31 * result + (feightTemplateId != null ? feightTemplateId.hashCode() : 0);
        result = 31 * result + (productAttributeCategoryId != null ? productAttributeCategoryId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (productSn != null ? productSn.hashCode() : 0);
        result = 31 * result + (deleteStatus != null ? deleteStatus.hashCode() : 0);
        result = 31 * result + (publishStatus != null ? publishStatus.hashCode() : 0);
        result = 31 * result + (newStatus != null ? newStatus.hashCode() : 0);
        result = 31 * result + (recommandStatus != null ? recommandStatus.hashCode() : 0);
        result = 31 * result + (verifyStatus != null ? verifyStatus.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (sale != null ? sale.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (promotionPrice != null ? promotionPrice.hashCode() : 0);
        result = 31 * result + (giftGrowth != null ? giftGrowth.hashCode() : 0);
        result = 31 * result + (giftPoint != null ? giftPoint.hashCode() : 0);
        result = 31 * result + (usePointLimit != null ? usePointLimit.hashCode() : 0);
        result = 31 * result + (subTitle != null ? subTitle.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (originalPrice != null ? originalPrice.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        result = 31 * result + (lowStock != null ? lowStock.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (previewStatus != null ? previewStatus.hashCode() : 0);
        result = 31 * result + (serviceIds != null ? serviceIds.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (albumPics != null ? albumPics.hashCode() : 0);
        result = 31 * result + (detailTitle != null ? detailTitle.hashCode() : 0);
        result = 31 * result + (detailDesc != null ? detailDesc.hashCode() : 0);
        result = 31 * result + (detailHtml != null ? detailHtml.hashCode() : 0);
        result = 31 * result + (detailMobileHtml != null ? detailMobileHtml.hashCode() : 0);
        result = 31 * result + (promotionStartTime != null ? promotionStartTime.hashCode() : 0);
        result = 31 * result + (promotionEndTime != null ? promotionEndTime.hashCode() : 0);
        result = 31 * result + (promotionPerLimit != null ? promotionPerLimit.hashCode() : 0);
        result = 31 * result + (promotionType != null ? promotionType.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (productCategoryName != null ? productCategoryName.hashCode() : 0);
        result = 31 * result + (supplyId != null ? supplyId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (hit != null ? hit.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + transfee;
        result = 31 * result + (isPaimai != null ? isPaimai.hashCode() : 0);
        result = 31 * result + (expireTime != null ? expireTime.hashCode() : 0);
        result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
        return result;
    }
}
