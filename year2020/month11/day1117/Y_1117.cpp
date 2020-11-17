#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <sstream>
#include <vector>
using namespace std;

int main()
{
    string s;
    getline(cin, s);
    
    string stringBuffer;
    istringstream ss(s);

    vector<string> v;
    while (getline(ss, stringBuffer, ' '))
    {
        v.push_back(stringBuffer);
    }
    
    for(int i=v.size()-1; i>=0; i--)
    {
        cout<<v[i]<<endl;
    }
}
