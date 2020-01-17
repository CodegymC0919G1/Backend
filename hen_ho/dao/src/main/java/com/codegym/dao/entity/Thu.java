package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="thu")
public class Thu {
    @Id
    @Column(name = "id_thu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idThu;

    @Column(name = "tieu_de")
    private String tieuDe;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "thoi_gian_gui")
    private Date thoiGianGui;

    @Column(name = "xem")
    private boolean xem;

    @Column(name = "xoa")
    private boolean xoa;

    @ManyToOne
    @JoinColumn(name = "id_nguoi_nhan")
    private ThanhVien thanhVienNhan;

    @ManyToOne
    @JoinColumn(name = "id_nguoi_gui")
    private ThanhVien thanhVienGui;

    public int getIdThu() {
        return idThu;
    }

    public void setIdThu(int idThu) {
        this.idThu = idThu;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Date getThoiGianGui() {
        return thoiGianGui;
    }

    public void setThoiGianGui(Date thoiGianGui) {
        this.thoiGianGui = thoiGianGui;
    }

    public boolean isXem() {
        return xem;
    }

    public void setXem(boolean xem) {
        this.xem = xem;
    }

    public boolean isXoa() {
        return xoa;
    }

    public void setXoa(boolean xoa) {
        this.xoa = xoa;
    }

    public ThanhVien getThanhVienNhan() {
        return thanhVienNhan;
    }

    public void setThanhVienNhan(ThanhVien thanhVienNhan) {
        this.thanhVienNhan = thanhVienNhan;
    }

    public ThanhVien getThanhVienGui() {
        return thanhVienGui;
    }

    public void setThanhVienGui(ThanhVien thanhVienGui) {
        this.thanhVienGui = thanhVienGui;
    }

    public Thu() {
    }

    public Thu(String tieuDe, String noiDung, Date thoiGianGui, boolean xem, boolean xoa, ThanhVien thanhVienNhan, ThanhVien thanhVienGui) {
        this.tieuDe = tieuDe;
        this.noiDung = noiDung;
        this.thoiGianGui = thoiGianGui;
        this.xem = xem;
        this.xoa = xoa;
        this.thanhVienNhan = thanhVienNhan;
        this.thanhVienGui = thanhVienGui;
    }

}
