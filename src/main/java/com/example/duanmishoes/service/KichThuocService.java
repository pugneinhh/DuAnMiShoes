package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminKichThuocRespon;
import com.example.duanmishoes.respon.KichThuocRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KichThuocService {
    @Autowired
    KichThuocRespon kichThuocRespon;

    public List<AdminKichThuocRespon> getALLKT(){
        return kichThuocRespon.getALLKT();
    }
}
