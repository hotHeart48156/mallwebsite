package com.smart.website.activite.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_sign_config", schema = "activiti", catalog = "")
public class SmsSignConfigEntity {
    private long id;
    private long plugInsId;
    private String imgurl;
    private int minScore;
    private int maxScore;
    private int continuityThree;
    private int continuityTwenty;
    private int continuityThirty;
    private int activityOverdue;
    private Timestamp modifyDate;
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
    @Column(name = "plug_ins_id", nullable = false)
    public long getPlugInsId() {
        return plugInsId;
    }

    public void setPlugInsId(long plugInsId) {
        this.plugInsId = plugInsId;
    }

    @Basic
    @Column(name = "imgurl", nullable = false, length = 200)
    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Basic
    @Column(name = "min_score", nullable = false)
    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    @Basic
    @Column(name = "max_score", nullable = false)
    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    @Basic
    @Column(name = "continuity_three", nullable = false)
    public int getContinuityThree() {
        return continuityThree;
    }

    public void setContinuityThree(int continuityThree) {
        this.continuityThree = continuityThree;
    }

    @Basic
    @Column(name = "continuity_twenty", nullable = false)
    public int getContinuityTwenty() {
        return continuityTwenty;
    }

    public void setContinuityTwenty(int continuityTwenty) {
        this.continuityTwenty = continuityTwenty;
    }

    @Basic
    @Column(name = "continuity_thirty", nullable = false)
    public int getContinuityThirty() {
        return continuityThirty;
    }

    public void setContinuityThirty(int continuityThirty) {
        this.continuityThirty = continuityThirty;
    }

    @Basic
    @Column(name = "activity_overdue", nullable = false)
    public int getActivityOverdue() {
        return activityOverdue;
    }

    public void setActivityOverdue(int activityOverdue) {
        this.activityOverdue = activityOverdue;
    }

    @Basic
    @Column(name = "modify_date", nullable = true)
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
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

        SmsSignConfigEntity that = (SmsSignConfigEntity) o;

        if (id != that.id) return false;
        if (plugInsId != that.plugInsId) return false;
        if (minScore != that.minScore) return false;
        if (maxScore != that.maxScore) return false;
        if (continuityThree != that.continuityThree) return false;
        if (continuityTwenty != that.continuityTwenty) return false;
        if (continuityThirty != that.continuityThirty) return false;
        if (activityOverdue != that.activityOverdue) return false;
        if (imgurl != null ? !imgurl.equals(that.imgurl) : that.imgurl != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (plugInsId ^ (plugInsId >>> 32));
        result = 31 * result + (imgurl != null ? imgurl.hashCode() : 0);
        result = 31 * result + minScore;
        result = 31 * result + maxScore;
        result = 31 * result + continuityThree;
        result = 31 * result + continuityTwenty;
        result = 31 * result + continuityThirty;
        result = 31 * result + activityOverdue;
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
