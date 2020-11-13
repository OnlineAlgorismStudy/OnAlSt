#include <iostream>
#include <string>

using namespace std;

int main() {
	string input;

	getline(cin, input);

	if (input.length() <= 20) {
		for (int i = 0; i < input.length() - 1; i++) {
			char temp = input[i];

			if (!(('0' <= temp && temp <= '9') || temp == '.'))
				input.replace(i, 1, 1, '0');
		}

		cout << 2 * stoi(input) << endl;

		cout << fixed;
		cout.precision(2);
		cout << stod(input) << endl;
	}

	return 0;
}