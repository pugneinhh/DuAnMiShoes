package com.example.duanmishoes.model;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public interface AdminCTSPRespon {
   @Value("#{target.idCTSP}")
   String getIdCTSP();

    @Value("#{target.tenSP}")
    String getTenSP();

    @Value("#{target.tenKM}")
    String getTenKM();

    @Value("#{target.tenKT}")
    String getTenKT();

    @Value("#{target.tenMS}")
    String getTenMS();

    @Value("#{target.tenCL}")
    String getTenCL();

    @Value("#{target.tenDC}")
    String getTenDC();

    @Value("#{target.tenDM}")
    String getTenDM();

    @Value("#{target.tenH}")
    String getTenH();

    @Value("#{target.soLuong}")
    int getTenSoLuong();

    @Value("#{target.giaBan}")
    BigDecimal getGiaBan();

    @Value("#{target.trangThai}")
    String getTrangThai();
}
