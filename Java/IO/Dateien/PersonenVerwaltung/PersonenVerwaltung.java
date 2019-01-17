/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author
 */
public class PersonenVerwaltung {

    /**
     * @param args the command line arguments
     */
    private static BufferedWriter br = null;

    private static void write(String input) {
        try {
            br = new BufferedWriter(
                 new FileWriter("hello.txt", true));
            br.write(input);
            br.newLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void closeWriter() throws IOException {
        br.close();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Input Vorname, Nachname, Adresse, Tel.");
            String line = input.readLine();
            input.close();
            write(line);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                closeWriter();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
