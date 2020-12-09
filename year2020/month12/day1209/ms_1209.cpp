#include <iostream>
#include <string>

using namespace std;

int solution(string s);

int main() {
	string str;

	getline(cin, str);

	if (1 <= str.length() && str.length() <= 5) {
		cout << solution(str) << endl;
	}

	return 0;
}

int solution(string s) {
	int answer = 0;
	int start = 0;
	int isPlus = 1;

	switch (s[start]) {
	case '-':
		isPlus = -1;
	case '+':
		start = 1;
		break;
	}

	answer = answer + isPlus * stoi(s.substr(start));

	return answer;
}