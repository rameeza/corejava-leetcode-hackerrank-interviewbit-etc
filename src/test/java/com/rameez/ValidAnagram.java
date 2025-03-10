package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/

class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        boolean ans = true;
        int[] charCounts = new int[26];

        // increment counts
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            charCounts[index]++;
        }

        // decrement counts
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int index = c - 'a';
            charCounts[index]--;
        }

        // check if all counts are 0
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                ans = false;
                break;
            }
        }

        return ans;
    }

    @Test
    void test() {

    }
}
