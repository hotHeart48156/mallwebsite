package com.smart.website.admin.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AdminSysRoleDeptEntityPK implements Serializable {
    private long roleId;
    private long deptId;

    @Column(name = "role_id", nullable = false)
    @Id
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "dept_id", nullable = false)
    @Id
    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysRoleDeptEntityPK that = (AdminSysRoleDeptEntityPK) o;

        if (roleId != that.roleId) return false;
        return deptId == that.deptId;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (deptId ^ (deptId >>> 32));
        return result;
    }
}
