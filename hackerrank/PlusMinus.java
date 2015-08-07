/**/
import java.util.*;

public class PlusMinus{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		int plusCount=0;
		int minusCount=0;
		int zeroCount=0;
		for(int i=0;i<N;i++){
			int tempNum=in.nextInt();
			if(tempNum>0)
				plusCount++;
			else if(tempNum<0)
				minusCount++;
			else
				zeroCount++;
		}
		System.out.println(String.format("%.3f",plusCount/(double)N));
		System.out.println(String.format("%.3f",minusCount/(double)N));
		System.out.println(String.format("%.3f",zeroCount/(double)N));
	}
}