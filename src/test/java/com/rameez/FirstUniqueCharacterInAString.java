package com.rameez;

import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/first-unique-character-in-a-string/

class FirstUniqueCharacterInAString {

    // METHOD 1: SLOW (Passes all test cases & beats 14% people in speed)
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.replace(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = map.get(c);
            if (count == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    // METHOD 2: FASTER (Passes all test cases & beats 63% people in speed)
    public int firstUniqChar2(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts[c - 'a']++;
        }

        int ans = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (counts[c - 'a'] == 1) {
                ans = i;
                break;
            }
        }
        return ans;
    }


    @Test
    void test() {

    }
}
