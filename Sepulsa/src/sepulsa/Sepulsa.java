package sepulsa;

import java.io.*;
import java.util.*;

/**
 *
 * @author galihdika
 */
public class Sepulsa {
    static String output;
    public static void main(String[] args) {
        //input
        String pesan = "akucintakamu";
               
        pesanRahasia(pesan);       
    }
    public static void pesanRahasia(String pesan) {
        int L = pesan.length();
        int M = L;
        int K = 1;
        while( K*K != M) {
            if (K*K < M) {
                K++;
            }
            else{
                M++;
            }
        }
        int size = (int)Math.sqrt(M);
        
        char arr[][] = new char[size][size];
        int count = 0;
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(count == L-1) {
                    arr[i][j] = pesan.charAt(count);
                }
                else if(count > L-1) {
                    arr[i][j] = '*';
                }
                else {
                    arr[i][j] = pesan.charAt(count);
                }
                count++;
            }
        }
        
        char arr2[][] = new char[size][size];
        output = "";
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                arr2[i][j] = arr[size-j-1][i];
                if(arr2[i][j] == '*') {
                    continue;
                }
                else {
                    output += String.valueOf(arr2[i][j]);
                }
            }
        }
        System.out.print(output);
    }
}