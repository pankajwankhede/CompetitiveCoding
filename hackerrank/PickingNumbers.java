import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*PROBLEM URL : https://www.hackerrank.com/challenges/picking-numbers*/
public class PickingNumbers {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Arrays.sort(a);
        Map<Integer,List<Integer>> multiSets=new HashMap<Integer,List<Integer>>();
        for(int a_i=0; a_i < n; a_i++){
            int index_1=a[a_i];
            List<Integer> setsValues=new ArrayList<Integer>();;
            for(int b_i=0;b_i<n;b_i++){
                
                if(Math.abs(index_1-a[b_i])<=1)
                    setsValues.add(a[b_i]);
            }
            multiSets.put(index_1,setsValues);
        }
        Set<Integer> indexes=multiSets.keySet();
        int maxIndex=0;
        int maxSize=0;
        for(int index:indexes){
            List<Integer> pairs=multiSets.get(index);
            
            int skipIndex=0;
            if(pairs.size()>=2){
                for(int j=0;j<pairs.size();j++){
                    
                    for(int i=0;i<pairs.size();i++){
                        if(Math.abs(pairs.get(j)-pairs.get(i))>1){
                            skipIndex=1;
                            break;    
                        }
                    }
                    if(skipIndex==1)
                        break;

                }
                
                if((pairs.size()>maxSize)&&(skipIndex==0)){
                   maxSize=pairs.size();
                   maxIndex=index;
                }

           }
            
         }

        System.out.println(maxSize);
            
    }
}