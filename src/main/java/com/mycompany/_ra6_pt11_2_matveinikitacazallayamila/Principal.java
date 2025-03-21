package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

import java.util.ArrayList;

/**
 *
 * @author nikita i yamila
 */
public class Principal {

    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Max", "Gos", 5);
        Animal animal2 = new Animal();
        Persona persona = new Persona();
        
        MyGenericArrayList<Animal> a = new MyGenericArrayList<>();
        MyGenericArrayList<Persona> p = new MyGenericArrayList<>();
        
        System.out.println("--- Afegir objectes ---");
        a.addElement(animal1);
        a.addElement(animal2);
        p.addElement(persona);
        
        System.out.println(a.demanarInfo());
        System.out.println(p.demanarInfo());
        System.out.println("Posició: " + a.getPosicio(0));
        
        
        System.out.println("--- Eliminar objectes ---");
        a.removeElement(0);
        
        System.out.println(a.demanarInfo());
        System.out.println(p.demanarInfo());
        
        
        
    }
}
