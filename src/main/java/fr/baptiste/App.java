package fr.baptiste;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        try (Scanner clavier = new Scanner(System.in)) {
            System.out.println("Veuillez entrer le NOM1 :");
            String NOM1 = clavier.next();
            
            System.out.println("Veuillez entrer le Nombre :");
            int NOMBRE = clavier.nextInt();

            System.out.println("Veuillez entrer le NOM2 :");
            String NOM2 = clavier.next();
            
            System.out.println("Veuillez entrer l'adjectif :");
            String ADJECTIF = clavier.next();
            
            
            System.out.println("Il était une fois un " + NOM1 + " qui avait " + NOMBRE + " " + NOM2 + ". Cela le rendait très "+ ADJECTIF +" ");
        }

    }
    
}
