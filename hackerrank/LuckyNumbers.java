import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Problem URL: https://www.hackerrank.com/contests/hourrank-16/challenges/leonardo-and-lucky-numbers */
public class LuckyNumbers {
	public static boolean checkLucky(long n){
		if((n%4==0))
			return true;
		else if((n%4==1)&&(n>=21))
			return true;
		else if((n%4==2)&&(n>=14))
			return true;
		else if((n%4==3)&&(n>=7)))
			return true;
		else
			return false;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long n = in.nextLong();
            if(checkLucky(n))
            	System.out.println("Yes");
            else
            	System.out.println("No");
        }
    }
}