package io.rizwan;

import java.util.Arrays;

public class D006_TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        System.out.println(Arrays.deepToString(arr));
        transpose(arr, 4);
        System.out.println(Arrays.deepToString(arr));
    }

    static void transpose(int matrix[][], int n)
    {
        // to traverse rows
        for (int i = 0; i < n; i++) {
            // to traverse columns
            for (int j = i; j < n; j++) {
                // swapping the elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
