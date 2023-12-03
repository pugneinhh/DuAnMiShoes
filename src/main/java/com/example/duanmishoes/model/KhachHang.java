package com.example.duanmishoes.model;

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
import lombok.ToString;

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

    private String ma;

    private String ten;

    private Date ngaySinh;

    private String soDienThoai;

    private String email;

    private String anh;

    private Date ngayThamGia;

    private String loaiKhach;

    private String matKhau;

    private String nguoiTao;

    private String nguoiSua;

    private Date ngayTao;

    private Date ngaySua;

    private Integer trangThai;

}
