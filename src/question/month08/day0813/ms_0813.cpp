#include <iostream>

using namespace std;

int main() {
	int data[100], i = 0, count = 0;
	int max = -1000, min = 1000;

	while (i < 100) 
	{
		scanf_s("%d", &data[i]);

		if (-1000 < data[i] && data[i] < 1000) 
		{
			if (data[i] != 999)
				count++;
			else break;
		}
		else continue;
		
		i++;
	}

	for (i = 0; i < count; i++) 
	{
		if (max < data[i])
			max = data[i];

		if (min > data[i])
			min = data[i];
	}

	cout << "max : " << max << endl;
	cout << "min : " << min << endl;

	return 0;
}