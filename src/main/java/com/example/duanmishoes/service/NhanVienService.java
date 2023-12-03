package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminNhanVienRespon;
import com.example.duanmishoes.model.NhanVien;
import com.example.duanmishoes.respon.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


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

    public boolean existByID(String id){
        return nhanVienRepository.existsById(UUID.fromString(id));
    }

    public void deleteByID(String id){
        nhanVienRepository.deleteById(UUID.fromString(id));
    }

}
