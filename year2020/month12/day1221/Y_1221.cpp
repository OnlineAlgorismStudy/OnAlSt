#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int count = 0;
    long long n = num;
    
    while(true) {
        if(count >= 500)
            return -1;
        if(n == 1)
            return count;
        
        if(n % 2 == 0)
            n = n / 2;
        else
            n = (n * 3) + 1;
        
        count++;
    }
}
