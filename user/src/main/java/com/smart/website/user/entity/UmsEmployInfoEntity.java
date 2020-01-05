package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_employ_info", schema = "user", catalog = "")
public class UmsEmployInfoEntity {
    private long id;
    private String name;
    private Integer age;
    private String gender;
    private String hobby;
    private String peoplenote;
    private String phone;
    private String address;
    private String guide1;
    private String guide;
    private String suggestion;
    private String guide2;
    private Timestamp createTime;
    private Long storeId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 255)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "hobby", nullable = true, length = 255)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Basic
    @Column(name = "peoplenote", nullable = true, length = 255)
    public String getPeoplenote() {
        return peoplenote;
    }

    public void setPeoplenote(String peoplenote) {
        this.peoplenote = peoplenote;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "guide1", nullable = true, length = 255)
    public String getGuide1() {
        return guide1;
    }

    public void setGuide1(String guide1) {
        this.guide1 = guide1;
    }

    @Basic
    @Column(name = "guide", nullable = true, length = 255)
    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    @Basic
    @Column(name = "suggestion", nullable = true, length = 255)
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Basic
    @Column(name = "guide2", nullable = true, length = 255)
    public String getGuide2() {
        return guide2;
    }

    public void setGuide2(String guide2) {
        this.guide2 = guide2;
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
    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmsEmployInfoEntity that = (UmsEmployInfoEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (hobby != null ? !hobby.equals(that.hobby) : that.hobby != null) return false;
        if (peoplenote != null ? !peoplenote.equals(that.peoplenote) : that.peoplenote != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (guide1 != null ? !guide1.equals(that.guide1) : that.guide1 != null) return false;
        if (guide != null ? !guide.equals(that.guide) : that.guide != null) return false;
        if (suggestion != null ? !suggestion.equals(that.suggestion) : that.suggestion != null) return false;
        if (guide2 != null ? !guide2.equals(that.guide2) : that.guide2 != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (hobby != null ? hobby.hashCode() : 0);
        result = 31 * result + (peoplenote != null ? peoplenote.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (guide1 != null ? guide1.hashCode() : 0);
        result = 31 * result + (guide != null ? guide.hashCode() : 0);
        result = 31 * result + (suggestion != null ? suggestion.hashCode() : 0);
        result = 31 * result + (guide2 != null ? guide2.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
