#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

void print(string s)
{
	cout<<s<<endl;
	cout<<"@@@@@@@@@@"<<endl;
}

int main()
{
	print("first");
	print("second");
	print("third");
}
