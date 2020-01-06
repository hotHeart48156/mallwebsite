package com.smart.website.activite.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SmsBasicGiftsEntityPK implements Serializable {
    private int storeId;
    private long id;

    @Column(name = "store_id", nullable = false)
    @Id
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    @Column(name = "id", nullable = false)
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsBasicGiftsEntityPK that = (SmsBasicGiftsEntityPK) o;

        if (storeId != that.storeId) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        int result = storeId;
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
