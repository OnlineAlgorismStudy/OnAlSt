#include <iostream>

using namespace std;

int main() {
	int data[100], cnt = 0;

	while (true) {
		// cin 으로는 한번에 인식이 안되네요 ㅇㅁㅇa
		scanf_s("%d", &data[cnt]);
		
		if (data[cnt] == 0)
			break;

		cnt++;
	}

	for (int i = cnt; i > 0; i--) {
		cout << data[i-1];

		if (i != 1)
			cout << ' ';
	}
}
