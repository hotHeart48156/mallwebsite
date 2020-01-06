package com.smart.website.admin.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_day_statics", schema = "admin", catalog = "")
public class AdminDayStaticsEntity {
    private int id;
    private Integer goodsCount;
    private Integer payOrderCount;
    private Integer articleCount;
    private Integer payAmount;
    private Integer memberCount;
    private Timestamp createTime;
    private Integer storeId;
    private Integer notPayOrderCount;
    private Integer notPayAmount;
    private String storeName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goods_count", nullable = true)
    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Basic
    @Column(name = "pay_order_count", nullable = true)
    public Integer getPayOrderCount() {
        return payOrderCount;
    }

    public void setPayOrderCount(Integer payOrderCount) {
        this.payOrderCount = payOrderCount;
    }

    @Basic
    @Column(name = "article_count", nullable = true)
    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    @Basic
    @Column(name = "pay_amount", nullable = true, precision = 0)
    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "member_count", nullable = true)
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
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

    @Basic
    @Column(name = "not_pay_order_count", nullable = true)
    public Integer getNotPayOrderCount() {
        return notPayOrderCount;
    }

    public void setNotPayOrderCount(Integer notPayOrderCount) {
        this.notPayOrderCount = notPayOrderCount;
    }

    @Basic
    @Column(name = "not_pay_amount", nullable = true, precision = 0)
    public Integer getNotPayAmount() {
        return notPayAmount;
    }

    public void setNotPayAmount(Integer notPayAmount) {
        this.notPayAmount = notPayAmount;
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

        AdminDayStaticsEntity that = (AdminDayStaticsEntity) o;

        if (id != that.id) return false;
        if (goodsCount != null ? !goodsCount.equals(that.goodsCount) : that.goodsCount != null) return false;
        if (payOrderCount != null ? !payOrderCount.equals(that.payOrderCount) : that.payOrderCount != null)
            return false;
        if (articleCount != null ? !articleCount.equals(that.articleCount) : that.articleCount != null) return false;
        if (payAmount != null ? !payAmount.equals(that.payAmount) : that.payAmount != null) return false;
        if (memberCount != null ? !memberCount.equals(that.memberCount) : that.memberCount != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (notPayOrderCount != null ? !notPayOrderCount.equals(that.notPayOrderCount) : that.notPayOrderCount != null)
            return false;
        if (notPayAmount != null ? !notPayAmount.equals(that.notPayAmount) : that.notPayAmount != null) return false;
        return storeName != null ? storeName.equals(that.storeName) : that.storeName == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (goodsCount != null ? goodsCount.hashCode() : 0);
        result = 31 * result + (payOrderCount != null ? payOrderCount.hashCode() : 0);
        result = 31 * result + (articleCount != null ? articleCount.hashCode() : 0);
        result = 31 * result + (payAmount != null ? payAmount.hashCode() : 0);
        result = 31 * result + (memberCount != null ? memberCount.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (notPayOrderCount != null ? notPayOrderCount.hashCode() : 0);
        result = 31 * result + (notPayAmount != null ? notPayAmount.hashCode() : 0);
        result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
        return result;
    }
}
