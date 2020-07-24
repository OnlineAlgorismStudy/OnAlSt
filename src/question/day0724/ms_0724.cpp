#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;

	cin >> n;

	for (int i = 1; i < 2*n; i += 2) {
		// 2중 for 문
		for (int j = 0; j < 2 * n - 1 - i; j++) {
			cout << " ";
		}
		
		for (int j = 0; j < i; j++) {
			cout << "*";
		}
		
		cout << endl;

		//단일 for 문
		//cout << string(2*n -1 -i, ' ');
		//cout << string(i, '*') << endl;
	}
	return 0;
}