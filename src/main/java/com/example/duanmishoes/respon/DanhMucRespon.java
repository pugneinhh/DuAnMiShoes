package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminDanhMucRespon;
import com.example.duanmishoes.model.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface DanhMucRespon extends JpaRepository<DanhMuc, UUID> {
    @Query(value = """
    SELECT dm.ma as ma ,dm.ten as ten, dm.trang_thai as trangThai FROM danh_muc dm
            """, nativeQuery = true)
    List<AdminDanhMucRespon> getALLDM();
}
