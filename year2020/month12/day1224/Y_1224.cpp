#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {
    string answer = "";
    int len = phone_number.length()-4;
    string last = phone_number.substr(len, 4);
    for(int i=0; i<len; i++)
        answer += "*";
    answer = answer + last;
    return answer;
}
