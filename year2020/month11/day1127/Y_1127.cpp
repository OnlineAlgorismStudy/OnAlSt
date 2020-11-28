#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    int num[200] = {0,};
    
    for(int i=0; i<numbers.size(); i++) {
        for(int j=0; j<numbers.size(); j++) {
            if(i == j) continue;
            
            int sum = numbers[i] + numbers[j];
            num[sum]++;
            
            if(num[sum] == 1)
                answer.push_back(sum);
        }
    }
    
    sort(answer.begin(), answer.end());
    return answer;
}
