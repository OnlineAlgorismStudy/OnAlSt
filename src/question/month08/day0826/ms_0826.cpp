#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main()
{
    int data[4] = { 0, };
    
    for(int i = 0; i < 4; i++)
    {
        cout << (i+1) << "class? ";
        
        string temp;
        getline(cin, temp);
        stringstream ss(temp);
        
        while(getline(ss, temp, ' '))
            data[i] += stoi(temp);
    }
    
    for(int i = 0; i < 4; i++)
        cout << (i+1) << "class : " << data[i] << endl;
    
    return 0;
}
