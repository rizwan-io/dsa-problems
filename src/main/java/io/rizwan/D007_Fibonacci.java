package io.rizwan;

import java.util.ArrayList;
import java.util.Arrays;

public class D007_Fibonacci {
    public static void main(String[] args) {
        long[] fib = printFibb(5);
        System.out.println(Arrays.toString(fib));
    }

    // this is an iterative approach. recursive approach is also possible.
    public static long[] printFibb(int n)
    {
        long a = 1;
        long b = 1;
        ArrayList<Long> result = new ArrayList<>();

        if (n == 1) {
            return new long[]{a};
        }

        result.add(a);
        result.add(b);

        for (int i = 2; i < n; i++) {
            // next number is sum of previous 2 numbers
            long num = a + b;

            result.add(num);

            // incrementing a and b
            a = b;
            b = num;
        }

        // converting an arraylist in to array and returning
        long []arr = new long[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
