/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

import java.util.ArrayList;
/**
 *
 * @author Nikita i Yamila
 */
public class MyGenericArrayList <T> {
    
    private ArrayList<T> llista = new ArrayList<>();

    public MyGenericArrayList() {
        
    }
    
    
    // FUNCIONA
    public void addElement(T objecte) {
        llista.add(objecte);
    }
    
    //FUNCIONA
    public void removeElement(int pos) {
        llista.remove(pos);
    }
    
    //FUNCIONA
    public T getPosicio(int pos) {
        return llista.get(pos);
    }
    
    public int sizeLlsita() {
        return llista.size();
    }
    
    public int edatMenor() {
        
        int minimMenor = 100;
        T objecte;
        int edat;
        
        for (int i = 0; i < llista.size(); i++) {
            objecte = llista.get(i);
        }
        
        return 0;
    }
    
    public String demanarInfo() {
        
        String info = "";
        T objecte;
        
        for (int i = 0; i < llista.size(); i++) {
            objecte = llista.get(i);
            info += objecte.toString();
        }
        return info;
    }
    
}
