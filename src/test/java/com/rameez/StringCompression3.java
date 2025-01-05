package com.rameez;

import org.junit.Test;

// https://leetcode.com/problems/string-compression-iii/

public class StringCompression3 {

    public String compressedString(String word) {
        StringBuilder answer = new StringBuilder();

        char prevC = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c != prevC) {
                answer.append(count);
                answer.append(prevC);
                prevC = c;
                count = 1;
            } else if (count == 9) {
                answer.append(count);
                answer.append(prevC);
                prevC = c;
                count = 1;
            } else {
                count++;
            }
        }
        answer.append(count);
        answer.append(prevC);

        return answer.toString();
    }

    @Test
    public void main() {

    }
}