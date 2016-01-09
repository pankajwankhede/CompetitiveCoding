import java.util.*;
class MyFibannaci {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/
 
        Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int N=in.nextInt();
		int[] array=new int[N+1];
		array[0]=A;
		array[1]=B;
		for(int i=2;i<N;i++){
			array[i]=array[i-2]+array[i-1];
		}
		
		System.out.println(array[N-1]);
 
    }
}