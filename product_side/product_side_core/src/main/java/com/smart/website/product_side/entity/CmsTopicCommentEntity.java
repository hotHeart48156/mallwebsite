package com.smart.website.product_side.entity;

import java.sql.Timestamp;

@Entity
@Table(name = "cms_topic_comment", schema = "product_side", catalog = "")
public class CmsTopicCommentEntity {
    private long id;
    private Long topicId;
    private String memberNickName;
    private String memberIcon;
    private String content;
    private Timestamp createTime;
    private Integer showStatus;
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
    @Column(name = "topic_id", nullable = true)
    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    @Basic
    @Column(name = "member_nick_name", nullable = true, length = 255)
    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    @Basic
    @Column(name = "member_icon", nullable = true, length = 255)
    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "show_status", nullable = true)
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
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

        CmsTopicCommentEntity that = (CmsTopicCommentEntity) o;

        if (id != that.id) return false;
        if (topicId != null ? !topicId.equals(that.topicId) : that.topicId != null) return false;
        if (memberNickName != null ? !memberNickName.equals(that.memberNickName) : that.memberNickName != null)
            return false;
        if (memberIcon != null ? !memberIcon.equals(that.memberIcon) : that.memberIcon != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (topicId != null ? topicId.hashCode() : 0);
        result = 31 * result + (memberNickName != null ? memberNickName.hashCode() : 0);
        result = 31 * result + (memberIcon != null ? memberIcon.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
