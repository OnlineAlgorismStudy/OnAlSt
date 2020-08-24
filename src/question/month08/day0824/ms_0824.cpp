#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main() {
	string data[5];
	int successful = 0;

	for (int i = 0; i < 5; i++) {
		string input;

		getline(cin, input);
		stringstream ss(input);

		int avg = 0;
		while (getline(ss, input, ' '))
			avg += stoi(input);

		if ((avg / 4) >= 80) {
			data[i] = "pass";
			successful++;
		}
		else data[i] = "fail";
	}
		
	for (int i = 0; i < 5; i++)
		cout << data[i] << endl;
	
	cout << "Successful : " << successful << endl;
	
	return 0;
}