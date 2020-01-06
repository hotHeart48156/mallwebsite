package com.smart.website.admin.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_sys_user_online", schema = "admin", catalog = "")
public class AdminSysUserOnlineEntity {
    private String sessionId;
    private String loginName;
    private String deptName;
    private String ipaddr;
    private String loginLocation;
    private String browser;
    private String os;
    private String status;
    private Timestamp startTimestamp;
    private Timestamp lastAccessTime;
    private Integer expireTime;

    @Id
    @Column(name = "sessionId", nullable = false, length = 50)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "login_name", nullable = true, length = 50)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "dept_name", nullable = true, length = 50)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "ipaddr", nullable = true, length = 50)
    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    @Basic
    @Column(name = "login_location", nullable = true, length = 255)
    public String getLoginLocation() {
        return loginLocation;
    }

    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
    }

    @Basic
    @Column(name = "browser", nullable = true, length = 50)
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Basic
    @Column(name = "os", nullable = true, length = 50)
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "start_timestamp", nullable = true)
    public Timestamp getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Timestamp startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    @Basic
    @Column(name = "last_access_time", nullable = true)
    public Timestamp getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Timestamp lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Basic
    @Column(name = "expire_time", nullable = true)
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysUserOnlineEntity that = (AdminSysUserOnlineEntity) o;

        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;
        if (ipaddr != null ? !ipaddr.equals(that.ipaddr) : that.ipaddr != null) return false;
        if (loginLocation != null ? !loginLocation.equals(that.loginLocation) : that.loginLocation != null)
            return false;
        if (browser != null ? !browser.equals(that.browser) : that.browser != null) return false;
        if (os != null ? !os.equals(that.os) : that.os != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (startTimestamp != null ? !startTimestamp.equals(that.startTimestamp) : that.startTimestamp != null)
            return false;
        if (lastAccessTime != null ? !lastAccessTime.equals(that.lastAccessTime) : that.lastAccessTime != null)
            return false;
        return expireTime != null ? expireTime.equals(that.expireTime) : that.expireTime == null;
    }

    @Override
    public int hashCode() {
        int result = sessionId != null ? sessionId.hashCode() : 0;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (ipaddr != null ? ipaddr.hashCode() : 0);
        result = 31 * result + (loginLocation != null ? loginLocation.hashCode() : 0);
        result = 31 * result + (browser != null ? browser.hashCode() : 0);
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (startTimestamp != null ? startTimestamp.hashCode() : 0);
        result = 31 * result + (lastAccessTime != null ? lastAccessTime.hashCode() : 0);
        result = 31 * result + (expireTime != null ? expireTime.hashCode() : 0);
        return result;
    }
}
