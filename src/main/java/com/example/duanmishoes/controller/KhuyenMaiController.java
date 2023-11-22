package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.KhuyenMai;
import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.service.KhuyenMaiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/khuyen-mai")
@RequiredArgsConstructor
public class KhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

    @GetMapping
    public ResponseEntity<?> getALL(){
        return new ResponseEntity<>(khuyenMaiService.getAllKhuyenMai(), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody KhuyenMai km){
        km.setNgay_tao(new Date(new java.util.Date().getTime()));
        return  ResponseEntity.ok(khuyenMaiService.addKhuyenMai(km));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id,@RequestBody KhuyenMai km){
        km.setId(UUID.fromString(id));
        km.setNgay_sua(new Date(new java.util.Date().getTime()));
        return  ResponseEntity.ok(khuyenMaiService.addKhuyenMai(km));
    }

    @GetMapping("/detail/{idV}")
    public ResponseEntity<?> detail(@PathVariable("idV") String id){
        return ResponseEntity.ok(khuyenMaiService.detailKhuyenMai(UUID.fromString(id)));

    }
}
