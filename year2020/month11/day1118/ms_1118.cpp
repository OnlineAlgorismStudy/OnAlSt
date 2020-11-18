#include <iostream>
#include <string>

using namespace std;

int main() {
	string data[5] = { "flower", "rose", "lily", "daffodil", "aza;ea" };
	char input;
	int count = 0;

	cin >> input;

	for (int i = 0; i < 5; i++) {
		char second = data[i][1];
		char third = data[i][2];

		if ((second == input) || (third == input)) {
			cout << data[i] << endl;
			count++;
		}
	}

	cout << count << endl;

	return 0;
}