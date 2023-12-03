package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminDanhMucRespon;
import com.example.duanmishoes.model.DanhMuc;
import com.example.duanmishoes.model.sanPhamSearch.DanhMucSearch;
import com.example.duanmishoes.respon.DanhMucRespon;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DanhMucService {
    @Autowired
    DanhMucRespon danhMucRespon;

    public List<DanhMuc> getALL() {
        return danhMucRespon.findAll();
    }

    public List<AdminDanhMucRespon> getALLDM() {
        return danhMucRespon.getALLDM();
    }

    public List<AdminDanhMucRespon> getTim(DanhMucSearch danhMucSearch) {
        return danhMucRespon.timDM(danhMucSearch);
    }

    public DanhMuc addDM(DanhMuc dm) {
        return danhMucRespon.save(dm);
    }
}
