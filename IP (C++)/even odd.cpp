#include <iostream>

using namespace std;

int main ()
{
    int a,b;
    cout << "Enter your number to be tested :" ;
    cin >> a;

    b = a%2;

    if (a > 0){

        if (a == 0)
        cout << " The number is even."<<endl;

        else
            cout << "The number is odd." ;
    }

    else
        cout << "The number is a negative number.";N

    return 0;
}

