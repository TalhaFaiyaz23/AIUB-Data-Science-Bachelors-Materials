#include <iostream>
using namespace std;

void bubbleSort(int a[], int n)
{
    for (int round = 0; round < n - 1; round++) // Round
    {
        for (int current_index_of_array = 0; current_index_of_array < (n - 1 - round); current_index_of_array++)
        {
            if (a[current_index_of_array] > a[current_index_of_array + 1])
            {
                int temp = a[current_index_of_array];
                a[current_index_of_array] = a[current_index_of_array + 1];
                a[current_index_of_array + 1] = temp;
            }
        }
    }
}

int main() {
    int a[] = {5, 2, 9, 1, 3};
    int n = sizeof(a) / sizeof(a[0]);

    bubbleSort(a, n);

    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    return 0;
}
