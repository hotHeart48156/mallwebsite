package com.smart.website.activite.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_share", schema = "activiti", catalog = "")
//分享
public class SmsShareEntity {
    private long id;
    private String userId;
    private String wxId;
    private String wxName;
    private Integer sex;
    private byte type;
    private long articleId;
    private Timestamp shareAdd;
    private BigDecimal coupon;
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
    @Column(name = "user_id", nullable = true, length = 15)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "wx_id", nullable = true, length = 50)
    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    @Basic
    @Column(name = "wx_name", nullable = true, length = 150)
    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "Article_id", nullable = false)
    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "share_add", nullable = true)
    public Timestamp getShareAdd() {
        return shareAdd;
    }

    public void setShareAdd(Timestamp shareAdd) {
        this.shareAdd = shareAdd;
    }

    @Basic
    @Column(name = "coupon", nullable = false, precision = 2)
    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
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

        SmsShareEntity that = (SmsShareEntity) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (articleId != that.articleId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (wxId != null ? !wxId.equals(that.wxId) : that.wxId != null) return false;
        if (wxName != null ? !wxName.equals(that.wxName) : that.wxName != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (shareAdd != null ? !shareAdd.equals(that.shareAdd) : that.shareAdd != null) return false;
        if (coupon != null ? !coupon.equals(that.coupon) : that.coupon != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (wxId != null ? wxId.hashCode() : 0);
        result = 31 * result + (wxName != null ? wxName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (int) type;
        result = 31 * result + (int) (articleId ^ (articleId >>> 32));
        result = 31 * result + (shareAdd != null ? shareAdd.hashCode() : 0);
        result = 31 * result + (coupon != null ? coupon.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
