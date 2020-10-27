#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s;
	getline(cin, s);

	int count = 0;

	for (int i = 0; i < s.length(); i++)
	{
		if (s[i] == ' ')
		{
			count += 1;
		}
	}

	printf("%d\n", count+1);
}
