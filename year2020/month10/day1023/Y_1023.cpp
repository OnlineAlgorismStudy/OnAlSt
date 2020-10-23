#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s1, s2;
	cin >> s1;
	cin >> s2;

	printf("%d\n", s1.length() + s2.length());
}
