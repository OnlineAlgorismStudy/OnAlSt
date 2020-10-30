#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main()
{
	string s;
	stack<string> st;

	for (int i = 0; i < 5; i++)
	{
		getline(cin, s);
		st.push(s);
	}
	
	while (!st.empty())
	{
		string top = st.top();
		st.pop();
		cout << top << endl;
	}
}
