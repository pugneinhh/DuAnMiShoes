package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminKhachHangRepon;
import com.example.duanmishoes.model.AdminNhanVienRespon;
import com.example.duanmishoes.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, UUID> {
    @Query(value ="""
SELECT khach_hang.id AS idKH, khach_hang.ma AS maKH, khach_hang.ten AS tenKH, khach_hang.so_dien_thoai AS sdt, khach_hang.email AS email, khach_hang.anh AS anh, khach_hang.trang_thai AS trangThaiKH
  from khach_hang
    """, nativeQuery = true)
    List<AdminKhachHangRepon> getAllKH();
}
