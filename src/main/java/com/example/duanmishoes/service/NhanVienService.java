package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminNhanVienRespon;
import com.example.duanmishoes.model.NhanVien;
import com.example.duanmishoes.respon.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NhanVienService {

    @Autowired
    NhanVienRepository nhanVienRepository;

    public List<AdminNhanVienRespon> getAll() {
        return nhanVienRepository.getAllNV();
    }

    public Optional<NhanVien> detail(UUID id) {
        return nhanVienRepository.findById(id);
    }

    public NhanVien add(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    public Boolean update(NhanVien nhanVien, UUID idNhanVien) {
        nhanVienRepository.save(nhanVien);
        return true;
    }

    public Boolean delete(NhanVien nhanVien) {
        nhanVienRepository.delete(nhanVien);
        return true;
    }

    public Boolean isEmailExists(String email) {
        return nhanVienRepository.existsByEmail(email);
    }


}
