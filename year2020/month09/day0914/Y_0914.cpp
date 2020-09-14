#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

void print(int n)
{
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            printf("%d ", i * j);
        }
        printf("\n");
    }
}

int main(int argc, const char * argv[]) {
    
    int n;
    scanf("%d", &n);
    
    print(n);
    return 0;
}
