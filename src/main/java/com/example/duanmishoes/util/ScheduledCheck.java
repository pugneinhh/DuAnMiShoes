package com.example.duanmishoes.util;

import com.example.duanmishoes.model.KhuyenMai;
import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.respon.KhuyenMaiRespon;
import com.example.duanmishoes.respon.VoucherRespon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
@Slf4j
public class ScheduledCheck {
    private KhuyenMaiRespon khuyenMaiRespon;

    private VoucherRespon voucherRespon;

    @Autowired
    public void setKhuyenMaiRespon(KhuyenMaiRespon khuyenMaiRespon){
        this.khuyenMaiRespon = khuyenMaiRespon;
    }

    @Autowired
    public void setVoucherRespon(VoucherRespon voucherRespon){
        this.voucherRespon = voucherRespon;
    }

    @Scheduled(fixedDelayString = "${config.fixedDelayMillis}")
    public void checkKhuyenMai(){
        List<KhuyenMai> khuyenMaiList = khuyenMaiRespon.findAll();
        try {
            khuyenMaiList.forEach(km -> {
//                System.out.println("Kết thúc:"+km.getNgay_ket_thuc());
                if (km.getNgay_bat_dau().isBefore(LocalDateTime.now()) && km.getNgay_ket_thuc().isAfter(LocalDateTime.now())){
                    km.setTrang_thai(1);
                    khuyenMaiRespon.save(km);
                }
                else if (km.getNgay_ket_thuc().isBefore(LocalDateTime.now())) {
                    km.setTrang_thai(2);
                    khuyenMaiRespon.save(km);
                }
            });
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Scheduled(fixedDelayString = "${config.fixedDelayMillis}")
    public void checkVoucher(){
        LocalDate localDate = LocalDate.now();
        Date currentDate = Date.valueOf(localDate);
        List<Voucher> voucherList = voucherRespon.findAll();
        try {
            voucherList.forEach(v -> {
                if (v.getNgayKetThuc().compareTo(currentDate) < 0) {
                    v.setTrangThai(2);
                    voucherRespon.save(v);
                }
            });
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}