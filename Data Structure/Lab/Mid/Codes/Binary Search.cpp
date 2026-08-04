#include <iostream>
using namespace std;

// Binary Search (array must be sorted)
// returns index if found, otherwise returns -1
int binarySearch(int a[], int n, int search_) {
    int low = 0, high = n - 1;

    while (low <= high)
    {
        int mid = (low + high) / 2;

        if (a[mid] == search_)
        {
            return mid;
        }
        else if (a[mid] < search_)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    return -1;
}

int main() {
    int a[] = {1, 3, 5, 7, 9, 11}; // must be sorted
    int n = sizeof(a) / sizeof(a[0]);

    int key;
    cout << "Enter number to search: ";
    cin >> key;

    int pos = binarySearch(a, n, key);

    if (pos == -1)
    {
        cout << "Not found" << endl;
    }
    else
    {
        cout << "Found at index: " << pos << endl;
    }

    return 0;
}
