package com.example.duanmishoes.controller;

import com.example.duanmishoes.service.ChatLieuService;
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
@RequestMapping("/chat-lieu")
@RequiredArgsConstructor
public class ChatLieuController {
    @Autowired
    ChatLieuService chatLieuService;
    @GetMapping
    public ResponseEntity<?> getALLCL(){
        return new ResponseEntity<>(chatLieuService.getALLCL(), HttpStatus.FOUND);
    }
}
