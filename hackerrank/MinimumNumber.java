import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/contests/w30/challenges/find-the-minimum-number
Contest: Week of Code w30
*/
public class MinimumNumber {
	public static String manipulateFunctionCall(int n){
		if(n==2)
			return "min(int,int)";
		else
			return "min(int,"+manipulateFunctionCall(n-1)+")";
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(manipulateFunctionCall(n));
    }
}