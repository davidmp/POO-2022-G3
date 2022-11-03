/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.prox;

/**
 *
 * @author LABORATORIO_2
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        JOptionPane.showMessageDialog(new JFrame(), "Visualizando imagen", "Mostrar Imagen",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getFile(fileName)));
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }
}
