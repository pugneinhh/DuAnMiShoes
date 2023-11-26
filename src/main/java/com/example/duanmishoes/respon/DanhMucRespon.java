package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminDanhMucRespon;
import com.example.duanmishoes.model.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface DanhMucRespon extends JpaRepository<DanhMuc, UUID> {
    @Query(value = """
    SELECT dm.id as id,dm.ma as ma ,dm.ten as ten, dm.trang_thai as trangThai FROM danh_muc dm ORDER BY dm.ma DESC 
            """, nativeQuery = true)
    List<AdminDanhMucRespon> getALLDM();
    @Query(value = """
    SELECT dm.id as id,dm.ma as ma ,dm.ten as ten, dm.trang_thai as trangThai FROM danh_muc dm WHERE dm.ma LIKE %:key% OR dm.ten LIKE %:key% AND dm.trang_thai=:timTT ORDER BY dm.ma DESC
            """, nativeQuery = true)
    List<AdminDanhMucRespon> timDM(@Param("key") String key,@Param("timTT") int timTT);
}
