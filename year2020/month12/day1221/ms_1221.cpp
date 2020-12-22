#include <iostream>

using namespace std;

int solution(int num);

int main() {
	int num;

	cin >> num;

	if (0 < num && num <= 8000000) {
		cout << solution(num) << endl;
	}

	return 0;
}

int solution(int num) {
	int answer = 0;
	long long temp = num;

	while (1 < temp) {
		if (answer >= 500) {
			answer = -1;
			break;
		}

		if (temp % 2 == 0)
			temp /= 2;
		else
			temp = temp * 3 + 1;

		answer++;
	}

	return answer;
}