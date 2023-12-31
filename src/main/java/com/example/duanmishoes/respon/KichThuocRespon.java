package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminKichThuocRespon;
import com.example.duanmishoes.model.KichThuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface KichThuocRespon extends JpaRepository<KichThuoc, UUID> {
    @Query(value = """
    SELECT o.ma as ma ,o.ten as ten, o.trang_thai as trangThai FROM kich_thuoc o
            """, nativeQuery = true)
    List<AdminKichThuocRespon> getALLKT();
}
