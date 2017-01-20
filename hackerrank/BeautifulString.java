import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/challenges/beautiful-binary-string
*/
public class BeautifulString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        System.out.println((B.length()-B.replaceAll("010","").length())/3);
    }

}
