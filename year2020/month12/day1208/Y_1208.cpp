#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    for(int i=0; i<n; i++) {
        if(i % 2 == 0)
            answer += "수";
        else
            answer += "박";
    }
    return answer;
}
