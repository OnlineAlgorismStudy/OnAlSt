#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s;
	getline(cin, s);

	for (int i = 0; i < s.length(); i++)
	{
		if (isalpha(s[i]))
		{
			printf("%c", toupper(s[i]));
		}
	}
}
