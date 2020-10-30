#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main()
{
	string s;
	getline(cin, s);

	string stringBuffer;
	istringstream ss(s);

	int cnt = 1;
	while (getline(ss, stringBuffer, ' '))
	{
		if (cnt % 2 == 1)
		{
			cout << stringBuffer << endl;
		}
		cnt++;
	}
}
