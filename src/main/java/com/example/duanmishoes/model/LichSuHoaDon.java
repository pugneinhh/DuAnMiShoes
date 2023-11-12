package com.example.duanmishoes.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
@Data
public class LichSuHoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "hoa_don_id")
    private HoaDon hoaDon;

    private String moTaHoatDong;
    private String nguoiTao;
    private String nguoiSua;
    private LocalDate ngayTao;
    private LocalDate ngaySua;
    private int trangThai;
}
