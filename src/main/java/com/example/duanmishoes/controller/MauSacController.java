package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.MauSac;
import com.example.duanmishoes.service.MauSacService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/mau-sac")
@RequiredArgsConstructor
public class MauSacController {
    @Autowired
    MauSacService mauSacService;

    @GetMapping
    public ResponseEntity<?> getALLMS() {
        return new ResponseEntity<>(mauSacService.getALLMS(), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody MauSac v) {
        int msThem = mauSacService.getALL().size();
        v.setMa("MS" + "-" + (msThem + 1));
        return ResponseEntity.ok(mauSacService.addMS(v));
    }
}
