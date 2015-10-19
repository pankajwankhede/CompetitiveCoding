import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*Problem : https://www.hackerrank.com/challenges/anagram*/
public class Angram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Integer noOfCases = in.nextInt();
        for(int i=0;i<noOfCases;i++) {
            String input = in.next();
            if((input.length() % 2) != 0) {
                System.out.println("-1");
            }
            else {
                
                
                int changeCount=0;
                int[] count = new int[26];
                for(int j=0;j<input.length()/2;j++){
                    count[(input.charAt(j)-'a')]++;
                    count[(input.charAt(input.length()-1-j)-'a')]--;    
                }
                    
                for(int j=0;j<26;j++) {
                      changeCount += Math.abs(count[j]);
                }
                System.out.println(changeCount/2);
            }
        }
    }
}