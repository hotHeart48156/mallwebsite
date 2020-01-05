package com.smart.website.admin;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AdminSysUserPostEntityPK implements Serializable {
    private long userId;
    private long postId;

    @Column(name = "user_id", nullable = false)
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "post_id", nullable = false)
    @Id
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

        AdminSysUserPostEntityPK that = (AdminSysUserPostEntityPK) o;

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
