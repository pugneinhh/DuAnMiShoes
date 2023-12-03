package com.example.duanmishoes.service;

import com.example.duanmishoes.model.*;
import com.example.duanmishoes.model.sanPhamSearch.CTSPSearch;
import com.example.duanmishoes.model.sanPhamSearch.DanhMucSearch;
import com.example.duanmishoes.respon.CTSPRespon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CTSPService {
    @Autowired
    CTSPRespon ctspRespon;
    @Autowired
    KhuyenMaiService khuyenMaiService;
    public List<ChiTietSanPham> getALL(){
        return ctspRespon.findAll();
    }
    public List<AdminCTSPRespon> getALLCTSP(UUID id){
        return ctspRespon.getALLCTSP(id);
    }
    public List<AdminCTSPRespon> getTim(UUID id, CTSPSearch ctspSearch) {
        return ctspRespon.getTim(id,ctspSearch);
    }
    public AdminDetailCTSP detailCTSP(UUID id){return ctspRespon.detailCTSP(id);}
    public List<UUID> getALLCTSPByKM(UUID id){
        return ctspRespon.getAllCTSPByKM(id);
    }


    public ChiTietSanPham updateKM(UUID idCTSP , KhuyenMai km){
        ChiTietSanPham ctsp = ctspRespon.getReferenceById(idCTSP);
        ctsp.setKhuyenMai(km);
        ctsp.setNgaySua(new Date(new java.util.Date().getTime()));
        System.out.println("khuyến mại"+ctsp.getKhuyenMai());
        return ctspRespon.save(ctsp);
    }


}
