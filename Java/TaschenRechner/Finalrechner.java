import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Finalrechner {

    double add(double z1, double z2) {
        return z1 + z2;
    }

    double sub(double z1, double z2) {
        return z1 - z2;
    }

    double div(double z1, double z2) {
        return z1 / z2;
    }

    double mult(double z1, double z2) {
        return z1 * z2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Bitte geben sie die erste Zahl ein: ");
            double zahl1 = s.nextDouble();
            System.out.print("Bitte geben sie die zweite Zahl ein: ");
            double zahl2 = s.nextDouble();
            System.out.print("Bitte geben sie eine Rechenoperation ein (+ - * /): ");
            String op = s.next();
            Finalrechner r = new Finalrechner();
            switch (op) {
                case "+":
                    System.out.println("Ergebnis: " + r.add(zahl1, zahl2));
                    break;
                case "-":
                    System.out.println("Ergebnis: " + r.sub(zahl1, zahl2));
                    break;
                case "*":
                    System.out.println("Ergebnis: " + r.mult(zahl1, zahl2));
                    break;
                case "/":
                    System.out.println("Ergebnis: " + r.div(zahl1, zahl2));
                    break;
                default:
                    System.out.println("Fehlerhafte eingabe. Bitte versuchen sie es erneut.");
            }
        } catch (java.util.InputMismatchException e) {
               System.out.println("Fehlerhafte eingabe. Bitte versuchen sie es erneut.");
        }       
    }
}