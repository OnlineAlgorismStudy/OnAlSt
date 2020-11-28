#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
    string s1, s2, s3;
    cin>>s1>>s2>>s3;
    
    string f = s2.substr(0, s2.find(".")) + s2.substr(s2.find("."), 4);
    string temp = s1 + f + s3;
    int len = (s1 + s2 + s3).length();
    
    cout<<temp.substr(0,len/2)<<endl;
    cout<<temp.substr(len/2, len)<<endl;
}
