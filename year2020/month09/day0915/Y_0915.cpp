#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

void print(int n1, int n2)
{
    if(n1 > n2)
        printf("%d\n", ((n1*n1) - (n2*n2)));
    else
        printf("%d\n", ((n2*n2) - (n1*n1)));
}

int main(int argc, const char * argv[]) {
    int n1, n2;
    scanf("%d %d", &n1, &n2);
    
    print(n1, n2);
    return 0;
}
