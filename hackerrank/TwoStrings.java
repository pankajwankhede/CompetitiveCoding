import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem : https://www.hackerrank.com/challenges/two-strings
*/
public class TwoStrings {

	public static String containsString(String A,String B){
		int[] values=new int[128];
		String output="NO";
		for(int i=0;i<A.length();i++){
			values[A.charAt(i)-'a']++;
		}
		for(int i=0;i<B.length();i++){
			if(values[B.charAt(i)-'a']>=1)
				output="YES";
		}
		return output;
	}

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        for(int i=0;i<N;i++){
			        String A=in.next();
			        String B=in.next();
			        System.out.println(containsString(A,B));        	
        }


    }
}