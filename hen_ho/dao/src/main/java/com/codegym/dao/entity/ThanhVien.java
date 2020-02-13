package com.codegym.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;


@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "thanh_vien")
public class ThanhVien {
    @Id
    @Column(name = "id_thanh_vien")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idThanhVien;

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
    private String tinhTrangHonNhan;

    @Lob
    @Column(name = "anh_dai_dien")
    private byte[] anhDaiDien;

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

    @Column(name = "muc_dich_tham_gia")
    private String mucDichThamGia;

    @Column(name = "nghe_nghiep")
    private String ngheNghiep;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    public ThanhVien(String hoTen, String gioiTinh, Date ngaySinh, String email, String diaChi, String tinhTrangHonNhan, byte[] anhDaiDien, int soLanCanhcao, int xu, int luotThich, int trangThaiDangNhap, boolean khoa, String mucDichThamGia, String ngheNghiep, User user) {
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
        this.mucDichThamGia = mucDichThamGia;
        this.ngheNghiep = ngheNghiep;
        this.user = user;
    }

    public Long getIdThanhVien() {
        return idThanhVien;
    }

    public void setIdThanhVien(Long idThanhVien) {
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

    public String getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public byte[] getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(byte[] anhDaiDien) {
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
                ", anhDaiDien=" + Arrays.toString(anhDaiDien) +
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
