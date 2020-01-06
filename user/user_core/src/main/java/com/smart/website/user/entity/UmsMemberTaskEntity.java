package com.smart.website.user.entity;

import javax.persistence.*;

@Entity
@Table(name = "ums_member_task", schema = "user", catalog = "")
public class UmsMemberTaskEntity {
    private long id;
    private String name;
    private Integer growth;
    private Integer intergration;
    private Integer type;
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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "growth", nullable = true)
    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Basic
    @Column(name = "intergration", nullable = true)
    public Integer getIntergration() {
        return intergration;
    }

    public void setIntergration(Integer intergration) {
        this.intergration = intergration;
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

        UmsMemberTaskEntity that = (UmsMemberTaskEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (growth != null ? !growth.equals(that.growth) : that.growth != null) return false;
        if (intergration != null ? !intergration.equals(that.intergration) : that.intergration != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (growth != null ? growth.hashCode() : 0);
        result = 31 * result + (intergration != null ? intergration.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
