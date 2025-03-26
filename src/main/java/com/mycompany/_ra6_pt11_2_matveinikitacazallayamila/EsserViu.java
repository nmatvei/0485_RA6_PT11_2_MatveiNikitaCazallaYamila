package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

/**
 * Classe Abstracte EsserViu que permet heredar mètodes a las seves classes filles
 * 
 * @author Nikita i Yamila
 */
public abstract class EsserViu{
    /**
     * Mètode dormir per mostrar un missatge que l'esser viu (persona o animal)
     * està dormint
     */
    public void dormir(){
        System.out.println("Zzz...");
    }
    
    /**
     * Mètode abstracte GET per retornar l'edat del esser viu (persona o animal)
     * @return edat de l'esser viu
     */
    public abstract int getEdat();
}
