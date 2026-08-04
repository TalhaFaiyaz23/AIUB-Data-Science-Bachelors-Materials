#include<iostream>
using namespace std;


int main()
{

    int arr[5] = {1,2,3,4,5};
    int deletable_index = 1;
    int search_val = 5;

    for(int i=0; i<5; i++)
    {
         if(arr[i] == search_val)
         {
            cout<< "Found !"<<endl;
         }
    }


    return 0;
}
