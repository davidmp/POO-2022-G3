package polimorfismo;

/**
 * Estudiante
 */
public class Estudiante extends Persona{
    public String cod_univ;

    public void estudiar() {
        System.out.println("Estudiando");
    }

    public void hacerTareas() {
        System.out.println("Haciendo tareas");
    }

    public void comer() {
        System.out.println("Comiendo pollo");
    }
    
}