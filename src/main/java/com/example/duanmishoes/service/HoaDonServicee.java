package com.example.duanmishoes.service;

import com.example.duanmishoes.model.AdminHoaDonResponn;
import com.example.duanmishoes.respon.HoaDonResponn;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.UUID;
@Service
@RequiredArgsConstructor
public class HoaDonServicee {
    @Autowired
    HoaDonResponn hoaDonResponn;

    public List<AdminHoaDonResponn> getALL() {
        return hoaDonResponn.getALLHD();
    }

    public List<AdminHoaDonResponn> getALLTT(int tt) {
        return hoaDonResponn.getALLHDTT(tt);
    }
    public List<AdminHoaDonResponn> timHoaDon(String tim, int loai, java.sql.Date bd, Date kt){
        return hoaDonResponn.search(tim,loai,bd,kt);
    }
     public AdminHoaDonResponn getByID(UUID id){
        return hoaDonResponn.detailHD(id);
    }

//    public LichSuHoaDon add(LichSuHoaDon kh){
//        return khachHangRespon.save(kh);
//    }
//    public LichSuHoaDon update(LichSuHoaDon kh, String ma){
//        Optional<LichSuHoaDon> optional =khachHangRespon.findById(ma);
//        return optional.map(o->{
//            o.setTenKhachHang(kh.getTenKhachHang());
//            o.setSinhNhat(kh.getSinhNhat());
//            o.setGioiTinh(kh.getGioiTinh());
//            o.setSoDienThoai(kh.getSoDienThoai());
//            o.setDiaChi(kh.getDiaChi());
//            return khachHangRespon.save(o);
//        }).orElse(null);
//    }
//    public LichSuHoaDon delete(String ma){
//        Optional<LichSuHoaDon> optional=khachHangRespon.findById(ma);
//        return optional.map(o->{
//             khachHangRespon.delete(o);
//             return o;
//        }).orElse(null) ;
//    }
}
