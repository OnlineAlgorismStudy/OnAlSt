#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string input;
	string data[2];

	do {
		getline(cin, input);

		stringstream ss(input);
		int i = 0;

		while (getline(ss, input, ' ')) {
			data[i] = input;
			i++;
		}

		if (data[0].length() <= 100 && data[1].length() <= 100)
			break;
	} 
	while (true);

	cout << stoi(data[0]) * stoi(data[1]) << endl;

	return 0;
}