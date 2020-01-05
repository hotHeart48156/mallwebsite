package com.smart.website.activite;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_configure", schema = "activiti", catalog = "")
public class SmsConfigureEntity {
    private long id;
    private String name;
    private String color;
    private String size;
    private BigDecimal costprice;
    private BigDecimal price;
    private BigDecimal yprice;
    private String img;
    private int pid;
    private int num;
    private String unit;
    private BigDecimal bargainPrice;
    private byte status;
    private String attribute;
    private byte recycle;
    private int totalNum;
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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 15)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "size", nullable = true, length = 100)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "costprice", nullable = false, precision = 2)
    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "yprice", nullable = false, precision = 2)
    public BigDecimal getYprice() {
        return yprice;
    }

    public void setYprice(BigDecimal yprice) {
        this.yprice = yprice;
    }

    @Basic
    @Column(name = "img", nullable = false, length = 255)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "pid", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "num", nullable = false)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Basic
    @Column(name = "unit", nullable = false, length = 30)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "bargain_price", nullable = true, precision = 2)
    public BigDecimal getBargainPrice() {
        return bargainPrice;
    }

    public void setBargainPrice(BigDecimal bargainPrice) {
        this.bargainPrice = bargainPrice;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "attribute", nullable = true, length = -1)
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Basic
    @Column(name = "recycle", nullable = false)
    public byte getRecycle() {
        return recycle;
    }

    public void setRecycle(byte recycle) {
        this.recycle = recycle;
    }

    @Basic
    @Column(name = "total_num", nullable = false)
    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
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

        SmsConfigureEntity that = (SmsConfigureEntity) o;

        if (id != that.id) return false;
        if (pid != that.pid) return false;
        if (num != that.num) return false;
        if (status != that.status) return false;
        if (recycle != that.recycle) return false;
        if (totalNum != that.totalNum) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (costprice != null ? !costprice.equals(that.costprice) : that.costprice != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (yprice != null ? !yprice.equals(that.yprice) : that.yprice != null) return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (bargainPrice != null ? !bargainPrice.equals(that.bargainPrice) : that.bargainPrice != null) return false;
        if (attribute != null ? !attribute.equals(that.attribute) : that.attribute != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (yprice != null ? yprice.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + pid;
        result = 31 * result + num;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (bargainPrice != null ? bargainPrice.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (attribute != null ? attribute.hashCode() : 0);
        result = 31 * result + (int) recycle;
        result = 31 * result + totalNum;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
