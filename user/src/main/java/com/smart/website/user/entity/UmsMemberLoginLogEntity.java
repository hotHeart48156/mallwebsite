package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_member_login_log", schema = "user", catalog = "")
public class UmsMemberLoginLogEntity {
    private long id;
    private Long memberId;
    private Timestamp createTime;
    private String ip;
    private String city;
    private Integer loginType;
    private String province;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "ip", nullable = true, length = 64)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 64)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "login_type", nullable = true)
    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    @Basic
    @Column(name = "province", nullable = true, length = 64)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

        UmsMemberLoginLogEntity that = (UmsMemberLoginLogEntity) o;

        if (id != that.id) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (loginType != null ? !loginType.equals(that.loginType) : that.loginType != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (loginType != null ? loginType.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
