package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminChucVuRespon;
import com.example.duanmishoes.model.ChucVu;
import com.example.duanmishoes.respon.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ChucVuService {
    @Autowired
    ChucVuRepository chucVuRepository;

    public List<AdminChucVuRespon> getAllCV() {
        return chucVuRepository.getALLCV();
    }


}
