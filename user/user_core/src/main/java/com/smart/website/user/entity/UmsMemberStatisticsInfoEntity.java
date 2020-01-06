package com.smart.website.user.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_member_statistics_info", schema = "user", catalog = "")
public class UmsMemberStatisticsInfoEntity {
    private long id;
    private Long memberId;
    private BigDecimal consumeAmount;
    private Integer orderCount;
    private Integer couponCount;
    private Integer commentCount;
    private Integer returnOrderCount;
    private Integer loginCount;
    private Integer attendCount;
    private Integer fansCount;
    private Integer collectProductCount;
    private Integer collectSubjectCount;
    private Integer collectTopicCount;
    private Integer collectCommentCount;
    private Integer inviteFriendCount;
    private Timestamp recentOrderTime;
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
    @Column(name = "member_id", nullable = true)
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "consume_amount", nullable = true, precision = 2)
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    @Basic
    @Column(name = "order_count", nullable = true)
    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    @Basic
    @Column(name = "coupon_count", nullable = true)
    public Integer getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
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
    @Column(name = "return_order_count", nullable = true)
    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    @Basic
    @Column(name = "login_count", nullable = true)
    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Basic
    @Column(name = "attend_count", nullable = true)
    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    @Basic
    @Column(name = "fans_count", nullable = true)
    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    @Basic
    @Column(name = "collect_product_count", nullable = true)
    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    @Basic
    @Column(name = "collect_subject_count", nullable = true)
    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    @Basic
    @Column(name = "collect_topic_count", nullable = true)
    public Integer getCollectTopicCount() {
        return collectTopicCount;
    }

    public void setCollectTopicCount(Integer collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    @Basic
    @Column(name = "collect_comment_count", nullable = true)
    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    @Basic
    @Column(name = "invite_friend_count", nullable = true)
    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    @Basic
    @Column(name = "recent_order_time", nullable = true)
    public Timestamp getRecentOrderTime() {
        return recentOrderTime;
    }

    public void setRecentOrderTime(Timestamp recentOrderTime) {
        this.recentOrderTime = recentOrderTime;
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

        UmsMemberStatisticsInfoEntity that = (UmsMemberStatisticsInfoEntity) o;

        if (id != that.id) return false;
        if (memberId != null ? !memberId.equals(that.memberId) : that.memberId != null) return false;
        if (consumeAmount != null ? !consumeAmount.equals(that.consumeAmount) : that.consumeAmount != null)
            return false;
        if (orderCount != null ? !orderCount.equals(that.orderCount) : that.orderCount != null) return false;
        if (couponCount != null ? !couponCount.equals(that.couponCount) : that.couponCount != null) return false;
        if (commentCount != null ? !commentCount.equals(that.commentCount) : that.commentCount != null) return false;
        if (returnOrderCount != null ? !returnOrderCount.equals(that.returnOrderCount) : that.returnOrderCount != null)
            return false;
        if (loginCount != null ? !loginCount.equals(that.loginCount) : that.loginCount != null) return false;
        if (attendCount != null ? !attendCount.equals(that.attendCount) : that.attendCount != null) return false;
        if (fansCount != null ? !fansCount.equals(that.fansCount) : that.fansCount != null) return false;
        if (collectProductCount != null ? !collectProductCount.equals(that.collectProductCount) : that.collectProductCount != null)
            return false;
        if (collectSubjectCount != null ? !collectSubjectCount.equals(that.collectSubjectCount) : that.collectSubjectCount != null)
            return false;
        if (collectTopicCount != null ? !collectTopicCount.equals(that.collectTopicCount) : that.collectTopicCount != null)
            return false;
        if (collectCommentCount != null ? !collectCommentCount.equals(that.collectCommentCount) : that.collectCommentCount != null)
            return false;
        if (inviteFriendCount != null ? !inviteFriendCount.equals(that.inviteFriendCount) : that.inviteFriendCount != null)
            return false;
        if (recentOrderTime != null ? !recentOrderTime.equals(that.recentOrderTime) : that.recentOrderTime != null)
            return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberId != null ? memberId.hashCode() : 0);
        result = 31 * result + (consumeAmount != null ? consumeAmount.hashCode() : 0);
        result = 31 * result + (orderCount != null ? orderCount.hashCode() : 0);
        result = 31 * result + (couponCount != null ? couponCount.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        result = 31 * result + (returnOrderCount != null ? returnOrderCount.hashCode() : 0);
        result = 31 * result + (loginCount != null ? loginCount.hashCode() : 0);
        result = 31 * result + (attendCount != null ? attendCount.hashCode() : 0);
        result = 31 * result + (fansCount != null ? fansCount.hashCode() : 0);
        result = 31 * result + (collectProductCount != null ? collectProductCount.hashCode() : 0);
        result = 31 * result + (collectSubjectCount != null ? collectSubjectCount.hashCode() : 0);
        result = 31 * result + (collectTopicCount != null ? collectTopicCount.hashCode() : 0);
        result = 31 * result + (collectCommentCount != null ? collectCommentCount.hashCode() : 0);
        result = 31 * result + (inviteFriendCount != null ? inviteFriendCount.hashCode() : 0);
        result = 31 * result + (recentOrderTime != null ? recentOrderTime.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
