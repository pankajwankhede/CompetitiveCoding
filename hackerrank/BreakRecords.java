import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakRecords {

/*Problem URL: https://www.hackerrank.com/challenges/breaking-best-and-worst-records
*/
    static int[] getRecord(int[] s){
        // Complete this function
        int[] recordsOutput;
        int smallestScore=s[0];
        int highestScore=s[0];
        int lowScoreCount=0;
        int hightScoreCount=0;
        for(int i=1;i<s.length;i++){
            if(s[i]>highestScore){
                hightScoreCount++;
                highestScore=s[i];
            }
            if(s[i]<smallestScore){
                lowScoreCount++;
                smallestScore=s[i];
            }
        }
        recordsOutput=new int[]{hightScoreCount,lowScoreCount};
        return recordsOutput;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        // int[] result = getRecord(s);
        // for(int i=0;i<result.length;i++){
        //     System.out.println(result[i]);
        // }
        // String separator = "", delimiter = " ";
        // for (Integer val : result) {
        //     System.out.print(separator + val);
        //     separator = delimiter;
        // }
        System.out.println("");
    }
}