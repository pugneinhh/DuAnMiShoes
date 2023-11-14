package com.example.duanmishoes.controller;

import com.example.duanmishoes.service.HoaDonServicee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/hoa-don")
@RequiredArgsConstructor
public class HoaDonControllerr {
    @Autowired
    private HoaDonServicee hoaDonService;

    @GetMapping
    public ResponseEntity<?> getALL(){
        return new ResponseEntity<>(hoaDonService.getALL(), HttpStatus.FOUND);
    }
    @GetMapping("{tt}")
    public ResponseEntity<?> getALLTT(@PathVariable("tt") int tt){
        return  ResponseEntity.ok(hoaDonService.getALLTT(tt));
    }
    @GetMapping("/detail-hoa-don/{idHD}")
    public ResponseEntity<?> detailHD(@PathVariable String id){
        return  ResponseEntity.ok(hoaDonService.getByID(UUID.fromString(id)));
    }
    @GetMapping("/tim-kiem/{hehe}/{loaiHD}/{BD}/{KT}")
    public ResponseEntity<?> timHoaDon(@PathVariable("hehe") String tim,
                                       @PathVariable("loaiHD")int loai,
                                       @PathVariable("BD") String bd,
                                       @PathVariable("KT") String kt) throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        Date d1= sdf.parse(bd);
        Date d2= sdf.parse(kt);
        java.sql.Date BD= new java.sql.Date(d1.getTime());
        java.sql.Date KT= new java.sql.Date(d2.getTime());
        return  ResponseEntity.ok(hoaDonService.timHoaDon(tim,loai,BD,KT));
    }
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody LichSuHoaDon khachHang){
//        return  ResponseEntity.ok(khachHangService.add(khachHang));
//    }
//    @PutMapping("/update/{ma}")
//    public ResponseEntity<?> update(@PathVariable String ma,@RequestBody LichSuHoaDon khachHang){
//        return   ResponseEntity.ok(khachHangService.update(khachHang,ma));
//    }
//    @DeleteMapping("/delete/{ma}")
//    public ResponseEntity<?> delete(@PathVariable String ma){
//        return  ResponseEntity.ok(khachHangService.delete(ma));
//    }
}
