#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <deque>
using namespace std;

deque<char> dq;

void print()
{
	for (int i = 0; i < dq.size(); i++)
	{
		char c = dq.front();
		printf("%c", c);

		dq.pop_front();
		dq.push_back(c);
	}
	printf("\n");
}

int main()
{
	string s;
	getline(cin, s);
	
	for (int i = 0; i < s.length(); i++)
		dq.push_back(s[i]);

	for (int i = 0; i < s.length(); i++)
	{
		char c = dq.back();
		dq.pop_back();
		dq.push_front(c);
		print();
	}
}
