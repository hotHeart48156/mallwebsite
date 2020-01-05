package com.smart.website.admin;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "admin_sys_job_log", schema = "admin", catalog = "")
public class AdminSysJobLogEntity {
    private long jobLogId;
    private String jobName;
    private String jobGroup;
    private String invokeTarget;
    private String jobMessage;
    private String status;
    private String exceptionInfo;
    private Timestamp createTime;

    @Id
    @Column(name = "job_log_id", nullable = false)
    public long getJobLogId() {
        return jobLogId;
    }

    public void setJobLogId(long jobLogId) {
        this.jobLogId = jobLogId;
    }

    @Basic
    @Column(name = "job_name", nullable = false, length = 64)
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Basic
    @Column(name = "job_group", nullable = false, length = 64)
    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    @Basic
    @Column(name = "invoke_target", nullable = false, length = 500)
    public String getInvokeTarget() {
        return invokeTarget;
    }

    public void setInvokeTarget(String invokeTarget) {
        this.invokeTarget = invokeTarget;
    }

    @Basic
    @Column(name = "job_message", nullable = true, length = 500)
    public String getJobMessage() {
        return jobMessage;
    }

    public void setJobMessage(String jobMessage) {
        this.jobMessage = jobMessage;
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
    @Column(name = "exception_info", nullable = true, length = 2000)
    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysJobLogEntity that = (AdminSysJobLogEntity) o;

        if (jobLogId != that.jobLogId) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;
        if (invokeTarget != null ? !invokeTarget.equals(that.invokeTarget) : that.invokeTarget != null) return false;
        if (jobMessage != null ? !jobMessage.equals(that.jobMessage) : that.jobMessage != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (exceptionInfo != null ? !exceptionInfo.equals(that.exceptionInfo) : that.exceptionInfo != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobLogId ^ (jobLogId >>> 32));
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
        result = 31 * result + (invokeTarget != null ? invokeTarget.hashCode() : 0);
        result = 31 * result + (jobMessage != null ? jobMessage.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (exceptionInfo != null ? exceptionInfo.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
