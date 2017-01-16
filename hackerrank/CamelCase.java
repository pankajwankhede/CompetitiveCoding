import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/challenges/camelcase
*/
public class CamelCase {
	public static int countWords(String s){
		char[] letters=s.toCharArray();
		int countOfWords=1;
		for(int i=0;i<letters.length;i++){
			if((int)letters[i]<97)
				countOfWords++;
		}
		return countOfWords;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(countWords(s));
    }
}
