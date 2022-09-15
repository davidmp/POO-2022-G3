/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo;

/**
 *
 * @author LABORATORIO_2
 */
public class Persona {
    //Atributos = variables
   private String nombre;
   private int edad;   
   //Metodos=acciones=comportamiento=funciones

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
    public void saludo() {
        System.out.println("Hola soy "+nombre+" y tengo la edad de "+edad);
    }
}
