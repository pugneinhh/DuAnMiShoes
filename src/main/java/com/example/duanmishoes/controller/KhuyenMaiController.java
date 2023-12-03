package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.KhuyenMai;
import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.service.KhuyenMaiService;
//import com.example.duanmishoes.util.ScheduledCheck;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/khuyen-mai")
@RequiredArgsConstructor
public class KhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

//    private ScheduledCheck scheduledCheck;
    @GetMapping
    @Bean
    public ResponseEntity<?> getALL(){
//        scheduledCheck.checkKhuyenMai();
        return new ResponseEntity<>(khuyenMaiService.getAllKhuyenMai(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody KhuyenMai km){
        km.setNgay_tao(new Date(new java.util.Date().getTime()));
        LocalDateTime ngayBD =  km.getNgay_bat_dau();
        LocalDateTime ngayKT =  km.getNgay_ket_thuc();
        LocalDateTime today = LocalDateTime.now();
        if (ngayBD.isAfter(today)) km.setTrang_thai(0);
        else if (ngayBD.isBefore(today) && ngayKT.isAfter(today)) km.setTrang_thai(1);
        else if (ngayKT.isBefore(today)) km.setTrang_thai(2);
        km.setNgay_bat_dau(khuyenMaiService.convertTime(km.getNgay_bat_dau()));
        km.setNgay_ket_thuc(khuyenMaiService.convertTime(km.getNgay_ket_thuc()));

        return  ResponseEntity.ok(khuyenMaiService.addKhuyenMai(km));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id,@RequestBody KhuyenMai km){
        km.setId(UUID.fromString(id));
        km.setNgay_sua(new Date(new java.util.Date().getTime()));
        return  ResponseEntity.ok(khuyenMaiService.addKhuyenMai(km));
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> detail(@PathVariable("id") String id){
        return ResponseEntity.ok(khuyenMaiService.detailKhuyenMai(UUID.fromString(id)));

    }
}
