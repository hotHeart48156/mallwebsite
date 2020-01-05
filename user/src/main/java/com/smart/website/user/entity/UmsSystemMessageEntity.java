package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_system_message", schema = "user", catalog = "")
public class UmsSystemMessageEntity {
    private long id;
    private long senderid;
    private long recipientid;
    private String title;
    private String content;
    private Timestamp time;
    private int type;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "senderid", nullable = false)
    public long getSenderid() {
        return senderid;
    }

    public void setSenderid(long senderid) {
        this.senderid = senderid;
    }

    @Basic
    @Column(name = "recipientid", nullable = false)
    public long getRecipientid() {
        return recipientid;
    }

    public void setRecipientid(long recipientid) {
        this.recipientid = recipientid;
    }

    @Basic
    @Column(name = "title", nullable = true, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmsSystemMessageEntity that = (UmsSystemMessageEntity) o;

        if (id != that.id) return false;
        if (senderid != that.senderid) return false;
        if (recipientid != that.recipientid) return false;
        if (type != that.type) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (senderid ^ (senderid >>> 32));
        result = 31 * result + (int) (recipientid ^ (recipientid >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + type;
        return result;
    }
}
