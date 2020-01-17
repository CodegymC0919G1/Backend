package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="nhom_thanh_vien")
public class NhomThanhVien {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_admin_nhom")
    private ThanhVien thanhVienAdmin;

    @ManyToOne
    @JoinColumn(name = "id_hoi_vien")
    private ThanhVien thanhVienHoiVien;

    @ManyToOne
    @JoinColumn(name = "id_hoi_nhom")
    private HoiNhom hoiNhom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ThanhVien getThanhVienAdmin() {
        return thanhVienAdmin;
    }

    public void setThanhVienAdmin(ThanhVien thanhVienAdmin) {
        this.thanhVienAdmin = thanhVienAdmin;
    }

    public ThanhVien getThanhVienHoiVien() {
        return thanhVienHoiVien;
    }

    public void setThanhVienHoiVien(ThanhVien thanhVienHoiVien) {
        this.thanhVienHoiVien = thanhVienHoiVien;
    }

    public HoiNhom getHoiNhom() {
        return hoiNhom;
    }

    public void setHoiNhom(HoiNhom hoiNhom) {
        this.hoiNhom = hoiNhom;
    }

    public NhomThanhVien(ThanhVien thanhVienAdmin, ThanhVien thanhVienHoiVien, HoiNhom hoiNhom) {
        this.thanhVienAdmin = thanhVienAdmin;
        this.thanhVienHoiVien = thanhVienHoiVien;
        this.hoiNhom = hoiNhom;
    }

    public NhomThanhVien() {
    }
}
