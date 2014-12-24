#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long findDigits(long long N){

    long long digits=0;
    long long tempNum=N-0;
    long long origN=N-0;

    while(tempNum>=10){
        
        if((tempNum%10)!=0){
            if(origN%(tempNum%10)==0){
            digits++;
            
        }

        }
        
        tempNum=tempNum/10;
    }

    if(origN%(tempNum)==0){
        digits++;
    }
    return digits;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int T;
    cin>>T;
    long long N;
    while(T--){
        cin>>N;
        cout<<findDigits(N)<<"\n";
    }
   
    return 0;
}