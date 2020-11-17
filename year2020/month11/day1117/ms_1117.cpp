#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string input;

	getline(cin, input);

	if (input.length() <= 100) {
		stringstream ss(input);
		string data[100];
		int i = 0;

		while (getline(ss, input, ' ')) {
			data[i] = input;
			i++;
		}

		for (int j = 0; j < i; j++)
			cout << data[i - (j + 1)] << endl;
	}

	return 0;
}