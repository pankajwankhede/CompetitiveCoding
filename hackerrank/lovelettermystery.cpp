#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int solveMystery(string in){
    int count=0;
    for(int j=0;j<in.length()/2;j++){
        count=count+abs(((int)(26+in[in.length()-(j+1)]))-((int)(26+in[j])));
    }
    return count;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int T;
    cin>>T;
    while(T--){
        string inputString;
        cin>>inputString;
        cout<<solveMystery(inputString)<<endl;
    }
    return 0;
}