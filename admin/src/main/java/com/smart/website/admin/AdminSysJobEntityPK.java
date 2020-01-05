package com.smart.website.admin;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AdminSysJobEntityPK implements Serializable {
    private long jobId;
    private String jobName;
    private String jobGroup;

    @Column(name = "job_id", nullable = false)
    @Id
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    @Column(name = "job_name", nullable = false, length = 64)
    @Id
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Column(name = "job_group", nullable = false, length = 64)
    @Id
    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysJobEntityPK that = (AdminSysJobEntityPK) o;

        if (jobId != that.jobId) return false;
        if (jobName != null ? !jobName.equals(that.jobName) : that.jobName != null) return false;
        if (jobGroup != null ? !jobGroup.equals(that.jobGroup) : that.jobGroup != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (jobId ^ (jobId >>> 32));
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobGroup != null ? jobGroup.hashCode() : 0);
        return result;
    }
}
