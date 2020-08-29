#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;

	cin >> n;

	for (int i = 0; i < n; i++) {
		cout << string(i, ' ');

		for (int j = i; j < n; j++)
			cout << '*';

		cout << endl;
	}
	return 0;
}