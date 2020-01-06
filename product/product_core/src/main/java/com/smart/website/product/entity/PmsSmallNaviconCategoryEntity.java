package com.smart.website.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "pms_small_navicon_category", schema = "product1", catalog = "")
public class PmsSmallNaviconCategoryEntity {
    private long id;
    private String title;
    private String icon;
    private String summary;
    private String content;
    private Integer sort;
    private Integer storeId;
    private String pcUrl;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "icon", nullable = true, length = 500)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "summary", nullable = true, length = 200)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 50)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Basic
    @Column(name = "pc_url", nullable = true, length = 255)
    public String getPcUrl() {
        return pcUrl;
    }

    public void setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsSmallNaviconCategoryEntity that = (PmsSmallNaviconCategoryEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        return pcUrl != null ? pcUrl.equals(that.pcUrl) : that.pcUrl == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (pcUrl != null ? pcUrl.hashCode() : 0);
        return result;
    }
}
