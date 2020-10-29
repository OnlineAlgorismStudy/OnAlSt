#include <iostream>
#include <string>

using namespace std;

int main() {
	string input;

	getline(cin, input);

	int strlen = input.length();

	cout << endl;

	if (strlen <= 100) {
		for (int i = strlen - 1; i >= 0; i--) {
			for (int j = i; j < strlen; j++)
				cout << input[j];

			for (int j = 0; j < i; j++)
				cout << input[j];

			cout << endl;
		}
	}

	return 0;
}