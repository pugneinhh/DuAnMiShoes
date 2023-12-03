package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminDanhMucRespon;
import com.example.duanmishoes.model.DanhMuc;
import com.example.duanmishoes.model.sanPhamSearch.DanhMucSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface DanhMucRespon extends JpaRepository<DanhMuc, UUID> {
    @Query(value = """
    SELECT dm.id as id,dm.ma as ma ,dm.ten as ten, dm.trang_thai as trangThai FROM danh_muc dm ORDER BY dm.ma DESC 
            """, nativeQuery = true)
    List<AdminDanhMucRespon> getALLDM();
    @Query(value = """
    SELECT dm.id as id,dm.ma as ma ,dm.ten as ten, dm.trang_thai as trangThai FROM danh_muc dm WHERE 
     (:#{#danhMucSearch.tenDM} IS NULL OR dm.ma LIKE (%:#{#danhMucSearch.tenDM}%) OR dm.ten LIKE (%:#{#danhMucSearch.tenDM}%) ) AND
     ( :#{#danhMucSearch.trangThaiDM} IS NULL OR dm.trang_thai=:#{#danhMucSearch.trangThaiDM})
    ORDER BY dm.ma DESC
            """, nativeQuery = true)
    List<AdminDanhMucRespon> timDM(DanhMucSearch danhMucSearch);
}
