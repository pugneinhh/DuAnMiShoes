package com.example.duanmishoes.controller;

import com.example.duanmishoes.service.DanhMucService;
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
@RequestMapping("/danh-muc")
@RequiredArgsConstructor
public class DanhMucController {
    @Autowired
    private DanhMucService danhMucService;
    @GetMapping
    public ResponseEntity<?> getALLDM(){
        return new ResponseEntity<>(danhMucService.getALLDM(), HttpStatus.FOUND);
    }
}
