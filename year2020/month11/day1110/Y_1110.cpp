#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main()
{
    string s1, s2;
    cin>>s1>>s2;
    
    string s = s1.substr(0, 2);
    s2.replace(0, 2, s);
    s2 = s2 += s;
    cout<<s2<<endl;
}
