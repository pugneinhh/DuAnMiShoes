package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.KhachHang;
import com.example.duanmishoes.service.KhachHangService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/khach-hang")
@RequiredArgsConstructor
public class KhachHangController {

    @Autowired
    KhachHangService khachHangService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(khachHangService.getAll(), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody KhachHang khachHang){
        return  ResponseEntity.ok(khachHangService.add(khachHang));
    }

}
