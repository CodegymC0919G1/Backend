package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="hoi_nhom")
public class HoiNhom {
    @Id
    @Column(name = "id_hoi_nhom")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHoiNhom;

    @Column(name = "ngay_thanh_lap")
    private Date ngayThanhLap;

    @Column(name = "so_thanh_vien")
    private int soThanhVien;

    @Column(name = "so_lan_canh_cao")
    private int soLanCanhCao;

    public int getIdHoiNhom() {
        return idHoiNhom;
    }

    public void setIdHoiNhom(int idHoiNhom) {
        this.idHoiNhom = idHoiNhom;
    }

    public Date getNgayThanhLap() {
        return ngayThanhLap;
    }

    public void setNgayThanhLap(Date ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoLanCanhCao() {
        return soLanCanhCao;
    }

    public void setSoLanCanhCao(int soLanCanhCao) {
        this.soLanCanhCao = soLanCanhCao;
    }

    public HoiNhom(Date ngayThanhLap, int soThanhVien, int soLanCanhCao) {
        this.ngayThanhLap = ngayThanhLap;
        this.soThanhVien = soThanhVien;
        this.soLanCanhCao = soLanCanhCao;
    }

    public HoiNhom() {
    }
}
