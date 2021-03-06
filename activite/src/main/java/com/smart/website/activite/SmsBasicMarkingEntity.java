package com.smart.website.activite;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_basic_marking", schema = "activiti", catalog = "")
public class SmsBasicMarkingEntity {
    private long id;
    private String name;
    private Integer status;
    private Integer activiUser;
    private Integer activiGoods;
    private Integer bigType;
    private Integer smallType;
    private String rules;
    private String goodsDs;
    private String userLevel;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp createTime;
    private Integer storeId;
    private String note;

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
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "activi_user", nullable = true)
    public Integer getActiviUser() {
        return activiUser;
    }

    public void setActiviUser(Integer activiUser) {
        this.activiUser = activiUser;
    }

    @Basic
    @Column(name = "activi_goods", nullable = true)
    public Integer getActiviGoods() {
        return activiGoods;
    }

    public void setActiviGoods(Integer activiGoods) {
        this.activiGoods = activiGoods;
    }

    @Basic
    @Column(name = "big_type", nullable = true)
    public Integer getBigType() {
        return bigType;
    }

    public void setBigType(Integer bigType) {
        this.bigType = bigType;
    }

    @Basic
    @Column(name = "small_type", nullable = true)
    public Integer getSmallType() {
        return smallType;
    }

    public void setSmallType(Integer smallType) {
        this.smallType = smallType;
    }

    @Basic
    @Column(name = "rules", nullable = true, length = 1000)
    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Basic
    @Column(name = "goods_ds", nullable = true, length = 255)
    public String getGoodsDs() {
        return goodsDs;
    }

    public void setGoodsDs(String goodsDs) {
        this.goodsDs = goodsDs;
    }

    @Basic
    @Column(name = "user_level", nullable = true, length = 500)
    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
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

    @Basic
    @Column(name = "note", nullable = true, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsBasicMarkingEntity that = (SmsBasicMarkingEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (activiUser != null ? !activiUser.equals(that.activiUser) : that.activiUser != null) return false;
        if (activiGoods != null ? !activiGoods.equals(that.activiGoods) : that.activiGoods != null) return false;
        if (bigType != null ? !bigType.equals(that.bigType) : that.bigType != null) return false;
        if (smallType != null ? !smallType.equals(that.smallType) : that.smallType != null) return false;
        if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
        if (goodsDs != null ? !goodsDs.equals(that.goodsDs) : that.goodsDs != null) return false;
        if (userLevel != null ? !userLevel.equals(that.userLevel) : that.userLevel != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (activiUser != null ? activiUser.hashCode() : 0);
        result = 31 * result + (activiGoods != null ? activiGoods.hashCode() : 0);
        result = 31 * result + (bigType != null ? bigType.hashCode() : 0);
        result = 31 * result + (smallType != null ? smallType.hashCode() : 0);
        result = 31 * result + (rules != null ? rules.hashCode() : 0);
        result = 31 * result + (goodsDs != null ? goodsDs.hashCode() : 0);
        result = 31 * result + (userLevel != null ? userLevel.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
