package com.example.duanmishoes.respon;


import com.example.duanmishoes.model.AdminMauSacRespon;
import com.example.duanmishoes.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SanPhamRespon extends JpaRepository<SanPham, UUID> {
}
