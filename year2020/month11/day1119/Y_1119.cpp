#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <sstream>
#include <vector>
using namespace std;

int main()
{
    string s;
    vector<string> v;
    
    while(true)
    {
        cin>>s;
        if(s == "0")
            break;
        v.push_back(s);
    }
    
    for(int i=0; i<v.size(); i++)
    {
        if(i%2 == 0) {
            cout<<v[i]<<endl;
        }
    }
}
