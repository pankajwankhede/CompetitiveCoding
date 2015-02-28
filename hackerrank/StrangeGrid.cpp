/*
Contest: Zen Hacks
Date of Contest: 28, Feb 2015
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long findElement(long r,int c)
{

	if(r%2!=0)
		//return 2*((2*r+1)+((c==1)?(c):(c-2)));
		return ((c==1)?((2*(2*(r-1)))+2*(r/2)):((2*(2*(r-1)))+2*(r/2)+2*(c-1)));
	else
		return ((c==1)?((2*(2*(r-2)))+2*((r-1)/2)):((2*(2*(r-2)))+2*((r-1)/2)+2*(c-1)))+1;
	
	    	
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int c;
    long r;
    cin>>r>>c;
    

    
    cout<<findElement(r,c)<<endl;
    return 0;

}