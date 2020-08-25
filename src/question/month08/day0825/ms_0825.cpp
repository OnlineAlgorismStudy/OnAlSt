#include <iostream>

using namespace std;

int main() {
	int students[100], i = 0;
	int nss[10] = { 0, }; // Number of Students by Score

	while (i < 100) {
		int temp;

		scanf_s("%d", &temp);

		if (temp != 0)
			nss[(temp / 10) - 1]++;
		else break;

		i++;
	}

	for (i = sizeof(nss) / sizeof(nss[0]) - 1; i >= 0; i--)
		if (nss[i] != 0)
			cout << (i + 1) * 10 << " : " << nss[i] << " person" << endl;

	return 0;
}