#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;
map<char,int> alpha;

void initiateAlphas(){
	for(int i=0;i<26;i++){
		
		alpha['a'+i]=0;
	}
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    initiateAlphas();
    //string S;
    int pangram=1;
    char S[1000];
cin.getline(S,1000);

    for(int j=0;S[j]!='\0';j++){
    	alpha[(char)tolower(S[j])]=1;
    	//cout<<(char)tolower(S[j]);
    }
    for(int i=0;i<26;i++){
    	if((alpha['a'+i]==0)){
    		pangram=0;
    	}
    }
    if(pangram==1){
    	cout<<"pangram";
    }else{
    	cout<<"not pangram";
    }
    return 0;
}
