package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Role {
    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(name = "role_name")
    private String roleName;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }
}