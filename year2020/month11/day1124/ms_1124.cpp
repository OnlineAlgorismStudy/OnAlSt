#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string data[3];
	string input;

	do {
		getline(cin, input);

		stringstream ss(input);
		int i = 0;

		while (getline(ss, input, ' ')) {
			data[i] = input;
			i++;
		}

		if (data[0].length() <= 100 && data[1].length() <= 100 && 1 <= stoi(data[2]))
			break;
	} while (true);

	data[0] = data[0] + data[1];
	data[1] = data[0].substr(0, stoi(data[2])) 
				+ 
			  data[1].substr(stoi(data[2]), data[1].length());

	cout << data[0] << endl;
	cout << data[1] << endl;

	return 0;
}