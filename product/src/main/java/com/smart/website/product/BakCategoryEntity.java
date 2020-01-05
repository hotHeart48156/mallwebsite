package com.smart.website.product;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "bak_category", schema = "product1", catalog = "")
public class BakCategoryEntity {
    private int id;
    private String name;
    private String keywords;
    private String descs;
    private int pid;
    private String iconUrl;
    private String picUrl;
    private String level;
    private Byte sortOrder;
    private Timestamp addTime;
    private Timestamp updateTime;
    private Byte deleted;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 63)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "keywords", nullable = false, length = 1023)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "descs", nullable = true, length = 255)
    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    @Basic
    @Column(name = "pid", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "icon_url", nullable = true, length = 255)
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Basic
    @Column(name = "pic_url", nullable = true, length = 255)
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Basic
    @Column(name = "level", nullable = true, length = 255)
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "sort_order", nullable = true)
    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
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
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "deleted", nullable = true)
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BakCategoryEntity that = (BakCategoryEntity) o;

        if (id != that.id) return false;
        if (pid != that.pid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (descs != null ? !descs.equals(that.descs) : that.descs != null) return false;
        if (iconUrl != null ? !iconUrl.equals(that.iconUrl) : that.iconUrl != null) return false;
        if (picUrl != null ? !picUrl.equals(that.picUrl) : that.picUrl != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (sortOrder != null ? !sortOrder.equals(that.sortOrder) : that.sortOrder != null) return false;
        if (addTime != null ? !addTime.equals(that.addTime) : that.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (descs != null ? descs.hashCode() : 0);
        result = 31 * result + pid;
        result = 31 * result + (iconUrl != null ? iconUrl.hashCode() : 0);
        result = 31 * result + (picUrl != null ? picUrl.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (sortOrder != null ? sortOrder.hashCode() : 0);
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}
