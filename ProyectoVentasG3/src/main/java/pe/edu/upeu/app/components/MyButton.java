/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author LABORATORIO_2
 */
public class MyButton extends JButton {

    public boolean over;
    private Color colorOver;
    private Color color;
    private Color colorClick;

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(76, 181, 195));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setColor(getBackground());
        g2.fillRect(2, 2, getWidth() - 4, getHeight() - 4);
        super.paintComponent(grphcs);
    }

    public MyButton() {
        setContentAreaFilled(false);
        colorOver = new Color(181, 242, 254);
        color = new Color(125, 224, 237);
        colorClick = new Color(158, 212, 237);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(getColorOver());
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(getColor());
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    setBackground(colorClick);
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (over) {
                        setBackground(getColorOver());
                    } else {
                        setBackground(getColor());
                    }
                }
            }
        });
    }

}
