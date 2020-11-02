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
		int maxIndex = 0;
		int i = 0;

		while (getline(ss, input, ' '))
			data[i] = input;

		for (i = 0; i < input.length(); i++)
			if (data[i].length() >= data[maxIndex].length())
				maxIndex = i;

		cout << data[maxIndex].length() << endl;
	}
	return 0;
}