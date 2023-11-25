package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminKhachHangRepon;
import com.example.duanmishoes.model.KhachHang;
import com.example.duanmishoes.respon.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class KhachHangService{
    @Autowired
    KhachHangRepository khachHangRepository;

    public List<AdminKhachHangRepon> getAll() {
        return khachHangRepository.getAllKH();
    }

    public KhachHang add(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }
}
