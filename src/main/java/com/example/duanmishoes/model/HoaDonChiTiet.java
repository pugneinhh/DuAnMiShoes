package com.example.duanmishoes.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "hoa_don_chi_tiet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class HoaDonChiTiet {
    @EmbeddedId
    private IDHoaDonChiTiet id;
    private int soLuong;
    private BigDecimal thanhTien;
    private String nguoiTao;
    private String nguoiSua;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;
}
