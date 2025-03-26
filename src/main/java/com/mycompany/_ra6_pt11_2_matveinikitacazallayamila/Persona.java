package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

/**
 * Classe Persona que estén de la classe abstracte EsserViiu
 * 
 * @author Nikita i Yamila
 */
public class Persona extends EsserViu {
    
    /*Declaració de variables i atributs*/
    private int edat;
    private String nom;
    private String cognom;
    private String dni;
    final static int EDAT_DEFAULT = 18;
    final static String NOM_DEFAULT = "", COGNOM_DEFAULT = "", 
                 DNI_DEFAULT = "00000000T";
    
    /**
     * Constructor per defecte que truca al constructror parametritzat.
     */
    public Persona(){
        this(EDAT_DEFAULT, NOM_DEFAULT, COGNOM_DEFAULT, DNI_DEFAULT);
    }
    
    /**
     * Constructor parametritzat que rep com a paremetres el nom, cognom, edat i
     * dni de la persona.
     * @param edat
     * @param nom
     * @param cognom
     * @param dni 
     */
    public Persona(int edat, String nom, String cognom, String dni) {
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
    }
    
    /**
     * Mètode sobrescrit GET per conseguir l'edat de la persona
     * @return edat de la persona
     */
    @Override
    public int getEdat() {
        return edat;
    }
    
    /**
     * Mètode GET per conseguir el nom de la persona
     * @return nom de la persona
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * Mètode GET per conseguir el cognom de la persona
     * @return cognom de la persona
     */
    public String getCognom() {
        return cognom;
    }
    
    /**
     * Mètode GET per conseguir el dni de la persona
     * @return dni de la persona
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * Mètode saludar per saludar a l'usuari amb el nom de l'objecte
     */
    public void saludar(){
        System.out.println("Hola! Soc el/la " + getNom());
    }
    
    /**
     * Mètode sobreescrit toString per poder mostrar la infromació de la persona
     * @return informació de la persona
     */
    @Override
    public String toString() {
        String infoPersona = "PERSONA:" + "\n\tNom: " + nom + "\n\tCognom: "
                + cognom + "\n\tDNI: " + dni + "\n\tEdat: " + edat;
        return infoPersona;
    }
}