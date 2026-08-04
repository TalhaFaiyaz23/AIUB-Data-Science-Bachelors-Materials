#include <iostream> // Main Structure (1-12)

using namespace std;

int main ()

{                        // cout (how output function works (7 - 16))


    cout<<"My name is Talha"<<endl; // cout function prints the sentence within "" sign and << is angular sign
    cout<<"My ID is 25-62983-2"<<endl; // endl is a function which makes a line break.
    cout<<"I am studying in AIUB"<<endl;
    cout<<"I love programming"<<endl;

    cout<<"My name is Talha.\nMy ID is 25-62983-2.\nI am studying in AIUB.\nI love programming"<<endl;
    // without using the cout function we can use \n for line break.


                              // Data types and assigning values


    int a; // In C++ , we have to declare all the data types first which is called Declaration ( 22 - 38 ).
    float f;
    double d;
    char ch;
    bool b;

    a = 25; // Then we have to initialize the declaration.
    f = 10.5;
    d = 12.1234;
    ch = 'a';
    b = true;

    cout<<"Different types of variables :"<<endl; // Then we have to give the assigned values (ex : a,f).
    cout<<"Integer value:"<<a<<endl;
    cout<<"float:"<<f<<endl;
    cout<<"Character:"<<ch<<endl;
    cout<<"Boolean value:"<<b<<endl;


    int l = 5; // We can also assign the values directly to the data types ( 41 - 51 ).
    float t = 98.5;
    double n = 16.4523;
    char c = 'b';
    bool s = false;

    cout<<"Different types of variables :"<<endl; // Another example.
    cout<<"Integer value:"<<l<<endl;
    cout<<"float:"<<t<<endl;
    cout<<"Character:"<<c<<endl;
    cout<<"Boolean value:"<<s<<endl;



                             // Array and Arithmetic

    int i,j,sum; // We can assign as much as variables we want by using comma.
    i = 10;
    j = 5;
    sum = i+j; //Summation.

    cout<<"Addition of i and j is:"<<sum<<endl;

    int x,y,mul;
    x = 3;
    y = 5;
    mul = x*y; //Multiplication.

    cout<<"Multiplication of x and y is:"<<mul<<endl;
    int m,o,sub;
    m = 3;
    o = 5;
    sub = m-n; //Subtraction.

    cout<<"Subtraction of m and o is:"<<sub<<endl;

    int q,r,div;
    q = 15;
    r = 3;
    div = c/d; //Division.

    cout<<"Division of q and r is:"<<div<<endl;

    int e,z,g,h,summation,subtraction,multiplication,division; //Or we can just do this instead.
    e = 1;
    z = 2;
    g = 3;
    h = 4;
    summation = e+z;
    subtraction = z-g;
    multiplication = g*h;
    division = h/e;

    cout<<"sum,sub,mul and division of e,f,g,h are:"<<endl<<summation<<endl<<subtraction<<endl<<multiplication<<endl<<division<<endl;



                      //How to take User input and output ( 100 - 111 ).

    int ab,cd;

    cout<<"Enter a number:"; // We have to write something with cout before we take user input with cin (which is the function for taking input from user) because otherwise people will not understand what kind of data they have to input.

    cin>>ab;
    cout<<"Enter a number:";
    cin>>cd;
    cout<<"Addition of ab and cd is:"<<ab+cd<<endl;

    return 0; //return function ensures the code is successfully compiled.

}
