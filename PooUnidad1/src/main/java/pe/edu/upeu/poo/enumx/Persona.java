/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.enumx;

/**
 *
 * @author LABORATORIO_2
 */
enum EST_CIVIL{Soltero,Casado, Viudo, Divorciado}

public class Persona {
    
    public static void main(String[] args) {
       EST_CIVIL ec=EST_CIVIL.Casado;
        System.out.println("Tu estado Civil:" + ec);
        System.out.println("Que estados civiles pasaste");
        for (EST_CIVIL arg: EST_CIVIL.values()) {
            System.out.println(arg);
        }                
    }
    
}
