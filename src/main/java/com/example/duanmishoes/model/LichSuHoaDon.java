package com.example.duanmishoes.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="lichSuHoaDon")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
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
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;
}
