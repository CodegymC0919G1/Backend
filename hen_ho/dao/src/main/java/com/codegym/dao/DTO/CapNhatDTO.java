package com.codegym.dao.DTO;

import com.codegym.dao.entity.ThanhVien;
import org.springframework.web.multipart.MultipartFile;

public class CapNhatDTO {
    private MultipartFile uploadData;
    private ThanhVien thanhvien;

    public CapNhatDTO() {
    }

    public CapNhatDTO(MultipartFile uploadData, ThanhVien thanhvien) {
        this.uploadData = uploadData;
        this.thanhvien = thanhvien;
    }

    public MultipartFile getUploadData() {
        return uploadData;
    }

    public void setUploadData(MultipartFile uploadData) {
        this.uploadData = uploadData;
    }

    public ThanhVien getThanhvien() {
        return thanhvien;
    }

    public void setThanhvien(ThanhVien thanhvien) {
        this.thanhvien = thanhvien;
    }

}
