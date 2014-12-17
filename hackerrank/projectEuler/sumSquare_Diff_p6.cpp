#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long T;
    cin>>T;
    for(long j=0;j<T;j++){
    	long N=3;

    	long result;
    	cin>>N;
    	result=(3*(N*N*N*N)+2*(N*N*N)-3*(N*N)-(2*N))/12;
    	cout<<result<<"\n";
    }//
    return 0;
}