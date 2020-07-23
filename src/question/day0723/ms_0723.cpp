#include <iostream>
#include <string>

using namespace std;

int main() {
	int n, by;

	cin >> n;
	by = 2 * n - 1;

	for (int i = 1; i <= 2 * n - 1; i++) {
		if (i <= n) {
			for (int j = 0; j < i - 1; j++) {
				cout << ' ';
			}
			//cout << string(i-1, ' ');
			
			for (int j = 0; j < by; j++) {
				cout << '*';
			}
			//cout << string(by, '*') << endl;

			by -= 2;
		} else {
			if (by < 0) by = 3;
			else by += 2;

			for (int j = i - by; j > 0; j--) {
				cout << ' ';
			}
			//cout << string(i - by, ' ');
			
			for (int j = 0; j < by; j++) {
				cout << '*';
			}
			//cout << string(by, '*');
		}
		
		cout << endl;
	}

	return 0;
}