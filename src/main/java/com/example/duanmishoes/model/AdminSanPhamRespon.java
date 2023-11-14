package com.example.duanmishoes.model;

import org.springframework.beans.factory.annotation.Value;

public interface AdminSanPhamRespon {
    @Value("#{target.ma}")
    String getMa();

    @Value("#{target.ten}")
    String getTen();

    @Value("#{target.ma}")
    String getTrangThai();
}
