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

//    @NotBlank(message = "Không được để trống mã !")

    private String ma;



    private String ten;


    @Temporal(TemporalType.DATE)
    private Date ngaySinh;



    private String soDienThoai;

    @ManyToOne
    @JoinColumn(name = "dia_chi_id", referencedColumnName = "id")
    private DiaChi diaChi;

//    @Column(name = "ngay_tham_gia")
    @Temporal(TemporalType.DATE)
    private Date ngayThamGia;


    @Column(name = "loai_khach")
    private String loaiKhach;


    @Column(name = "mat_khau")
    private String matKhau;

//    @NotBlank(message = "Không được để trống người tạo !")
    @Column(name = "nguoi_tao")
    private String nguoiTao;

//    @NotBlank(message = "Không được để trống người sửa !")
    @Column(name = "nguoi_sua")
    private String nguoiSua;

    @Column(name = "ngay_tao")
    @Temporal(TemporalType.DATE)
    private Date ngayTao;

    @Column(name = "ngay_sua")
    @Temporal(TemporalType.DATE)
    private Date ngaySua;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
