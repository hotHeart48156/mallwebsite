package com.smart.website.activite.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_group", schema = "activiti", catalog = "")
public class SmsGroupEntity {
    private long id;
    private Long goodsId;
    private String goodsName;
    private Integer originPrice;
    private Integer groupPrice;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer hours;
    private Integer peoples;
    private Integer status;
    private Timestamp createTime;
    private Integer maxPeople;
    private Integer limitGoods;
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
    @Column(name = "goods_id", nullable = true)
    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 255)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "origin_price", nullable = true, precision = 0)
    public Integer getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Integer originPrice) {
        this.originPrice = originPrice;
    }

    @Basic
    @Column(name = "group_price", nullable = true, precision = 0)
    public Integer getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Integer groupPrice) {
        this.groupPrice = groupPrice;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "hours", nullable = true)
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Basic
    @Column(name = "peoples", nullable = true)
    public Integer getPeoples() {
        return peoples;
    }

    public void setPeoples(Integer peoples) {
        this.peoples = peoples;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Column(name = "max_people", nullable = true)
    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Basic
    @Column(name = "limit_goods", nullable = true)
    public Integer getLimitGoods() {
        return limitGoods;
    }

    public void setLimitGoods(Integer limitGoods) {
        this.limitGoods = limitGoods;
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

        SmsGroupEntity that = (SmsGroupEntity) o;

        if (id != that.id) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (originPrice != null ? !originPrice.equals(that.originPrice) : that.originPrice != null) return false;
        if (groupPrice != null ? !groupPrice.equals(that.groupPrice) : that.groupPrice != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (hours != null ? !hours.equals(that.hours) : that.hours != null) return false;
        if (peoples != null ? !peoples.equals(that.peoples) : that.peoples != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (maxPeople != null ? !maxPeople.equals(that.maxPeople) : that.maxPeople != null) return false;
        if (limitGoods != null ? !limitGoods.equals(that.limitGoods) : that.limitGoods != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (originPrice != null ? originPrice.hashCode() : 0);
        result = 31 * result + (groupPrice != null ? groupPrice.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (hours != null ? hours.hashCode() : 0);
        result = 31 * result + (peoples != null ? peoples.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (maxPeople != null ? maxPeople.hashCode() : 0);
        result = 31 * result + (limitGoods != null ? limitGoods.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
