package com.codegym.dao.DTO;
import java.sql.Date;
import com.codegym.dao.entity.HoiNhom;
import com.codegym.dao.entity.ThanhVien;

public class BaiDangDTO {

    private int idBaiDang;
    private String tieuDe;
    private String anh;
    private String noiDung;
    private boolean xoa;
    private Date thoiGianDang;
    private ThanhVien thanhVienDang;
    private HoiNhom idHoiNhom;

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

    public HoiNhom getIdHoiNhom() {
        return idHoiNhom;
    }

    public void setIdHoiNhom(HoiNhom idHoiNhom) {
        this.idHoiNhom = idHoiNhom;
    }
    public BaiDangDTO() {
        //contrutor
    }
}
