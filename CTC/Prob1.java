/*
Lesson: Arrays
Problem :1
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prob1 {

	public static boolean isUniqueChars(String s){
		int[] ascis=new int[128];
		boolean output=true;
		for(int i=0;i<s.length();i++){
			ascis[((int)s.charAt(i))]++;
		}
		for(int i=0;i<128;i++){
			if(ascis[i]>1){
				output=false;
				break;
			}
				
		}
		return output;
	}

	public static boolean isUniqueCharsBool(String s){
		boolean[] ascis=new boolean[128];
		boolean output=true;
		for(int i=0;i<s.length();i++){
			if(ascis[(int)s.charAt(i)])
				output= false;
			ascis[(int)s.charAt(i)]=true;
		}
		return output;
	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String inputString=in.next();
		System.out.println(isUniqueChars(inputString)?"YES":"NO");
		System.out.println("Second Function");
		System.out.println(isUniqueCharsBool(inputString)?"YES":"NO");
	

	}

}
