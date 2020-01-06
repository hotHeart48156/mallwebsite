package com.smart.website.product_side.entity;

@Entity
@Table(name = "cms_parter", schema = "product_side", catalog = "")
public class CmsParterEntity {
    private int id;
    private String companyname;
    private String name;
    private String idcard;
    private String phone;
    private String info;
    private Integer storeId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "companyname", nullable = true, length = 255)
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "idcard", nullable = true, length = 255)
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "info", nullable = true, length = 255)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

        CmsParterEntity that = (CmsParterEntity) o;

        if (id != that.id) return false;
        if (companyname != null ? !companyname.equals(that.companyname) : that.companyname != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (idcard != null ? !idcard.equals(that.idcard) : that.idcard != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (info != null ? !info.equals(that.info) : that.info != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (companyname != null ? companyname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (idcard != null ? idcard.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
