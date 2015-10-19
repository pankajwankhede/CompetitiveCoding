import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String[] st=s.split(":");

        if(st[2].indexOf("PM")!=-1){
            int temp=Integer.parseInt(st[0])+12;    
            if(temp>23)
                System.out.println(st[0]+":"+st[1]+":"+st[2].substring(0,2));
            else    
                System.out.println(temp+":"+st[1]+":"+st[2].substring(0,2));
        }
            
        else{
         if(Integer.parseInt(st[0])==12)
                System.out.println("00"+":"+st[1]+":"+st[2].substring(0,2));
            else    
                System.out.println(st[0]+":"+st[1]+":"+st[2].substring(0,2));   
        }
            
    }
}