package org.example;

public class Teht17 {

    static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (right > left) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            right--;
            left++;
        }
        return new String(chars);
    }
}
