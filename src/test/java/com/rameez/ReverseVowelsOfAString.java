package com.rameez;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

// https://leetcode.com/problems/reverse-vowels-of-a-string/

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        StringBuilder sb = new StringBuilder(s);
        int reverseIndex = sb.length() - 1;
        for (int i = 0; i < reverseIndex; ) {
            char frontC = sb.charAt(i);
            char backC = sb.charAt(reverseIndex);
            if (vowels.contains(frontC) && vowels.contains(backC)) {
                // interchange
                sb.setCharAt(i, backC);
                sb.setCharAt(reverseIndex, frontC);

                i++;
                reverseIndex--;
            } else if (vowels.contains(frontC)) {
                reverseIndex--;
            } else if (vowels.contains(backC)) {
                i++;
            } else {
                i++;
                reverseIndex--;
            }
        }

        return sb.toString();
    }

    @Test
    public void main() {
        assertEquals("AceCreIm", reverseVowels("IceCreAm"));
    }
}