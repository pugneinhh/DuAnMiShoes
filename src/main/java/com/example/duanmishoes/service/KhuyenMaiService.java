package com.example.duanmishoes.service;

import com.example.duanmishoes.model.KhuyenMai;
import com.example.duanmishoes.respon.KhuyenMaiRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiService {
    @Autowired
    KhuyenMaiRespon khuyenMaiRespon;

    public List<KhuyenMai> getAllKhuyenMai(){
        return khuyenMaiRespon.findAll();
    }
}
