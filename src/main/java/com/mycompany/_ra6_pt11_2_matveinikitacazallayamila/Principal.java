package com.mycompany._ra6_pt11_2_matveinikitacazallayamila;

/**
 * Script on es proven les clàses Animal, Persona i les llistes on es guarden 
 * (MyGenericArrayList).
 * 
 * @author Nikita i Yamila
 */
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("DEMOSTRACIÓ DEL FUNCIONAMENT DE LA PROGRAMACIÓ "
                + "GENÈRICA");
        System.out.println("Primerament, demostrarem l'ús de les clàses Persona "
                + "i Animal:");
        
        System.out.println("\nDeclarem una persona anomenada Pep Pujol, amb DNI "
                + "12345678A i una edat de 4 anys.");
        Persona persona1 = new Persona(4, "Pep", "Pujol", "12345678A");
        System.out.println("En Pep pot:");
        System.out.println("\tSaludar-nos: " + persona1.saludar());
        System.out.println("\tDormir: " + persona1.dormir());
        System.out.println("\tMostrar tota la seva informació:");
        System.out.println("\t\n" + persona1.toString());
        
        System.out.println("\nAra declarem a un gos de 5 anys amb el nom de Max");
        Animal animal1 = new Animal("Max", "Gos", 5);
        System.out.println("En Max pot:");
        System.out.println("\tGrunyir: " + animal1.ferSoroll());
        System.out.println("\tDormir: " + animal1.dormir());  
        System.out.println("\tMostrar tota la seva informació:");
        System.out.println("\t\n" + animal1.toString());
        
        System.out.println("\nTambé podem declarar animals i persones sense "
                + "informació:");
        Persona personaBuida = new Persona();
        Animal animalBuit = new Animal();
        System.out.println(personaBuida.toString());
        System.out.println(animalBuit.toString());
        
        System.out.println("\nAra veurem veurem l'ús de la programació genèrica "
                + "amb llistes");
        System.out.println("Podem crear dues llistes diferents i poder introduir "
                + "en una animals i en l'altre persones, sense especificar abans"
                + " de quin tipus serà cadascuna");
        System.out.println("\nUn cop creades, amb aquestes llistes podem:");
        MyGenericArrayList llistaPersones = new MyGenericArrayList();
        MyGenericArrayList llistaAnimals = new MyGenericArrayList();

        System.out.println("\t- Afegir persones i animals amb el mètode addElement "
                + "(afagirem les persones que hem declarat abans i dues noves, "
                + "el Marc i la Laia. Pel que fa animals, afagirem un gat de nom Mitxel"
                + " i un conill de nom Bugs Bunny)");
        /*Afegim les persones*/
        llistaPersones.addElement(persona1);
        llistaPersones.addElement(new Persona(26, "Marc", "Soler", "23456789Y"));
        llistaPersones.addElement(new Persona(32, "Laia", "Ferrer", "87654321Y"));
        llistaPersones.addElement(personaBuida);
        /*Afegim els animals*/
        llistaAnimals.addElement(animal1);
        llistaAnimals.addElement(new Animal("Mitxel", "Gat", 3));
        llistaAnimals.addElement(new Animal("Bugs Bunny", "Conill", 2));
        llistaAnimals.addElement(animalBuit);

        System.out.println("\t- Podem conseguir objectes amb el mètode getObjecte "
                + "(per exemple, treurem l'objecte referent a la Laia o en Mitxel"
                + "i guardar-los en una variable, per exemple)");
        /*Estructura TRY-CATCH per controlar qualsevol execepció llançada*/
        try{
            EsserViu persona2 = llistaPersones.getObject(2);
            EsserViu animal2 = llistaAnimals.getObject(1);
        } catch(Exception e){ System.err.println(e.getMessage());}
        
        System.out.println("\t- Podem eliminar persones i animals amb el mètode "
                + "removeElement (per exemple, la persona i l'animal amb dades buides "
                + "que són a la posició 3)");
        /*Estructura TRY-CATCH per controlar qualsevol execepció llançada*/
        try{
            llistaPersones.removeElement(3);
            llistaAnimals.removeElement(3);
        } catch(Exception e){ System.err.println(e.getMessage());}
        
        System.out.println("\t- Podem dir la llargada de les llistes amb sizeLlista");
        System.out.println("\t\t- Llargada de la llista de persones: "
                + llistaPersones.sizeLlista());
        System.out.println("\t\t- Llargada de la llista d'animals: " 
                + llistaAnimals.sizeLlista());
        
        System.out.println("\t- Podem dir l'edat més de les llistes amb edatMenor");
        System.out.println("\t\t- Edat més petita de la llista de persones: "
                + llistaPersones.edatMenor());
        System.out.println("\t\t- Edat més petita de la llista d'animals: " 
                + llistaAnimals.edatMenor());
        
        System.out.println("\t- Podem mostrar la informació d'un sol element de "
                + "la llista");
        System.out.println("\t  Informació de l'animal en la posició numero 1");
        llistaAnimals.demanarInfo(1);
        System.out.println("\n\t- O podem demanar la informació de tots els elements "
                + "d'una llista");
        System.out.println("\t  Informació de totes les persones de la llista de "
                + "persones");
        llistaPersones.demanarInfo();
    }
}
