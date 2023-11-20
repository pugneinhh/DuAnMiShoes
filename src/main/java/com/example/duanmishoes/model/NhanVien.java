package com.example.duanmishoes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Table(name ="nhan_vien")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NhanVien {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "chuc_vu_id", referencedColumnName = "id")
    private ChucVu chucVu;

    @NotEmpty(message = "Mã không được để trống")
    private String ma;

    @NotEmpty(message = "Họ và tên không được để trống")
    private String ten;


    private String anh;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    private Date ngaySinh;

    @NotEmpty(message = "SĐT không được để trống")
    @Pattern(regexp = "^[0-9]{10,11}$", message = "Số điện thoại phải có từ 10 đến 11 chữ số")
    private String sdt;

    @NotEmpty(message = "Email không được để trống")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@fpt\\.edu\\.vn$", message = "Email phải có đuôi @fpt.edu.vn")
    private String email;

    private String cccd;

    private String thanhPho;


    private String huyen;


    private String xa;

    private String diaChiCuThe;

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
