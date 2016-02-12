import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem URL: https://www.hackerrank.com/challenges/find-point
*/

public class MidPoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
        	int Px0=in.nextInt();
        	int Py0=in.nextInt();
        	int Px1=in.nextInt();
        	int Py1=in.nextInt();
        	int midX=(2*Px1)-Px0;
        	int midY=(2*Py1)-Py0;
        	System.out.println(midX+"\t"+midY);
        }


    }
}