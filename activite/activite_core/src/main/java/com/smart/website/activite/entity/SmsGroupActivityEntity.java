package com.smart.website.activite.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_group_activity", schema = "activiti", catalog = "")
//团购活动
public class SmsGroupActivityEntity {
    private long id;
    private String name;
    private BigDecimal price;
    private Integer transfee;
    private Integer status;
    private Integer feestatus;
    private Timestamp createTime;
    private Integer storeId;
    private String goodsIds;
    private String pic;
    private BigDecimal originprice;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "transfee", nullable = true, precision = 0)
    public Integer getTransfee() {
        return transfee;
    }

    public void setTransfee(Integer transfee) {
        this.transfee = transfee;
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
    @Column(name = "feestatus", nullable = true)
    public Integer getFeestatus() {
        return feestatus;
    }

    public void setFeestatus(Integer feestatus) {
        this.feestatus = feestatus;
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
    @Column(name = "goods_ids", nullable = true, length = 255)
    public String getGoodsIds() {
        return goodsIds;
    }

    public void setGoodsIds(String goodsIds) {
        this.goodsIds = goodsIds;
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
    @Column(name = "originprice", nullable = true, precision = 2)
    public BigDecimal getOriginprice() {
        return originprice;
    }

    public void setOriginprice(BigDecimal originprice) {
        this.originprice = originprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsGroupActivityEntity that = (SmsGroupActivityEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (transfee != null ? !transfee.equals(that.transfee) : that.transfee != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (feestatus != null ? !feestatus.equals(that.feestatus) : that.feestatus != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (goodsIds != null ? !goodsIds.equals(that.goodsIds) : that.goodsIds != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        return originprice != null ? originprice.equals(that.originprice) : that.originprice == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (transfee != null ? transfee.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (feestatus != null ? feestatus.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (goodsIds != null ? goodsIds.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (originprice != null ? originprice.hashCode() : 0);
        return result;
    }
}
