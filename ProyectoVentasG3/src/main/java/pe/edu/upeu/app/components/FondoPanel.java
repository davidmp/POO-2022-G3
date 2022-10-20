/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.components;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import pe.edu.upeu.app.util.UtilsX;

/**
 *
 * @author LABORATORIO_2
 */
public class FondoPanel extends JPanel {

    private BufferedImage image;
    public String nombreImg = "fondo.png";
    public int cornerRadius = 0;
    UtilsX obj = new UtilsX();

    public FondoPanel() {
    }

    public FondoPanel(String imgName, int cornerRadius) {
        this.nombreImg = imgName;
        this.cornerRadius = cornerRadius;
    }

    @Override
    public void paint(Graphics g) {
        try {
            image = ImageIO.read(obj.getFile(nombreImg));
        } catch (Exception e) {
        }
        image = makeRoundedCorner(image, cornerRadius);
        g.setColor(getBackground());
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    public static BufferedImage makeRoundedCorner(BufferedImage image, int cornerRadius) {
        int w = image.getWidth();
        int h = image.getHeight();
        BufferedImage output = new BufferedImage(w, h,
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = output.createGraphics();
        g2.setComposite(AlphaComposite.Src);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fill(new RoundRectangle2D.Float(0, 0, w, h,
                cornerRadius, cornerRadius));
        g2.setComposite(AlphaComposite.SrcAtop);
        g2.drawImage(image, 0, 0, null);
        g2.dispose();
        return output;
    }

}
