package io.rizwan;

public class D001_SearchAnElement {
    public static void main(String[] args) {
        int result = search(new int[]{1, 2, 3, 4, 5}, 5, 5);
        System.out.println(result);
    }

    static int search(int arr[], int N, int X)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) return i;
        }

        return -1;
    }
}
