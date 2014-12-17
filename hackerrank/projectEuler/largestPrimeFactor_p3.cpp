#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long findlargestprimeFactor(long long no){
	
	long long a=2;
	long long largestPrimeFactor=no;
	while(a*a<=no){
		if(no%a==0){
			largestPrimeFactor=a;
			//cout<<a<<"\t";
			no=no/a;
		}else{
			a++;
			
		}
	}
	if((no!=1)&&(no>largestPrimeFactor)){
		largestPrimeFactor=no;
		//cout<<no<<"\t";
	}

	return largestPrimeFactor;
};

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int T;
    long long no;


    cin>>T;
    for(int i=0;i<T;i++){
    	cin>>no;
    	cout<<findlargestprimeFactor(no)<<"\n";

    }
    return 0;
}