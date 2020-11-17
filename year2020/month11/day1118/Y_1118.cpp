#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <sstream>
#include <vector>
using namespace std;

int main()
{
    string s[5] = { "flower", "rose", "lily", "daffodil", "azalea"};
    char c;
    scanf("%c", &c);
    
    int cnt = 0;
    for(int i=0; i<5; i++)
    {
        if(s[i][1] == c || s[i][2] == c)
        {
            cout<<s[i]<<endl;
            cnt++;
        }
    }
    printf("%d\n", cnt);
}
