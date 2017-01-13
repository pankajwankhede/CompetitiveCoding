import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Problem URL: https://www.hackerrank.com/challenges/circular-array-rotation*/
public class CircularRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            int inputValue = in.nextInt();
            int index=a_i+k;

            if(index>=n){
                index=Math.abs(n-index)%n;
            }
            a[index]=inputValue;
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
        

    }
}