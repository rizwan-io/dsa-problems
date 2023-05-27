package io.rizwan;

public class D002_MinAndMax {
    public static void main(String[] args) {
        pair pair = getMinMax(new long[]{3, 2, 1, 56, 10000, 167}, 6);
        System.out.println(pair.first);
        System.out.println(pair.second);
    }

    static pair getMinMax(long a[], long n) {
        long min = a[0];
        long max = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] < min) min = a[i];
            else if (a[i] > max) max = a[i];
        }

        return new pair(min, max);
    }

    static class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
}