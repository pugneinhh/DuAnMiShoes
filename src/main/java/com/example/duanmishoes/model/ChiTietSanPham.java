package com.example.duanmishoes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "chi_tiet_san_pham")
@Data

public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn (name = "san_pham_id")
    private SanPham sanPham;
    @ManyToOne
    @JoinColumn (name = "khuyen_mai_id")
    private KhuyenMai khuyenMai;
    @ManyToOne
    @JoinColumn (name = "kich_thuoc_id")
    private KichThuoc kichThuoc;
    @ManyToOne
    @JoinColumn (name = "mau_sac_id")
    private MauSac mauSac;
    @ManyToOne
    @JoinColumn (name = "chat_lieu_id")
    private ChatLieu chatLieu;
    @ManyToOne
    @JoinColumn (name = "do_cao_id")
    private DoCao doCao;
    @ManyToOne
    @JoinColumn (name = "danh_muc_id")
    private DanhMuc danhMuc;
    @ManyToOne
    @JoinColumn (name = "hang_id")
    private Hang hang;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;
    private String moTa;
    private Date ngayTao;
    private Date ngaySua;
    private int soLuong;
    private String nguoiTao;
    private String nguoiSua;
    private int trangThai;
}
