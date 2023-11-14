package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.Voucher;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
@Repository
public interface VoucherRespon extends JpaRepository<Voucher,UUID> {
    @Query(value ="SELECT * from voucher v WHERE v.ma LIKE %:key% or phuong_thuc LIKE :key and ngay_bat_dau between :ngayBD and :ngayKT and ngay_ket_thuc between  :ngayBD and :ngayKT" ,nativeQuery = true)
    List<Voucher> search(@Param("key")String key,@Param("ngayBD")Date ngayBD,@Param("ngayKT")Date ngayKT);
}
