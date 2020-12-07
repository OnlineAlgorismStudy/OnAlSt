#include <iostream>
#include <string>

using namespace std;

bool solution(string s);

int main() {
	string s;

	getline(cin, s);

	if (1 <= s.length() && s.length() <= 8) {
		cout << solution(s) << endl;
	}
	return 0;
}

bool solution(string s) {
	bool isNumber = true;
	bool isInRange = true;
	int i = 0;

	while (s[i] != NULL) {
		if (!(0 <= s[i]-'0' && s[i]-'0' <= 9)) {
			isNumber = false;
		}

		i++;
	}

	if (i != 4 && i != 6) {
		isInRange = false;
	}

	return isNumber && isInRange;
}