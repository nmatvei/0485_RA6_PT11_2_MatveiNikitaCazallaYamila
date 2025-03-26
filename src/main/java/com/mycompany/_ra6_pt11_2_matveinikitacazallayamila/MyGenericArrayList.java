package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

import java.util.ArrayList;

/**
 * Classe MyGenericArrayList per guardar objectes disn d'ella sense especificar
 * quin però que estenen de la classe abstracte EsserViu
 * 
 * @author Nikita i Yamila
 * @param <T extends EsserViu>
 */
public class MyGenericArrayList <T extends EsserViu> {
    
    /*Declaració de variables i atributs*/
    private ArrayList<T> llista = new ArrayList<>();
    private final int EDAT_MAX = Integer.MAX_VALUE;
    
    /*Constructor buït per instànciar un objecte però no donar valor a cap 
    atribut*/
    public MyGenericArrayList() {}
    
    /**
     * Mètode addElement per afegir un objecte dins de la llista
     * @param objecte
     */
    public void addElement(T objecte) {
        llista.add(objecte);
    }
    
    /**
     * Mètode removeElement per treure el objecte en la posició desitjada
     * @param posicio
     * @throws Exception
     */
    public void removeElement(int posicio) throws Exception{
        if (posicio > llista.size() || posicio < 0){
            throw new IndexOutOfBoundsException("Posició de l'array fora de rang");
        }
        llista.remove(posicio);
    }
    
    /**
     * Mètode GET per retornar l'objecte de la posició desitjada
     * @param posicio
     * @return objecte en la posició especificada
     * @throws Exception
     */
    public T getObject(int posicio) throws Exception{
        if (posicio > llista.size() || posicio < 0){
            throw new IndexOutOfBoundsException("Posició de l'array fora de rang");
        }
        return llista.get(posicio);
    }
    
    /**
     * Mètode que diu la llargada de la llista
     * @return llargada de la llista
     */
    public int sizeLlista() {
        return llista.size();
    }
    
    /**
     * Mètode edatMenor per determinar quina és l'edat més petita de la llista
     * d'objectes que tenim
     * @return edat més petita de la llista
     */
    public int edatMenor() {
        /*Declaració de variables*/
        int minimMenor = EDAT_MAX;
        int edat;
        
        /*Estructura FOR per pasar per tots els elements de la taula, extreure la
        seva edat i veure si és mès petita que la de referència*/
        for (int i = 0; i < llista.size(); i++) {
            T obj = llista.get(i);
            edat = obj.getEdat();
            if (edat < minimMenor) {
                minimMenor = edat;
            }
        }
        /*Retornem */
        return minimMenor;
    }
    
    /**
     * Mètode demanarInfo per mostra la informació de tots els objectes de la llista
     */
    public void demanarInfo() {
        /*Declaració de variables*/
        T objecte;
        
        /*Estructura FOR per pasar per cada objecte de la llista i mostrar la seva
        informació amb el toString*/
        for (int i = 0; i < llista.size(); i++) {
            objecte = llista.get(i);
            System.out.println(objecte.toString());
        }
    }
    
    /**
     * Mètode sobrecarregat demanarInfo per poder demanar la informació d'un objecte
     * en una posició concreta.
     * @param posicio
     */
    public void demanarInfo(int posicio){
        /*Declaració de variables*/
        T objecte = llista.get(posicio);
        
        /*Imprimim per pantalla la informació del objecte amb el toString*/
        System.out.println(objecte.toString());
    }
}