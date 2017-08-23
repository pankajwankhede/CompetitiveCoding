import java.io.*;
import java.util.*;

/*Problem URL: https://www.hackerrank.com/challenges/birthday-cake-candles
*/
public class BirthdayCandles{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int maxHeight=0;
		int countMaxHeight=0;
		for(int i=0;i<n;i++){
			int input=in.nextInt();
			if(input>maxHeight){
				maxHeight=input;
				countMaxHeight=1;
			}else if(input==maxHeight){
				countMaxHeight++;

			}

		}
		System.out.println(countMaxHeight);
	}
}