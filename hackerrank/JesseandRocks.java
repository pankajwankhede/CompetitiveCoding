import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Contest : Codeagon 
URL: https://www.hackerrank.com/contests/codeagon/challenges/jesse-and-the-rocks

*/

public class JesseandRocks {

    public static void main(String[] args) {
     
        
             Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		int strengthJesse=in.nextInt();
		int beatenRocks=0;
		int skippedRocks=0;
		for(int i=0;i<N;i++){
			int rs=in.nextInt();
			if(skippedRocks<=1){
				if(rs>strengthJesse){
					skippedRocks=skippedRocks+1;
				}else{
					beatenRocks=beatenRocks+1;
				}
			}
					
		}
		System.out.println(beatenRocks);
    }
}