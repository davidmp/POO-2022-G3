/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.encript;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LABORATORIO_2
 */
public class ClaseGeneral {
   
    public static void main(String[] args) {
        
        
        RepositoryEncript re=new RepositoryEncript(new MessageStream());         
        re.getInstance().addTextEncript("Holas132456", ""); //dccfe110cf5876b7c99bcaa5ac70ea43
        
        
        
        
        HashMap<Integer, Object> datax = re.getInstance().sendEncript();
        
        for (Map.Entry<Integer, Object> entry : datax.entrySet()) {
                System.out.println("Clave cifrada: " +entry.getValue());
        }
        
        
      
    }
}
