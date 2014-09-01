#include <iostream>
using namespace std;

long long int crazykangs(int a,int b, int M){
	long long int out=0;
	for(int j=a;j<=b;j++){
		if(j%M==0)
			out++;

	}
	return out;
} 

int main()
{   
	long long int T;
	long long int a,b,M;
	cin>>T;
	while(T--){
		cin>>a>>b>>M;
		cout<<crazykangs(a,b,M)<<endl;

	}

    
    return 0;
}
