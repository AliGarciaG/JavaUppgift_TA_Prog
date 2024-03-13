// Namn: Alí García
// Skriv ett program som gör om morsekod till engelska och engelska till morsekod
// Version 1.0
// Till nästa version fixa try and catch for metoden toMorseCode
package Inlamingsuppgift_TA_Prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Här deklareras variabler
        String myText;
        int choice = 0;              // Ändra värdet för att välja converter

        // skapa objekt och klass
        Scanner myScan = new Scanner(System.in);
        Converter myConverter = new Converter();

        //Skapar meny
        do {
            System.out.println();
            myConverter.marginal();
            System.out.println("        MORSE CODE CONVERTER");
            myConverter.marginal();
            System.out.println("\n1. Omvandla ord till Morsekod");
            System.out.println("2. Omvandla Morsekod till bokstäver");
            System.out.println("3. Avsluta");

            while (choice == 0 || choice < 0 || choice > 3) {   // Endast 1,2 eller 3
                System.out.print("\nVälj ett alternativ: ");
                //Try catch bokstäver, bara integer tillåts här
                try {
                    choice = Integer.parseInt(myScan.nextLine());
                } catch (NumberFormatException e) {

                    System.out.println("\nFel: " + e.getMessage());
                    System.out.println("Endast 1, 2 eller 3 accepteras, inga bokstäver!");
                    choice = 0;
                }
            }
            switch (choice) {
                // anropar metod toMorseCode
                case 1:
                    System.out.print("Skriv ett tecken eller ett ord: ");
                    myText = myScan.nextLine();
                    myConverter.toMorseCode(myText);
                    myConverter.printOutResults();
                    choice = 0;
                    break;
                // anropar metod fromMorseCode
                case 2:
                    System.out.print("Skriv Morsekod: ");
                    myText = myScan.nextLine();
                    myConverter.fromMorseCode(myText);
                    myConverter.printOutResults();
                    choice = 0;
                    break;
                case 3:
                    System.out.println("Programmet avslutas...");
                    break;
                default:
                    System.out.println("Fel nummer har matats in, försök igen!");
            }
        } while (choice != 3);    //menu anropas igen så länge man inte väljer 3
    }
}