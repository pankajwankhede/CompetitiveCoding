import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem URL: https://www.hackerrank.com/challenges/apple-and-orange


*/
public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apple_Count=0;
        int orange_Count=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int lengthOfApple=a+apple[apple_i];
            if((lengthOfApple>=s) && (lengthOfApple<=t))
                apple_Count++;

        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int lengthOfOrange=b+orange[orange_i];
            if((lengthOfOrange>=s) && (lengthOfOrange<=t))
                orange_Count++;
        }
        System.out.println(apple_Count);
        System.out.println(orange_Count);

    }
}