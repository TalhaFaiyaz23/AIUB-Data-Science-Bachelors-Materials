#include <iostream>

using namespace std;

int main ()

{
    int a,b;
    char values;

    cout << " Enter two numbers :" << endl;
    cin >> a >> b;

    cout << " Enter a valid expression :" << endl ;
    cin >> values ;

    if ( values == '+')
        cout << " The sum is :" << a+b ;

    else if ( values == '-')
        cout << " The subtraction is :" << a-b ;

    else if ( values == '*')
        cout << " The multiplication is :" << a*b ;

     else if ( values == '/')
        cout << " The division is :" << a/b ;

     else
        cout << "Invalid expression.";

    return 0;
}
