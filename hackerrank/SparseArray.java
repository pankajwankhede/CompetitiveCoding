import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SparseArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		
		HashMap<String,Integer> inputs=new HashMap<String,Integer>();
		for(int i=0;i<N;i++){
			String inputString=in.next();
			if(inputs.containsKey(inputString)){
				Integer existingCount=inputs.get(inputString);
				inputs.put(inputString,existingCount+1);
			}				
			else
				inputs.put(inputString,1);
		}
		int Q=in.nextInt();
		int[] output=new int[Q];
		for(int i=0;i<Q;i++){
			String queryString=in.next();
			if(inputs.containsKey(queryString))
				System.out.println(inputs.get(queryString));
			else
				System.out.println(0);
		}

    }
}