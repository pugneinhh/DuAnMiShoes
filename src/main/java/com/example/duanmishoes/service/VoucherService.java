package com.example.duanmishoes.service;

import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.respon.VoucherRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
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
}
