package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminNhanVienRespon;
import com.example.duanmishoes.model.NhanVien;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, UUID> {
    @Query(value ="""
SELECT nv.id AS idNV, cv.ma AS maCV , nv.ma AS maNV, nv.ten AS tenNV, nv.anh AS anhNV, nv.gioi_tinh AS gioiTinh, nv.ngay_sinh AS ngaySinh, nv.so_dien_thoai AS SDT, nv.email AS email, nv.cccd AS cccd, nv.thanhPho AS thanhPho, nv.huyen AS huyen,
nv.xa AS xa, nv.dia_chi_cu_the AS diaChiCuThe, nv.mat_khau AS matKhau, cv.id AS idCV
FROM     chuc_vu cv INNER JOIN nhan_vien nv ON cv.id = nv.chuc_vu_id
    """, nativeQuery = true)
    List<AdminNhanVienRespon> getAllNV();

    Boolean existsByEmail(String email);
}
