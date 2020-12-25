#include <iostream>
#include <string>

using namespace std;

string solution(string phone_number);

int main() {
	string pn;

	getline(cin, pn);

	if (4 <= pn.length() && pn.length() <= 20) {
		cout << solution(pn) << endl;
	}
}

string solution(string phone_number) {
	int len = phone_number.length();
	string answer = "";

	for (int i = 0; i < len - 4; i++) {
		answer += "*";
	}

	answer += phone_number.substr(len - 4, 4);

	return answer;
}