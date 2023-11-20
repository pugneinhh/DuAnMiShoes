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

    public Optional<KhachHang> detail(UUID id) {
        return khachHangRepository.findById(id);
    }

    public Boolean add(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
        return true;
    }

    public Boolean delete(KhachHang khachHang) {
        khachHangRepository.delete(khachHang);
        return true;
    }

    public Boolean update(KhachHang khachHang, UUID idKhachHang) {
        khachHangRepository.save(khachHang);
        return true;
    }
}
