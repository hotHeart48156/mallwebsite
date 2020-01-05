package com.smart.website.product;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_favorite", schema = "product1", catalog = "")
public class PmsFavoriteEntity {
    private long id;
    private Timestamp addTime;
    private int type;
    private Long objId;
    private Long storeId;
    private Long memberId;
    private String name;
    private String meno1;
    private String meno2;
    private String meno3;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "add_time", nullable = true)
    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "obj_id", nullable = true)
    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
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
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "meno1", nullable = true, length = 255)
    public String getMeno1() {
        return meno1;
    }

    public void setMeno1(String meno1) {
        this.meno1 = meno1;
    }

    @Basic
    @Column(name = "meno2", nullable = true, length = 255)
    public String getMeno2() {
        return meno2;
    }

    public void setMeno2(String meno2) {
        this.meno2 = meno2;
    }

    @Basic
    @Column(name = "meno3", nullable = true, length = 255)
    public String getMeno3() {
        return meno3;
    }

    public void setMeno3(String meno3) {
        this.meno3 = meno3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsFavoriteEntity that = (PmsFavoriteEntity) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (objId != null ? !objId.equals(that.objId) : that.objId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (meno1 != null ? !meno1.equals(that.meno1) : that.meno1 != null) return false;
        if (meno2 != null ? !meno2.equals(that.meno2) : that.meno2 != null) return false;
        if (meno3 != null ? !meno3.equals(that.meno3) : that.meno3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (objId != null ? objId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (meno1 != null ? meno1.hashCode() : 0);
        result = 31 * result + (meno2 != null ? meno2.hashCode() : 0);
        result = 31 * result + (meno3 != null ? meno3.hashCode() : 0);
        return result;
    }
}
