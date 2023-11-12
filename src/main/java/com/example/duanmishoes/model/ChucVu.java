
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
@Table(name = "chuc_vu")
@Entity
public class ChucVu {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

//    @NotBlank(message = "Không được để trống mã !")
    @Column(name = "ma")
    private String ma;


    @Column(name = "ten")
    private String ten;

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
