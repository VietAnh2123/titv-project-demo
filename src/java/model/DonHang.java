/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author AD
 */
public class DonHang {
    private String maDonHang;
    private String khachHang;
    private String diaChiNguoiMua;
    private String diaChiNhanHang;
    private String diaChiMuaHang;
    private String trangThai;
    private String hinhThucThanhThoan;
    private float soTienDaThanhToan;
    private float soTienConThieu;
    private Date ngayDatHang;
    private Date ngayGiaoHang;

    public DonHang() {
    }

    public DonHang(String maDonHang, String khachHang, String diaChiNguoiMua, String diaChiNhanHang, String diaChiMuaHang, String trangThai, String hinhThucThanhThoan, float soTienDaThanhToan, float soTienConThieu, Date ngayDatHang, Date ngayGiaoHang) {
        this.maDonHang = maDonHang;
        this.khachHang = khachHang;
        this.diaChiNguoiMua = diaChiNguoiMua;
        this.diaChiNhanHang = diaChiNhanHang;
        this.diaChiMuaHang = diaChiMuaHang;
        this.trangThai = trangThai;
        this.hinhThucThanhThoan = hinhThucThanhThoan;
        this.soTienDaThanhToan = soTienDaThanhToan;
        this.soTienConThieu = soTienConThieu;
        this.ngayDatHang = ngayDatHang;
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }

    public String getDiaChiNguoiMua() {
        return diaChiNguoiMua;
    }

    public void setDiaChiNguoiMua(String diaChiNguoiMua) {
        this.diaChiNguoiMua = diaChiNguoiMua;
    }

    public String getDiaChiNhanHang() {
        return diaChiNhanHang;
    }

    public void setDiaChiNhanHang(String diaChiNhanHang) {
        this.diaChiNhanHang = diaChiNhanHang;
    }

    public String getDiaChiMuaHang() {
        return diaChiMuaHang;
    }

    public void setDiaChiMuaHang(String diaChiMuaHang) {
        this.diaChiMuaHang = diaChiMuaHang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhThucThanhThoan() {
        return hinhThucThanhThoan;
    }

    public void setHinhThucThanhThoan(String hinhThucThanhThoan) {
        this.hinhThucThanhThoan = hinhThucThanhThoan;
    }

    public float getSoTienDaThanhToan() {
        return soTienDaThanhToan;
    }

    public void setSoTienDaThanhToan(float soTienDaThanhToan) {
        this.soTienDaThanhToan = soTienDaThanhToan;
    }

    public float getSoTienConThieu() {
        return soTienConThieu;
    }

    public void setSoTienConThieu(float soTienConThieu) {
        this.soTienConThieu = soTienConThieu;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public Date getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Date ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDonHang);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DonHang other = (DonHang) obj;
        return Objects.equals(this.maDonHang, other.maDonHang);
    }
    
}
