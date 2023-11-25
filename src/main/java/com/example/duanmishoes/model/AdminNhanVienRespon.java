package com.example.duanmishoes.model;

import org.springframework.beans.factory.annotation.Value;

public interface AdminNhanVienRespon {

    @Value("#{target.idNV}")
    String getIdNV();

    @Value("#{target.tenCV}")
    String getTenCV();

    @Value("#{target.anhNV}")
    String getAnh();

    @Value("#{target.maNV}")
    String getMaNV();

    @Value("#{target.tenNV}")
    String getTenNV();

    @Value("#{target.SDT}")
    String getSDT();

    @Value("#{target.email}")
    String getEmail();

    @Value("#{target.trangThai}")
    String getTrangThai();
}
