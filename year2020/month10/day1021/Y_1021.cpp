#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s;
	getline(cin, s);

	for(int i=3; i<=6; i++)
		cout<<s[i];
}
