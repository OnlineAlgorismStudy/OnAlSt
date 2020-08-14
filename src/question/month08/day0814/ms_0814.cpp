#include <iostream>

using namespace std;

int main() {
	int data[100], i = 0;

	while (i < 100) {
		int temp;
		
		scanf_s("%d", &temp);

		if (temp != 0) {
			data[i] = temp;
			i++;
		}
		else break;
	}

	int count = 0, sum = 0;
	
	for (int j = 0; j < i; j++) {
		if (data[j] % 5 == 0) {
			sum += data[j];
			count++;
		}
	}

	cout << "Multiples of 5 : " << count << endl;
	cout << "sum : " << sum << endl;
	printf("avg : %.1lf", (sum / double(count)));

	return 0;
}