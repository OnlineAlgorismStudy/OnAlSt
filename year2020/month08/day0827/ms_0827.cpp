#include <iostream>

using namespace std;

int main()
{
    int data[4][3] = 
    {
         { 3, 5, 9 },
         { 2, 11, 5 },
         { 8, 30, 10 },
         { 22, 5, 1 }
    };
    int total = 0;
    
    for(int i = 0; i < 4; i++) {
        for(int j = 0; j < 3; j++) {
            cout << data[i][j];
            total += data[i][j];
            
            if(j != 3)
                cout << ' ';
        }
        
        cout << endl;
    }
    
    cout << total;
    
    return 0;
}
