/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TacGia;

/**
 *
 * @author AD
 */
public class TacGiaDAO extends DBContext.DBContext implements IDAO<TacGia> {

    @Override
    public ArrayList<TacGia> selectAll() {
        List<TacGia> list = new ArrayList<>();
        String sql = "select * from tacgia";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                TacGia tg = new TacGia(rs.getString("maTacGia"), rs.getString("hoVaTen"), rs.getDate("ngaySinh"), rs.getString("tieuSu"));
                list.add(tg);
            }
        } catch (SQLException ex) {
        }
        return (ArrayList<TacGia>) list;
    }

    @Override
    public TacGia selectById(String id) {
        TacGia tg = null;
        String sql = "select * from tacgia where maTacGia = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                tg = new TacGia(id, rs.getString("hoVaTen"), rs.getDate("ngaySinh"), rs.getString("tieuSu"));
                break;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return tg;
    }

    @Override
    public int insert(TacGia t) {
        int result = 0;
        String sql = "insert into tacgia(maTacGia, hoVaTen, ngaySinh, tieuSu)"
                + "values(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getMaTacGia());
            ps.setString(2, t.getHoVaTen());
            ps.setDate(3, t.getNgaySinh());
            ps.setString(4, t.getTieuSu());
            ResultSet rs = ps.executeQuery();
            
            result = ps.executeUpdate();
            if(result < 0){
                System.out.println("Failed!");
            }else{
                System.out.println("Success!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int insertAll(ArrayList<TacGia> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TacGia t) {
        int result = 0;
        String sql = "delete from tacgia "
                + "where maTacGia=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getMaTacGia());
            ResultSet rs = ps.executeQuery();
            result = ps.executeUpdate();
            if(result < 0){
                System.out.println("Failed!");
            }else{
                System.out.println("Success!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    @Override
    public int update(TacGia t) {
        int result = 0;
        String sql = "update tacgia "
                + "set "
                + "hoVaTen=?"
                + ",ngaySinh=?"
                + ",tieuSu=? "
                + "where maTacGia=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, t.getHoVaTen());
            ps.setDate(2, t.getNgaySinh());
            ps.setString(3, t.getTieuSu());
            ps.setString(4, t.getMaTacGia());
            ResultSet rs = ps.executeQuery();
            result = ps.executeUpdate();
            if(result < 0){
                System.out.println("Failed!");
            }else{
                System.out.println("Success!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }

    
}
