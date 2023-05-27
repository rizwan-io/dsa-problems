package io.rizwan;

public class D003_MissingNumber {
    public static void main(String[] args) {
        int result = missingNumber(new int[]{1,2,3,5}, 5);
        System.out.println(result);
    }
    static int missingNumber(int array[], int n) {
        int sumOfNElements = (n * (n+1)) / 2;
        int sumOfArray = 0;

        for (int i = 0; i < n-1; i++) {
            sumOfArray += array[i];
        }

        return sumOfNElements-sumOfArray;
    }
}
