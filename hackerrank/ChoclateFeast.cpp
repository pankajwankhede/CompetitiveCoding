#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int chocsforWraps(int answer,int m){
    int no=0,temp;
   
    if(answer/m>=1)
      return (answer/m)+chocsforWraps((answer%m)+(answer/m),m);
    else
      return 0;
 
    
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t,n,c,m;
    cin>>t;
    while(t--){
        cin>>n>>c>>m;
        int answer=0;
        answer=n/c;
        answer=n/c+chocsforWraps(n/c,m);
        // Computer answer
        
        cout<<answer<<endl;
    }
    return 0;
}