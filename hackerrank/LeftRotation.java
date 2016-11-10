import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int[] inputArray=new int[n];
        int[] outputArray=new int[n];
        for(int i=0;i<n;i++){
        	int inputNum=in.nextInt();
        	inputArray[i]=inputNum;
        }
        for(int i=d;i<n;i++){
            outputArray[i-d]=inputArray[i];
        }
        for(int i=0;i<d;i++){
            outputArray[n-d+i]=inputArray[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(outputArray[i]);
        }
        
    }
}


