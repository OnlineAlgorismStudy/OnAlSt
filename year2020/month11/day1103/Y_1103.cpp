#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main()
{
	string s;
	cin >> s;

	while (s.length() > 1)
	{
		int n;
		scanf("%d", &n);

		if (n <= s.length())
		{
			string s_front = s.substr(0, n - 1);
			string s_end = s.substr(n, s.length() - s_front.length() - 1);
			s = s_front + s_end;
		}
		else
		{
			s = s.substr(0, s.length() - 1);
		}

		cout << s<< endl;
	}
}
