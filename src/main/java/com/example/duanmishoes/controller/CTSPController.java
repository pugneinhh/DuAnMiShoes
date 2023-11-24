package com.example.duanmishoes.controller;

import com.example.duanmishoes.model.AdminCTSPRespon;
import com.example.duanmishoes.service.CTSPService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/ctsp")
public class CTSPController {
    @Autowired
    private CTSPService ctspService;
    @GetMapping("/showct/{idSP}")
    public ResponseEntity<?> getALLCTSP(@PathVariable("idSP") String id){
        return new ResponseEntity<>(ctspService.getALLCTSP(UUID.fromString(id)), HttpStatus.FOUND);
    }

    @GetMapping("/showct")
    public ResponseEntity<?> getALLCTSP_1(@RequestParam String id){
        return new ResponseEntity<>(ctspService.getALLCTSP(UUID.fromString(id)), HttpStatus.OK);
    }
}

