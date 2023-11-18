package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminDoCaoRespon;
import com.example.duanmishoes.model.DoCao;
import com.example.duanmishoes.respon.DoCaoRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoCaoService {
    @Autowired
    private DoCaoRespon doCaoRespon;
    public List<DoCao> getALL(){
        return doCaoRespon.findAll();
    }
    public List<AdminDoCaoRespon> getALLDC(){
        return doCaoRespon.getALLDC();
    }
    public DoCao addDC(DoCao dc){return doCaoRespon.save(dc);}
}
