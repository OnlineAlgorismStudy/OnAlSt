#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS
int main()
{
    int n;
    scanf_s("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int k = 1; k < n; k++)
    {
        for (int l = 1; l < n; l++)
        {
            if (l <= n - k)
            {
                printf("*");
            }
        }
        printf("\n");
    }
    return 0;
}