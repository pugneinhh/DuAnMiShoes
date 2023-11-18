package com.example.duanmishoes.service;

import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.respon.VoucherRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class VoucherService {
    @Autowired
    VoucherRespon vr;
    public List<Voucher> getAll(){
        return vr.findAll();
    }
    public List<Voucher> getTim(String key, Date ngayBD,Date ngayKT){
        return vr.search(key,ngayBD,ngayKT);
    }
    public Voucher addVoucher(Voucher v){
        return vr.save(v);
    }
    public Voucher detailVoucher(UUID id){return vr.getById(id);}
    @Scheduled(cron = "0 * * * * *",zone = "Asia/Saigon")
    public void checkHan(){
        Date now = new Date(new java.util.Date().getTime());
        for (Voucher x : vr.findAll()){
            if (x.getNgayKetThuc().before(now)) {
                x.setTrangThai(1);
                vr.save(x);
            }
        }
    }

}
