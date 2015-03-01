/*
Contest: 101 Hack
Date: January 2015
*/
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isClassThere(int n,int k, int t[]){
    int count=0;
    for(int i=0;i<n;i++){
        if(t[i]<=0)
            count++;
    }
    if(count>=k)
        return true;
    else
        return false;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int T;
    
    cin>>T;
    while(T--){
        int N, K;
        cin>>N>>K;
        int tim[N];
        for(int i=0;i<N;i++)
            cin>>tim[i];
        cout<<(isClassThere(N,K,tim)?"NO":"YES")<<endl;
        
    }
    return 0;
    
    
}