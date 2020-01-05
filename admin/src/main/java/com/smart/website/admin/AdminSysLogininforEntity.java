package com.smart.website.admin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_sys_logininfor", schema = "admin", catalog = "")
public class AdminSysLogininforEntity {
    private long infoId;
    private String loginName;
    private String ipaddr;
    private String loginLocation;
    private String browser;
    private String os;
    private String status;
    private String msg;
    private Timestamp loginTime;

    @Id
    @Column(name = "info_id", nullable = false)
    public long getInfoId() {
        return infoId;
    }

    public void setInfoId(long infoId) {
        this.infoId = infoId;
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
    @Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "msg", nullable = true, length = 255)
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Basic
    @Column(name = "login_time", nullable = true)
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysLogininforEntity that = (AdminSysLogininforEntity) o;

        if (infoId != that.infoId) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (ipaddr != null ? !ipaddr.equals(that.ipaddr) : that.ipaddr != null) return false;
        if (loginLocation != null ? !loginLocation.equals(that.loginLocation) : that.loginLocation != null)
            return false;
        if (browser != null ? !browser.equals(that.browser) : that.browser != null) return false;
        if (os != null ? !os.equals(that.os) : that.os != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (msg != null ? !msg.equals(that.msg) : that.msg != null) return false;
        if (loginTime != null ? !loginTime.equals(that.loginTime) : that.loginTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (infoId ^ (infoId >>> 32));
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (ipaddr != null ? ipaddr.hashCode() : 0);
        result = 31 * result + (loginLocation != null ? loginLocation.hashCode() : 0);
        result = 31 * result + (browser != null ? browser.hashCode() : 0);
        result = 31 * result + (os != null ? os.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        return result;
    }
}
