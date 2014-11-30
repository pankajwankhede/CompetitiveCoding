#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;

//map<int,int> fibSeries;

//1,2,3,5,8,13,21,34,55,89
long long generateFibs(long long no){
    long long a=1;
    long long b=2;
    long long c=0;
    long long sum=b;


    while(c<no){
        if(c%2==0){
            
            sum=sum+c;
        }
        c=a+b;//3,5
        a=b;//2,3
        b=c;//3,5

   
            
        

    }
    return sum;
    


}

 

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
     int  T;
    cin>>T;
    //generateFibs();
    for(int i=0;i<T;i++){
        long long no;
        cin>>no;
        cout<<generateFibs(no)<<"\n";

   
        
    }
    return 0;
}