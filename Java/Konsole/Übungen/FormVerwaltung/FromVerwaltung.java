
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
public class FromVerwaltung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dreieck d = new Dreieck();
        Rechteck r = new Rechteck();
        Kreis k = new Kreis();

        System.out.println("Welche Fläche soll berechnet werden? 1.) Dreieck 2.) Rechteck 3.) Kreis");
        int ob = s.nextInt();
        System.out.println("Was soll berechnet werden? 1.) Umfang 2.) Fläche");
        int uf = s.nextInt();

        switch (ob) {
            case 1:
                // Dreieck
                switch (uf) {
                    case 1:
                        try{
                        System.out.println("(Dreieck/Umfang) Bitte alle drei seiten eingeben: z.B. 1,2,3");
                        String in = s.next();
                        String split[] = in.split(",");
                        System.out.println(d.umfang(Double.parseDouble(split[0]), Double.parseDouble(split[1]), Double.parseDouble(split[2])));
                        } catch(Exception ex){
                            System.out.println(ex.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("(Dreieck/Fläche) Bitte den A eingeben:");
                        double a = s.nextDouble();
                        System.out.println("(Dreieck/Fläche) Bitte höhe eingeben: ");
                        double h = s.nextDouble();
                        System.out.println(d.fläche(a, h));
                        break;
                }
                break;
            case 2:
                // Rechteck
                switch (uf) {
                    case 1:
                        System.out.println("(Rechteck/Umfang) Bitte zwei seiten eingeben: z.B. 1,2");
                        String in = s.next();
                        String split[] = in.split(",");
                        System.out.println(r.umfang(Double.parseDouble(split[0]), Double.parseDouble(split[1])));
                        break;
                    case 2:
                        System.out.println("(Rechteck/Fläche) Bitte A eingeben:");
                        double a = s.nextDouble();
                        System.out.println("(Rechteck/Fläche) Bitte B eingeben: ");
                        double h = s.nextDouble();
                        System.out.println(r.fläche(a, h));
                        break;
                }
                break;
            case 3:
                // Kreis
                switch (uf) {
                    case 1:
                        System.out.println("(Kreis/Umfang) Bitte Radius eingeben:");
                        double radius = s.nextDouble();
                        System.out.println(k.umfang(radius));
                        break;
                    case 2:
                        System.out.println("(Kreis/Fläche) Bitte Radius eingeben:");
                        double rad = s.nextDouble();
                        System.out.println(k.fläche(rad));
                        break;
                }
                break;
        }

    }

}
