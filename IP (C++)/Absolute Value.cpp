#include <iostream>

using namespace std;

int main ()

{
    int number;
    cout << "Enter any number :" << endl;
    cin >> number;

    if (number < 0 ){

    number = -number; }

    cout <<"The absolute value of your number is :" <<number ;
    return 0;
}
