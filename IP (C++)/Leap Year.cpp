#include <iostream>

using namespace std;

int main ()

{
    int year,rem_4, rem_100, rem_400;

    cout <<"Enter your number to check if its a leap year"<< endl ;
    cin >> year ;

    rem_4 = year % 4;
    rem_100 = year % 100;
    rem_400 = year % 400;

    if ( (rem_4 == 0 && rem_100 != 0) || rem_400 == 0)

        cout << "The year is a leap year. " << endl;


    else

        cout << "The year is not a leap year" << endl;


    return 0;
}
