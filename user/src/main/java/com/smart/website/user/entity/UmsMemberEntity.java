package com.smart.website.user.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "ums_member", schema = "user", catalog = "")
public class UmsMemberEntity {
    private long id;
    private Long memberLevelId;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private Integer status;
    private Timestamp createTime;
    private String icon;
    private Integer gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private Integer sourceType;
    private Integer integration;
    private Integer growth;
    private Integer luckeyCount;
    private Integer historyIntegration;
    private String avatar;
    private String weixinOpenid;
    private String invitecode;
    private Integer blance;
    private Long schoolId;
    private Integer storeId;
    private Long areaId;
    private String schoolName;
    private String areaName;
    private Integer buyCount;
    private Integer buyMoney;
    private String memberLevelName;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "username", nullable = true, length = 64)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 64)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 64)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "gender", nullable = true)
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 64)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "job", nullable = true, length = 100)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "personalized_signature", nullable = true, length = 200)
    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    @Basic
    @Column(name = "source_type", nullable = true)
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "integration", nullable = true)
    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    @Basic
    @Column(name = "growth", nullable = true)
    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Basic
    @Column(name = "luckey_count", nullable = true)
    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    @Basic
    @Column(name = "history_integration", nullable = true)
    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    @Basic
    @Column(name = "avatar", nullable = true, length = 255)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "weixin_openid", nullable = true, length = 1000)
    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    @Basic
    @Column(name = "invitecode", nullable = true, length = 20)
    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode;
    }

    @Basic
    @Column(name = "blance", nullable = true, precision = 0)
    public Integer getBlance() {
        return blance;
    }

    public void setBlance(Integer blance) {
        this.blance = blance;
    }

    @Basic
    @Column(name = "school_id", nullable = true)
    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
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
    @Column(name = "area_id", nullable = true)
    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "school_name", nullable = true, length = 255)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "area_name", nullable = true, length = 255)
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Basic
    @Column(name = "buy_count", nullable = true)
    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    @Basic
    @Column(name = "buy_money", nullable = true, precision = 0)
    public Integer getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(Integer buyMoney) {
        this.buyMoney = buyMoney;
    }

    @Basic
    @Column(name = "member_level_name", nullable = true, length = 255)
    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmsMemberEntity that = (UmsMemberEntity) o;

        if (id != that.id) return false;
        if (memberLevelId != null ? !memberLevelId.equals(that.memberLevelId) : that.memberLevelId != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;
        if (personalizedSignature != null ? !personalizedSignature.equals(that.personalizedSignature) : that.personalizedSignature != null)
            return false;
        if (sourceType != null ? !sourceType.equals(that.sourceType) : that.sourceType != null) return false;
        if (integration != null ? !integration.equals(that.integration) : that.integration != null) return false;
        if (growth != null ? !growth.equals(that.growth) : that.growth != null) return false;
        if (luckeyCount != null ? !luckeyCount.equals(that.luckeyCount) : that.luckeyCount != null) return false;
        if (historyIntegration != null ? !historyIntegration.equals(that.historyIntegration) : that.historyIntegration != null)
            return false;
        if (avatar != null ? !avatar.equals(that.avatar) : that.avatar != null) return false;
        if (weixinOpenid != null ? !weixinOpenid.equals(that.weixinOpenid) : that.weixinOpenid != null) return false;
        if (invitecode != null ? !invitecode.equals(that.invitecode) : that.invitecode != null) return false;
        if (blance != null ? !blance.equals(that.blance) : that.blance != null) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (areaName != null ? !areaName.equals(that.areaName) : that.areaName != null) return false;
        if (buyCount != null ? !buyCount.equals(that.buyCount) : that.buyCount != null) return false;
        if (buyMoney != null ? !buyMoney.equals(that.buyMoney) : that.buyMoney != null) return false;
        if (memberLevelName != null ? !memberLevelName.equals(that.memberLevelName) : that.memberLevelName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (memberLevelId != null ? memberLevelId.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (personalizedSignature != null ? personalizedSignature.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (integration != null ? integration.hashCode() : 0);
        result = 31 * result + (growth != null ? growth.hashCode() : 0);
        result = 31 * result + (luckeyCount != null ? luckeyCount.hashCode() : 0);
        result = 31 * result + (historyIntegration != null ? historyIntegration.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (weixinOpenid != null ? weixinOpenid.hashCode() : 0);
        result = 31 * result + (invitecode != null ? invitecode.hashCode() : 0);
        result = 31 * result + (blance != null ? blance.hashCode() : 0);
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (buyCount != null ? buyCount.hashCode() : 0);
        result = 31 * result + (buyMoney != null ? buyMoney.hashCode() : 0);
        result = 31 * result + (memberLevelName != null ? memberLevelName.hashCode() : 0);
        return result;
    }
}
