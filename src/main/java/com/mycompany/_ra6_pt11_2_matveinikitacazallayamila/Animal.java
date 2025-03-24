/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

/**
 * Classe Animal
 * @author Yamila i Nikita
 */
public class Animal {
    
    private int edat;
    private String nom, tipus;
    final int EDAT_ANIMAL = 3;
    final private String NOM_ANIMAL = "", TIPUS_ANIMAL = "";
    
    public Animal() {
        this.nom = NOM_ANIMAL;
        this.tipus = TIPUS_ANIMAL;
        this.edat = EDAT_ANIMAL;
    }
    
    public Animal(String nom, String tipus, int edat) {
        this.nom = nom;
        this.tipus = tipus;
        this.edat = edat;
    }
    
    public void ferSoroll() {
        System.out.println("Grrrrrrrr");
    }
    
    public void dormir() {
        System.out.println("Zzzzzzzz");
    }
    
    public int getEdat() {
        return edat;
    }

    @Override
    public String toString() {
        String infoAnimal = "ANIMAL:" + "\n\tNom: " + nom + "\n\tTipus: " +
                tipus + "\n\tEdat: " + edat;
        return infoAnimal;
    }
    
    
    
}
