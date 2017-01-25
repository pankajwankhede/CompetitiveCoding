import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/challenges/string-construction
*/

public class StringConstruction {
	public static int uniqueCharsCount(String s){
		int[] asciCodes=new int[128];
		for(int i=0;i<s.length();i++){
			asciCodes[(int)s.charAt(i)]++;
		}
		int count=0;
		for(int i=0;i<128;i++){
			if(asciCodes[i]>=1)
				count++;
		}
		return count;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            System.out.println(uniqueCharsCount(s));
        }

    }
}
