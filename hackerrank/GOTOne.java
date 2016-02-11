import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL:
https://www.hackerrank.com/challenges/game-of-thrones
*/
public class GOTOne {
     
    public static String isinputStringContainsPalindrome(String input){
		String output="YES";
		int[] ansichar=new int[128];
		boolean lengthEven=(input.length()%2==0)?true:false;
		for(int i=0;i<input.length();i++){
			ansichar[input.charAt(i)-'a']++;
		}
		int count=0;
		for(int i=0;i<28;i++){
			if(((ansichar[i]%2)!=0)){
				System.out.println(count);
				count++;
			}
		}
		if(count>1){
//			if(!lengthEven)
				output="NO";
		}
		return output;
	}
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        ans=isinputStringContainsPalindrome(inputString);
        System.out.println(ans);
        myScan.close();
    }
}
