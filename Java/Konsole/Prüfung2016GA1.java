
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
class log {

    public String datum;
    public String Uhrzeit;
    public int PassNummer;
    public int PassArt;
    public String LiftNR;
    public int Laenge;

    public log(String datum, String Uhrzeit, int PassNummer, int PassArt, String LiftNr, int Laenge) {
        this.datum = datum;
        this.Uhrzeit = Uhrzeit;
        this.PassNummer = PassNummer;
        this.PassArt = PassArt;
        this.LiftNR = LiftNr;
        this.Laenge = Laenge;
    }

}

public class Prüfung2016GA1 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<log> eintrag = new ArrayList<log>();

    public void parse(String line) {

        String[] split = null;
        String[] prep = null;

        try {
            Pattern p = Pattern.compile("\u007C", Pattern.LITERAL);
            split = p.split(line);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (int i = 0; i < split.length; i++) {
            eintrag.add(new log(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]), split[4], Integer.parseInt(split[5])));
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Prüfung2016GA1 ga = new Prüfung2016GA1();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("LogSkipass.txt"));
            while ((br.readLine()) != null) {
                ga.parse(br.readLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int count = 0;
        for (int i = 0; i < eintrag.size(); i++) {
            if (eintrag.get(i).PassNummer == 30201) {
                count = count + eintrag.get(i).Laenge;
            }
        }
        System.out.println(count);
    }

}
