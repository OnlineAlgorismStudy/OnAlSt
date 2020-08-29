#include <iostream>

using namespace std;

int main() {
	int data[100], i = 0, count = 0;

	while (i < sizeof(data) / sizeof(data[0])) {
		int temp;

		scanf_s("%d", &temp);

		if (temp != 0) {
			data[i] = temp;
			count++;
		}
		else break;

		i++;
	}

	cout << count << endl;

	for (i = 0; i < count; i++) {
		if (data[i] % 2 == 0)
			cout << data[i] / 2;
		else 
			cout << data[i] * 2;
		
		if (i != count)
			cout << ' ';
	}

	return 0;
}