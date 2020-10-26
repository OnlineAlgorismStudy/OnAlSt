#include <iostream>

using namespace std;

int main() {
	char data;

	while (true) {
		cin >> data;

		if ((65 <= data && data <= 90) || (97 <= data && data <= 122))
			cout << data << endl;

		else if (48 <= data && data <= 57)
			cout << (int)data << endl;

		else
			break;
	}

	return 0;
}