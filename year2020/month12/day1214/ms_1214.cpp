#include <iostream>
#include <string>

using namespace std;

string solution(string s);

int main() {
	string s;

	getline(cin, s);

	if (1 <= s.length()) {
		cout << solution(s) << endl;
	}

	return 0;
}

string solution(string s) {
	string answer = "";
	int index = 0;

	for (int i = 0; i < s.length(); i++) {
		char temp = s[i];

		if (temp == ' ') {
			index = 0;
			answer += temp;
			continue;
		}

		if (index % 2 == 0) {
			answer += toupper(temp);
		}
		else {
			answer += tolower(temp);
		}

		index++;
	}

	return answer;
}