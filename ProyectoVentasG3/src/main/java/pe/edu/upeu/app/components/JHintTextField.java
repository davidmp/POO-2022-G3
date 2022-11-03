/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.components;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class JHintTextField extends JTextField implements FocusListener {

    private String hint;

    public JHintTextField() {
        this.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (this.getText().toString().equals(hint)) {
            this.setText("");
            this.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (this.getText().equals("")) {
            this.setHintText(this.hint);
        }
    }

    public void setHintText(String hint) {
        this.hint = hint;
        this.setText(hint);
        this.setForeground(Color.LIGHT_GRAY);
    }
}
