package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminChucVuRespon;
import com.example.duanmishoes.model.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu, UUID> {
    @Query(value = """
    SELECT o.ma as ma ,o.ten as ten, o.trang_thai as trangThai FROM chuc_vu o
            """, nativeQuery = true)
    List<AdminChucVuRespon> getALLCV();
}
