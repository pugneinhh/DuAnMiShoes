package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.SanPham;
import com.example.duanmishoes.service.SanPhamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/san-pham")
@RequiredArgsConstructor
public class SanPhamController {
    @Autowired
    SanPhamService sanPhamService;
    @GetMapping
    public ResponseEntity<?> getALLSP(){
        return new ResponseEntity<>(sanPhamService.getALLSP(), HttpStatus.FOUND);
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody SanPham v){
        return  ResponseEntity.ok(sanPhamService.addSP(v));
    }
}
