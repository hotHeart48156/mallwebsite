package com.smart.website.activite;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sms_goods_diypage_map", schema = "activiti", catalog = "")
public class SmsGoodsDiypageMapEntity {
    private long id;
    private Long goodsId;
    private Long diypageId;
    private String data;
    private Integer storeId;

    @Basic
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
    @Column(name = "diypage_id", nullable = true)
    public Long getDiypageId() {
        return diypageId;
    }

    public void setDiypageId(Long diypageId) {
        this.diypageId = diypageId;
    }

    @Basic
    @Column(name = "data", nullable = true, length = -1)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

        SmsGoodsDiypageMapEntity that = (SmsGoodsDiypageMapEntity) o;

        if (id != that.id) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (diypageId != null ? !diypageId.equals(that.diypageId) : that.diypageId != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (diypageId != null ? diypageId.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
