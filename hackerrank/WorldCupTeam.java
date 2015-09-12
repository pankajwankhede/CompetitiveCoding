import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WorldCupTeam {

	public static int[] selectionSort(int[] a){
		int minimum,temp;
		for(int i=0;i<10;i++){
			minimum=i;
			for(int j=i+1;j<10;j++){
				if(a[j]<a[minimum])
					minimum=j;
			}
			temp=a[minimum];
			a[minimum]=a[i];
			a[i]=temp;

		}

		return a;

	}

	public static int highestSumTeam(int[] ratings){
		int sum1=0,sum2=0;
		sum1=ratings[9]+ratings[7]+ratings[5];
		sum2=ratings[8]+ratings[6]+ratings[4];

		return ((sum1>=sum2)?sum1:sum2);

	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int[] ratings=new int[10];
        for(int i=0;i<10;i++){
        	ratings[i]=in.nextInt();
        }

        int[] sorterdRatings=selectionSort(ratings);
        System.out.println(highestSumTeam(sorterdRatings));

    }
}