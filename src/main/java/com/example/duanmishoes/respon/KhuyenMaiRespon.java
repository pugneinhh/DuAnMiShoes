package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.KhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface KhuyenMaiRespon extends JpaRepository<KhuyenMai,UUID> {


}

