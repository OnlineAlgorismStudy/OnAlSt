#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    if(!(s.length() == 4 || s.length() == 6))
        return false;
        
    bool numeric = true;
    for(int i=0; i<s.length(); i++) {
        char c = s.at(i);
        if(!(c >= 48 && c <= 57))
            return false;
    }
    return numeric;
}
