/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.cinterna;

/**
 *
 * @author LABORATORIO_2
 */
public class ClaseGeneral {
    public static void main(String[] args) {
            Mama m=new Mama();
            m.nombre="Luz";
            
            Mama.Bebe b=m.new Bebe();
            b.meses=6;
            
            System.out.println("Hola, Soy "+m.nombre+" y mi bebe tiene "+b.meses+ " meses");
            
    }
}
