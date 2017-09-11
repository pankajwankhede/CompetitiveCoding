import java.util.*;

/*Problem URL: http://practice.geeksforgeeks.org/problems/positive-and-negative-elements/*/
public class PositiveNegative{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0){
			int n=in.nextInt();
			int[] inputPositiveNumbers=new int[n];
			int[] inputNegativeNumbers=new int[n];
			int positiveIndex=0,negativeIndex=0;
			for(int i=0;i<n;i++){
				int inputNumber=in.nextInt();
				if(inputNumber<0)
					inputNegativeNumbers[negativeIndex++]=inputNumber;
				else
					inputPositiveNumbers[positiveIndex++]=inputNumber;

			}

			for(int i=0;i<n;i++){
				if(inputPositiveNumbers[i]!=0)
					System.out.print(inputPositiveNumbers[i]+" ");
				if(inputNegativeNumbers[i]!=0)
					System.out.print(inputNegativeNumbers[i]+" ");

			}
		}
	}
}