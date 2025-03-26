package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

import java.util.ArrayList;

/**
 * Script on es proven les clàses Animal, Persona i 
 * @author Nikita i Yamila
 */
public class Principal {

    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Max", "Gos", 5);
        Animal animal2 = new Animal();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(4, "Pep", "Pujol", "12345678A");
        /*
        MyGenericArrayList<Animal> a = new MyGenericArrayList<>();
        MyGenericArrayList<Persona> p = new MyGenericArrayList<>();
        
        System.out.println("--- Afegir objectes ---");
        a.addElement(animal1);
        a.addElement(animal2);
        p.addElement(persona1);
        p.addElement(persona2);
        
        System.out.println("Mida llista p: " + p.sizeLlista());
        System.out.println("Mida llista p: " + a.sizeLlista());
        
        System.out.println(a.demanarInfo());
        System.out.println(p.demanarInfo());
        System.out.println("Posició: " + a.getObject(0));
        
        System.out.println(a.edatMenor());
        System.out.println(p.edatMenor());
        
        
        System.out.println("--- Eliminar objectes ---");
        a.removeElement(0);
        
        System.out.println(a.demanarInfo());
        System.out.println(p.demanarInfo());*/
        
        
        
        System.out.println(animal1.toString());
        
    }
}
