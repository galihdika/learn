package sepulsa2;

import java.util.*;
/**
 *
 * @author galihdika
 */
public class Sepulsa2 {

    public static void main(String[] args) {
        //Input
        String angka = "1223556";
        
        munculSekali(angka);
    }
    
    static void munculSekali(String inputAngka) {
        int L = inputAngka.length();
               
        //string to int[]
        int arr[] = new int[L];
        for(int i=0; i<L; i++) {
            arr[i] = Character.getNumericValue(inputAngka.charAt(i));
        }
        
        //mencari max int
        int max = 0;
        for(int i=0; i<L; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
      
        //menghitung jumlah angka sama dan print angka single
        System.out.print("array(");
        for(int i=1; i<=max; i++) {
            int count = 0;
            for(int j=0; j<L; j++) {
                if(i == arr[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(" " + i + " ");
            }
        }
        System.out.print(")");
    }
}