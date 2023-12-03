package com.example.duanmishoes.respon;


import com.example.duanmishoes.model.AdminSanPhamRespon;
import com.example.duanmishoes.model.SanPham;
import com.example.duanmishoes.model.sanPhamSearch.SanPhamSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface SanPhamRespon extends JpaRepository<SanPham, UUID> {
    @Query(value = """
    SELECT  a.id AS idSP,a.ma AS ma ,a.ten AS ten,SUM(o.so_luong) AS soLuong, a.trang_thai AS trangThai
    FROM san_pham a JOIN chi_tiet_san_pham o  on o.san_pham_id= a.id GROUP BY ma,ten,a.trang_thai,a.id ORDER BY a.ma ASC 
            """, nativeQuery = true)
    List<AdminSanPhamRespon> getALLSP();

    @Query(value = "select san_pham.id from san_pham join chi_tiet_san_pham on san_pham.id = chi_tiet_san_pham.san_pham_id where chi_tiet_san_pham.id = ?1",nativeQuery = true)
    UUID getIDSPbyCTSP(UUID id);

    @Query(value = """
    SELECT  a.id AS idSP,a.ma AS ma ,a.ten AS ten,SUM(o.so_luong) AS soLuong, a.trang_thai AS trangThai
    FROM san_pham a JOIN chi_tiet_san_pham o  on o.san_pham_id= a.id GROUP BY ma,ten,a.trang_thai,a.id HAVING 
    (:#{#sanPhamSearch.tenSP} IS NULL OR a.ma LIKE (%:#{#sanPhamSearch.tenSP}%) OR a.ten LIKE (%:#{#sanPhamSearch.tenSP}%) ) AND
     ( :#{#sanPhamSearch.trangThaiSP} IS NULL OR a.trang_thai=:#{#sanPhamSearch.trangThaiSP}) AND
     ( :#{#sanPhamSearch.soLuongSP} IS NULL OR SUM(o.so_luong)<=:#{#sanPhamSearch.soLuongSP})
    ORDER BY a.ma ASC
            """, nativeQuery = true)
    List<AdminSanPhamRespon> getTim(SanPhamSearch sanPhamSearch);
}
