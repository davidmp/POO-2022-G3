
package pe.edu.upeu.app.util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
* Clase Principal para manejo de alertas
* @see <br>
* El constructor resive 3 parametros (mensaje, tipo_de_alerta, icono_personalizado)
* <h1>El parámetro tipoDialog tiene las siguientes opciones: JOptionPane</h1>
* <ol><li>WARNING_MESSAGE</li><li>ERROR_MESSAGE</li><li>PLAIN_MESSAGE</li><li>INFORMATION_MESSAGE</li>
* <li>QUESTION_MESSAGE</li></ol>
* 
* @see <a href = "https://github.com/davidmp" />Aqui Github</a>
* @see <a href = "https://javadesde0.com/tag/que-es-joptionpane/" />Tutorial</a>
* @return No hay retorno de metodos
*/
public class MsgBox {
    JPanel p=new JPanel();
    UtilsX util=new UtilsX();
    ImageIcon icon;

    public MsgBox(String msg, int tipoDialog, String iconPropio) {
        
        if (!iconPropio.trim().equals("")) {
            icon=new ImageIcon(util.getFile(iconPropio));
            JOptionPane.showMessageDialog(p, msg, "Mensaje", tipoDialog,icon);
        }else{
            JOptionPane.showMessageDialog(p, msg, "Mensaje", tipoDialog);  
        }
                      
    } 
    
}
