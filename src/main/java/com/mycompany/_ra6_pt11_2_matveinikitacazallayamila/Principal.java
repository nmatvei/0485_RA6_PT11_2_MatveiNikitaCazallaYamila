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
        
        MyGenericArrayList llista = new MyGenericArrayList();
        
        llista.addElement(animal1);
        llista.addElement(animal2);
        
        System.out.println(llista.edatMenor());
        
    }
}
