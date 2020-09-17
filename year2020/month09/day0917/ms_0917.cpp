#include <iostream>
#include <algorithm> // for sort algorithm

using namespace std;

void descendingSort(int* p);

int main() {
	int n;

	cin >> n;

	if (1 <= n && n <= 10) {
		int *data = new int[n];

		for (int i = 0; i < n; i++)
			scanf_s("%d", &data[i]);

		descendingSort(data);
	}

	return 0;
}

void descendingSort(int* p) {
	sort(p, p + sizeof(p),
		[](int x, int y) { return x > y; }
	);

	for (int i = 0; i < sizeof(p); i++) {
		cout << *(p + i);

		if (i != sizeof(p))
			cout << ' ';
	}
}