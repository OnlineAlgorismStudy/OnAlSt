#include <iostream>
#include <vector>

using namespace std;

int main() {
	vector<int> data;
	int n;

	cin >> n;

	if (0 < n && n <= 20) {
		for (int i = 0; i < n; i++) {
			int temp;

			scanf_s("%d", &temp);
			data.push_back(temp);
		}

		for (int i = 0; i < data.size() - 1; i++) {
			int temp = i;

			for (int j = i + 1; j < data.size(); j++)
				if (data[temp] < data[j])
					temp = j;

			int value = data[i];
			data[i] = data[temp];
			data[temp] = value;
		}

		for (int i = 0; i < data.size(); i++)
			cout << data[i] << endl;
	}


	return 0;
}