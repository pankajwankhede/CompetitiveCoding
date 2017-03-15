import java.util.*;
/*Code Jam 2016- Qualification Round- Counting Sheep*/
public class CountingSheep{

	public static int willSheepSleep(int N){
		int output=-1;
		boolean[] number=new boolean[10];
		boolean sleep=false;
		int l=2;
		int originalN=N;
		if(originalN!=0){
			for(;;){
				int n=N;
				while(n!=0){
					int k=n%10;
					n=n/10;
					number[k]=true;
				}

				int countOfNumbers=0;
				for(int i=0;i<10;i++){
					if(number[i]){
						countOfNumbers++;
					}
						
				}
				
				if(countOfNumbers==10){
					sleep=true;
					output=N;
					break;
				}else{
					N=originalN*l;
					l++;
				}


			}
		}
		
		if(sleep)
			return N;
		else
			return -1;
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int i=1;
		while(i<=T){
			int N=in.nextInt();
			int output=willSheepSleep(N);
			System.out.println("Case #"+i+": "+((output==-1)?"INSOMANIA":output));
			i++;
		}
	}
}