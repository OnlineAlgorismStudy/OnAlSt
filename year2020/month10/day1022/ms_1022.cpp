#include <iostream>
#include <cstring>
#include <sstream>

using namespace std;

int main() {
	string input;
	
	getline(cin, input);

	stringstream ss(input);
	string data[2];
	int i = 0;

	while (getline(ss, input, ' ')) {
		data[i] = input;
		i++;
	}

	int range = stoi(data[1]);
	int dl = data[0].length();
	int min = range;

	if (dl > range) 
		min = dl - range;
	else min = 0;

	if (dl <= 100) {
		for (i = dl - 1; i >= min; i--) {
			cout << data[0][i];
		}
	}

	return 0;
}