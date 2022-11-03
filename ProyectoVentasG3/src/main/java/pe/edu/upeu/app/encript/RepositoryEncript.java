/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.encript;

/**
 *
 * @author LABORATORIO_2
 */
public class RepositoryEncript {

    //EncriptMD5 emd5;
    EncriptRSA rsa;

    public RepositoryEncript(Subject subject) {
        this.rsa = new EncriptRSA(subject);
        new EncriptSHA1(subject);
        new EncriptMD5(subject);
    }

    public EncriptRSA getInstance() {
        return rsa;
        //eturn emd5;
    }
}
