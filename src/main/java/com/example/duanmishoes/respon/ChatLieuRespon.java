package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminChatLieuRespon;
import com.example.duanmishoes.model.ChatLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ChatLieuRespon extends JpaRepository<ChatLieu, UUID> {
    @Query(value = """
    SELECT o.ma as ma ,o.ten as ten, o.trang_thai as trangThai FROM chat_lieu o
            """, nativeQuery = true)
    List<AdminChatLieuRespon> getALLCL();
}
