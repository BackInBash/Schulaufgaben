/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author m.brunsch
 */
public class ArrayStringTest {

    void sortiere(){
        
    }
    public void dreheZahlen(int n) {

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            Arrays.sort(arr);
            System.out.print(Arrays.toString(arr) + "");
            System.out.println("");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(arr[i] + "");
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        ArrayStringTest ary = new ArrayStringTest();
        ary.dreheZahlen(10);

    }

}
