import java.util.Scanner;

/*
Problem URL: https://www.hackerrank.com/challenges/strange-grid 
 */

public class StrangeGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		long r=in.nextInt();
		int c=in.nextInt();
		System.out.println(findStrangeNumber(r,c));

	}

	private static long findStrangeNumber(long r, int c) {
		// TODO Auto-generated method stub
		long rowValuesStartingAt=0;
		if(r%2==0)
			rowValuesStartingAt=((r*10)/2)-9;
		else
			rowValuesStartingAt=(r/2)*10;
		System.out.println(rowValuesStartingAt);
		long output=rowValuesStartingAt;
		for(int i=2;i<=c;i++){
			output=output+2;
		}
		
		return output;
	}

}
