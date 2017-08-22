import java.util.*;

public class PrintArraySpiral{
	public static void printArrayInSpiral(int[][] input,int r,int c){
		int colIndex=0;
		int rowIndex=0;
		int i;
		
		while((rowIndex<r)&&(colIndex<c)){
			for(i=colIndex;i<c;i++){
				System.out.print(input[rowIndex][i]+" ");
			}
			rowIndex++;
			
			for(i=rowIndex;i<r-1;i++){
				System.out.print(input[i][(c-1)-colIndex]+" ");
			}
			c--;
			
			for(i=c;i>colIndex;i--){
				System.out.print(input[(r-1)][i]+" ");
			}
			
			
			for(i=r-1;i>rowIndex-1;i--){
				System.out.print(input[i][colIndex]+" ");
			}
			r--;
			colIndex++;
			
			}
		
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[][] input=new int[N][N];
		for(int i=0;i<N;i++){
			for(int k=0;k<N;k++){
				input[i][k]=in.nextInt();
			}
		}
		printArrayInSpiral(input,N,N);

	}
}