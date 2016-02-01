import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Contest: World Code Sprint
Problem URL: https://www.hackerrank.com/contests/worldcodesprint/challenges/save-our-ship
*/

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int length=S.length();
        int diff=0;
        for(int i=0;i<length;i=i+3){
        	
        	if(!('S'==S.charAt(i)))
        		diff++;

        	if(!('O'==S.charAt(i+1)))
        		diff++;

        	if(!('S'==S.charAt(i+2)))
        		diff++;


        }
        System.out.println(diff);
    }
}
