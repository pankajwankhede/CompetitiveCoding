#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
long long int findchocPieces(int n){
    long long int h,v;
    long long int pieces;
    
    h=n/2;
    v=n-h;
    pieces=h*v;
    return pieces;
    
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t,n;
    cin>>t;
    while(t--){
        cin>>n;
        cout<<findchocPieces(n)<<endl;
    }
    return 0;
}