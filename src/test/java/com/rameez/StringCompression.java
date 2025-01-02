package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/string-compression/

public class StringCompression {

    public int compress(char[] chars) {
        int answer = 1;
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (c == chars[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    // write count in chars[]
                    char[] digits = (count + "").toCharArray();
                    for (int j = 0; j < digits.length; j++) {
                        chars[answer++] = digits[j];
                    }
                }
                // write new char & update count
                chars[answer++] = c;
                count = 1;
            }
        }// end loop

        // insert count of the last group of characters
        if (count > 1) {
            // (write count in chars[])
            char[] digits = (count + "").toCharArray();
            for (int j = 0; j < digits.length; j++) {
                chars[answer++] = digits[j];
            }
        }

        return answer;
    }

    @Test
    public void main() {

    }
}