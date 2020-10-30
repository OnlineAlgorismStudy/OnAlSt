#include <iostream>
#include <cctype> // for isalpha, tolower, isdigit
#include <string>

using namespace std;

int main() {
	string data;

	getline(cin, data);

	if (data.length() <= 100) {
		for (int i = 0; i < data.length(); i++) {
			if (isalpha(data[i]))
				cout << (char)tolower(data[i]);

			else if (isdigit(data[i]))
				cout << data[i];
		}
	}
	
	return 0;
}