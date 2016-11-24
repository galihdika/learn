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
public class Codility2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 165;
        System.out.println(solution(N));
    }
    
    public static int solution(int N) {
        // write your code in Java SE 8\
        String S = Integer.toBinaryString(N);
        int binary = Integer.parseInt(S);
        
        S = S.replaceAll("1", " ");
        String Sarr[] = S.split("\\s");
        
        int max = 0;
        for(int i=0; i<Sarr.length; i++) {
            if(Sarr[i].length() >  max) {
                max = Sarr[i].length();
            }
        }
        
        return max;
    }
    
}
