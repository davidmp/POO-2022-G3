/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.encript;

import java.util.HashMap;

public class EncriptSHA1 extends Observer {

    public EncriptSHA1(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addTextEncript(String msg, String typex) {
        subject.setState(msg, typex);
    }

    @Override
    public Object encrypt(String msg, String typex) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance("SHA1");
            byte[] array = md.digest(msg.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public HashMap<Integer, Object> sendEncript() {
        return subject.notifyObservers();
    }
}
