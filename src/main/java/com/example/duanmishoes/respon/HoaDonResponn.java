package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminHoaDonResponn;
import com.example.duanmishoes.model.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;


public interface HoaDonResponn extends JpaRepository<HoaDon, UUID> {
    @Query(value = """
    SELECT  hd.ma AS ma, nv.ma as maNV, kh.ten as tenKH,kh.so_dien_thoai as sdt,
             ngay_mua as ngayMua,thanh_tien as thanhTien,hd.trang_thai as trangThai FROM hoa_don hd
 			JOIN khach_hang kh ON kh.id = hd.khach_hang_id
 			JOIN nhan_vien nv ON nv.id = hd.nhan_vien_id ORDER BY hd.ma DESC
            """, nativeQuery = true)
    List<AdminHoaDonResponn> getALLHD();
    @Query(value = """
 SELECT  hd.ma AS ma, nv.ma as maNV, kh.ten as tenKH,kh.so_dien_thoai as sdt,
                        ngay_mua as ngayMua,thanh_tien as thanhTien,hd.trang_thai as trangThai FROM hoa_don hd
            			JOIN khach_hang kh ON kh.id = hd.khach_hang_id
            			JOIN nhan_vien nv ON nv.id = hd.nhan_vien_id  where hd.trang_thai=:tt ORDER BY hd.ma DESC """,
            nativeQuery = true)
    List<AdminHoaDonResponn> getALLHDTT(int tt );
}
