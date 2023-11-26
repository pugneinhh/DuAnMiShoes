package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminMauSacRespon;
import com.example.duanmishoes.model.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface MauSacRespon extends JpaRepository<MauSac, UUID> {
    @Query(value = """
    SELECT o.id as id,o.ma as ma ,o.ten as ten, o.trang_thai as trangThai FROM mau_sac o ORDER BY o.ma DESC
            """, nativeQuery = true)
    List<AdminMauSacRespon> getALLMS();
}
