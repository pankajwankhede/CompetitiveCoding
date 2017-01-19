import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URl: https://www.hackerrank.com/challenges/mars-exploration
*/

public class MarsExplore {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String expectedString="";
        for(int i=0;i<S.length()/3;i++){
        	expectedString=expectedString+"SOS";
        }
        int count=0;
        for(int i=0;i<S.length();i++){
        	if(S.charAt(i)!=expectedString.charAt(i))
        		count++;
        }
        System.out.println(count);
    }
}