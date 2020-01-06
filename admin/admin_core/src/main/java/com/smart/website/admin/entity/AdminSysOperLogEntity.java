package com.smart.website.admin.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_sys_oper_log", schema = "admin", catalog = "")
public class AdminSysOperLogEntity {
    private long operId;
    private String title;
    private Integer businessType;
    private String method;
    private String requestMethod;
    private Integer operatorType;
    private String operName;
    private String deptName;
    private String operUrl;
    private String operIp;
    private String operLocation;
    private String operParam;
    private Integer status;
    private String errorMsg;
    private Timestamp operTime;

    @Id
    @Column(name = "oper_id", nullable = false)
    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "business_type", nullable = true)
    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    @Basic
    @Column(name = "method", nullable = true, length = 100)
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "request_method", nullable = true, length = 10)
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    @Basic
    @Column(name = "operator_type", nullable = true)
    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    @Basic
    @Column(name = "oper_name", nullable = true, length = 50)
    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
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
    @Column(name = "oper_url", nullable = true, length = 255)
    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    @Basic
    @Column(name = "oper_ip", nullable = true, length = 50)
    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    @Basic
    @Column(name = "oper_location", nullable = true, length = 255)
    public String getOperLocation() {
        return operLocation;
    }

    public void setOperLocation(String operLocation) {
        this.operLocation = operLocation;
    }

    @Basic
    @Column(name = "oper_param", nullable = true, length = 2000)
    public String getOperParam() {
        return operParam;
    }

    public void setOperParam(String operParam) {
        this.operParam = operParam;
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
    @Column(name = "error_msg", nullable = true, length = 2000)
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Basic
    @Column(name = "oper_time", nullable = true)
    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysOperLogEntity that = (AdminSysOperLogEntity) o;

        if (operId != that.operId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (businessType != null ? !businessType.equals(that.businessType) : that.businessType != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (requestMethod != null ? !requestMethod.equals(that.requestMethod) : that.requestMethod != null)
            return false;
        if (operatorType != null ? !operatorType.equals(that.operatorType) : that.operatorType != null) return false;
        if (operName != null ? !operName.equals(that.operName) : that.operName != null) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;
        if (operUrl != null ? !operUrl.equals(that.operUrl) : that.operUrl != null) return false;
        if (operIp != null ? !operIp.equals(that.operIp) : that.operIp != null) return false;
        if (operLocation != null ? !operLocation.equals(that.operLocation) : that.operLocation != null) return false;
        if (operParam != null ? !operParam.equals(that.operParam) : that.operParam != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (errorMsg != null ? !errorMsg.equals(that.errorMsg) : that.errorMsg != null) return false;
        return operTime != null ? operTime.equals(that.operTime) : that.operTime == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (operId ^ (operId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (businessType != null ? businessType.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (requestMethod != null ? requestMethod.hashCode() : 0);
        result = 31 * result + (operatorType != null ? operatorType.hashCode() : 0);
        result = 31 * result + (operName != null ? operName.hashCode() : 0);
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (operUrl != null ? operUrl.hashCode() : 0);
        result = 31 * result + (operIp != null ? operIp.hashCode() : 0);
        result = 31 * result + (operLocation != null ? operLocation.hashCode() : 0);
        result = 31 * result + (operParam != null ? operParam.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (errorMsg != null ? errorMsg.hashCode() : 0);
        result = 31 * result + (operTime != null ? operTime.hashCode() : 0);
        return result;
    }
}
