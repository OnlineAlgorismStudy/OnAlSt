#include <iostream>
#include <string>
#include <sstream>
#include <algorithm> // for sort

using namespace std;

int main() {
	string input;

	getline(cin, input);

	stringstream ss(input);
	string data[3];
	int i = 0;
	bool isOK = true; // false : not ok

	while (getline(ss, input, ' ')) {
		data[i] = input;

		if (!(1 <= data[i].length() && data[i].length() <= 10))
			isOK = false;

		i++;
	}

	if (isOK) {
		sort(data, data + 3);

		cout << data[0] << endl;
	}

	return 0;
}