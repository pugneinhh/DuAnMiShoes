package com.example.duanmishoes.controller;


import com.example.duanmishoes.model.ChucVu;
import com.example.duanmishoes.service.ChucVuService;
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
@RequestMapping("/chuc-vu")
@RequiredArgsConstructor
public class ChucVuController {

    @Autowired
    ChucVuService chucVuService;

    @GetMapping
    public ResponseEntity<?> getALLCV(){
        return new ResponseEntity<>(chucVuService.getAllCV(), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody ChucVu chucVu){
        return  ResponseEntity.ok(chucVuService.add(chucVu));
    }
}
