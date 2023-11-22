package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminMauSacRespon;
import com.example.duanmishoes.model.MauSac;
import com.example.duanmishoes.respon.MauSacRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MauSacService {
    @Autowired
    MauSacRespon mauSacRespon;
    public List<MauSac> getALL(){
        return mauSacRespon.findAll();
    }
    public List<AdminMauSacRespon> getALLMS(){
        return mauSacRespon.getALLMS();
    }
    public MauSac addMS(MauSac ms){return mauSacRespon.save(ms);}
}
