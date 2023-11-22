package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminDoCaoRespon;
import com.example.duanmishoes.model.DoCao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface DoCaoRespon extends JpaRepository<DoCao, UUID> {
    @Query(value = """
    SELECT o.ma as ma ,o.ten as ten, o.trang_thai as trangThai FROM do_cao o ORDER BY o.ma ASC
            """, nativeQuery = true)
    List<AdminDoCaoRespon> getALLDC();
}
