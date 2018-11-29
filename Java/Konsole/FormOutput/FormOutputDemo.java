/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class FormOutputDemo {

    /**
     * @param args the command line arguments
     */
    static final int zahl = 10;

    static void show() {
        int anz = 10;
        double summe = 99.98765;
        float anteil = 0.00005432f;
        String type = "Airbus A-380";
        System.out.println("0123456789012345678901234567890123456789");
        System.out.printf("Anzahl : %5d Summe : %8.3e\n", anz, anteil);
        System.out.format("Anzahl : %5d Summe : %8.3e\n", anz, summe);
        System.out.printf("Anzahl : %5d Summe : %8.3f\n", anz, summe);
        System.out.printf("Anzahl : %-5d Summe : %8.3f\n", anz, summe);
        System.out.printf("Anzahl : %0+5d Summe : %08.3f\n", anz, summe);
        System.out.printf("Anteil : % .4g\n", anteil);
        System.out.printf("Anteil : %.4E\n", anteil);
        System.out.printf("Anteil : %.4f\n", anteil);
        System.out.printf("Typ : %s\n", type);
        System.out.printf("Typ : %15s\n", type);
        System.out.printf("Typ : %5s\n", type);
        System.out.printf("Typ : %5.6S\n", type);
        System.out.printf("Typ : %8.6s\n", type);
        System.out.printf("%B\n", true);
    }

    static void dezout() {
        System.out.printf("Zahl Dezimal : %d\n", zahl);
    }

    static void octout() {
        System.out.printf("Zahl Oktal : %o\n", zahl);
    }

    static void hexout() {
        System.out.printf("Zahl Hexa : 0x%X\n", zahl);
    }
    
    static void binout() {
        System.out.println("Zahl Bin : "+Integer.toBinaryString(zahl));
    }
    
    static void euro(){
        System.out.printf("Zahl € : %.2f€\n", Double.parseDouble(Integer.toString(zahl)));
    }

    public static void main(String[] args) {
        // TODO code application logic here
		show();
		dezout();
		octout();
		hexout();
		binout();
        euro();
    }

}
