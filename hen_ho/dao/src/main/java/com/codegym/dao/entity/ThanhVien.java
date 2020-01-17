package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="thanh_vien")
public class ThanhVien {
    @Id
    @Column(name = "id_thanh_vien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idThanhVien;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "email")
    private String email;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "tinh_trang_hon_nhan")
    private Boolean tinhTrangHonNhan;

    @Column(name = "anh_dai_dien")
    private String anhDaiDien;

    @Column(name = "so_lan_canh_cao")
    private int soLanCanhcao;

    @Column(name = "xu")
    private int xu;

    @Column(name = "luot_thich")
    private int luotThich;

    @Column(name = "trang_thai_dang_nhap")
    private int trangThaiDangNhap;

    @Column(name = "khoa")
    private boolean khoa;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;


    public int getIdThanhVien() {
        return idThanhVien;
    }

    public void setIdThanhVien(int idThanhVien) {
        this.idThanhVien = idThanhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(Boolean tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public String getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(String anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public int getSoLanCanhcao() {
        return soLanCanhcao;
    }

    public void setSoLanCanhcao(int soLanCanhcao) {
        this.soLanCanhcao = soLanCanhcao;
    }

    public int getXu() {
        return xu;
    }

    public void setXu(int xu) {
        this.xu = xu;
    }

    public int getLuotThich() {
        return luotThich;
    }

    public void setLuotThich(int luotThich) {
        this.luotThich = luotThich;
    }

    public int getTrangThaiDangNhap() {
        return trangThaiDangNhap;
    }

    public void setTrangThaiDangNhap(int trangThaiDangNhap) {
        this.trangThaiDangNhap = trangThaiDangNhap;
    }

    public boolean isKhoa() {
        return khoa;
    }

    public void setKhoa(boolean khoa) {
        this.khoa = khoa;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ThanhVien(String hoTen, String gioiTinh, Date ngaySinh, String email, String diaChi, Boolean tinhTrangHonNhan, String anhDaiDien, int soLanCanhcao, int xu, int luotThich, int trangThaiDangNhap, boolean khoa, User user) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.diaChi = diaChi;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.anhDaiDien = anhDaiDien;
        this.soLanCanhcao = soLanCanhcao;
        this.xu = xu;
        this.luotThich = luotThich;
        this.trangThaiDangNhap = trangThaiDangNhap;
        this.khoa = khoa;
        this.user = user;
    }

    public ThanhVien() {
    }
}