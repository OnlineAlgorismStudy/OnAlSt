#include <iostream>

using namespace std;

int main() {
	int n;
	
	cin >> n;

	for (int i = n - 1; i >= 0; i--) {
		for (int j = 0; j < i; j++) {
			cout << "  ";
		}

		int cnt = 1;
		for (int j = 0; j < n - i; j++) {
			cout << cnt++ << ' ';
		}

		cout << endl;
	}

	return 0;
}