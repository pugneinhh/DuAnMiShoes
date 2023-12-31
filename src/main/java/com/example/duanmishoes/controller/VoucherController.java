package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.Voucher;
import com.example.duanmishoes.service.VoucherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/voucher")
@RequiredArgsConstructor
public class VoucherController {
    @Autowired
    VoucherService vs;
    @GetMapping
    public ResponseEntity<?> getALL(){
        return ResponseEntity.ok(vs.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Voucher v){
        v.setNgayBatDau(new Date(new java.util.Date().getTime()));
        return  ResponseEntity.ok(vs.addVoucher(v));
    }
    @GetMapping("/tim-voucher/{key}/{ngayBD}/{ngayKT}")
    public ResponseEntity<?> tim(@PathVariable("key")String key,
                                 @PathVariable("ngayBD")String ngayBD,
                                 @PathVariable("ngayKT")String ngayKT) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d1=sdf.parse(ngayBD);
        java.util.Date d2=sdf.parse(ngayKT);
        Date dBD=new Date(d1.getTime());
        Date dKT=new Date(d2.getTime());
        return  ResponseEntity.ok(vs.getTim(key,dBD,dKT));
    }
}
