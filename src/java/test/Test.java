/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import database.TacGiaDAO;
import database.TheLoaiDAO;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import model.TacGia;
import model.TheLoai;

/**
 *
 * @author AD
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("THE LOAI");
//        TheLoaiDAO tl = new TheLoaiDAO();
//        ArrayList<TheLoai> list = tl.selectAll();
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getMaTheLoai() + " - " + list.get(i).getTenTheLoai());
//        }
//        System.out.println("TAC GIA");
//        TacGiaDAO tg = new TacGiaDAO();
//        ArrayList<TacGia> tgList = tg.selectAll();
//        for (int i = 0; i < tgList.size(); i++) {
//            System.out.println(tgList.get(i).getMaTacGia() + " - " + tgList.get(i).getHoVaTen() + " - " + tgList.get(i).getNgaySinh() + " - " + tgList.get(i).getTieuSu());
//        }
//        System.out.println("TAC GIA by ID");
//        TacGia tacgia = tg.selectById("01");
//        System.out.println(tacgia.getHoVaTen());
//        System.out.println("INSERT TACGIA");
//        TacGia newTG = new TacGia("06", "Truong Dinh Dong Duong", new Date(2003-1900, 11-1, 9), "Da thay doi");
//        tg.upTG);date(newTG);
        Random r = new Random();
        
        int x;
        int y;
        x = r.nextInt(100-50+1)+50;
        System.out.println(x);
        
    }
}
