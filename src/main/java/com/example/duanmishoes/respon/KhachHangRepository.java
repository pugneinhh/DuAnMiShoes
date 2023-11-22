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
SELECT khach_hang.id AS idKH, khach_hang.ma AS maKH, khach_hang.ten AS tenKH, khach_hang.so_dien_thoai AS sdt, khach_hang.email AS email, khach_hang.image AS anh, khach_hang.trang_thai AS trangThaiKH, dia_chi.ten_nguoi_nhan AS tenNguoiNhan,\s
 dia_chi.so_dien_thoai AS sdtNguoiNhan, dia_chi.dia_chi AS diaChi, dia_chi.pho AS pho, dia_chi.phuong AS phuong, dia_chi.thanh_pho AS thanhPho, dia_chi.quoc_gia\s
FROM     dia_chi INNER JOIN
  khach_hang ON dia_chi.id = khach_hang.dia_chi_id
    """, nativeQuery = true)
    List<AdminKhachHangRepon> getAllKH();
}
