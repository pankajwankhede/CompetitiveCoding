import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Problem URL: https://www.hackerrank.com/contests/world-codesprint-9/challenges/grading
*/
public class Grading {
	public static boolean isGRadePass(int n){
		return (n>=40);
	}
	public static int roundGrades(int n){
		int roundGrade=n;
		if((5-(n%5))<3){
			roundGrade=((n/5)+1)*5;
		}else{
			roundGrade=n;
		}
		if(isGRadePass(roundGrade))
			return roundGrade;
		else
			return n;

	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            System.out.println(roundGrades(grade));
        }
    }
}
