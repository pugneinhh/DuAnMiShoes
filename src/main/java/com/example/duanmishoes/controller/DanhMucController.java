package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.DanhMuc;
import com.example.duanmishoes.model.sanPhamSearch.DanhMucSearch;
import com.example.duanmishoes.service.DanhMucService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/danh-muc")
@RequiredArgsConstructor
public class DanhMucController {
    @Autowired
    private DanhMucService danhMucService;
    @GetMapping
    public ResponseEntity<?> getALLDM(){
        return ResponseEntity.ok(danhMucService.getALLDM());
    }
    @PostMapping("/tim-kiem")
    public ResponseEntity<?> search(@RequestBody DanhMucSearch danhMucSearch){
        return ResponseEntity.ok(danhMucService.getTim(danhMucSearch));
    }
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody DanhMuc v){
        int dmThem = danhMucService.getALL().size();
        v.setMa("DM" + "-" + (dmThem + 1));
        v.setTrangThai(1);
        return  ResponseEntity.ok(danhMucService.addDM(v));
    }
}
