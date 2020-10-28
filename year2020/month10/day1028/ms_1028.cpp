#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string data;

	getline(cin, data);
	
	if (data.length() <= 100) {
		stringstream ss(data);
		int count = 0;

		while (getline(ss, data, ' '))
			count++;

		cout << count << endl;
	}

	return 0;
}