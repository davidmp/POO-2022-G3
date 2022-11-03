/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.encript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Subject {

    private final List<Observer> observers;

    public Subject() {
        observers = new ArrayList();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public HashMap<Integer, Object> notifyObservers() {
        HashMap<Integer, Object> map = new HashMap<>();
        int i = 0;
        for (Observer observer : observers) {
            map.put(++i,
                    observer.encrypt(String.valueOf(getState().get(1)),
                            String.valueOf(getState().get(2)))
            );
        }
        return map;
    }

    abstract void setState(String msg, String typex);

    abstract HashMap<Integer, Object> getState();
}
