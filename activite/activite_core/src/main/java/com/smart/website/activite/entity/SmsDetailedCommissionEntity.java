package com.smart.website.activite.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_detailed_commission", schema = "activiti", catalog = "")
public class SmsDetailedCommissionEntity {
    private long id;
    private Long userid;
    private String sNo;
    private Double money;
    private Double sMoney;
    private Integer status;
    private Timestamp addtime;
    private Integer type;
    private String referee;
    private Integer recycle;
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
    @Column(name = "userid", nullable = true)
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "sNo", nullable = true, length = 255)
    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    @Basic
    @Column(name = "money", nullable = true, precision = 2)
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "s_money", nullable = true, precision = 2)
    public Double getsMoney() {
        return sMoney;
    }

    public void setsMoney(Double sMoney) {
        this.sMoney = sMoney;
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
    @Column(name = "addtime", nullable = true)
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
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
    @Column(name = "Referee", nullable = true, length = 50)
    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    @Basic
    @Column(name = "recycle", nullable = true)
    public Integer getRecycle() {
        return recycle;
    }

    public void setRecycle(Integer recycle) {
        this.recycle = recycle;
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

        SmsDetailedCommissionEntity that = (SmsDetailedCommissionEntity) o;

        if (id != that.id) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (sNo != null ? !sNo.equals(that.sNo) : that.sNo != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (sMoney != null ? !sMoney.equals(that.sMoney) : that.sMoney != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (referee != null ? !referee.equals(that.referee) : that.referee != null) return false;
        if (recycle != null ? !recycle.equals(that.recycle) : that.recycle != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (sNo != null ? sNo.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (sMoney != null ? sMoney.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (referee != null ? referee.hashCode() : 0);
        result = 31 * result + (recycle != null ? recycle.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
