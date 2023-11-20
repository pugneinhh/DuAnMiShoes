package com.example.duanmishoes.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "khach_hang")
@Entity
public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "dia_chi_id", referencedColumnName = "id")
    private DiaChi diaChi;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "so_dien_thoai")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "image")
    private String image;

    @Column(name = "ngay_tham_gia")
    private Date ngayThamGia;

    @Column(name = "loai_khach")
    private String loaiKhach;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "nguoi_tao")
    private String nguoiTao;

    @Column(name = "nguoi_sua")
    private String nguoiSua;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
