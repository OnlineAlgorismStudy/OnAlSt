#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
#include <cstring>
using namespace std;

int n;
int dice[101];

void dfs(int cnt)
{
    if(cnt > n)
    {
        for(int i=1; i<=n; i++)
        {
            printf("%d ", dice[i]);
        }
        printf("\n");
        return;
    }
    
    for(int i=dice[cnt-1]; i<=6; i++)
    {
        dice[cnt] = i;
        dfs(cnt+1);
    }
}

int main()
{
    scanf("%d", &n);
    dice[0] = 1;
    dfs(1);
}
