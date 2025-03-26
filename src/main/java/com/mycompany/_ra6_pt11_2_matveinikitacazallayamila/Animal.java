package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

/**
 * Classe Animal
 * 
 * @author Nikita i Yamila
 */
public class Animal extends EsserViu {
    /*Declaració de variables i atributs*/
    private int edat;
    private String nom, tipus;
    final static int EDAT_DEFAULT = 3;
    final static private String NOM_ANIMAL = "", TIPUS_ANIMAL = "";
    
    public Animal() {
        this(NOM_ANIMAL, TIPUS_ANIMAL, EDAT_DEFAULT);
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
    
    @Override
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
