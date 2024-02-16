/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;

/**
 *
 * @author AD
 */
public class KhachHangDAO extends DBContext.DBContext implements IDAO<KhachHang> {

    @Override
    public ArrayList<KhachHang> selectAll() {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khachhang";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maKhachHang = rs.getString("maKhachHang");
                String tenDangNhap = rs.getString("tenDangNhap");
                String matKhau = rs.getString("matKhau");
                String hoVaTen = rs.getString("hoVaTen");
                String gioiTinh = rs.getString("gioiTinh");
                String diaChi = rs.getString("diaChi");
                String diaChiNhanHang = rs.getString("diaChiNhanHang");
                String diaChiMuaHang = rs.getString("diaChiMuaHang");
                Date ngaySinh = rs.getDate("ngaySinh");
                String soDienThoai = rs.getString("soDienThoai");
                String email = rs.getString("email");
                boolean dangKyNhanBangTin = rs.getBoolean("dangKynhanBangTin");

                KhachHang kh = new KhachHang(maKhachHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang, diaChiMuaHang, ngaySinh, soDienThoai, email, dangKyNhanBangTin);
                list.add(kh);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return list;
    }

    public KhachHang selectById(KhachHang t) {
        KhachHang result = null;
        String sql = "SELECT * FROM khachhang WHERE maKhachHang=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getMaKhachHang());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maKhachHang = rs.getString("maKhachHang");
                String hoVaTen = rs.getString("hoVaTen");
                String gioiTinh = rs.getString("gioiTinh");
                String diaChi = rs.getString("diaChi");
                String diaChiNhanHang = rs.getString("diaChiNhanHang");
                String diaChiMuaHang = rs.getString("diaChiMuaHang");
                Date ngaySinh = rs.getDate("ngaySinh");
                String soDienThoai = rs.getString("soDienThoai");
                String email = rs.getString("email");
                boolean dangKyNhanBangTin = rs.getBoolean("dangKyNhanBangTin");

                result = new KhachHang(maKhachHang, "", "", hoVaTen, gioiTinh, diaChi, diaChiNhanHang,
                        diaChiMuaHang, ngaySinh, soDienThoai, email, dangKyNhanBangTin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public int insert(KhachHang t) {
        int result = 0;
        String sql = "INSERT INTO khachhang(maKhachHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang, diaChiMuaHang, ngaySinh, soDienThoai, email, dangKyNhanBangTin) "
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getMaKhachHang());
            ps.setString(2, t.getTenDangNhap());
            ps.setString(3, t.getMatKhau());
            ps.setString(4, t.getHoVaTen());
            ps.setString(5, t.getGioiTinh());
            ps.setString(6, t.getDiaChi());
            ps.setString(7, t.getDiaChiNhanHang());
            ps.setString(8, t.getDiaChiMuaHang());
            ps.setDate(9, t.getNgaySinh());
            ps.setString(10, t.getSoDienThoai());
            ps.setString(11, t.getEmail());
            ps.setBoolean(12, t.isDangKyNhanBangTin());

            ResultSet rs = ps.executeQuery();

            result = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int insertAll(ArrayList<KhachHang> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(KhachHang t) {
        int result = 0;
        String sql = "UPDATE khachhang "
                + "SET hoVaTen=? ,"
                + "gioiTinh=? ,"
                + "diaChi=? ,"
                + "diaChiNhanHang=? ,"
                + "diaChiMuaHang=? ,"
                + "ngaySinh=? ,"
                + "soDienThoai=? ,"
                + "email=? ,"
                + "dangKyNhanBangTin=? "
                + "WHERE maKhachHang=? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getHoVaTen());
            ps.setString(2, t.getGioiTinh());
            ps.setString(3, t.getDiaChi());
            ps.setString(4, t.getDiaChiNhanHang());
            ps.setString(5, t.getDiaChiMuaHang());
            ps.setDate(6, t.getNgaySinh());
            ps.setString(7, t.getSoDienThoai());
            ps.setString(8, t.getEmail());
            ps.setBoolean(9, t.isDangKyNhanBangTin());
            ps.setString(10, t.getMaKhachHang());

            ResultSet rs = ps.executeQuery();

            result = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public boolean changePassword(KhachHang t) {
        int result = 0;
        String sql = "UPDATE khachhang "
                + "SET matkhau=? "
                + "WHERE makhachhang=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getMatKhau());
            ps.setString(2, t.getMaKhachHang());
            ResultSet rs = ps.executeQuery();

            result = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result > 0;
    }

    public boolean kiemTraTenDangNhap(String tenDangNhap) {
        boolean result = false;
        String sql = "select * from khachhang where tenDangNhap=?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, tenDangNhap);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    public KhachHang kiemTraTaiKhoan(KhachHang t) {
        KhachHang result = null;
        String sql = "select * from khachhang where tenDangNhap=? and matKhau=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getTenDangNhap());
            ps.setString(2, t.getMatKhau());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String maKhachHang = rs.getString("maKhachHang");
                String tenDangNhap = rs.getString("tenDangNhap");
                String matKhau = rs.getString("matKhau");
                String hoVaTen = rs.getString("hoVaTen");
                String gioiTinh = rs.getString("gioiTinh");
                String diaChi = rs.getString("diaChi");
                String diaChiNhanHang = rs.getString("diaChiNhanHang");
                String diaChiMuaHang = rs.getString("diaChiMuaHang");
                Date ngaySinh = rs.getDate("ngaySinh");
                String soDienThoai = rs.getString("soDienThoai");
                String email = rs.getString("email");
                boolean dangKyNhanBangTin = rs.getBoolean("dangKynhanBangTin");

                result = new KhachHang(maKhachHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang, diaChiMuaHang, ngaySinh, soDienThoai, email, dangKyNhanBangTin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public KhachHang selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
