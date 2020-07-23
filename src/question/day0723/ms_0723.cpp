#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;

	cin >> n;

	for(int i = -(n-1); i <= (n-1); i++) {
		for (int j = 0; j < (n-1) - abs(i); j++) {
			cout << ' ';
		}
		//cout << string((n - 1) - abs(i), ' ');

		for (int j = 0; j < 2 * abs(i) + 1; j++) {
			cout << '*';
		}
		//cout << string(2 * abs(i) + 1, '*');
		
		cout << endl;
	}

	return 0;
}
