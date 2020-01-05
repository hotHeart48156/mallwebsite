package com.smart.website.activite;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sms_draw", schema = "activiti", catalog = "")
public class SmsDrawEntity {
    private long id;
    private String name;
    private long goodId;
    private Timestamp foundTime;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer num;
    private Integer spellingNumber;
    private Integer collageNumber;
    private Integer state;
    private BigDecimal price;
    private Integer cishu;
    private String type;
    private Integer storeId;
    private String goodsName;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "good_id", nullable = false)
    public long getGoodId() {
        return goodId;
    }

    public void setGoodId(long goodId) {
        this.goodId = goodId;
    }

    @Basic
    @Column(name = "found_time", nullable = true)
    public Timestamp getFoundTime() {
        return foundTime;
    }

    public void setFoundTime(Timestamp foundTime) {
        this.foundTime = foundTime;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "num", nullable = true)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "spelling_number", nullable = true)
    public Integer getSpellingNumber() {
        return spellingNumber;
    }

    public void setSpellingNumber(Integer spellingNumber) {
        this.spellingNumber = spellingNumber;
    }

    @Basic
    @Column(name = "collage_number", nullable = true)
    public Integer getCollageNumber() {
        return collageNumber;
    }

    public void setCollageNumber(Integer collageNumber) {
        this.collageNumber = collageNumber;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "cishu", nullable = true)
    public Integer getCishu() {
        return cishu;
    }

    public void setCishu(Integer cishu) {
        this.cishu = cishu;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 255)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "goods_name", nullable = true, length = 255)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsDrawEntity that = (SmsDrawEntity) o;

        if (id != that.id) return false;
        if (goodId != that.goodId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (foundTime != null ? !foundTime.equals(that.foundTime) : that.foundTime != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (spellingNumber != null ? !spellingNumber.equals(that.spellingNumber) : that.spellingNumber != null)
            return false;
        if (collageNumber != null ? !collageNumber.equals(that.collageNumber) : that.collageNumber != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (cishu != null ? !cishu.equals(that.cishu) : that.cishu != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (goodId ^ (goodId >>> 32));
        result = 31 * result + (foundTime != null ? foundTime.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (spellingNumber != null ? spellingNumber.hashCode() : 0);
        result = 31 * result + (collageNumber != null ? collageNumber.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (cishu != null ? cishu.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        return result;
    }
}
