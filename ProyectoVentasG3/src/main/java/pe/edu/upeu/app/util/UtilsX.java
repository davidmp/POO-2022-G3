package pe.edu.upeu.app.util;

import java.net.URL;

/**
 *
 * @author LABORATORIO_2
 */
public class UtilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }
}
