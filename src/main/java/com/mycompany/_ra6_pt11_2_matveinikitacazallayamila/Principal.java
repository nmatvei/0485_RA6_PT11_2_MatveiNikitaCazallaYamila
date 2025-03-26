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
        
        System.out.println("\nTambé podem declarar animals i persones sense informació:");
        Persona personaBuida = new Persona();
        Animal animalBuit = new Animal();
        System.out.println(personaBuida.toString());
        System.out.println(animalBuit.toString());
        
        System.out.println("\nAra veurem veurem l'ús de la programació genèrica amb llistes");
        System.out.println("Podem crear dues llistes diferents i poder introduir "
                + "en una animals i en l'altre persones, sense especificar abans"
                + " de quin tipus serà cadascuna");
        System.out.println("\nCreem una primera llista on posarem persones:");
        MyGenericArrayList llistaPersones = new MyGenericArrayList();
        System.out.println("\t- Podem afegir persones amb el mètode addElement "
                + "(afagirem les persones que hem declarat abans i dues noves, "
                + "el Marc i la Laia)");
        llistaPersones.addElement(persona1);
        llistaPersones.addElement(new Persona(26, "Marc", "Soler", "23456789Y"));
        llistaPersones.addElement(new Persona(32, "Laia", "Ferrer", "87654321Y"));
        llistaPersones.addElement(personaBuida);
        System.out.println("\t- Podem conseguir objectes amb el mètode getObjecte (per exemple, treurem l'objecte referent a la Laia)");
        try{
            EsserViu persona2 = llistaPersones.getObject(2);
        } catch(Exception e){ System.err.println(e.getMessage());}
        System.out.println("\t- Podem eliminar persones amb el mètode removeElement (per exemple, la persona amb dades buides que és a la posició 3)");
        try{
            llistaPersones.removeElement(3);
        } catch(Exception e){ System.err.println(e.getMessage());}
        

    }
}
