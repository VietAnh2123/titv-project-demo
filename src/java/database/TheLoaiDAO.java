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
import model.TheLoai;

/**
 *
 * @author AD
 */
public class TheLoaiDAO extends DBContext.DBContext implements IDAO<TheLoai> {

    private ArrayList<TheLoai> listTheLoai;

    @Override
    public ArrayList<TheLoai> selectAll() {
        List<TheLoai> list = new ArrayList<>();
        String sql = "select * from theloai";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai theloai = new TheLoai(rs.getString("maTheLoai"), rs.getString("tenTheLoai"));
                list.add(theloai);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return (ArrayList<TheLoai>) list;
    }

    @Override
    public TheLoai selectById(String id) {
        return null;
    }

    @Override
    public int insert(TheLoai theLoai) {
        
        return 0;
    }

    @Override
    public int insertAll(ArrayList<TheLoai> list) {
        int dem = 0;
        
        return dem;
    }

    @Override
    public int delete(TheLoai theLoai) {
        
        return 0;
    }

    public int deleteAll(ArrayList<TheLoai> list) {
        int dem = 0;
        
        return dem;
    }

    @Override
    public int update(TheLoai theLoai) {
        
        return 0;
    }

}
