/*
Lesson: Arrays
Problem :2
*/

import java.util.*;

public class Prob2{
	public static String reverseString(String s){
		char[] sArray=s.toCharArray();
		for(int i=0;i<sArray.length/2;i++){
			char temp=sArray[i];
			sArray[i]=sArray[sArray.length-(i+1)];
			sArray[sArray.length-(i+1)]=temp;
		}
		return new String(sArray);
	}
	public static void main(String arg[]){
		Scanner in =new Scanner(System.in);
		String inputString=in.next();
		System.out.println(reverseString(inputString));
	}
}