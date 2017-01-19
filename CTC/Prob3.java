/*
Lesson: Arrays
Problem :3
*/

import java.util.*;

public class Prob3{
	public static boolean isTheyPermuted(String s1,String s2){
		int[] asciiValues=new int[128];
		if(s1.length()!=s2.length())
			return false;
		else{
			for(int i=0;i<s1.length();i++){
				asciiValues[(int)s1.charAt(i)]++;
				asciiValues[(int)s2.charAt(i)]++;
			}
			for(int i=0;i<128;i++){
				if(asciiValues[i]%2!=0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		String s2=in.next();
		System.out.println((isTheyPermuted(s1,s2))?"YES":"NO");
	}
}