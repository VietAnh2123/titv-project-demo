/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AD
 */
public class ChiTietDonHang {
    private String maChiTietDonHang;
    private String donHang;
    private String maSanPham;
    private int soLuong;
    private float giaBia;
    private float giaGiam;
    private float giaBan;
    private float vat;
    private float tongTien;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(String maChiTietDonHang, String donHang, String maSanPham, int soLuong, float giaBia, float giaGiam, float giaBan, float vat, float tongTien) {
        this.maChiTietDonHang = maChiTietDonHang;
        this.donHang = donHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.giaBia = giaBia;
        this.giaGiam = giaGiam;
        this.giaBan = giaBan;
        this.vat = vat;
        this.tongTien = tongTien;
    }

    public String getMaChiTietDonHang() {
        return maChiTietDonHang;
    }

    public void setMaChiTietDonHang(String maChiTietDonHang) {
        this.maChiTietDonHang = maChiTietDonHang;
    }

    public String getDonHang() {
        return donHang;
    }

    public void setDonHang(String donHang) {
        this.donHang = donHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaBia() {
        return giaBia;
    }

    public void setGiaBia(float giaBia) {
        this.giaBia = giaBia;
    }

    public float getGiaGiam() {
        return giaGiam;
    }

    public void setGiaGiam(float giaGiam) {
        this.giaGiam = giaGiam;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
}
