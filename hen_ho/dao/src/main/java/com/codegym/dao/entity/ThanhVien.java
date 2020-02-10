package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "thanh_vien")
public class ThanhVien {
    @Id
    @Column(name = "id_thanh_vien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idThanhVien;

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
    private byte[] anhDaiDien;

    @Column(name = "so_lan_canh_cao")
    private Integer soLanCanhcao;

    @Column(name = "xu")
    private Integer xu;


    @Column(name = "luot_thich")
    private Integer luotThich;

    @Column(name = "trang_thai_dang_nhap")
    private Integer trangThaiDangNhap;

    @Column(name = "khoa")
    private boolean khoa;

    @Column(name = "muc_dich_tham_gia")
    private String mucDichThamGia;

    @Column(name = "nghe_nghiep")
    private String ngheNghiep;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    public ThanhVien() {
    }


    public long getIdThanhVien() {
        return idThanhVien;
    }

    public void setIdThanhVien(long idThanhVien) {
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

    public byte[] getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(byte[] anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public Integer getSoLanCanhcao() {
        return soLanCanhcao;
    }

    public void setSoLanCanhcao(Integer soLanCanhcao) {
        this.soLanCanhcao = soLanCanhcao;
    }

    public Integer getXu() {
        return xu;
    }

    public void setXu(Integer xu) {
        this.xu = xu;
    }

    public Integer getLuotThich() {
        return luotThich;
    }

    public void setLuotThich(Integer luotThich) {
        this.luotThich = luotThich;
    }

    public Integer getTrangThaiDangNhap() {
        return trangThaiDangNhap;
    }

    public void setTrangThaiDangNhap(Integer trangThaiDangNhap) {
        this.trangThaiDangNhap = trangThaiDangNhap;
    }

    public boolean isKhoa() {
        return khoa;
    }

    public void setKhoa(boolean khoa) {
        this.khoa = khoa;
    }

    public String getMucDichThamGia() {
        return mucDichThamGia;
    }

    public void setMucDichThamGia(String mucDichThamGia) {
        this.mucDichThamGia = mucDichThamGia;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ThanhVien{" +
                "idThanhVien=" + idThanhVien +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tinhTrangHonNhan='" + tinhTrangHonNhan + '\'' +
                ", anhDaiDien='" + anhDaiDien + '\'' +
                ", soLanCanhcao=" + soLanCanhcao +
                ", xu=" + xu +
                ", luotThich=" + luotThich +
                ", trangThaiDangNhap=" + trangThaiDangNhap +
                ", khoa=" + khoa +
                ", mucDichThamGia='" + mucDichThamGia + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", user=" + user +
                '}';
    }
}


