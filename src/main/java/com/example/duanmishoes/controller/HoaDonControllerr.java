package com.example.duanmishoes.controller;

import com.example.duanmishoes.service.HoaDonServicee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return new ResponseEntity<>(hoaDonService.getALLTT(tt), HttpStatus.FOUND);
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
