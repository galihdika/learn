
package geekofgeek;

import java.util.*;
/**
 *
 * @author ataga
 */
public class GeekOfGeek {

    static int maxResult;
    static int minResult;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int N = sc.nextInt();
            
            int[] A = new int[N];
            for(int j=0; j<N; j++) {
                A[j] = sc.nextInt();
            }
            maxVal(A);
            System.out.println(maxResult +" "+ minResult);
        }
    }
    
    static void maxVal(int[] A) {
        int currMax;
        int currMin;
        int prevMax = A[0];
        int prevMin = A[0];
        maxResult = A[0];
        minResult = A[0];
        
        for(int i=1; i<A.length; i++) {
            currMax = Math.max(prevMax*A[i], prevMin*A[i]);
            currMin = Math.min(prevMin*A[i], prevMax*A[i]);
            maxResult = Math.max(maxResult, currMax);
            minResult = Math.min(minResult, currMin);
            prevMax = maxResult;
            prevMin = minResult;
        }        
    }
    
}
