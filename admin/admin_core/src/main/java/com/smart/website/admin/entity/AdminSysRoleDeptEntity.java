package com.smart.website.admin.entity;

import javax.persistence.*;

@Entity
@Table(name = "admin_sys_role_dept", schema = "admin", catalog = "")
@IdClass(AdminSysRoleDeptEntityPK.class)
public class AdminSysRoleDeptEntity {
    private long roleId;
    private long deptId;

    @Id
    @Column(name = "role_id", nullable = false)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "dept_id", nullable = false)
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

        AdminSysRoleDeptEntity that = (AdminSysRoleDeptEntity) o;

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
