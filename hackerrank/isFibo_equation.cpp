#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isPerfectSquare(long long n){
    long long s=sqrt(n);
    return (s*s==n);
}

bool isFibo(long long n){

    return isPerfectSquare((5*n*n)+4)||isPerfectSquare((5*n*n)-4);
        
    
} 

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
     int  T;
    cin>>T;
    for(int i=0;i<T;i++){
        long long no;
        cin>>no;
   
        if (isFibo(no))
            cout<<"IsFibo\n";
        else
            cout<<"IsNotFibo\n";
        
    }
    return 0;
}