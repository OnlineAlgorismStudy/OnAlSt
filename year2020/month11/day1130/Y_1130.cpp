#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    
    int month[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    string day[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    
    int date = 0;
    for(int i=0; i<a; i++) {
        date += month[i];
    }
    
    date += b-1;
    return day[date%7];
}
