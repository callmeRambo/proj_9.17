package com.unsw.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    private int adminUid;

    @Id
    @Column(name = "admin_uid", nullable = false)
    public int getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(int adminUid) {
        this.adminUid = adminUid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (adminUid != admin.adminUid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return adminUid;
    }
}
