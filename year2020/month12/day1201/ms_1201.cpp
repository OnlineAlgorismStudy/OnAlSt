#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int solution(int n);

int main() {
    int n;

    cin >> n;

    if (1 <= n && n <= 100000000) {
        cout << solution(n) << endl;
    }

    return 0;
}

int solution(int n) {
    int answer = 0;
    int max = 0;
    int count = 1;
    int temp = n;

    while (true) {
        max = pow(3, count);

        if (max > temp)
            break;

        count++;
    }

    string ternary = "";

    for (int i = 0; i < count; i++) {
        int minus = pow(3, (count - 1 - i));
        int index = 0;

        for (int j = 0; j < 2; j++) {
            if ((temp - minus) >= 0) {
                temp -= minus;
                index++;
            }
        }

        ternary += to_string(index);
    }

    for (int i = 0; i < count; i++) {
        answer += (ternary[i] - '0') * pow(3, i);
    }

    return answer;
}
