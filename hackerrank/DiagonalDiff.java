import java.util.*;

public class DiagonalDiff{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		long leftDiagonalSum=0;
		long rightDiagonalSum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int num=in.nextInt();
				if(i==j){
					leftDiagonalSum=leftDiagonalSum+num;
				}
				if(i==n-j-1){
					rightDiagonalSum=rightDiagonalSum+num;
				}
			}
		}


		System.out.println(Math.abs(leftDiagonalSum-rightDiagonalSum));
	}
}