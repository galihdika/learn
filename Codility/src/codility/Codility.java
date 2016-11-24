/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author ataga
 */
public class Codility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 1023;
        System.out.println(solution(N));
    }
    
    public static int solution(int N) {
        // write your code in Java SE 8\
        int K=0;
        
        while(power(2,K) <= N) {
            K++;
        }
        K--;
        
        int[] val = new int[K+1];
        int a = 0;
        int binary = N - power(2,K);
        val[a] = 1;
        while(K > 0) {
            K--;
            a++;
            int temp = binary;
            temp -= power(2,K);
            if(temp>=0) {
                val[a] = 1;
                binary = temp;
            }
            else {
                val[a] = 0;
            }
        }
        
        String stringResult = "";
        for(int i=0; i<val.length; i++) {
            stringResult += String.valueOf(val[i]);
        }
        return Integer.parseInt(stringResult);
    }
    
    //a^b
    static int power(int a, int b) {
        if(b > 0) {
            return  a * power(a, b-1);
        }
        else {
            return 1;
        }
    }
    
}
