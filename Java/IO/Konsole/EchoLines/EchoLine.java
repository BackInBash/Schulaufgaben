
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class EchoLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(
            new InputStreamReader(System.in));
            String vorname;
            String nachname;
            String adresse;
            
            while((vorname = br.readLine()) != null && (nachname = br.readLine()) != null && (adresse = br.readLine()) != null){
                System.out.println("Vorname: "+vorname +"\nNachname: "+ nachname +"\nAdresse: "+ adresse);
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
