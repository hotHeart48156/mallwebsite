package com.smart.website.product;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pms_member_price", schema = "product1", catalog = "")
public class PmsMemberPriceEntity {
    private long id;
    private Long productId;
    private Long memberLevelId;
    private BigDecimal memberPrice;
    private String memberLevelName;
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
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "member_level_id", nullable = true)
    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    @Basic
    @Column(name = "member_price", nullable = true, precision = 2)
    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    @Basic
    @Column(name = "member_level_name", nullable = true, length = 100)
    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
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

        PmsMemberPriceEntity that = (PmsMemberPriceEntity) o;

        if (id != that.id) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (memberLevelId != null ? !memberLevelId.equals(that.memberLevelId) : that.memberLevelId != null)
            return false;
        if (memberPrice != null ? !memberPrice.equals(that.memberPrice) : that.memberPrice != null) return false;
        if (memberLevelName != null ? !memberLevelName.equals(that.memberLevelName) : that.memberLevelName != null)
            return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (memberLevelId != null ? memberLevelId.hashCode() : 0);
        result = 31 * result + (memberPrice != null ? memberPrice.hashCode() : 0);
        result = 31 * result + (memberLevelName != null ? memberLevelName.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
