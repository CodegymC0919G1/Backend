package com.codegym.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="thong_bao_thanh_vien")
public class ThongBaoThanhVien {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idThongBaoThanhVien;

    @ManyToOne
    @JoinColumn(name = "id_thanh_vien")
    private ThanhVien thanhVienThongBao;

    @ManyToOne
    @JoinColumn(name = "id_thong_bao")
    private ThongBao thongBao;

    public int getIdThongBaoThanhVien() {
        return idThongBaoThanhVien;
    }

    public void setIdThongBaoThanhVien(int idThongBaoThanhVien) {
        this.idThongBaoThanhVien = idThongBaoThanhVien;
    }

    public ThanhVien getThanhVienThongBao() {
        return thanhVienThongBao;
    }

    public void setThanhVienThongBao(ThanhVien thanhVienThongBao) {
        this.thanhVienThongBao = thanhVienThongBao;
    }

    public ThongBao getThongBao() {
        return thongBao;
    }

    public void setThongBao(ThongBao thongBao) {
        this.thongBao = thongBao;
    }

    public ThongBaoThanhVien(ThanhVien thanhVienThongBao, ThongBao thongBao) {
        this.thanhVienThongBao = thanhVienThongBao;
        this.thongBao = thongBao;
    }

    public ThongBaoThanhVien() {
    }
}