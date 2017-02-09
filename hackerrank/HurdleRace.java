import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Problem URL: https://www.hackerrank.com/contests/hourrank-17/challenges/the-hurdle-race*/
public class HurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max_Height=k;
        
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i]>max_Height){
                max_Height=height[height_i];
                
            }
                
        }
        System.out.println(max_Height-k);
        // your code goes here
    }
}
