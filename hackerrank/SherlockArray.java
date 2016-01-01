import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockArray {
	public static int sumOf(int[] A,int startIndex,int endIndex){
		int sum=0;
		for(int i=startIndex;i<=endIndex;i++){
			sum=sum+A[i];
		}
		return sum;
	}
	public static String checkIfNumExists(int[] A,int total){
		boolean result=false;
		if(A.length==1)
			result=true;
		else{
			for(int i=1;i<A.length-1;i++){
			result=result||(sumOf(A,0,i-1)==sumOf(A,i+1,A.length-1));
			if(result)
				break;
		}	
		}
		

		return (result?"YES":"NO");

	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
        	int N=in.nextInt();
        	int[] A=new int[N];
        	int total=0;
        	for(int j=0;j<N;j++){
        		A[j]=in.nextInt();
        		total=total+A[j];
        	}
        	System.out.println(checkIfNumExists(A,total));
        }
    }
}