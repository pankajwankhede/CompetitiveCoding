/*
Contest: 101 Hack
Date: January 2015
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean isClassThere(int n, int k, int t[]){
		int count=0;
		for(int i=0;i<n;i++){
			if(t[i]<=0)
				count++;
		}
		return (count>=k);
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int T =in.nextInt();
        while(T>0){
        	int N,K;
        	N=in.nextInt();
        	K=in.nextInt();
        	int[] tim=new int[N];
        	for(int i=0;i<N;i++){
        		tim[i]=in.nextInt();
        	}

        	System.out.println((isClassThere(N,K,tim)?"NO":"YES"));
        	T--;
        }
        
    }
}