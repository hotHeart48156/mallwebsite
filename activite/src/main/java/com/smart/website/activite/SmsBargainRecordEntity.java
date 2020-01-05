package com.smart.website.activite;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_bargain_record", schema = "activiti", catalog = "")
public class SmsBargainRecordEntity {
    private long id;
    private long sId;
    private long userId;
    private BigDecimal money;
    private Timestamp addTime;
    private String event;
    private String name;
    private String tel;
    private int sheng;
    private int city;
    private int quyu;
    private String address;
    private byte status;
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
    @Column(name = "s_id", nullable = false)
    public long getsId() {
        return sId;
    }

    public void setsId(long sId) {
        this.sId = sId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "money", nullable = false, precision = 2)
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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
    @Column(name = "event", nullable = true, length = 200)
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 15)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "tel", nullable = false, length = 15)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "sheng", nullable = false)
    public int getSheng() {
        return sheng;
    }

    public void setSheng(int sheng) {
        this.sheng = sheng;
    }

    @Basic
    @Column(name = "city", nullable = false)
    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    @Basic
    @Column(name = "quyu", nullable = false)
    public int getQuyu() {
        return quyu;
    }

    public void setQuyu(int quyu) {
        this.quyu = quyu;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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

        SmsBargainRecordEntity that = (SmsBargainRecordEntity) o;

        if (id != that.id) return false;
        if (sId != that.sId) return false;
        if (userId != that.userId) return false;
        if (sheng != that.sheng) return false;
        if (city != that.city) return false;
        if (quyu != that.quyu) return false;
        if (status != that.status) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (event != null ? !event.equals(that.event) : that.event != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (sId ^ (sId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (event != null ? event.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + sheng;
        result = 31 * result + city;
        result = 31 * result + quyu;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
