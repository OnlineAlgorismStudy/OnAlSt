#include <iostream>
#include <string>

using namespace std;

int main() {
	int n;

	cin >> n;

	for (int i = -(n - 1); i <= (n - 1); i++) {
		// 2�� for ��
		for (int j = 0; j < n - abs(i); j++) {
			cout << '*';
		}
		cout << endl;

		// ���� for ��
		//cout << string(n - abs(i), '*') << endl;
	}
	return 0;
}