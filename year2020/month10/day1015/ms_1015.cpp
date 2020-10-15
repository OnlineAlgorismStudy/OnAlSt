#include <iostream>

using namespace std;

int multNums(int value);

int main() {
	int data[3];

	cin >> data[0] >> data[1] >> data[2];

	for (int i = 0; i < 3; i++) {
		// ���ڸ����� �ƴϸ� �� ���� 1�� ����
		if (!(100 <= data[i] && data[i] < 1000))
			data[i] = 1;
	}

	cout << multNums(data[0] * data[1] * data[2]) << endl;

	return 0;
}

int multNums(int value) {
	if (value == 0)
		return 1;

	int division = value / 10;
	int remainder = value % 10;

	if (remainder != 0)
		return remainder * multNums(division);
	else
		return multNums(division);
}