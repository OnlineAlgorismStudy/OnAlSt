#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s;
	int n;
	cin >> s >> n;

	for (int i = 0; i < n; i++)
	{
		printf("%c", s[s.length() - i - 1]);
	}
}
