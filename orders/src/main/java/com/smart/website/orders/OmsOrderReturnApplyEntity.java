package com.smart.website.orders;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "oms_order_return_apply", schema = "orders", catalog = "")
public class OmsOrderReturnApplyEntity {
    private long id;
    private Long orderId;
    private Long companyAddressId;
    private Long productId;
    private String orderSn;
    private Timestamp createTime;
    private String memberUsername;
    private BigDecimal returnAmount;
    private String returnName;
    private String returnPhone;
    private Integer status;
    private Timestamp handleTime;
    private String productPic;
    private String productName;
    private String productBrand;
    private String productAttr;
    private Integer productCount;
    private BigDecimal productPrice;
    private BigDecimal productRealPrice;
    private String reason;
    private String description;
    private String proofPics;
    private String handleNote;
    private String handleMan;
    private String receiveMan;
    private Timestamp receiveTime;
    private String receiveNote;
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
    @Column(name = "order_id", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "company_address_id", nullable = true)
    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
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
    @Column(name = "order_sn", nullable = true, length = 64)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    @Column(name = "member_username", nullable = true, length = 64)
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Basic
    @Column(name = "return_amount", nullable = true, precision = 2)
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    @Basic
    @Column(name = "return_name", nullable = true, length = 100)
    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    @Basic
    @Column(name = "return_phone", nullable = true, length = 100)
    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "handle_time", nullable = true)
    public Timestamp getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Timestamp handleTime) {
        this.handleTime = handleTime;
    }

    @Basic
    @Column(name = "product_pic", nullable = true, length = 500)
    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 200)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_brand", nullable = true, length = 200)
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Basic
    @Column(name = "product_attr", nullable = true, length = 500)
    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
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
    @Column(name = "product_price", nullable = true, precision = 2)
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_real_price", nullable = true, precision = 2)
    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    @Basic
    @Column(name = "reason", nullable = true, length = 200)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "proof_pics", nullable = true, length = 1000)
    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }

    @Basic
    @Column(name = "handle_note", nullable = true, length = 500)
    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    @Basic
    @Column(name = "handle_man", nullable = true, length = 100)
    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    @Basic
    @Column(name = "receive_man", nullable = true, length = 100)
    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    @Basic
    @Column(name = "receive_time", nullable = true)
    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Basic
    @Column(name = "receive_note", nullable = true, length = 500)
    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
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

        OmsOrderReturnApplyEntity that = (OmsOrderReturnApplyEntity) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (companyAddressId != null ? !companyAddressId.equals(that.companyAddressId) : that.companyAddressId != null)
            return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (orderSn != null ? !orderSn.equals(that.orderSn) : that.orderSn != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (memberUsername != null ? !memberUsername.equals(that.memberUsername) : that.memberUsername != null)
            return false;
        if (returnAmount != null ? !returnAmount.equals(that.returnAmount) : that.returnAmount != null) return false;
        if (returnName != null ? !returnName.equals(that.returnName) : that.returnName != null) return false;
        if (returnPhone != null ? !returnPhone.equals(that.returnPhone) : that.returnPhone != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (handleTime != null ? !handleTime.equals(that.handleTime) : that.handleTime != null) return false;
        if (productPic != null ? !productPic.equals(that.productPic) : that.productPic != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productBrand != null ? !productBrand.equals(that.productBrand) : that.productBrand != null) return false;
        if (productAttr != null ? !productAttr.equals(that.productAttr) : that.productAttr != null) return false;
        if (productCount != null ? !productCount.equals(that.productCount) : that.productCount != null) return false;
        if (productPrice != null ? !productPrice.equals(that.productPrice) : that.productPrice != null) return false;
        if (productRealPrice != null ? !productRealPrice.equals(that.productRealPrice) : that.productRealPrice != null)
            return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (proofPics != null ? !proofPics.equals(that.proofPics) : that.proofPics != null) return false;
        if (handleNote != null ? !handleNote.equals(that.handleNote) : that.handleNote != null) return false;
        if (handleMan != null ? !handleMan.equals(that.handleMan) : that.handleMan != null) return false;
        if (receiveMan != null ? !receiveMan.equals(that.receiveMan) : that.receiveMan != null) return false;
        if (receiveTime != null ? !receiveTime.equals(that.receiveTime) : that.receiveTime != null) return false;
        if (receiveNote != null ? !receiveNote.equals(that.receiveNote) : that.receiveNote != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (companyAddressId != null ? companyAddressId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (memberUsername != null ? memberUsername.hashCode() : 0);
        result = 31 * result + (returnAmount != null ? returnAmount.hashCode() : 0);
        result = 31 * result + (returnName != null ? returnName.hashCode() : 0);
        result = 31 * result + (returnPhone != null ? returnPhone.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (handleTime != null ? handleTime.hashCode() : 0);
        result = 31 * result + (productPic != null ? productPic.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productBrand != null ? productBrand.hashCode() : 0);
        result = 31 * result + (productAttr != null ? productAttr.hashCode() : 0);
        result = 31 * result + (productCount != null ? productCount.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (productRealPrice != null ? productRealPrice.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (proofPics != null ? proofPics.hashCode() : 0);
        result = 31 * result + (handleNote != null ? handleNote.hashCode() : 0);
        result = 31 * result + (handleMan != null ? handleMan.hashCode() : 0);
        result = 31 * result + (receiveMan != null ? receiveMan.hashCode() : 0);
        result = 31 * result + (receiveTime != null ? receiveTime.hashCode() : 0);
        result = 31 * result + (receiveNote != null ? receiveNote.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
