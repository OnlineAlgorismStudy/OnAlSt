#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    string s;
    cin>>s;
    
    size_t ab = s.find("ab");
    size_t c = s.find("c");
    
    if(c != string::npos) cout<<"Yes ";
    else cout<<"No ";
    
    if(ab != string::npos) cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
}
