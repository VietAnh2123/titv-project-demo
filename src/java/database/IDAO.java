/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package database;

import java.util.ArrayList;

/**
 *
 * @author AD
 * @param <T>
 */
public interface IDAO<T> {
    public ArrayList<T> selectAll();
    
    public T selectById(String id);
    
    public int insert(T t);
    
    public int insertAll(ArrayList<T> list);
    
    public int delete(T t);
    
    public int update(T t);
}
