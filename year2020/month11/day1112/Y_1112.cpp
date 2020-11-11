#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <algorithm>
using namespace std;

bool comp(string s1, string s2)
{
    return s1 < s2;
}

int main()
{
    string s[3];
    for(int i=0; i<3; i++)
    {
        cin>>s[i];
    }
    
    sort(s, s+3, comp);
    cout<<s[0]<<endl;
}
