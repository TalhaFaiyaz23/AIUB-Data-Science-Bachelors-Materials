#include<iostream>
using namespace std;

void selectionSort(int A[], int n) {
    for (int i = 0; i < n - 1; i++) {
        int minimum = i;

        for (int j = i + 1; j < n; j++) {
            if (A[j] < A[minimum]) {
                minimum = j;
            }
        }

        if (minimum != i) {
            int temp = A[i];
            A[i] = A[minimum];
            A[minimum] = temp;
        }
    }
}

int main() {
    // Example array to sort
    int A[] = {64, 25, 12, 22, 11};
    // Calculate the number of elements in the array
    int n = sizeof(A) / sizeof(A[0]);

    cout << "Original array: ";
    for (int i = 0; i < n; i++) {
        cout << A[i] << " ";
    }
    cout << endl;

    // Call the selection sort function
    selectionSort(A, n);

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++) {
        cout << A[i] << " ";
    }
    cout << endl;

    return 0;
}
