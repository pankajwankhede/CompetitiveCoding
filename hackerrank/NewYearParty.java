/*
Contest: HourRank 4
Problem : https://www.hackerrank.com/contests/hourrank-4/challenges/new-year-party

*/

import java.util.*;

public class NewYearParty{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		
		int tempTimeIn=in.nextInt();
		for(int i=1;i<N;i++){
			int inTime=in.nextInt();
			
			if(inTime>tempTimeIn){
				tempTimeIn=inTime;
			}else{
				tempTimeIn++;
			}

		}
		System.out.println(tempTimeIn);
	}
}