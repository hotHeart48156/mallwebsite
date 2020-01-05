package com.smart.website.activite;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_paimai", schema = "activiti", catalog = "")
public class SmsPaimaiEntity {
    private long id;
    private String name;
    private long goodId;
    private Timestamp createTime;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer state;
    private BigDecimal price;
    private Integer addprice;
    private Integer storeId;
    private String goodsName;
    private Integer status;
    private BigDecimal proprice;

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
    @Column(name = "good_id", nullable = false)
    public long getGoodId() {
        return goodId;
    }

    public void setGoodId(long goodId) {
        this.goodId = goodId;
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
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
    @Column(name = "addprice", nullable = true, precision = 0)
    public Integer getAddprice() {
        return addprice;
    }

    public void setAddprice(Integer addprice) {
        this.addprice = addprice;
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
    @Column(name = "goods_name", nullable = true, length = 100)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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
    @Column(name = "proprice", nullable = true, precision = 2)
    public BigDecimal getProprice() {
        return proprice;
    }

    public void setProprice(BigDecimal proprice) {
        this.proprice = proprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsPaimaiEntity that = (SmsPaimaiEntity) o;

        if (id != that.id) return false;
        if (goodId != that.goodId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (addprice != null ? !addprice.equals(that.addprice) : that.addprice != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (proprice != null ? !proprice.equals(that.proprice) : that.proprice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (goodId ^ (goodId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (addprice != null ? addprice.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (proprice != null ? proprice.hashCode() : 0);
        return result;
    }
}
