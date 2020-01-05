package com.smart.website.product;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pms_product_consult", schema = "product1", catalog = "")
public class PmsProductConsultEntity {
    private long id;
    private Long goodsId;
    private String goodsName;
    private long memberId;
    private String memberName;
    private Long storeId;
    private String email;
    private String consultContent;
    private Timestamp consultAddtime;
    private String consultReply;
    private Timestamp consultReplyTime;
    private Byte isanonymous;
    private Byte isDel;
    private String pic;
    private String attr;
    private Integer stars;
    private Long orderId;
    private Integer type;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goods_id", nullable = true)
    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 100)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "member_id", nullable = false)
    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "member_name", nullable = true, length = 100)
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "consult_content", nullable = true, length = 255)
    public String getConsultContent() {
        return consultContent;
    }

    public void setConsultContent(String consultContent) {
        this.consultContent = consultContent;
    }

    @Basic
    @Column(name = "consult_addtime", nullable = true)
    public Timestamp getConsultAddtime() {
        return consultAddtime;
    }

    public void setConsultAddtime(Timestamp consultAddtime) {
        this.consultAddtime = consultAddtime;
    }

    @Basic
    @Column(name = "consult_reply", nullable = true, length = 255)
    public String getConsultReply() {
        return consultReply;
    }

    public void setConsultReply(String consultReply) {
        this.consultReply = consultReply;
    }

    @Basic
    @Column(name = "consult_reply_time", nullable = true)
    public Timestamp getConsultReplyTime() {
        return consultReplyTime;
    }

    public void setConsultReplyTime(Timestamp consultReplyTime) {
        this.consultReplyTime = consultReplyTime;
    }

    @Basic
    @Column(name = "isanonymous", nullable = true)
    public Byte getIsanonymous() {
        return isanonymous;
    }

    public void setIsanonymous(Byte isanonymous) {
        this.isanonymous = isanonymous;
    }

    @Basic
    @Column(name = "is_del", nullable = true)
    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 255)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "attr", nullable = true, length = 255)
    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Basic
    @Column(name = "stars", nullable = true)
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
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
    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmsProductConsultEntity that = (PmsProductConsultEntity) o;

        if (id != that.id) return false;
        if (memberId != that.memberId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (memberName != null ? !memberName.equals(that.memberName) : that.memberName != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (consultContent != null ? !consultContent.equals(that.consultContent) : that.consultContent != null)
            return false;
        if (consultAddtime != null ? !consultAddtime.equals(that.consultAddtime) : that.consultAddtime != null)
            return false;
        if (consultReply != null ? !consultReply.equals(that.consultReply) : that.consultReply != null) return false;
        if (consultReplyTime != null ? !consultReplyTime.equals(that.consultReplyTime) : that.consultReplyTime != null)
            return false;
        if (isanonymous != null ? !isanonymous.equals(that.isanonymous) : that.isanonymous != null) return false;
        if (isDel != null ? !isDel.equals(that.isDel) : that.isDel != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (attr != null ? !attr.equals(that.attr) : that.attr != null) return false;
        if (stars != null ? !stars.equals(that.stars) : that.stars != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (int) (memberId ^ (memberId >>> 32));
        result = 31 * result + (memberName != null ? memberName.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (consultContent != null ? consultContent.hashCode() : 0);
        result = 31 * result + (consultAddtime != null ? consultAddtime.hashCode() : 0);
        result = 31 * result + (consultReply != null ? consultReply.hashCode() : 0);
        result = 31 * result + (consultReplyTime != null ? consultReplyTime.hashCode() : 0);
        result = 31 * result + (isanonymous != null ? isanonymous.hashCode() : 0);
        result = 31 * result + (isDel != null ? isDel.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (attr != null ? attr.hashCode() : 0);
        result = 31 * result + (stars != null ? stars.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
