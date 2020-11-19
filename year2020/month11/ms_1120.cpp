#include <iostream>
#include <string>
#include <algorithm> // for sort

using namespace std;

int main() {
	int n;
	string* data = nullptr;

	cin >> n;

	if (n <= 10) {
		data = new string[n];
		string temp;

		// 엔터 값 처리!
		getline(cin, temp);

		for (int i = 0; i < n; i++) {
			getline(cin, temp);

			if (temp.length() <= 100) {
				data[i] = temp;
			}
		}

		sort(data, data + n);

		for (int i = 0; i < n; i++) {
			cout << data[i] << endl;
		}
	}

	delete[] data;

	return 0;
}