
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
public class Zahlenkette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=i; j<=i*i; j=j+i){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
}
