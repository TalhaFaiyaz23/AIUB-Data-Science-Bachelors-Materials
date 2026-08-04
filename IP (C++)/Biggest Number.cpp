#include <iostream>

using namespace std;

int main ()

{
    int a,b,c;

    cout << " Enter three number to check which one is the biggest :" ;
    cin >> a >> b >> c;

    if (a > b)
    {
        if (a > c)
            cout << " first number is the biggest." ;
        else
            cout << "Last number is the biggest" ;
    }

    else
    {
        if (b > c)
            cout << " The second number is the biggest " ;
        else
            cout << " The Last number is the biggest " ;

    }

    return 0;
}
