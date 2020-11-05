#include <iostream>
#include <string>

using namespace std;

int main() {
	string input[5];

	for (int i = 0; i < 5; i++) {
		getline(cin, input[i]);

		if (input[i].length() > 30) {
			i--;
			continue;
		}
	}

	for (int i = 1; i <= 5; i++)
		cout << input[5 - i] << endl;

	return 0;
}