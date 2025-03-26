package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

import java.util.ArrayList;

/**
 * Classe MyGenericArrayList per guardar objectes disn d'ella sense especificar
 * quin
 * 
 * @author Nikita i Yamila
 * @param <T extends EsserViu>
 */
public class MyGenericArrayList <T extends EsserViu> {
    
    /*Declaració d'atributs*/
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
     */
    public void removeElement(int posicio) {
        llista.remove(posicio);
    }
    
    /**
     * Mètode GET per retornar el objecte de la posició determinada
     * @param posicio
     * @return objecte en la posició especificada
     */
    public T getObject(int posicio) {
        return llista.get(posicio);
    }
    
    /**
     * Mètode que diu la llargada de la llista
     * 
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
        
        int minimMenor = EDAT_MAX;
        int edat;
        
        
        for (int i = 0; i < llista.size(); i++) {
            T obj = llista.get(i);
            edat = obj.getEdat();
            
            /*
            if (llista.get(i) instanceof Persona) {
                Persona p = (Persona) llista.get(i);
                edat = p.getEdat();
            } else if (llista.get(i) instanceof Animal) {
                Animal a = (Animal) llista.get(i);
                edat = a.getEdat();
            }*/
            
            if (edat < minimMenor) {
                minimMenor = edat;
            }
            
        }
        
        return minimMenor;
    }
    

    /**
     * Mètode demanarInfo per mostra la informació de tots els objectes de la llista
     * @return informació de cada objecte de la llista
     */
    public void demanarInfo() {
        
        T objecte;
        
        for (int i = 0; i < llista.size(); i++) {
            objecte = llista.get(i);
            System.out.println(objecte.toString());
        }
    }
    
    /**
     * Mètode sobrecarregat demanarInfo per poder 
     * @param posicio
     * @return informació de l'objetce en aquella posició
     */
    public String demanarInfor(int posicio){
        String info = "";
        T objecte;
        
        objecte = llista.get(posicio);
        info += objecte.toString();
        
        return info;
    }
}
