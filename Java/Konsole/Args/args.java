/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class args {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-d") || args[i].startsWith("--debug")) {
                System.out.println("Debugg Mode");
                System.exit(0);
            }
            if (args[i].startsWith("-log")) {
                try {
                    System.out.println("Log Path: " + args[i + 1]);
                } catch (Exception e) {
                    System.out.println("ERROR: No Log Path!");
                }
                System.exit(0);
            }
            System.out.println(" " + args[i]);
        }
    }

}
