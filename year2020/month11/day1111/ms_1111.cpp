#include <iostream>
#include <string>

using namespace std;

int main() {
	string input;

	getline(cin, input);

	if (input.length() <= 100) {
		int find_c = input.find_first_of('c');
		int find_ab = input.find_first_of("ab");

		if (0 <= find_c && find_c <= input.length() - 1) {
			cout << "Yes";
		}
		else cout << "No";

		cout << ' ';

		if (0 <= find_ab && find_ab <= input.length() - 1) {
			cout << "Yes";
		}
		else cout << "No";
	}

	return 0;
}