#include <string>
#include <vector>

using namespace std;

long long sum(int small, int big) {
    long long answer = 0;
    for(int i=small; i<=big; i++)
        answer += i;
    return answer;
}

long long solution(int a, int b) {
    if(a > b) return sum(b, a);
    else return sum(a, b);
}
