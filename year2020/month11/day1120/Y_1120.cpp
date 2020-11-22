#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main()
{
    vector<string> v;
    int count;
    scanf("%d", &count);
    
    for(int i=0; i<count; i++) {
        string s;
        cin>>s;
        v.push_back(s);
    }
    
    sort(v.begin(), v.end());
    for(int i=0; i<count; i++) {
        cout<<v[i]<<endl;
    }
}
