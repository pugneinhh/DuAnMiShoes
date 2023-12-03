package com.example.duanmishoes.respon;


import com.example.duanmishoes.model.*;
import com.example.duanmishoes.model.sanPhamSearch.CTSPSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface CTSPRespon extends JpaRepository<ChiTietSanPham, UUID> {
    @Query(value = """
            SELECT o.id AS idCTSP,ha.link_anh AS link,o.mo_ta AS moTa ,sp.ten AS tenSP ,km.ten AS tenKM,kt.ten AS tenKT,ms.ten AS tenMS,cl.ten AS tenCL,dc.ten AS tenDC,dm.ten AS tenDM
            ,h.ten AS tenH,o.so_luong AS soLuong,o.gia_ban AS giaBan,o.trang_thai AS trangThai
            FROM chi_tiet_san_pham o
            JOIN san_pham sp  on o.san_pham_id=sp.id
            JOIN khuyen_mai km  on o.khuyen_mai_id=km.id
            JOIN kich_thuoc kt  on o.kich_thuoc_id=kt.id
            JOIN mau_sac ms  on o.mau_sac_id=ms.id
            JOIN chat_lieu cl  on o.chat_lieu_id=cl.id
            JOIN do_cao dc  on o.do_cao_id=dc.id
            JOIN danh_muc dm  on o.danh_muc_id=dm.id
            JOIN hang h  on o.hang_id=h.id
            JOIN hinh_anh ha on o.id=ha.chi_tiet_san_pham_id    
            WHERE o.san_pham_id=:idSP
                     """, nativeQuery = true)
    List<AdminCTSPRespon> getALLCTSP(@Param("idSP") UUID idSP);


    @Query(value = """
            SELECT o.id AS idC,o.mo_ta AS moTa ,sp.ten AS tenSP ,kt.id AS idKT,ms.id AS idMS,cl.id AS idCL,dc.id AS idDC,dm.id AS idDM
            ,h.id AS idH,o.so_luong AS soLuong,o.gia_ban AS giaBan,o.trang_thai AS trangThai
            FROM chi_tiet_san_pham o
            JOIN san_pham sp  on o.san_pham_id=sp.id
            JOIN khuyen_mai km  on o.khuyen_mai_id=km.id
            JOIN kich_thuoc kt  on o.kich_thuoc_id=kt.id
            JOIN mau_sac ms  on o.mau_sac_id=ms.id
            JOIN chat_lieu cl  on o.chat_lieu_id=cl.id
            JOIN do_cao dc  on o.do_cao_id=dc.id
            JOIN danh_muc dm  on o.danh_muc_id=dm.id
            JOIN hang h  on o.hang_id=h.id
            WHERE o.id=:idCT
                     """, nativeQuery = true)
    AdminDetailCTSP detailCTSP(@Param("idCT") UUID idCT);

    @Query(value = """
                        SELECT o.id AS idCTSP,ha.link_anh AS link,o.mo_ta AS moTa ,sp.ten AS tenSP ,km.ten AS tenKM,kt.ten AS tenKT,ms.ten AS tenMS,cl.ten AS tenCL,dc.ten AS tenDC,dm.ten AS tenDM
                        ,h.ten AS tenH,o.so_luong AS soLuong,o.gia_ban AS giaBan,o.trang_thai AS trangThai
                        FROM chi_tiet_san_pham o
                        JOIN san_pham sp  on o.san_pham_id=sp.id
                        JOIN khuyen_mai km  on o.khuyen_mai_id=km.id
                        JOIN kich_thuoc kt  on o.kich_thuoc_id=kt.id
                        JOIN mau_sac ms  on o.mau_sac_id=ms.id
                        JOIN chat_lieu cl  on o.chat_lieu_id=cl.id
                        JOIN do_cao dc  on o.do_cao_id=dc.id
                        JOIN danh_muc dm  on o.danh_muc_id=dm.id
                        JOIN hang h  on o.hang_id=h.id
                        JOIN hinh_anh ha on o.id=ha.chi_tiet_san_pham_id    
                        WHERE 
                        (:#{#ctspSearch.tenCT} IS NULL OR sp.ten LIKE (%:#{#ctspSearch.tenCT}%) ) AND
                        (:#{#ctspSearch.idKT} IS NULL OR o.kich_thuoc_id =:#{#ctspSearch.idKT} ) AND
                        (:#{#ctspSearch.idMS} IS NULL OR o.mau_sac_id =:#{#ctspSearch.idMS} ) AND
                        (:#{#ctspSearch.idCL} IS NULL OR o.chat_lieu_id =:#{#ctspSearch.idCL} ) AND
                        (:#{#ctspSearch.idDC} IS NULL OR o.do_cao_id =:#{#ctspSearch.idDC} ) AND
                        (:#{#ctspSearch.idDM} IS NULL OR o.danh_muc_id =:#{#ctspSearch.idDM} ) AND
                        (:#{#ctspSearch.idH} IS NULL OR o.hang_id =:#{#ctspSearch.idH} ) AND
                        (:#{#ctspSearch.trangThaiCT} IS NULL OR o.trang_thai =:#{#ctspSearch.trangThaiCT}) AND
                        (:#{#ctspSearch.soluongCT} IS NULL OR o.so_luong <=:#{#ctspSearch.soluongCT}) AND
                        (:#{#ctspSearch.giaBanCT} IS NULL OR o.gia_ban <=:#{#ctspSearch.giaBanCT}) AND
                        o.san_pham_id=:idSP
                                 """, nativeQuery = true)
    List<AdminCTSPRespon> getTim(@Param("idSP") UUID idSP, CTSPSearch ctspSearch);


    @Query(value = """
            SELECT o.id 
            FROM chi_tiet_san_pham o
            JOIN khuyen_mai km  on o.khuyen_mai_id=km.id
            WHERE km.id=:idKM ORDER BY o.id DESC
                     """, nativeQuery = true)
    List<UUID> getAllCTSPByKM(@Param("idKM") UUID idKM);

}
