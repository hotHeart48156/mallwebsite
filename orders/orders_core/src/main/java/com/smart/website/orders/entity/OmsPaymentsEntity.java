package com.smart.website.orders.entity;

import javax.persistence.*;

@Entity
@Table(name = "oms_payments", schema = "orders", catalog = "")
public class OmsPaymentsEntity {
    private short id;
    private String code;
    private String name;
    private Byte isOnline;
    private String params;
    private short sort;
    private String memo;
    private short status;

    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 50)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "is_online", nullable = true)
    public Byte getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Byte isOnline) {
        this.isOnline = isOnline;
    }

    @Basic
    @Column(name = "params", nullable = false, length = -1)
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Basic
    @Column(name = "sort", nullable = false)
    public short getSort() {
        return sort;
    }

    public void setSort(short sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "memo", nullable = false, length = 200)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OmsPaymentsEntity that = (OmsPaymentsEntity) o;

        if (id != that.id) return false;
        if (sort != that.sort) return false;
        if (status != that.status) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (isOnline != null ? !isOnline.equals(that.isOnline) : that.isOnline != null) return false;
        if (params != null ? !params.equals(that.params) : that.params != null) return false;
        return memo != null ? memo.equals(that.memo) : that.memo == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isOnline != null ? isOnline.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (int) sort;
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (int) status;
        return result;
    }
}
