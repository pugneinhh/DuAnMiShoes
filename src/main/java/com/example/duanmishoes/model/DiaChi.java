
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

    private String tenNguoiNhan;

    private String sdt;

    private String diaChi;

    private String pho;

    private String phuong;

    private String thanhPho;

    private String quocGia;

    private Integer trangThai;

}
