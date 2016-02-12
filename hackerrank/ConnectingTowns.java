import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
Problem URL: https://www.hackerrank.com/challenges/connecting-towns
*/

public class ConnectingTowns {
    
    public static int findRoutes(int[] routes){
        int output=1;
        for(int i=0;i<routes.length;i++){
            output=output*routes[i];
            output=output%1234567;
        }
        return output;
    }

    public static void main(String[] args) {
	        Scanner in =new Scanner(System.in);
	        int T=in.nextInt();
	        for(int i=0;i<T;i++){
	            int N=in.nextInt();
	            int[] routes=new int[N-1];
	            for(int j=0;j<routes.length;j++){
	                routes[j]=in.nextInt();
	                
	            }
	            System.out.println(findRoutes(routes));
	        }
	    }
}