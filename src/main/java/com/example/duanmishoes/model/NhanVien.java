package com.example.duanmishoes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

    private String ma;

    private String ten;

    private String anh;

    private String gioiTinh;

    private Date ngaySinh;

    private String soDienThoai;

    private String email;

    private String matKhau;

    private String cccd;

    private String thanhPho;

    private String huyen;

    private String xa;

    private String diaChi;

    private String nguoiTao;

    private String nguoiSua;

    private Date ngayTao;

    private Date ngaySua;

    private Integer trangThai;
}
