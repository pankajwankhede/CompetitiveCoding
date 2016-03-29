/*
Contest: CodeMonk
Category: Array and Strings
*/

import java.io.*;
import java.util.*;
class PrateekAndFriends {
	public static String checkFeasible(int[] input, int totalSum,int N){
		int SUM=0;
		String output="NO";
		for(int j=0;j<N;j++){
			SUM=input[j];
			int i=j+1;
			while((SUM<totalSum)&&(i<N))
			{
				
				
					SUM=SUM+input[i];
					i++;
					
					
				
					
					
				
			}
			if(SUM==totalSum){
				output="YES";
				break;	
			}
				
		}
 
		return output;
		
	}
    public static void main(String args[] ) throws Exception {
       
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T>0){
			int N,X;
			N=in.nextInt();
			X=in.nextInt();
			int[] input=new int[N];
			for(int i=0;i<N;i++){
				input[i]=in.nextInt();
			}
		
			T--;
			System.out.println(checkFeasible(input,X,N));
			
 
		}
        
    }
}