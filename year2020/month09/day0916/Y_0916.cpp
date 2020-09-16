#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int student[4][4];
void printSum()
{
    for(int i=0; i<4; i++)
    {
        for(int j=0; j<4; j++)
        {
            printf("%d ", student[i][j]);
        }
        printf("\n");
    }
}

int main(int argc, const char * argv[]) {
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            scanf("%d", &student[i][j]);
        }
    }
    
    for(int i=0; i<4; i++)
    {
        for(int j=0; j<3; j++)
        {
            student[3][i] += student[j][i];
        }
        student[i][3] = student[i][0] + student[i][1] + student[i][2];
    }
    printSum();
    return 0;
}
