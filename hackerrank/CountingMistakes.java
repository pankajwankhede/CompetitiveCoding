import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* Problem URL- https://www.hackerrank.com/contests/ncr-codesprint/challenges/counting-mistakes*/
public class CountingMistakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int errors=0;
        int prevN=in.nextInt();
        if(prevN!=1)
            errors++;
        
        for(int i=1;i<n;i++){
            int num=in.nextInt();
            if((num-prevN)!=1)
                errors++;
            prevN=num;
        }
        System.out.println(errors);
    }
}