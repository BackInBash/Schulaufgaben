/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public class rechner {

    public void error(String ro) {

        if (!ro.equals("+") || ro.equals("-") || ro.equals("/") || ro.equals("*")) {
            System.out.println("Fehler: Für den Operator bitte nur + - * oder / eingeben !");
            System.exit(0);
        }

    }

    public void operator(String ro, double zahl1, double zahl2) {

        switch (ro) {
            case "+": {
                double erg = zahl1 + zahl2;
                System.out.println("Das Ergebniss lautet " + zahl1 + ro + zahl2 + "=" + erg);
                break;
            }
            case "-": {
                double erg = zahl1 - zahl2;
                System.out.println("Das Ergebniss lautet " + zahl1 + ro + zahl2 + "=" + erg);
                break;
            }
            case "*": {
                double erg = zahl1 * zahl2;
                System.out.println("Das Ergebniss lautet " + zahl1 + ro + zahl2 + "=" + erg);
                break;
            }
            case "/": {
                double erg = zahl1 / zahl2;
                System.out.println("Das Ergebniss lautet " + zahl1 + ro + zahl2 + "=" + erg);
                break;
            }
            default:
                
            break;
        }

    }
}
