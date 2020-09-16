#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

vector<int> v;
int n;

void sortDesc()
{
    sort(v.begin(), v.end(), greater<int>());
    for(int i=0; i<n; i++)
    {
        printf("%d ", v[i]);
    }
}

int main(int argc, const char * argv[]) {
    scanf("%d", &n);

    int input_num;
    for(int i=0; i<n; i++)
    {
        scanf("%d", &input_num);
        v.push_back(input_num);
    }
    sortDesc();
}
