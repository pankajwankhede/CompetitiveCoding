import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot
Contest: Week Of Code w30
*/
public class CandyRobot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        int noOfReplaced=0;
        int orign=n;
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        // your code goes here
        for(int i=0;i<t-1;i++){
            n=n-c[i];
            if(n<5){
                if(i<t-1)
                    noOfReplaced=noOfReplaced+(orign-n);
                    n=orign;
            }
                
        }
        System.out.println(noOfReplaced);
    }
}