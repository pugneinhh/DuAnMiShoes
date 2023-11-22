
package com.example.duanmishoes.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "dia_chi")
@Entity
public class DiaChi {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ten_nguoi_nhan")
    private String ten;

    @Column(name = "so_dien_thoai")
    private String sdt;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "pho")
    private String pho;

    @Column(name = "phuong")
    private String phuong;

    @Column(name = "thanh_pho")
    private String thanhPho;

    @Column(name = "quoc_gia")
    private String quocGia;

    @Column(name = "trang_thai")
    private Integer trangThai;

}
