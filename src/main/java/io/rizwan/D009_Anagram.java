package io.rizwan;

import java.util.Arrays;
import java.util.Locale;

public class D009_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("helo", "olhq"));
    }

    public static boolean isAnagram(String a,String b)
    {
        if (a.length() != b.length()) return false;

        // array for both the strings to keep the count of each alphabet.
        int arrOfA[] = new int[26];
        int arrOfB[] = new int[26];

        // converting to uppercase just for the sake of consistency
        a = a.toUpperCase();
        b = b.toUpperCase();

        // traversing the strings and incrementing the index of the character encountered
        // if 'a' is encountered then arr[0] will be incremented
        // if 'b' is encountered then arr[1] will be incremented and so on
        for (int i = 0; i < a.length(); i++) {
            arrOfA[(a.charAt(i) - 'A')]++;
            arrOfB[(b.charAt(i) - 'A')]++;
        }

        // if the arrays has same number of alphabet return true
        if (Arrays.equals(arrOfA, arrOfB)) return true;
        return false;

    }
}
