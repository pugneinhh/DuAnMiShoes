package com.example.duanmishoes.model;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;
@Entity
@Table(name = "voucher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
    private String phuongThuc;
    private Timestamp ngayBatDau;
    private Timestamp ngayKetThuc;
    private int mucDo;
    private BigDecimal giamToiDa;
    private BigDecimal dieuKien;
    private int soLuong;
    private String loaiVoucher;
    private String nguoiTao;
    private String nguoiSua;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;
}
