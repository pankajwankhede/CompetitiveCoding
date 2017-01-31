import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/challenges/palindrome-index
*/
public class PalindromeIndex {

	public static boolean isPalindrome(String s){
		int N=s.length();
		if(N%2==0){
			for(int i=0;i<N/2;i++){
				if(s.charAt(i)!=s.charAt(N-i-1))
					return false;
			}
			return true;	
		}else{
			for(int i=0;i<N/2;i++){
				if(s.charAt(i)!=s.charAt(N-i-1))
					return false;
			}
			return true;
		}
		
	}
	public static int findPalindromicIndex(String s){
		int[] ascii=new int[128];
		int N=s.length();
		if(isPalindrome(s))
			return -1;
		else{
			for(int i=0;i<=N/2;i++){
			if(s.charAt(i)!=s.charAt(N-i-1)){
				if(i==0){
					if(isPalindrome(s.substring(i+1,N))){
						return i;
					}
						
					else if(isPalindrome(s.substring(0,N-1))){
						return N-i-1;
					}
				}else{
					if(isPalindrome(s.substring(0,i-1)+s.substring(i+1,N-1)))
						return i;
					else
						return N-i-1;
				}	
			}
					
				
			}
			
		}
		
		return -1;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
        	String s=in.next();
        	System.out.println(findPalindromicIndex(s));
        }
    }
}
