package com.example.duanmishoes.controller;

import com.example.duanmishoes.service.KichThuocService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/kich-thuoc")
@RequiredArgsConstructor
public class KichThuocController {
    @Autowired
    KichThuocService kichThuocService;
    @GetMapping
    public ResponseEntity<?> getALLKT(){
        return new ResponseEntity<>(kichThuocService.getALLKT(), HttpStatus.FOUND);
    }
}
