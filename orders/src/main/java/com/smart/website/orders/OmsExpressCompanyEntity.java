package com.smart.website.orders;

import javax.persistence.*;

@Entity
@Table(name = "oms_express_company", schema = "orders", catalog = "")
public class OmsExpressCompanyEntity {
    private int id;
    private String expressCorpId;
    private String expressCorpName;
    private byte status;
    private String logoUrl;
    private Integer storeId;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EXPRESS_CORP_ID", nullable = false, length = 32)
    public String getExpressCorpId() {
        return expressCorpId;
    }

    public void setExpressCorpId(String expressCorpId) {
        this.expressCorpId = expressCorpId;
    }

    @Basic
    @Column(name = "EXPRESS_CORP_NAME", nullable = false, length = 64)
    public String getExpressCorpName() {
        return expressCorpName;
    }

    public void setExpressCorpName(String expressCorpName) {
        this.expressCorpName = expressCorpName;
    }

    @Basic
    @Column(name = "STATUS", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "LOGO_URL", nullable = true, length = 32)
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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

        OmsExpressCompanyEntity that = (OmsExpressCompanyEntity) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (expressCorpId != null ? !expressCorpId.equals(that.expressCorpId) : that.expressCorpId != null)
            return false;
        if (expressCorpName != null ? !expressCorpName.equals(that.expressCorpName) : that.expressCorpName != null)
            return false;
        if (logoUrl != null ? !logoUrl.equals(that.logoUrl) : that.logoUrl != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (expressCorpId != null ? expressCorpId.hashCode() : 0);
        result = 31 * result + (expressCorpName != null ? expressCorpName.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (logoUrl != null ? logoUrl.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
