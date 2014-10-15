#include <iostream>
using namespace std;
int main(){
	int n=1;

	string S;
	int count=0;
	int flag=0;
	
	cin>>n;
	int arr[100][26]={};
	for(int i=0;i<n;i++){
		cin>>S;
		for(int j=0;j<S.size();j++){
			arr[i][S[j]-'a']++;
		}
    }
	
		
		for(int j=0;j<26;j++){
			flag=0;
			for(int i=0;i<n;i++){
			if(arr[i][j]==0)
				flag=1;
				
		}
		if(flag==0)
			count++;
    }
	cout<<count;
	


	return 0;
}