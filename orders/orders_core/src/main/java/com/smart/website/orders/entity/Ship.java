package com.smart.website.orders.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "oms_ship", schema = "orders", catalog = "")
public class Ship {
    private int id;
    private String name;
    private Byte hasCod;
    private Object firstunit;
    private Object continueunit;
    private Byte defAreaFee;
    private Byte type;
    private BigDecimal firstunitPrice;
    private BigDecimal continueunitPrice;
    private String exp;
    private String logiName;
    private String logiCode;
    private Byte isDef;
    private Short sort;
    private Byte status;
    private Byte freePostage;
    private String areaFee;
    private BigDecimal goodsmoney;
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
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "has_cod", nullable = true)
    public Byte getHasCod() {
        return hasCod;
    }

    public void setHasCod(Byte hasCod) {
        this.hasCod = hasCod;
    }

    @Basic
    @Column(name = "firstunit", nullable = true)
    public Object getFirstunit() {
        return firstunit;
    }

    public void setFirstunit(Object firstunit) {
        this.firstunit = firstunit;
    }

    @Basic
    @Column(name = "continueunit", nullable = true)
    public Object getContinueunit() {
        return continueunit;
    }

    public void setContinueunit(Object continueunit) {
        this.continueunit = continueunit;
    }

    @Basic
    @Column(name = "def_area_fee", nullable = true)
    public Byte getDefAreaFee() {
        return defAreaFee;
    }

    public void setDefAreaFee(Byte defAreaFee) {
        this.defAreaFee = defAreaFee;
    }

    @Basic
    @Column(name = "type", nullable = true)
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "firstunit_price", nullable = true, precision = 2)
    public BigDecimal getFirstunitPrice() {
        return firstunitPrice;
    }

    public void setFirstunitPrice(BigDecimal firstunitPrice) {
        this.firstunitPrice = firstunitPrice;
    }

    @Basic
    @Column(name = "continueunit_price", nullable = true, precision = 2)
    public BigDecimal getContinueunitPrice() {
        return continueunitPrice;
    }

    public void setContinueunitPrice(BigDecimal continueunitPrice) {
        this.continueunitPrice = continueunitPrice;
    }

    @Basic
    @Column(name = "exp", nullable = true, length = -1)
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Basic
    @Column(name = "logi_name", nullable = true, length = 50)
    public String getLogiName() {
        return logiName;
    }

    public void setLogiName(String logiName) {
        this.logiName = logiName;
    }

    @Basic
    @Column(name = "logi_code", nullable = true, length = 50)
    public String getLogiCode() {
        return logiCode;
    }

    public void setLogiCode(String logiCode) {
        this.logiCode = logiCode;
    }

    @Basic
    @Column(name = "is_def", nullable = true)
    public Byte getIsDef() {
        return isDef;
    }

    public void setIsDef(Byte isDef) {
        this.isDef = isDef;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "free_postage", nullable = true)
    public Byte getFreePostage() {
        return freePostage;
    }

    public void setFreePostage(Byte freePostage) {
        this.freePostage = freePostage;
    }

    @Basic
    @Column(name = "area_fee", nullable = true, length = -1)
    public String getAreaFee() {
        return areaFee;
    }

    public void setAreaFee(String areaFee) {
        this.areaFee = areaFee;
    }

    @Basic
    @Column(name = "goodsmoney", nullable = true, precision = 2)
    public BigDecimal getGoodsmoney() {
        return goodsmoney;
    }

    public void setGoodsmoney(BigDecimal goodsmoney) {
        this.goodsmoney = goodsmoney;
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

        Ship that = (Ship) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (hasCod != null ? !hasCod.equals(that.hasCod) : that.hasCod != null) return false;
        if (firstunit != null ? !firstunit.equals(that.firstunit) : that.firstunit != null) return false;
        if (continueunit != null ? !continueunit.equals(that.continueunit) : that.continueunit != null) return false;
        if (defAreaFee != null ? !defAreaFee.equals(that.defAreaFee) : that.defAreaFee != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (firstunitPrice != null ? !firstunitPrice.equals(that.firstunitPrice) : that.firstunitPrice != null)
            return false;
        if (continueunitPrice != null ? !continueunitPrice.equals(that.continueunitPrice) : that.continueunitPrice != null)
            return false;
        if (exp != null ? !exp.equals(that.exp) : that.exp != null) return false;
        if (logiName != null ? !logiName.equals(that.logiName) : that.logiName != null) return false;
        if (logiCode != null ? !logiCode.equals(that.logiCode) : that.logiCode != null) return false;
        if (isDef != null ? !isDef.equals(that.isDef) : that.isDef != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (freePostage != null ? !freePostage.equals(that.freePostage) : that.freePostage != null) return false;
        if (areaFee != null ? !areaFee.equals(that.areaFee) : that.areaFee != null) return false;
        if (goodsmoney != null ? !goodsmoney.equals(that.goodsmoney) : that.goodsmoney != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (hasCod != null ? hasCod.hashCode() : 0);
        result = 31 * result + (firstunit != null ? firstunit.hashCode() : 0);
        result = 31 * result + (continueunit != null ? continueunit.hashCode() : 0);
        result = 31 * result + (defAreaFee != null ? defAreaFee.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (firstunitPrice != null ? firstunitPrice.hashCode() : 0);
        result = 31 * result + (continueunitPrice != null ? continueunitPrice.hashCode() : 0);
        result = 31 * result + (exp != null ? exp.hashCode() : 0);
        result = 31 * result + (logiName != null ? logiName.hashCode() : 0);
        result = 31 * result + (logiCode != null ? logiCode.hashCode() : 0);
        result = 31 * result + (isDef != null ? isDef.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (freePostage != null ? freePostage.hashCode() : 0);
        result = 31 * result + (areaFee != null ? areaFee.hashCode() : 0);
        result = 31 * result + (goodsmoney != null ? goodsmoney.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
