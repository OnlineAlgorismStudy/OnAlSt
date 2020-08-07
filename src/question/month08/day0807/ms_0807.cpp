#include <iostream>

using namespace std;

int main() {
	int data[10], min = 10000, max = 0, i = 0;
	bool check[10];

	while (i < 10) 
	{
		scanf_s("%d", &data[i]);

		if (0 < data[i] && data[i] < 100)
			check[i] = true;
		else if (100 <= data[i] && data[i] < 10000)
			check[i] = false;

		i++;
	}

	for (i = 0; i < 10; i++) 
	{
		if (check[i]) 
		{
			if (data[i] > max)
				max = data[i];
		}
		else 
		{
			if (data[i] < min)
				min = data[i];
		}

		if (data[i] < 1)
			max = 100;

		if (data[i] >= 10000)
			min = 100;
	}

	cout << max << ' ' << min << endl;

	return 0;
}