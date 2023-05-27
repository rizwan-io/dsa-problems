package io.rizwan;

import java.util.Arrays;

public class D004_WaveArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        convertToWave(5, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void convertToWave(int n, int[] a) {
        for (int i = 0; i < n-1; i+=2) {
            int temp = a[i+1];
            a[i+1] = a[i];
            a[i] = temp;
        }
    }
}
