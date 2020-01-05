package com.smart.website.admin;

import javax.persistence.*;

@Entity
@Table(name = "admin_sys_user_post", schema = "admin", catalog = "")
@IdClass(AdminSysUserPostEntityPK.class)
public class AdminSysUserPostEntity {
    private long userId;
    private long postId;

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "post_id", nullable = false)
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysUserPostEntity that = (AdminSysUserPostEntity) o;

        if (userId != that.userId) return false;
        if (postId != that.postId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (postId ^ (postId >>> 32));
        return result;
    }
}
