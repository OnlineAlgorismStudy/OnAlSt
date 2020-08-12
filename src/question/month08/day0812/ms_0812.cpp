#include <iostream>

using namespace std;

int main() {
	int data[10], odd = 0, even = 0;

	for (int i = 0; i < sizeof(data) / sizeof(data[0]); i++) 
	{
		scanf_s("%d", &data[i]);

		if (i % 2 == 0)
			odd += data[i];
		else
			even += data[i];
	}

	cout << "odd : " << odd << endl;
	cout << "even : " << even << endl;

	return 0;
}