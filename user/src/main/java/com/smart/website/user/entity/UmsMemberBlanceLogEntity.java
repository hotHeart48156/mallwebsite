package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_member_blance_log", schema = "user", catalog = "")
public class UmsMemberBlanceLogEntity {
    private long id;
    private Long memberId;
    private Integer price;
    private Integer type;
    private String note;
    private Timestamp createTime;
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
    @Column(name = "member_id", nullable = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
    @Column(name = "note", nullable = true, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmsMemberBlanceLogEntity that = (UmsMemberBlanceLogEntity) o;

        if (id != that.id) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
