import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem URL: https://www.hackerrank.com/challenges/reduced-string
*/
public class ReducedString {
	
	public static boolean isUniqueChars(String s){
		boolean[] ascii=new boolean[128];
		for(int i=0;i<s.length();i++){
			if(ascii[(int)s.charAt(i)])
				return false;
			ascii[(int)s.charAt(i)]=true;
		}
		return true;
	}
	public static String reduceString(String s){
		
		if (isUniqueChars(s)) {
			return s;
		}else{
			String temp="";
			for(int i=0;i<s.length()-1;i++){
				
				if(s.charAt(i)==s.charAt(i+1)){
				
					s=temp+reduceString(s.substring(i+2));
					if(isUniqueChars(s))
						break;
					else
						s=reduceString(s);
				}else{
					temp=temp+s.charAt(i);


				}
			}
			return s;
		}
	}

	public static String reduceStringUsingStack(String s){
		Stack<Character> uniqueChars=new Stack<Character>();
		String output="";
		for(int i=0;i<s.length();i++){
			
			if(uniqueChars.empty())
				uniqueChars.push(s.charAt(i));
			else{
				if(uniqueChars.peek()==s.charAt(i))
					uniqueChars.pop();
				else
					uniqueChars.push(s.charAt(i));	
			}
		}
		for(int i=0;i<uniqueChars.size();i++){
			output=output+uniqueChars.get(i);
		}
		return output;
	}
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	String inputString=in.next();
    	// String output=reduceString(inputString);
    	String output=reduceStringUsingStack(inputString);
    	System.out.println((output.length()==0)?"Empty String":output);
    }
}