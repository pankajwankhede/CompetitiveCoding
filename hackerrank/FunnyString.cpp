/*
Contest: Zen Hacks
Date of Contest: 28, Feb 2015
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isFunny(string inputString){
	bool result=true;
	for(int i=1;i<inputString.length();i++){
		result=result&&(abs(((int)inputString[i])-((int)inputString[i-1]))==abs(((int)inputString[inputString.length()-i-1])-((int)inputString[inputString.length()-i])));
	}
   return result;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int T;
    cin>>T;
    while(T--){
    	string inputString;
    	cin>>inputString;
    	cout<<(isFunny(inputString)?"Funny":"Not Funny")<<endl;
    }  
    return 0;
}