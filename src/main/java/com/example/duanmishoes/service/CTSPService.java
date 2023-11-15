package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminCTSPRespon;
import com.example.duanmishoes.model.AdminSanPhamRespon;
import com.example.duanmishoes.model.ChiTietSanPham;
import com.example.duanmishoes.respon.CTSPRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CTSPService {
    @Autowired
    CTSPRespon ctspRespon;
    public List<ChiTietSanPham> getALL(){
        return ctspRespon.findAll();
    }
    public List<AdminCTSPRespon> getALLCTSP(UUID id){
        return ctspRespon.getALLCTSP(id);
    }
}
