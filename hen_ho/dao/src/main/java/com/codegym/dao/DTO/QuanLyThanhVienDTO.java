package com.codegym.dao.DTO;

import java.sql.Date;

public class QuanLyThanhVienDTO {
    private Long idThanhVien;
    private String hoTen;
    private boolean vip;
    private Date ngayThamGia;
    private Integer xu;
    private Integer soLanCanhCao;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Long getIdThanhVien() {
        return idThanhVien;
    }

    public void setIdThanhVien(Long idThanhVien) {
        this.idThanhVien = idThanhVien;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getNgayThamGia() {
        return ngayThamGia;
    }

    public void setNgayThamGia(Date ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public Integer getXu() {
        return xu;
    }

    public void setXu(Integer xu) {
        this.xu = xu;
    }

    public Integer getSoLanCanhCao() {
        return soLanCanhCao;
    }

    public void setSoLanCanhCao(Integer soLanCanhCao) {
        this.soLanCanhCao = soLanCanhCao;
    }
}
