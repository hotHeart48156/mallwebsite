package com.smart.website.activite.entity;

import javax.persistence.*;

@Entity
@Table(name = "sms_home_recommend_subject", schema = "activiti", catalog = "")
public class SmsHomeRecommendSubjectEntity {
    private long id;
    private Long subjectId;
    private String subjectName;
    private Integer recommendStatus;
    private Integer sort;
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
    @Column(name = "subject_id", nullable = true)
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "subject_name", nullable = true, length = 64)
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Basic
    @Column(name = "recommend_status", nullable = true)
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

        SmsHomeRecommendSubjectEntity that = (SmsHomeRecommendSubjectEntity) o;

        if (id != that.id) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (subjectName != null ? !subjectName.equals(that.subjectName) : that.subjectName != null) return false;
        if (recommendStatus != null ? !recommendStatus.equals(that.recommendStatus) : that.recommendStatus != null)
            return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (subjectName != null ? subjectName.hashCode() : 0);
        result = 31 * result + (recommendStatus != null ? recommendStatus.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
