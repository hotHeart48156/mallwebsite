package com.smart.website.orders;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "picture", schema = "orders", catalog = "")
public class PictureEntity {
    private long id;
    private Timestamp createTime;
    private String deleteUrl;
    private String filename;
    private String height;
    private String size;
    private String url;
    private String username;
    private String width;
    private String md5Code;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "delete_url", nullable = true, length = 255)
    public String getDeleteUrl() {
        return deleteUrl;
    }

    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl;
    }

    @Basic
    @Column(name = "filename", nullable = true, length = 255)
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "height", nullable = true, length = 255)
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "size", nullable = true, length = 255)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "width", nullable = true, length = 255)
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Basic
    @Column(name = "md5code", nullable = true, length = 255)
    public String getMd5Code() {
        return md5Code;
    }

    public void setMd5Code(String md5Code) {
        this.md5Code = md5Code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PictureEntity that = (PictureEntity) o;

        if (id != that.id) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (deleteUrl != null ? !deleteUrl.equals(that.deleteUrl) : that.deleteUrl != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (md5Code != null ? !md5Code.equals(that.md5Code) : that.md5Code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (deleteUrl != null ? deleteUrl.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (md5Code != null ? md5Code.hashCode() : 0);
        return result;
    }
}
