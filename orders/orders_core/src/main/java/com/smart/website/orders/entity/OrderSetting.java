package com.smart.website.orders.entity;

import javax.persistence.*;

@Entity
@Table(name = "oms_order_setting", schema = "orders", catalog = "")
//退货设置
public class OrderSetting {
    private long id;
    private Integer flashOrderOvertime;
    private Integer normalOrderOvertime;
    private Integer confirmOvertime;
    private Integer finishOvertime;
    private Integer commentOvertime;
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
    @Column(name = "flash_order_overtime", nullable = true)
    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    @Basic
    @Column(name = "normal_order_overtime", nullable = true)
    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    @Basic
    @Column(name = "confirm_overtime", nullable = true)
    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    @Basic
    @Column(name = "finish_overtime", nullable = true)
    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    @Basic
    @Column(name = "comment_overtime", nullable = true)
    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
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

        OrderSetting that = (OrderSetting) o;

        if (id != that.id) return false;
        if (flashOrderOvertime != null ? !flashOrderOvertime.equals(that.flashOrderOvertime) : that.flashOrderOvertime != null)
            return false;
        if (normalOrderOvertime != null ? !normalOrderOvertime.equals(that.normalOrderOvertime) : that.normalOrderOvertime != null)
            return false;
        if (confirmOvertime != null ? !confirmOvertime.equals(that.confirmOvertime) : that.confirmOvertime != null)
            return false;
        if (finishOvertime != null ? !finishOvertime.equals(that.finishOvertime) : that.finishOvertime != null)
            return false;
        if (commentOvertime != null ? !commentOvertime.equals(that.commentOvertime) : that.commentOvertime != null)
            return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (flashOrderOvertime != null ? flashOrderOvertime.hashCode() : 0);
        result = 31 * result + (normalOrderOvertime != null ? normalOrderOvertime.hashCode() : 0);
        result = 31 * result + (confirmOvertime != null ? confirmOvertime.hashCode() : 0);
        result = 31 * result + (finishOvertime != null ? finishOvertime.hashCode() : 0);
        result = 31 * result + (commentOvertime != null ? commentOvertime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
