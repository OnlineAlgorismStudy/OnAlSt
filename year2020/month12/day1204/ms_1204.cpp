#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

string solution(string s);

int main() {
	string str;

	getline(cin, str);

	if (1 <= str.length()) {
		cout << solution(str) << endl;
	}

	return 0;
}

string solution(string s) {
	string answer = "";

	sort(s.begin(), s.end());
	reverse(s.begin(), s.end());

	answer = s;

	return answer;
}
