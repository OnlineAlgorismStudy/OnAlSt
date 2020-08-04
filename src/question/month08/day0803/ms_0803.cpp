#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string input;
	
	getline(cin, input);

	stringstream ss(input);
	string temp;
	vector<string> data;

	while (getline(ss, temp, ' ')) {
		data.push_back(temp);
	}
	
	bool onOff[10] = { true, false, false, true, false,
					   false, true, false, false, false };

	if (data.size() >= 10) {
		for (int i = 0; i < 10; i++) {
			if (onOff[i])
				cout << data[i] << ' ';
		}

		// ±ÍÂúÀ» ¶§
		// cout << data[0] << ' ' << data[3] << ' ' << data[6] << endl;
	}
	

	
	return 0;
}