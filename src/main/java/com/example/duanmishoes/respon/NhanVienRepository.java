package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminNhanVienRespon;
import com.example.duanmishoes.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, UUID> {
    @Query(value ="""
SELECT nv.id AS idNV,  nv.anh AS anhNV, nv.ma AS maNV, nv.ten AS tenNV,
 nv.so_dien_thoai AS SDT,nv.email AS email, nv.trang_thai AS trangThai, cv.ten AS tenCV
FROM     chuc_vu cv INNER JOIN nhan_vien nv ON cv.id = nv.chuc_vu_id
    """, nativeQuery = true)
    List<AdminNhanVienRespon> getAllNV();

    Boolean existsByEmail(String email);
}
