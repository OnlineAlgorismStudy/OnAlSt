#include <iostream>

using namespace std;

bool solution(int x);

int main() {
	int x;

	cin >> x;

	if (1 <= x && x <= 10000) {
		cout << solution(x) << endl;
	}
}

bool solution(int x) {
	int SED[5] = { 0, 0, 0, 0, 0 };
	int temp = x;
	int sum = 0;
	int i = 0;

	while (temp > 0) {
		SED[i] = temp % 10;
		temp /= 10;
		i++;
	}

	for (i = 0; i < 5; i++) {
		sum += SED[i];
	}

	if (!(x % sum))
		return true;
	else
		return false;
}