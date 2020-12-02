#include <iostream>
#include <string>

using namespace std;

string solution(string s);

int main() {
	string s;

	getline(cin, s);

	if (1 <= s.length() && s.length() <= 100) {
		cout << solution(s) << endl;
	}

	return 0;
}

string solution(string s) {
	string answer = "";
	int half = s.length() / 2;

	if (s.length() % 2)
		answer += s.substr(half, 1);
	else
		answer += s.substr(half - 1, 2);

	return answer;
}