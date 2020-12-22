#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    int temp = x;
    int n = 0;
    while(x != 0) {
        n = n + (x % 10);
        x = x / 10;
    }
    
    if(temp % n == 0)
        return true;
    else
        return false;
}
