#include <iostream>
#include <string>

using namespace std;

bool isIn(string data, string word);

int main() {
	string data[5];
	string input = "";
	string temp;
	char c;

	for (int i = 0; i < 5; i++) {
		getline(cin, temp);

		if (temp.length() <= 100) {
			data[i] = temp;
		}
		else i--;
	}

	cin >> c;
	getline(cin, temp); // fflush

	for (int i = 0; i < 1; i++) {
		getline(cin, temp);

		if (temp.length() <= 100) {
			input = temp;
		}
		else i--;
	}

	bool isAny = false;
	string str = "";

	str += c;

	for (int i = 0; i < 5; i++) {
		if (isIn(data[i], str) || isIn(data[i], input)) {
			cout << data[i] << endl;
			isAny = true;
		}
	}

	if (!isAny)
		cout << "none" << endl;

	return 0;
}

bool isIn(string data, string word) {
	int temp = data.find(word);

	if (0 <= temp && temp <= data.length()) {
		return true;
	}
	else return false;
}