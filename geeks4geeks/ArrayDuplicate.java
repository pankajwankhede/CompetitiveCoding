import java.util.*;

/*Problem URL: http://www.geeksforgeeks.org/check-two-unsorted-array-duplicates-allowed-elements/*/

public  class ArrayDuplicate{
	public static boolean findIfContainsDuplicate(int[] a,int[] b,int n){
		int[] hashingArray=new int[128];
		for(int i=0;i<n;i++){
			hashingArray[(int)a[i]]++;
			hashingArray[(int)b[i]]--;
		}
		for(int i=0;i<128;i++){
			if(hashingArray[i]!=0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] array_A=new int[n];
		int[] array_B=new int[n];
		for(int i=0;i<n;i++){
			array_A[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			array_B[i]=in.nextInt();
		}
		System.out.println(findIfContainsDuplicate(array_A,array_B,n)?"Yes":"No");
	}
}