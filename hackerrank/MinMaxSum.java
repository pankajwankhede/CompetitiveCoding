import java.util.*;
public class MinMaxSum{

/*HackerRank Problem URL: https://www.hackerrank.com/challenges/mini-max-sum*/
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int[] inNumbers=new int[5];
		long sum=0;
		for(int i=0;i<5;i++){
			inNumbers[i]=in.nextInt();
			sum=sum+inNumbers[i];
		}
		
		long minSum=sum;
		long maxSum=0;
		for(int i=0;i<5;i++){
			long thisSum=sum-inNumbers[i];
			if(thisSum>maxSum)
				maxSum=thisSum;

			if(thisSum<minSum)
				minSum=thisSum;
		}

		
		System.out.println(minSum+" "+maxSum);
		
	}
}