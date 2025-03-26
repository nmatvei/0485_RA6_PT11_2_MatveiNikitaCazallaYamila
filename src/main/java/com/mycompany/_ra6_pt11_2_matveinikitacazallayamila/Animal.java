package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

/**
 * Classe Animal que estén de la classe abstracte EsserViiu
 * 
 * @author Nikita i Yamila
 */
public class Animal extends EsserViu {
    
    /*Declaració de variables i atributs*/
    private int edat;
    private String nom, tipus;
    final static int EDAT_DEFAULT = 3;
    final static private String NOM_ANIMAL = "", TIPUS_ANIMAL = "";
    
    /**
     * Constructor per defecte que crida al constructor parametritzat
     */
    public Animal() {
        this(NOM_ANIMAL, TIPUS_ANIMAL, EDAT_DEFAULT);
    }
    
    /**
     * Constructor parametritzat que dona valor als atributs amb els paràmetres rebuts
     * @param nom
     * @param tipus
     * @param edat 
     */
    public Animal(String nom, String tipus, int edat) {
        this.nom = nom;
        this.tipus = tipus;
        this.edat = edat;
    }
    
    /**
     * Mètode ferSoroll per grunyir
     */
    public void ferSoroll() {
        System.out.println("Grrrrrrrr");
    }
    
    
    /**
     * Mètode sobrescrit GET per conseguir l'edat de l'animal
     * @return edat de l'animal
     */
    @Override
    public int getEdat() {
        return edat;
    }
    /**
     * Mètode GET per obtenir el nom de l'animal
     * @return nom de l'animal
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Mètode GET per obtenir el tipus de l'animal
     * @return tipus d'animal
     */
    public String getTipus() {
        return tipus;
    }
    
    /**
     * Mètode sobrescrit toString per mostrarla informació de l'animal
     * @return informació de l'animal 
     */
    @Override
    public String toString() {
        String infoAnimal = "ANIMAL:" + "\n\tNom: " + nom + "\n\tTipus: " +
                tipus + "\n\tEdat: " + edat;
        return infoAnimal;
    }
}
