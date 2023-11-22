package com.example.duanmishoes.service;

import com.example.duanmishoes.model.KhuyenMai;
import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.respon.KhuyenMaiRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KhuyenMaiService {
    @Autowired
    KhuyenMaiRespon khuyenMaiRespon;

    public List<KhuyenMai> getAllKhuyenMai(){
        return khuyenMaiRespon.findAll();
    }

    public KhuyenMai addKhuyenMai(KhuyenMai km){
        return khuyenMaiRespon.save(km);
    }
    public KhuyenMai detailKhuyenMai(UUID id){return khuyenMaiRespon.getById(id);}

}
