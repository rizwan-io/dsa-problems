package io.rizwan;

public class D005_BitonicPoint {
    public static void main(String[] args) {
        int result = findMaximum(new int[]{5,1079,950,901,899,801,750,650,10,1}, 10);
        System.out.println(result);
    }
    static int findMaximum(int[] arr, int n) {
        int low = 0;
        int high = n-1;

        while (low < high) {
            int mid = (low+high)/2;
            if (arr[mid+1] > arr[mid]) {
                low = mid+1;
            } else if (arr[mid-1] > arr[mid]) {
                high = mid-1;
            } else {
                return arr[mid];
            }
        }
        return arr[low];
    }
}
