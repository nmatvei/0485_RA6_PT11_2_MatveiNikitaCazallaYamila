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
    
    //FUNCIONA
    public int sizeLlista() {
        return llista.size();
    }
    
    //FUNCIONA
    public int edatMenor() {
        
        int minimMenor = 100;
        int edat = 0;
        
        for (int i = 0; i < llista.size(); i++) {
            
            if (llista.get(i) instanceof Persona) {
                Persona p = (Persona) llista.get(i);
                edat = p.getEdat();
            } else if (llista.get(i) instanceof Animal) {
                Animal a = (Animal) llista.get(i);
                edat = a.getEdat();
            }
            
            if (edat < minimMenor) {
                minimMenor = edat;
            }
            
        }
        
        return minimMenor;
    }
    
    //FUNCIONA
    public void demanarInfo() {
        
        T objecte;
        
        for (int i = 0; i < llista.size(); i++) {
            objecte = llista.get(i);
            System.out.println(objecte.toString());
        }
    }
    
}
