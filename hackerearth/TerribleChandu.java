/*
Contest Name: Code Monk(Array& Strings)
Date: Jun 4, 2015
*/

import java.io.*;
import java.util.*;
class TestClass {
	public static String reverseString(String s){
		String output="";
		for(int i=s.length()-1;i>=0;i--){
			output=output+s.charAt(i);
			
		}
		return output;
	}
    public static void main(String args[] ) throws Exception {
       
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T>0){
			String inputString=in.next();
			System.out.println(reverseString(inputString));
			T--;
		}
        
    }
}