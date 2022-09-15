/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.poo;

/**
 *
 * @author LABORATORIO_2
 */
public class PooUnidad1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona p=new Persona();
        p.setNombre("David");
        p.setEdad(25);
        System.out.println("Nombre:"+p.getNombre());
        System.out.println("Edad:"+p.getEdad());
        p.saludo();
    }
}
