import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray {

	public static String[] inputStrings;
	public static int[] inputStringCount;
	public static int N,start=0;

	public static void add(String s){
		boolean alreadyFound=false;
		for(int i=0;i<N;i++){
			if((inputStrings[i]!=null)&&(inputStrings[i].equals(s))){
				inputStringCount[i]++;
				alreadyFound=true;
				break;
			}
		}
		if(!alreadyFound){

			inputStrings[start]=s;
			inputStringCount[start]=1;
			start++;	
		}
		

	}


	public static int query(String queryString){
		int outputCount=0;
		for(int i=0;i<N;i++){
			if((inputStrings[i]!=null)&&(inputStrings[i].equals(queryString))){
				outputCount=inputStringCount[i];
				break;
			}
		}

		return outputCount;

	}
/*Problem URL: https://www.hackerrank.com/challenges/sparse-arrays*/
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		inputStrings=new String[N];
		inputStringCount=new int[N];
		for(int i=0;i<N;i++){
			add(in.next());
		}
		int Q=in.nextInt();
		for(int i=0;i<Q;i++){
			System.out.println(query(in.next()));
		}


    }
}