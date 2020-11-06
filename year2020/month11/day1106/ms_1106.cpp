#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string input;

	getline(cin, input);

	if (input.length() <= 100) {
		stringstream ss(input);
		int i = 0;

		while (getline(ss, input, ' ')) {
			if (i % 2 == 0)
				cout << input << endl;

			i++;
		}
	}

	return 0;
}