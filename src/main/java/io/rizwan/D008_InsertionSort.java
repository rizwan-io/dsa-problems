package io.rizwan;

import java.util.Arrays;

public class D008_InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 3};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    // Function to sort the array using insertion sort algorithm.
    // refer: https://www.youtube.com/watch?v=OGzPmgsI-pQ
    public static void insertionSort(int arr[], int n)
    {
        for (int i = 1; i < n; i++) {
            int unsortedMarker = i;

            for (int j = i-1; j >= 0; j--) {
                // if the element is greater than previous swap
                if (arr[unsortedMarker] < arr[j]) {
                    int temp = arr[unsortedMarker];
                    arr[unsortedMarker] = arr[j];
                    arr[j] = temp;
                    unsortedMarker--;
                }
            }
        }
    }
}
