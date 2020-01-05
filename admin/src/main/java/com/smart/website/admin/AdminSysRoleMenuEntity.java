package com.smart.website.admin;

import javax.persistence.*;

@Entity
@Table(name = "admin_sys_role_menu", schema = "admin", catalog = "")
@IdClass(AdminSysRoleMenuEntityPK.class)
public class AdminSysRoleMenuEntity {
    private long roleId;
    private long menuId;

    @Id
    @Column(name = "role_id", nullable = false)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "menu_id", nullable = false)
    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminSysRoleMenuEntity that = (AdminSysRoleMenuEntity) o;

        if (roleId != that.roleId) return false;
        if (menuId != that.menuId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (menuId ^ (menuId >>> 32));
        return result;
    }
}
