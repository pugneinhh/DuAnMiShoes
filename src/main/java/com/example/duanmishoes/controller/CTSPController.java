package com.example.duanmishoes.controller;


import com.example.duanmishoes.model.AdminCTSPRespon;

import com.example.duanmishoes.model.KhuyenMai;

import com.example.duanmishoes.model.sanPhamSearch.CTSPSearch;
import com.example.duanmishoes.service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import java.sql.Date;
import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/ctsp")
public class CTSPController {
    @Autowired
    private CTSPService ctspService;
    @GetMapping("/showct/{idSP}")
    public ResponseEntity<?> getALLCTSP(@PathVariable("idSP") String id){
        return ResponseEntity.ok(ctspService.getALLCTSP(UUID.fromString(id)));
    }

    @PostMapping("/{idSP}/tim-kiem")
    public ResponseEntity<?> search(@PathVariable("idSP") String id,@RequestBody CTSPSearch ctspSearch){
        return ResponseEntity.ok(ctspService.getTim(UUID.fromString(id),ctspSearch));
    }

    @GetMapping("/showct")
    public ResponseEntity<?> getALLCTSP_1(@RequestParam String id){
        return new ResponseEntity<>(ctspService.getALLCTSP(UUID.fromString(id)), HttpStatus.OK);
    }

    @GetMapping("/detail/{idCT}")
    public ResponseEntity<?> detail(@PathVariable("idCT") String idCT){
        return ResponseEntity.ok(ctspService.detailCTSP(UUID.fromString(idCT)));
    }

    @PutMapping("/updateKM/{idCTSP}")
    public ResponseEntity<?> update(@PathVariable("idCTSP") String idCTSP,@RequestBody KhuyenMai khuyenMai){
        System.out.println("Vào update");
        return  ResponseEntity.ok(ctspService.updateKM(UUID.fromString(idCTSP),khuyenMai));
    }

    @GetMapping("/showKM/{idKM}")
    public ResponseEntity<?> getALLCTSPByKM(@PathVariable("idKM") String id){
        return new ResponseEntity<>(ctspService.getALLCTSPByKM(UUID.fromString(id)), HttpStatus.OK);
    }
}

