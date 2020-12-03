#include <iostream>
#include <string>
#include <algorithm>
#include <cmath>

using namespace std;

string s;
int init;

void translate(int n) {
    int r = n % 3;
    n /= 3;
    
    if(n > 0) translate(n);
    s += to_string(r);
}

int solution(int n) {
    translate(n);
    reverse(s.begin(), s.end());
    
    int res = 0;
    for(int i=s.length()-1; i>=0; i--) {
        res += (pow(3.0, (s.length()-1) - i) * (s.at(i) - 48));
    }
    return res;
}

