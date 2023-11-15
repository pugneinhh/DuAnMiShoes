package com.example.duanmishoes.controller;

import com.example.duanmishoes.service.CTSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/ctsp")
public class CTSPController {
    @Autowired
    private CTSPService ctspService;
    @GetMapping("/show-ct/{idSP}")
    public ResponseEntity<?> getALLCTSP(@PathVariable String id){
        return new ResponseEntity<>(ctspService.getALLCTSP(UUID.fromString(id)), HttpStatus.FOUND);
    }
}
