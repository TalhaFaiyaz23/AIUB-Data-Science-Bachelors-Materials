
#include <iostream>

using namespace std;

int main ()

{              // Multiplication table

    int i, mul;

    cout << "Input a number :" << endl;
    cin >> mul;


    for ( i= 1;i <= 10; i ++ )
        {
        cout <<"The multiplication table of your number is  : " <<endl << mul << "*" << i << "=" << i*mul<< endl;
    }

    return 0;
}

