/*
Domains: Algorithm Warmup

*/

import java.util.*;


public class VeryBigSum{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		long sum=0;
		for(int i=0;i<N;i++){
			sum=sum+in.nextInt();
		}
		System.out.println(sum);

	}
}