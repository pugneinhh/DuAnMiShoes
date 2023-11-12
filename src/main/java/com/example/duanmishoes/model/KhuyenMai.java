package com.example.duanmishoes.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "khuyen_mai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String ma;
    private String ten;
    private double khuyen_mai_toi_da;
    private LocalDateTime ngay_bat_dau;
    private LocalDateTime ngay_ket_thuc;
    private String loai;
    private String nguoi_tao;
    private String nguoi_sua;
    private Date ngay_tao;
    private Date ngay_sua;
    private Integer trang_thai;

    @Override
    public String toString() {
        return ten;

    }

    public String formatCurrency(){
        Locale loc = new Locale("vi","VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
        return  nf.format(this.khuyen_mai_toi_da);

    }

    public String formatDate(LocalDateTime ldt){
        return ldt.getHour()+":"+ldt.getMinute()+ " - "+ldt.getDayOfMonth()+"/"+ldt.getMonthValue()+"/"+ldt.getYear();
    }
}
