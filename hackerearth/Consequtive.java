/*
Contest Name: Code Monk(Array& Strings)
Date: Jun 4, 2015
*/

import java.io.*;
import java.util.*;
class Consequtive {
	public static String removeCons(String s){
		String output=""+s.charAt(0);
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(i-1))
				output=output+s.charAt(i);

		}
		
		return output;
	}
    public static void main(String args[] ) throws Exception {
       
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T>0){
			String inputString=in.next();
			System.out.println(removeCons(inputString));
			T--;
		}
        
    }
}