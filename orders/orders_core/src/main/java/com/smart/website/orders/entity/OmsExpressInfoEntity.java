package com.smart.website.orders.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "oms_express_info", schema = "orders", catalog = "")
public class OmsExpressInfoEntity {
    private int id;
    private Integer orderId;
    private String expressCorpId;
    private String expressNo;
    private Byte expressStatus;
    private String expressDetail;
    private Timestamp updateTime;
    private Integer storeId;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORDER_ID", nullable = true)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "EXPRESS_CORP_ID", nullable = true, length = 32)
    public String getExpressCorpId() {
        return expressCorpId;
    }

    public void setExpressCorpId(String expressCorpId) {
        this.expressCorpId = expressCorpId;
    }

    @Basic
    @Column(name = "EXPRESS_NO", nullable = true, length = 32)
    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    @Basic
    @Column(name = "EXPRESS_STATUS", nullable = true)
    public Byte getExpressStatus() {
        return expressStatus;
    }

    public void setExpressStatus(Byte expressStatus) {
        this.expressStatus = expressStatus;
    }

    @Basic
    @Column(name = "EXPRESS_DETAIL", nullable = true, length = -1)
    public String getExpressDetail() {
        return expressDetail;
    }

    public void setExpressDetail(String expressDetail) {
        this.expressDetail = expressDetail;
    }

    @Basic
    @Column(name = "UPDATE_TIME", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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

        OmsExpressInfoEntity that = (OmsExpressInfoEntity) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (expressCorpId != null ? !expressCorpId.equals(that.expressCorpId) : that.expressCorpId != null)
            return false;
        if (expressNo != null ? !expressNo.equals(that.expressNo) : that.expressNo != null) return false;
        if (expressStatus != null ? !expressStatus.equals(that.expressStatus) : that.expressStatus != null)
            return false;
        if (expressDetail != null ? !expressDetail.equals(that.expressDetail) : that.expressDetail != null)
            return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (expressCorpId != null ? expressCorpId.hashCode() : 0);
        result = 31 * result + (expressNo != null ? expressNo.hashCode() : 0);
        result = 31 * result + (expressStatus != null ? expressStatus.hashCode() : 0);
        result = 31 * result + (expressDetail != null ? expressDetail.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
