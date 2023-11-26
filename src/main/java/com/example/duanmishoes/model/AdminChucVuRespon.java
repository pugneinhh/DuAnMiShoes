package com.example.duanmishoes.model;

import org.springframework.beans.factory.annotation.Value;

public interface AdminChucVuRespon {

    @Value("#{target.idCV}")
    String getIdCV();

    @Value("#{target.ma}")
    String getMa();

    @Value("#{target.ten}")
    String getTen();

}
