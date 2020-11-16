#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main()
{
	int num[5];

	for (int i = 0; i < 5; i++)
		scanf("%d", &num[i]);

	string s;
	for (int i = 0; i < 5; i++)
		s += std::to_string(num[i]);

	int remain = s.length() % 3;

	for (int i = 0; i < 5; i++)
	{
		if (i < 4) 
		{
			for (int j = 0; j < 3; j++) 
			{
				cout << s[i * 3 + j];
			}
		}
		else
		{
			for (int j = 0; j < remain; j++)
			{
				cout << s[i * 3 + j];
			}
		}
		cout << endl;
	}
}
