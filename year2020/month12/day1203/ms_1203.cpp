#include <iostream>

using namespace std;

long long solution(int a, int b);

int main() {
	int a;
	int b;

	cin >> a >> b;

	if ((-10000000 <= a && a <= 10000000) && (-10000000 <= b && b <= 10000000)) {
		cout << solution(a, b) << endl;
	}

	return 0;
}

long long solution(int a, int b) {
	long long answer = 0;
	int A = a;
	int B = b;

	if (A > B) {
		int temp = A;
		A = B;
		B = temp;
	}
	
	if (A != B) {
		for (int i = A; i <= B; i++) {
			answer += i;
		}
	}
	else answer = A;

	return answer;
}