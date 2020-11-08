#include <iostream>
#include <string> // for string, length
#include <cstring> // for strlen, strcat_s

using namespace std;

void ex_01();
void ex_02();

int main() {
	ex_01();
	//ex_02();

	return 0;
}

// string 사용
void ex_01() {
	string input;

	getline(cin, input);

	if (input.length() <= 20)
		input += "fighting";

	cout << input << endl;
}

// strcat_s 사용
void ex_02() {
	char input[30];

	cin >> input;

	if (strlen(input) <= 20) {
		char plus[] = "fighting";

		strcat_s(input, plus);
	}

	cout << input << endl;
}