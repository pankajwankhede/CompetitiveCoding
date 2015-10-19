import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem :https://www.hackerrank.com/challenges/extra-long-factorials
*/
public class ExtraLongFactorials {

	public static BigInteger factorial(int N){
		
		if((N==0)||(N==1))
			return BigInteger.valueOf(1);
		else
			return BigInteger.valueOf(N).multiply(factorial(N-1));	

	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        System.out.println(factorial(N));
    }
}