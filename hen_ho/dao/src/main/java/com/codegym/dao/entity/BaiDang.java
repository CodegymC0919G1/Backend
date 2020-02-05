package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="bai_dang")
public class BaiDang {

    @Id
    @Column(name = "id_bai_dang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBaiDang;

    @Column(name = "tieu_de")
    private String tieuDe;

    @Column(name = "anh")
    private String anh;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "xoa")
    private boolean xoa;

    @Column(name = "thoi_gian_dang")
    private Date thoiGianDang;

    @ManyToOne
    @JoinColumn(name = "id_nguoi_dang")
    private ThanhVien thanhVienDang;

    @ManyToOne
    @JoinColumn(name = "id_hoi_nhom")
    private HoiNhom idHoiNhom;

    public BaiDang(String tieuDe, String anh, String noiDung, boolean xoa, Date thoiGianDang, ThanhVien thanhVienDang, HoiNhom idHoiNhom) {
        this.tieuDe = tieuDe;
        this.anh = anh;
        this.noiDung = noiDung;
        this.xoa = xoa;
        this.thoiGianDang = thoiGianDang;
        this.thanhVienDang = thanhVienDang;
        this.idHoiNhom = idHoiNhom;
    }

    public int getIdBaiDang() {
        return idBaiDang;
    }

    public void setIdBaiDang(int idBaiDang) {
        this.idBaiDang = idBaiDang;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public boolean isXoa() {
        return xoa;
    }

    public void setXoa(boolean xoa) {
        this.xoa = xoa;
    }

    public Date getThoiGianDang() {
        return thoiGianDang;
    }

    public void setThoiGianDang(Date thoiGianDang) {
        this.thoiGianDang = thoiGianDang;
    }

    public ThanhVien getThanhVienDang() {
        return thanhVienDang;
    }

    public void setThanhVienDang(ThanhVien thanhVienDang) {
        this.thanhVienDang = thanhVienDang;
    }

    public BaiDang() {
    }

    public HoiNhom getIdHoiNhom() {
        return idHoiNhom;
    }

    public void setIdHoiNhom(HoiNhom idHoiNhom) {
        this.idHoiNhom = idHoiNhom;
    }
}
