/*
Contest Name: Code Monk(Array& Strings)
Date: Jun 4, 2015
*/

#include <iostream>
using namespace std;

string reverseString(string inputString){
	string outputstring;
	for(int i=inputString.length();i>=0;i--){
		outputstring=outputstring+inputString[i];
	}
	return outputstring;
}

int main()
{
    int T;
    cin>>T;
    string outputstrings[10];
    int i=0;
    while(T--){
    	string inputString;
    	cin>>inputString;
    	outputstrings[i]=reverseString(inputString);
    	i++;
    }

    for(int j=0;j<i;j++){
    	cout<<outputstrings[j]<<endl;
    }
    	
    return 0;
}