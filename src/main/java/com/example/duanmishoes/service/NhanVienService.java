package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminNhanVienRespon;
import com.example.duanmishoes.model.NhanVien;
import com.example.duanmishoes.respon.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NhanVienService {

    @Autowired
    NhanVienRepository nhanVienRepository;

    public List<AdminNhanVienRespon> getAll() {
        return nhanVienRepository.getAllNV();
    }

    public NhanVien add(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

}
