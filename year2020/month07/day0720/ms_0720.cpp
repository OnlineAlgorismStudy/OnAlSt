#include <iostream>

using namespace std;

int main() {
	int n;

	cin >> n;

	if (3 <= n && n <= 10) {
		char symbol = 'A';
		
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				cout << symbol;
				symbol++;
			}
			cout << endl;
		}
	}

	return 0;
}
