package com.smart.website.user.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ums_member_level", schema = "user", catalog = "")
public class UmsMemberLevelEntity {
    private long id;
    private String name;
    private Integer growthPoint;
    private Integer defaultStatus;
    private BigDecimal freeFreightPoint;
    private Integer commentGrowthPoint;
    private Integer priviledgeFreeFreight;
    private Integer priviledgeSignIn;
    private Integer priviledgeComment;
    private Integer priviledgePromotion;
    private Integer priviledgeMemberPrice;
    private Integer priviledgeBirthday;
    private Integer articlecount;
    private Integer goodscount;
    private BigDecimal price;
    private String note;
    private Integer storeId;
    private String icon;
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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "growth_point", nullable = true)
    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    @Basic
    @Column(name = "default_status", nullable = true)
    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Basic
    @Column(name = "free_freight_point", nullable = true, precision = 2)
    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    @Basic
    @Column(name = "comment_growth_point", nullable = true)
    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    @Basic
    @Column(name = "priviledge_free_freight", nullable = true)
    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    @Basic
    @Column(name = "priviledge_sign_in", nullable = true)
    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    @Basic
    @Column(name = "priviledge_comment", nullable = true)
    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    @Basic
    @Column(name = "priviledge_promotion", nullable = true)
    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    @Basic
    @Column(name = "priviledge_member_price", nullable = true)
    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    @Basic
    @Column(name = "priviledge_birthday", nullable = true)
    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    @Basic
    @Column(name = "articlecount", nullable = true)
    public Integer getArticlecount() {
        return articlecount;
    }

    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }

    @Basic
    @Column(name = "goodscount", nullable = true)
    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
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
    @Column(name = "note", nullable = true, length = 200)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "icon", nullable = true, length = 255)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

        UmsMemberLevelEntity that = (UmsMemberLevelEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (growthPoint != null ? !growthPoint.equals(that.growthPoint) : that.growthPoint != null) return false;
        if (defaultStatus != null ? !defaultStatus.equals(that.defaultStatus) : that.defaultStatus != null)
            return false;
        if (freeFreightPoint != null ? !freeFreightPoint.equals(that.freeFreightPoint) : that.freeFreightPoint != null)
            return false;
        if (commentGrowthPoint != null ? !commentGrowthPoint.equals(that.commentGrowthPoint) : that.commentGrowthPoint != null)
            return false;
        if (priviledgeFreeFreight != null ? !priviledgeFreeFreight.equals(that.priviledgeFreeFreight) : that.priviledgeFreeFreight != null)
            return false;
        if (priviledgeSignIn != null ? !priviledgeSignIn.equals(that.priviledgeSignIn) : that.priviledgeSignIn != null)
            return false;
        if (priviledgeComment != null ? !priviledgeComment.equals(that.priviledgeComment) : that.priviledgeComment != null)
            return false;
        if (priviledgePromotion != null ? !priviledgePromotion.equals(that.priviledgePromotion) : that.priviledgePromotion != null)
            return false;
        if (priviledgeMemberPrice != null ? !priviledgeMemberPrice.equals(that.priviledgeMemberPrice) : that.priviledgeMemberPrice != null)
            return false;
        if (priviledgeBirthday != null ? !priviledgeBirthday.equals(that.priviledgeBirthday) : that.priviledgeBirthday != null)
            return false;
        if (articlecount != null ? !articlecount.equals(that.articlecount) : that.articlecount != null) return false;
        if (goodscount != null ? !goodscount.equals(that.goodscount) : that.goodscount != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (growthPoint != null ? growthPoint.hashCode() : 0);
        result = 31 * result + (defaultStatus != null ? defaultStatus.hashCode() : 0);
        result = 31 * result + (freeFreightPoint != null ? freeFreightPoint.hashCode() : 0);
        result = 31 * result + (commentGrowthPoint != null ? commentGrowthPoint.hashCode() : 0);
        result = 31 * result + (priviledgeFreeFreight != null ? priviledgeFreeFreight.hashCode() : 0);
        result = 31 * result + (priviledgeSignIn != null ? priviledgeSignIn.hashCode() : 0);
        result = 31 * result + (priviledgeComment != null ? priviledgeComment.hashCode() : 0);
        result = 31 * result + (priviledgePromotion != null ? priviledgePromotion.hashCode() : 0);
        result = 31 * result + (priviledgeMemberPrice != null ? priviledgeMemberPrice.hashCode() : 0);
        result = 31 * result + (priviledgeBirthday != null ? priviledgeBirthday.hashCode() : 0);
        result = 31 * result + (articlecount != null ? articlecount.hashCode() : 0);
        result = 31 * result + (goodscount != null ? goodscount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        return result;
    }
}
