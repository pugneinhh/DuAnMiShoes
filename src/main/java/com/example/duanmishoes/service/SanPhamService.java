package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminSanPhamRespon;
import com.example.duanmishoes.model.SanPham;
import com.example.duanmishoes.respon.SanPhamRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    SanPhamRespon sanPhamRespon;
    public List<SanPham> getALL(){
        return sanPhamRespon.findAll();
    }
    public List<AdminSanPhamRespon> getALLSP(){
        return sanPhamRespon.getALLSP();
    }
    public SanPham addSP(SanPham sp){return sanPhamRespon.save(sp);}
}
