#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;
map<int,int> primeNos;

int checkifPrime(int n){
    int j=2;
    int isPrime=1;
    while(j<=sqrt(n)){
        if(n%j==0){
            isPrime=0;
            break;
        }else{
            j++;
        }
            
    }
    return isPrime;
}

void generatePrime(){
    //int limit=10000;
    int a=2;
    int i=1;

    while(i<=10000){
    	

        if(checkifPrime(a)){
            primeNos[i]=a;
            i++;
        }
        
        a++;

    }

}


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int T;
    int no;


    cin>>T;
    generatePrime();
    for(int i=0;i<T;i++){
        cin>>no;
        cout<<primeNos[no]<<"\n";

    }

    return 0;
}