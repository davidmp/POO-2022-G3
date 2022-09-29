
package pe.edu.upeu.app.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author LABORATORIO_2
 */
public class GUIMain{
    JFrame frame=new JFrame();
    public GUIMain(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(new Dimension(screenSize.width, (screenSize.height)-36));
        frame.setVisible(true);
    }
        
}
