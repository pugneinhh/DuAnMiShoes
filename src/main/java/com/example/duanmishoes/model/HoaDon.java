package com.example.duanmishoes.model;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "hoaDon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Data
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    @ManyToOne
    @JoinColumn(name = "nhan_vien_id")
    private NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;
    private Date ngayMua;
    private BigDecimal giaGoc;
    private BigDecimal giaGiamGia;
    private BigDecimal thanhTien;
    private String nguoiTao;
    private String nguoiSua;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;
}
