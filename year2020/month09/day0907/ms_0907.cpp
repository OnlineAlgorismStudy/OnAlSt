#include <iostream>

using namespace std;

int Power(int n, int count);

int main() {
	int data[2];
	
	for (int i = 0; i < 2; i++) {
		int temp;

		scanf_s("%d", &temp);
		
		if (temp <= 10)
			data[i] = temp;
	}

	cout << Power(data[0], data[1]) << endl;

	return 0;
}

int Power(int n, int count) {
	if (count == 0)
		return 1;
	else
		return n * Power(n, count-1);
}