#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s1, s2;;
	cin>>s1>>s2;

	s1.length() > s2.length() ? printf("%d", s1.length()) : printf("%d", s2.length());
}
