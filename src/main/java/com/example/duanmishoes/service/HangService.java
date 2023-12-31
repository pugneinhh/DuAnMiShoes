package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminHangRespon;
import com.example.duanmishoes.respon.HangRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangService {
    @Autowired
    HangRespon hangRespon;

    public List<AdminHangRespon> getALLH(){
        return hangRespon.getALLH();
    }
}
