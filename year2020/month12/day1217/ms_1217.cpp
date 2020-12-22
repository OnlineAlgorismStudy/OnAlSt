#include <iostream>
#include <cmath>

using namespace std;

long long solution(long long n);

int main() {
	long long n;

	cin >> n;

	if (1 <= n && n <= 50000000000000) {
		cout << solution(n) << endl;
	}
}

long long solution(long long n) {
	long long answer = -1;
	long long value = floor(sqrt(n));

	if (value * value == n) {
		answer = (value + 1) * (value + 1);
	}

	return answer;
}