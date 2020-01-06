package com.smart.website.product_side.entity;

import java.sql.Timestamp;

@Entity
@Table(name = "cms_subject", schema = "product_side", catalog = "")
public class CmsSubjectEntity {
    private long id;
    private Long categoryId;
    private String title;
    private String pic;
    private Integer productCount;
    private Integer recommendStatus;
    private Timestamp createTime;
    private Integer collectCount;
    private Integer readCount;
    private Integer commentCount;
    private String albumPics;
    private String description;
    private Integer showStatus;
    private String content;
    private Integer forwardCount;
    private String categoryName;
    private Long areaId;
    private Long schoolId;
    private Long memberId;
    private Integer reward;
    private Integer storeId;
    private String areaName;
    private String schoolName;
    private String memberName;
    private String videoSrc;
    private Integer type;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 500)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "product_count", nullable = true)
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "collect_count", nullable = true)
    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    @Basic
    @Column(name = "read_count", nullable = true)
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "comment_count", nullable = true)
    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @Basic
    @Column(name = "album_pics", nullable = true, length = -1)
    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 1000)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "forward_count", nullable = true)
    public Integer getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    @Basic
    @Column(name = "category_name", nullable = true, length = 200)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "area_id", nullable = true)
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "school_id", nullable = true)
    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
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
    @Column(name = "reward", nullable = true)
    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
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
    @Column(name = "area_name", nullable = true, length = 255)
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "school_name", nullable = true, length = 255)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "member_name", nullable = true, length = 255)
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Basic
    @Column(name = "video_src", nullable = true, length = 255)
    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmsSubjectEntity that = (CmsSubjectEntity) o;

        if (id != that.id) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (productCount != null ? !productCount.equals(that.productCount) : that.productCount != null) return false;
        if (recommendStatus != null ? !recommendStatus.equals(that.recommendStatus) : that.recommendStatus != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (collectCount != null ? !collectCount.equals(that.collectCount) : that.collectCount != null) return false;
        if (readCount != null ? !readCount.equals(that.readCount) : that.readCount != null) return false;
        if (commentCount != null ? !commentCount.equals(that.commentCount) : that.commentCount != null) return false;
        if (albumPics != null ? !albumPics.equals(that.albumPics) : that.albumPics != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (forwardCount != null ? !forwardCount.equals(that.forwardCount) : that.forwardCount != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (reward != null ? !reward.equals(that.reward) : that.reward != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (videoSrc != null ? !videoSrc.equals(that.videoSrc) : that.videoSrc != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (productCount != null ? productCount.hashCode() : 0);
        result = 31 * result + (recommendStatus != null ? recommendStatus.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (collectCount != null ? collectCount.hashCode() : 0);
        result = 31 * result + (readCount != null ? readCount.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        result = 31 * result + (albumPics != null ? albumPics.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (forwardCount != null ? forwardCount.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (reward != null ? reward.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (videoSrc != null ? videoSrc.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
