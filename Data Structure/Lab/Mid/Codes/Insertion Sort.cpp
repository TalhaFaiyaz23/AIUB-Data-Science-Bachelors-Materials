#include <iostream>
using namespace std;

/// Temp = 9
/// 9 11 67 77 23

void insertionSort(int a[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int temp = a[i];
        int j = i - 1;

        while (j >= 0 && a[j] > temp)
        {
            a[j + 1] = a[j]; // Right Shift
            j--;
        }
        a[j + 1] = temp;
    }
}

int main() {
    int a[] = {5, 2, 9, 1, 3};
    int n = sizeof(a) / sizeof(a[0]);

    insertionSort(a, n);

    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    return 0;
}
