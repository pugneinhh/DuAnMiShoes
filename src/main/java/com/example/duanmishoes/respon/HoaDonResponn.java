package com.example.duanmishoes.respon;

import com.example.duanmishoes.model.AdminHoaDonResponn;
import com.example.duanmishoes.model.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;
import java.util.UUID;


public interface HoaDonResponn extends JpaRepository<HoaDon, UUID> {
    @Query(value = """
 SELECT hd.id AS idHD,  hd.ma AS ma, nv.ma as maNV, kh.ten as tenKH,kh.so_dien_thoai as sdt,
             ngay_mua as ngayMua,thanh_tien as thanhTien,hd.trang_thai as trangThai,hd.loai_hoa_don AS loaiHD FROM hoa_don hd
 			JOIN khach_hang kh ON kh.id = hd.khach_hang_id
 			JOIN nhan_vien nv ON nv.id = hd.nhan_vien_id ORDER BY hd.ma DESC
            """, nativeQuery = true)
    List<AdminHoaDonResponn> getALLHD();
    @Query(value = """
 SELECT  hd.ma AS ma, nv.ma as maNV, kh.ten as tenKH,kh.so_dien_thoai as sdt,
                        ngay_mua as ngayMua,thanh_tien as thanhTien,hd.trang_thai as trangThai,hd.loai_hoa_don AS loaiHD FROM hoa_don hd
            			JOIN khach_hang kh ON kh.id = hd.khach_hang_id
            			JOIN nhan_vien nv ON nv.id = hd.nhan_vien_id  where hd.trang_thai=:tt ORDER BY hd.ma DESC """,
            nativeQuery = true)
    List<AdminHoaDonResponn> getALLHDTT(int tt );
//    @Query("select o from KhachHang o where o.ten=:keyword or o.ma=:keyword")List<KhachHang> search(@Param("keyword")String keyword)
    @Query(value = """
            SELECT hd.id AS idHD,  hd.ma AS ma, nv.ma as maNV, kh.ten as tenKH,kh.so_dien_thoai as sdt,
            hd.ngay_mua as ngayMua,hd.thanh_tien as thanhTien,hd.trang_thai as trangThai,hd.loai_hoa_don AS loaiHD FROM hoa_don hd
            JOIN khach_hang kh ON kh.id = hd.khach_hang_id
            JOIN nhan_vien nv ON nv.id = hd.nhan_vien_id  where hd.ma=:hehe or nv.ma=:hehe or kh.ten=:hehe 
            AND hd.loai_hoa_don =:timLoai AND hd.ngay_mua BETWEEN :bd AND :kt ORDER BY hd.ma DESC """,nativeQuery = true)
    List<AdminHoaDonResponn> search(@Param("hehe") String hehe, int timLoai,  java.sql.Date bd, Date kt);

    @Query(value = """
 SELECT hd.id AS idHD, hd.ma AS ma, nv.ma as maNV, kh.ten as tenKH,kh.so_dien_thoai as sdt,
                        ngay_mua as ngayMua,thanh_tien as thanhTien,hd.trang_thai as trangThai,hd.loai_hoa_don AS loaiHD FROM hoa_don hd
            			JOIN khach_hang kh ON kh.id = hd.khach_hang_id
            			JOIN nhan_vien nv ON nv.id = hd.nhan_vien_id  where hd.id=:key """,
            nativeQuery = true)
    AdminHoaDonResponn detailHD(UUID key);
}
