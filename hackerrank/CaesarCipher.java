import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/challenges/caesar-cipher-1
*/
public class CaesarCipher {

	public static String cipherIt(String s,int k,int n){
		String outputString="";
		for(int i=0;i<n;i++){
			int asciiValue=(int)s.charAt(i);
			if(((asciiValue>64)&&(asciiValue<91))){
				int temp=((asciiValue+k)-65)%26;
				outputString=outputString+(char)(65+temp);
			}else if(((asciiValue>96)&&(asciiValue<123))){
				int temp=((asciiValue+k)-97)%26;
				outputString=outputString+(char)(97+temp);
			}else
				outputString=outputString+(char)(asciiValue);

		}
		return outputString;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        System.out.println(cipherIt(s,k,n));
    }
}