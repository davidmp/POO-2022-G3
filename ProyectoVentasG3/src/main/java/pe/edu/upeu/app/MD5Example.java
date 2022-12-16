/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app;

/**
 *
 * @author EP-Ing_Sist.-CALIDAD
 */
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Example {
//hash function to get the md5 hash  

    public static String getMd5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5"); 
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } //for specifying wrong message digest algorithms  
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
//driver code  

    public static void main(String args[]) throws NoSuchAlgorithmException {
        String s = "123456";
        System.out.println("Cifrado: " + getMd5Hash(s));
    }
}
