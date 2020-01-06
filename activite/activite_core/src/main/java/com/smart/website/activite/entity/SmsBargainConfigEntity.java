package com.smart.website.activite.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_bargain_config", schema = "activiti", catalog = "")
public class SmsBargainConfigEntity {
    private long id;
    private long plugInsId;
    private Integer canNum;
    private Integer helpNum;
    private String parameter;
    private Integer invalidTime;
    private Timestamp addTime;
    private Integer storeId;

    @Basic
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "plug_ins_id", nullable = false)
    public long getPlugInsId() {
        return plugInsId;
    }

    public void setPlugInsId(long plugInsId) {
        this.plugInsId = plugInsId;
    }

    @Basic
    @Column(name = "can_num", nullable = true)
    public Integer getCanNum() {
        return canNum;
    }

    public void setCanNum(Integer canNum) {
        this.canNum = canNum;
    }

    @Basic
    @Column(name = "help_num", nullable = true)
    public Integer getHelpNum() {
        return helpNum;
    }

    public void setHelpNum(Integer helpNum) {
        this.helpNum = helpNum;
    }

    @Basic
    @Column(name = "parameter", nullable = true, length = 11)
    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Basic
    @Column(name = "invalid_time", nullable = true)
    public Integer getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Integer invalidTime) {
        this.invalidTime = invalidTime;
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

        SmsBargainConfigEntity that = (SmsBargainConfigEntity) o;

        if (id != that.id) return false;
        if (plugInsId != that.plugInsId) return false;
        if (canNum != null ? !canNum.equals(that.canNum) : that.canNum != null) return false;
        if (helpNum != null ? !helpNum.equals(that.helpNum) : that.helpNum != null) return false;
        if (parameter != null ? !parameter.equals(that.parameter) : that.parameter != null) return false;
        if (invalidTime != null ? !invalidTime.equals(that.invalidTime) : that.invalidTime != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (plugInsId ^ (plugInsId >>> 32));
        result = 31 * result + (canNum != null ? canNum.hashCode() : 0);
        result = 31 * result + (helpNum != null ? helpNum.hashCode() : 0);
        result = 31 * result + (parameter != null ? parameter.hashCode() : 0);
        result = 31 * result + (invalidTime != null ? invalidTime.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
