#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
long long int findsum(int n){
    long long int sum=0;
   int th,fi,fif;
    long long int fivmax,fifmax,thmax;
    if(n%3==0)
        th=n/3-1;
    else
        th=n/3;
    if(n%5==0)
        fi=n/5-1;
    else
        fi=n/5;
    if(n>=15){
       if(n%15==0)
        fif=n/15-1;
       else
        fif=n/15;
        
    }
    else
        fif=0;
    fivmax=fi*5;
    thmax=th*3;
    fifmax=fif*15;
    
    sum=(th*(3+thmax)/2)+(fi*(5+fivmax)/2)-(fif*(15+fifmax)/2);
    
    return sum;
    
    

   
    
    
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
     int t,n,c,m;
    cin>>t;
    while(t--){
        cin>>n;
        
        cout<<findsum(n)<<endl;
    }
    return 0;
}