#include<iostream>
using namespace std;

struct Box
{
    int id;
    float w;
};


int main()
{

    int search_val=-1;
    Box b[2];

    for(int i=0; i<2; i++)
    {
        cout<<"Enter ID ";
        cin>>b[i].id;
        cout<<"Enter Weight ";
        cin>>b[i].w;
    }

    cout<<"Enter Search Value ";
    cin>>search_val;

    for(int i=0; i<2; i++)
    {
        if(b[i].id == search_val)
        {
            cout<<"Item found at = "<<i<<"th position"<<endl;
            cout<<"Item Weight is = "<<b[i].w<<"KG"<<endl;
        }
    }







    return 0;
}
