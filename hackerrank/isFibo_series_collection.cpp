#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;

map<int,int> fibSeries;

void generateFibs(){
    long long a=0;
    long long b=1;
    long long c;
    while(true){
        
        c=a+b;
        
        if(c>10000000000LL)
            break;
        fibSeries[c]=1;
        a=b;
        b=c;

    }
    


}

 

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
     int  T;
    cin>>T;
    generateFibs();
    for(int i=0;i<T;i++){
        long long no;
        cin>>no;
   
        if (fibSeries[no])
            cout<<"IsFibo\n";
        else
            cout<<"IsNotFibo\n";
        
    }
    return 0;
}