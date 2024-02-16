/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.security.MessageDigest;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author AD
 */
public class Encode {
    public static String toSHA1(String str){
        String salt = "qwerty";
        String result = "";
        
        str = str + salt;
        try{
            byte[] dataByte = str.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            result = Base64.encodeBase64String(md.digest(dataByte));
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
