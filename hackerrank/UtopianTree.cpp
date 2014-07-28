#include <iostream>
using namespace std;

int utopianheight(int a){
	int i=0,h=1;

	while(i!=a){
       if(h%2==0)
       	h=h+1;
       else
       	h=h*2;



		i++;
	}

	return h;
	
}
int main(){
    int T;
    cin>>T;
    while(T--){
    	int n;
    	cin>>n;
    	cout<<utopianheight(n)<<endl;
    }
    
	return 0;
}