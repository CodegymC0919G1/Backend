package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="bao_cao")
public class BaoCao {
    @Id
    @Column(name = "id_bao_cao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBaoCao;

    @Column(name = "thoi_gian_bao_cao")
    private Date thoiGianBaoCao;

    @Column(name = "noi_dung")
    private String noiDung;

    @Column(name = "xu_ly")
    private boolean xuLy;

    @ManyToOne
    @JoinColumn(name = "id_nguoi_bao_cao")
    private ThanhVien thanhVienBaoCao;

    @ManyToOne
    @JoinColumn(name = "id_nguoi_bi_bao_cao")
    private ThanhVien thanhVienBiBaoCao;

    public long getIdBaoCao() {
        return idBaoCao;
    }

    public void setIdBaoCao(long idBaoCao) {
        this.idBaoCao = idBaoCao;
    }

    public Date getThoiGianBaoCao() {
        return thoiGianBaoCao;
    }

    public void setThoiGianBaoCao(Date thoiGianBaoCao) {
        this.thoiGianBaoCao = thoiGianBaoCao;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public boolean isXuLy() {
        return xuLy;
    }

    public void setXuLy(boolean xuLy) {
        this.xuLy = xuLy;
    }

    public ThanhVien getThanhVienBaoCao() {
        return thanhVienBaoCao;
    }

    public void setThanhVienBaoCao(ThanhVien thanhVienBaoCao) {
        this.thanhVienBaoCao = thanhVienBaoCao;
    }

    public ThanhVien getThanhVienBiBaoCao() {
        return thanhVienBiBaoCao;
    }

    public void setThanhVienBiBaoCao(ThanhVien thanhVienBiBaoCao) {
        this.thanhVienBiBaoCao = thanhVienBiBaoCao;
    }

    public BaoCao() {
    }

    public BaoCao(Date thoiGianBaoCao, String noiDung, boolean xuLy, ThanhVien thanhVienBaoCao, ThanhVien thanhVienBiBaoCao) {
        this.thoiGianBaoCao = thoiGianBaoCao;
        this.noiDung = noiDung;
        this.xuLy = xuLy;
        this.thanhVienBaoCao = thanhVienBaoCao;
        this.thanhVienBiBaoCao = thanhVienBiBaoCao;
    }

}