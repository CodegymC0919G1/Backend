package com.codegym.dao.DTO;

import java.util.List;

public class DetailNhomThanhVienDTO {
    private String hoTenAdmin;
    private List hoTenThanhVien;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoTenAdmin() {
        return hoTenAdmin;
    }

    public void setHoTenAdmin(String hoTenAdmin) {
        this.hoTenAdmin = hoTenAdmin;
    }

    public List getHoTenThanhVien() {
        return hoTenThanhVien;
    }

    public void setHoTenThanhVien(List<String> hoTenThanhVien) {
        this.hoTenThanhVien = hoTenThanhVien;
    }
}
