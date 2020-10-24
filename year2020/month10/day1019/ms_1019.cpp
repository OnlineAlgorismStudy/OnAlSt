#include <iostream>

using namespace std;

int main() {
	int n;

	while (true) {
		cout << "ASCII code =? ";
		cin >> n;

		if (33 <= n && n <= 127) {
			cout << (char)n << endl;
		}
		else break;
	}

	return 0;
}