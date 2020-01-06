package com.smart.website.activite.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "sms_user_red_packet", schema = "activiti", catalog = "")
public class SmsUserRedPacketEntity {
    private int id;
    private int redPacketId;
    private long adminId;
    private Long userId;
    private BigDecimal amount;
    private Date grabTime;
    private String note;
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
    @Column(name = "red_packet_id", nullable = false)
    public int getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(int redPacketId) {
        this.redPacketId = redPacketId;
    }

    @Basic
    @Column(name = "admin_id", nullable = false)
    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "grab_time", nullable = false)
    public Date getGrabTime() {
        return grabTime;
    }

    public void setGrabTime(Date grabTime) {
        this.grabTime = grabTime;
    }

    @Basic
    @Column(name = "note", nullable = true, length = 256)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

        SmsUserRedPacketEntity that = (SmsUserRedPacketEntity) o;

        if (id != that.id) return false;
        if (redPacketId != that.redPacketId) return false;
        if (adminId != that.adminId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (grabTime != null ? !grabTime.equals(that.grabTime) : that.grabTime != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        return storeId != null ? storeId.equals(that.storeId) : that.storeId == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + redPacketId;
        result = 31 * result + (int) (adminId ^ (adminId >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (grabTime != null ? grabTime.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        return result;
    }
}
